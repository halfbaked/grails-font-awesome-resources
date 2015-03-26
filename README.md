grails-lesshat [![Build Status](https://travis-ci.org/donbeave/grails-lesshat.svg?branch=master)](https://travis-ci.org/donbeave/grails-lesshat)
============

Grails LESS Hat plugin

Summary
-------

Provides [LESS Hat][lesshat] support for the asset-pipeline static asset management plugin.

Installation
------------

In `BuildConfig.groovy`, add the dependency to "plugins" section:

```groovy
plugins {
    //...
    compile ':lesshat:3.0.2.1'
    //...
}
```

Change the version to reflect the actual version you would like to use.

Usage
-----

In you LESS stylesheet file just add following code at the top:

```
@import 'lesshat.less';
```

Then you can use all 86 smart mixins. Documentation of the mixins please check on the official GitHub page:
https://github.com/madebysource/lesshat#-documentation


Copyright and License
===

lesshat plugin:

Copyright 2014 Alexey Zhokhov under the [Apache License, Version 2.0](LICENSE). Supported by [Polusharie][polusharie].

LESS Hat files:

```
The MIT License
   
Copyright (c) 2013 Petr Brzek
   
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```

[lesshat]: http://lesshat.madebysource.com/
[polusharie]: http://www.polusharie.com
