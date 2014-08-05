def log = org.slf4j.LoggerFactory.getLogger('grails.plugins.twitterbootstrap.FontAwesomePluginResources')
def dev = grails.util.GrailsUtil.isDevelopmentEnv()
def pluginManager = grails.util.Holders.pluginManager
def lesscssPlugin = pluginManager.getGrailsPlugin('lesscss-resources') || pluginManager.getGrailsPlugin('less-resources')
def configDefaultBundle = grails.util.Holders.config.grails.plugins.fontawesomeresources.defaultBundle
if (!configDefaultBundle && !configDefaultBundle.equals(false)) {
    configDefaultBundle = 'bundle_fontawesome'
}

def dirLessSource
def dirTarget 

log.debug "dirLessSource: ${dirLessSource}"
log.debug "dirTarget: ${dirTarget}"

def cssFile = "font-awesome.css"
def cssminFile = "font-awesome.min.css"

log.debug "config: grails.plugins.fontawesomeresources.defaultBundle = ${configDefaultBundle}"

log.debug "is lesscss-resources plugin loaded? ${!!lesscssPlugin}"



modules = {
  
    'font-awesome-css' {
        defaultBundle configDefaultBundle
        
        resource id: 'font-awesome-css', url: [plugin: 'font-awesome-resources', dir: 'css/font-awesome', file: (dev ? cssFile : cssminFile)], disposition: 'head', exclude: 'minify'
    }

    'font-awesome-less' {
        defaultBundle configDefaultBundle
        
        resource id:'font-awesome-less', url:[plugin: 'font-awesome-resources', dir: 'less/font-awesome', file: 'font-awesome.less'], attrs:[rel: "stylesheet/less", type:'css', order:120], disposition: 'head'
    }
    
    'font-awesome' {
        defaultBundle configDefaultBundle

        if (lesscssPlugin) {
            dependsOn 'font-awesome-less'
        } else {
            dependsOn 'font-awesome-css'
        }
    }
    
}
