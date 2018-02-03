Multi-Project-Skeleton
------------

This project aims to simplify creating a multi module project ready to package and deploy to a server.

It provides some minimal code just to demonstrate usage.

Requires
---------------
* Please download latest version of SBT.
* [sbt 1.1.0](http://www.scala-sbt.org)

Use
---------------
Clone and update the project name from build.sbt

    $ git clone git://github.com/fractal/multi-project-skeleton my-project
    $ cd my-project
    $ rm -rf .git
    $ vi build.sbt # change name to my-project, and organization to something that suits you
    $ sbt
    > app/run
    > app/packageZipTarball

Author
--------------------
Fernando Racca

[@quant_leap](http://twitter.com/quant_leap)

Simpler version:
[fractal/skeleton](http://github.com/fractal/skeleton)
