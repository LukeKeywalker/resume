import org.scalajs.linker.interface.ModuleSplitStyle

lazy val resume = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    scalaVersion                    := "3.3.3",
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("resume")))
    },
    libraryDependencies ++= Seq(
      "org.scala-js"  %%% "scalajs-dom" % "2.8.0",
      "com.raquo"     %%% "laminar"     % "17.0.0",
      "org.scalameta" %%% "munit"       % "1.0.0" % Test
    )
  )
