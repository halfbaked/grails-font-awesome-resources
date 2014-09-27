eventAssetPrecompileStart = { assetConfig ->
    if (!config.grails.assets.plugin.'font-awesome-resources'.excludes ||
            config.grails.assets.plugin.'font-awesome-resources'.excludes.size() == 0) {
        config.grails.assets.plugin.'font-awesome-resources'.excludes = ['font-awesome/*.less']
    }
}
