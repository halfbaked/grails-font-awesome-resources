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
import grails.util.Environment
import grails.util.Holders
import org.slf4j.LoggerFactory

/**
 * @author <a href='mailto:eamonnoconnell@gmail.com'>Eamonn O'Connell</a>
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 * @author <a href='mailto:soeren@glasius.dk'>Søren Berg Glasius</a>
 */
def log = LoggerFactory.getLogger('grails.plugins.twitterbootstrap.FontAwesomePluginResources')
def pluginManager = Holders.pluginManager
boolean lesscssPlugin = pluginManager.getGrailsPlugin('lesscss-resources') || pluginManager.getGrailsPlugin('less-resources')
def configDefaultBundle = Holders.config.grails.plugins.fontawesomeresources.defaultBundle
if (!configDefaultBundle && !configDefaultBundle.equals(false)) {
    configDefaultBundle = 'bundle_fontawesome'
}

log.debug "config: grails.plugins.fontawesomeresources.defaultBundle = $configDefaultBundle"
log.debug "is lesscss-resources plugin loaded? $lesscssPlugin"

String cssFile = Environment.developmentMode ? 'font-awesome.css' : 'font-awesome.min.css'

modules = {

    'font-awesome-css' {
        defaultBundle configDefaultBundle

        resource id: 'font-awesome-css',
                url: [plugin: 'font-awesome-resources',
                      dir   : 'css/font-awesome',
                      file  : cssFile],
                disposition: 'head',
                exclude: 'minify'
    }

    'font-awesome-less' {
        defaultBundle configDefaultBundle

        resource id: 'font-awesome-less',
                url: [plugin: 'font-awesome-resources',
                      dir   : 'less/font-awesome',
                      file  : 'font-awesome.less'],
                attrs: [rel  : 'stylesheet/less',
                        type : 'css',
                        order: 120],
                disposition: 'head'
    }

    'font-awesome' {
        defaultBundle configDefaultBundle

        dependsOn lesscssPlugin ? 'font-awesome-less' : 'font-awesome-css'
    }
}
