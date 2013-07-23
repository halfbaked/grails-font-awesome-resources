def dev = grails.util.GrailsUtil.isDevelopmentEnv()

def configDefaultBundle = org.codehaus.groovy.grails.commons.ApplicationHolder.application.config.grails.plugins.fontawesomeresources.defaultBundle
if (!configDefaultBundle && !configDefaultBundle.equals(false)) {
    configDefaultBundle = 'bundle_fontawesome'
}

def configIncludeIe7 = org.codehaus.groovy.grails.commons.ApplicationHolder.application.config.grails.plugins.fontawesomeresources.includeIe7


modules = {
  
    'font-awesome-css' {
        defaultBundle configDefaultBundle
        
        resource id: 'font-awesome-css', url: [plugin: 'font-awesome-resources', dir: 'css', file: (dev ? 'font-awesome.css' : 'font-awesome.min.css')], disposition: 'head', exclude: 'minify'
    }
    
    'font-awesome-ie7-css' {
        defaultBundle configDefaultBundle
        dependsOn 'font-awesome-css'
        
        resource id: 'font-awesome-ie7-css', url: [plugin: 'font-awesome-resources', dir: 'css', file: (dev ? 'font-awesome-ie7.css' : 'font-awesome-ie7.min.css')], disposition: 'head', exclude: 'minify'
    }
    
    'font-awesome' {
        defaultBundle configDefaultBundle
        dependsOn 'font-awesome-css'
        
        if (configIncludeIe7) {
            dependsOn 'font-awesome-ie7-css'
        }
    
    }
    
}
