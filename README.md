# test-web-project

a very simple web project that depends on test-dep. It is scalatra based and you can generate a war application.

## Basic usage

```
sbt test
sbt package
```

## Run using sbt managed jetty application server

```
$ cd test-web-project
$ ./sbt
> jetty:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.
