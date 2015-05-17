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

class FontAwesomeResourcesGrailsPlugin {
    def version = '4.3.0.2'
    def grailsVersion = '2.0 > *'
    def title = 'Grails Font Awesome Resources Plugin'
    def description = '''\
Like the jquery-resources plugin that pulls in the jquery javascript lib as a resource, this plugin pulls in Font Awesome.
Font Awesome is a very popular font based icon set. Font based icons are a very convenient means of incorporating icons into a web application and the technique is growing in popularity.
Font Awesome probably works best when used with the twitter bootstrap UI framework for which it was designed.
From version 4.0.3.0 support for IE7 is gone, since Font Awesome does not support IE7 any longer.
'''
    def documentation = 'https://github.com/donbeave/grails-font-awesome'
    def license = 'APACHE'
    def developers = [
        [name: "Eamoon O'Connell", email: 'eamonnoconnell@gmail.com'],
        [name: 'Alexey Zhokhov', email: 'donbeave@gmail.com'],
        [name: 'Søren Berg Glasius', email: 'soeren@glasius.dk']
    ]
    def issueManagement = [url: 'https://github.com/donbeave/grails-font-awesome/issues']
    def scm = [url: 'https://github.com/donbeave/grails-font-awesome']
}
