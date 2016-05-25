package com.orange.testweb

import org.scalatra._

class TestWebServlet extends MyProjectWebTestStack {
  import MetaInfo._

  get("/") {
    <html>
      <body>
        <h1>Hello, {project} release {version} built on {buildDate}!</h1>
        <p>I'm using the dependency {testdep.TestDep.getMessage()}</p>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
