grails-font-awesome-resources
=============================

Provides the Twitter Bootstrap compatible awesome font based icon set Font Awesome as a [Grails resource](http://grails.org/plugin/resources).

## Summary
[Font Awesome](http://fortawesome.github.com/Font-Awesome/) is an iconic font designed for use with Twitter Bootstrap. Twitter Bootstrap comes with an icon set (GLYPHICONS) built in. This set is rendered using image sprites. Font based icons are an alternative, and convenient means of incorporating icons into a web application. It is a technique that is growing in popularity. One of its plus points is how easy it is to manipulate an icon with css. A few lines of the most basic css can change the size and color of an icon, or set of icons. Try doing that with an image sprite!

Installation
------------

In `BuildConfig.groovy`, add the dependency to "plugins" section:

```groovy
plugins {
    //...
    runtime ':font-awesome-resources:4.3.0.1'
    //...
}
```

Change the version to reflect the actual version you would like to use.



Resources plugin

* Reference the font-awesome resource from within your ApplicationResources file or directly in a gsp page/layout
Example

    // ApplicationResources.groovy
    customBootstrap {
      dependsOn 'font-awesome'
      resource url: 'css/bootstrap.css'
      resource url: 'js/bootstrap.js'
      resource url: 'css/bootstrap-fixtaglib.css'
    }

    // main.gsp
    <r:require module="customBootstrap" />

The above example I'm not using the [grails twitter bootstrap plugin](http://grails.org/plugin/twitter-bootstrap).
When using font-awesome, I found it was best to build the bootstrap files from the original Bootstrap website and opt
not to include the glyphicons sprite. I did however borrow some of the good work done on the plugin to integrate bootstrap
with Grails paginate functionality.

### Using with Resources plugin
With Grails version 2.3.8 and later, you should set compile ":resources:1.2.8" rather than runtime ":resources:1.2.8" in BuildConfig.groovy in order to avoid an exception.

### Asset Pipeline
Optionally you can also use asset-pipeline and include font-awesome in your existing css file:
```css
/*
 *= require font-awesome
 * or
 *= require font-awesome-css
 */
```

The latter option will observe the ie7 configuration and include that css file automatically if enabled.

## Usage
You can include an icon in your HTML using the appropriate css class. See the [Font Awesome project on GitHub](http://fortawesome.githuCSSb.com/Font-Awesome/) for a list of the icons and their
corresponding class names.

Example

    <i class="icon-user"></i>

Copyright and License
===

font-awesome-resources plugin:

Copyright 2014 Alexey Zhokhov under the [Apache License, Version 2.0](LICENSE). Supported by [Polusharie][polusharie].

Font Awesome files:

```
http://fontawesome.io/license (Font: SIL OFL 1.1, CSS: MIT License)
```

[polusharie]: http://www.polusharie.com
