grails-font-awesome-resources
=============================

Provides the Twitter Bootstrap compatible awesome font based icon set Font Awesome as a [Asset-Pipeline](http://grails.org/plugin/asset-pipeline) or [Grails resource](http://grails.org/plugin/resources).

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

## Usage

## Including the resources with Asset-Pipeline plugin

The recommended way is to use the [asset-pipeline plugin](http://grails.org/plugin/asset-pipeline) (minimal 0.1.7). It is
the default since Grails 2.4.0 and replaces the resources plugin.

To include font-awesome resources add the following to your application's css.

Stylesheet `grails-app/assets/javascripts/application.css`:
```css
/*
*= require font-awesome
*/
```

#### LESS Support

In you LESS stylesheet file just add following code at the top:

```less
@import 'font-awesome';
```

## Resources plugin

With Grails version 2.3.8 and later, you should set compile ":resources:1.2.8" rather than runtime ":resources:1.2.8" in BuildConfig.groovy in order to avoid an exception.

* Reference the font-awesome resource from within your ApplicationResources file or directly in a gsp page/layout
Example

```groovy
// ApplicationResources.groovy
customBootstrap {
    dependsOn 'font-awesome'

    resource url: 'css/bootstrap.css'
    resource url: 'js/bootstrap.js'
    resource url: 'css/bootstrap-fixtaglib.css'
}
```

The above example I'm not using the [grails twitter bootstrap plugin](http://grails.org/plugin/twitter-bootstrap).
When using font-awesome, I found it was best to build the bootstrap files from the original Bootstrap website and opt
not to include the glyphicons sprite. I did however borrow some of the good work done on the plugin to integrate bootstrap
with Grails paginate functionality.

#### Usage in Grails Resources support

A font-awesome resource depends on `font-awesome-css` or `font-awesome-less` (if less plugin installed).

Declare bootstrap resource module in GSP page header:
```gsp
<r:require modules="font-awesome"/>
```

#### Usage in GSP page with Resource support
```gsp
<html>
    <head>
        <meta name="layout" content="main"/>
        <r:require modules="font-awesome"/>
    </head>
<body>
    <h1> Hello World </h1>
</body>
</html>
```

## Icons usage
You can include an icon in your HTML using the appropriate css class. See the [Font Awesome](http://fontawesome.io/icons/) for a list of the icons and their corresponding class names.

Example

```html
<i class="fa fa-user"></i>
```

Copyright and License
===

font-awesome-resources plugin:

Copyright 2014 Alexey Zhokhov under the [Apache License, Version 2.0](LICENSE). Supported by [Polusharie][polusharie].

Font Awesome files:

```
http://fontawesome.io/license (Font: SIL OFL 1.1, CSS: MIT License)
```

[polusharie]: http://www.polusharie.com
