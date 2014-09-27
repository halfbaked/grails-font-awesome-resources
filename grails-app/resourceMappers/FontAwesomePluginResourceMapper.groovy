/*
 * Copyright 2012 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author <a href='mailto:eamonnoconnell@gmail.com'>Eamonn O'Connell</a>
 * @author <a href='mailto:soeren@glasius.dk'>Søren Berg Glasius</a>
 *
 * Removes the warning seen in the Chrome debugger:
 * ‘Resource interpreted as Font but transferred with MIME type application/octet-stream’
 * http://kalikallin.tumblr.com/post/25182657116/setting-grails-content-type-for-a-given-file-extension
 */
class FontAwesomePluginResourceMapper {
    static phase = alternateRepresentationPhase

    static defaultIncludes = ['**/*.woff']

    def map(resource, config) {
        resource.requestProcessors << { req, resp ->
            resp.setHeader('Content-Type', 'font/opentype')
        }
    }

    // This decouples the plugin from the resources plugin.
    private static Object getAlternateRepresentationPhase() {
        try {
            FontAwesomePluginResourceMapper.class.forName('org.grails.plugin.resource.mapper.MapperPhase').enumConstants.find {
                it.name() == 'ALTERNATEREPRESENTATION'
            }
        } catch (ignored) {
            null
        }
    }
}
