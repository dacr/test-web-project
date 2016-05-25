
sourceGenerators in Compile <+=
 (sourceManaged in Compile, version, name) map {
  (dir, version, projectname) =>
  val file = dir / "com" / "orange" / "testweb" / "MetaInfo.scala"
  val buildDate = (new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new java.util.Date())
  IO.write(file,
  """package com.orange.testweb
    |object MetaInfo { 
    |  val version="%s"
    |  val project="%s"
    |  val buildDate="%s"
    |}
    |""".stripMargin.format(version, projectname, buildDate) )
  Seq(file)
}

