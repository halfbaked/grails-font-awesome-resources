modules = {

  'font-awesome' {
    resource url: [plugin: 'font-awesome-resources', dir: 'css', file: (dev ? 'font-awesome.css' : 'font-awesome.min.css')], exclude: 'minify'
  }

}
