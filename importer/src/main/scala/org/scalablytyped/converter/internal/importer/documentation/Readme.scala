package org.scalablytyped.converter.internal.importer.documentation

import org.scalablytyped.converter.internal.importer.Summary
import org.scalablytyped.converter.internal.ts.TsIdentLibrary

object Readme {
  def apply(summary: Summary, runId: String, locOutput: Option[String]): String = s"""

# ScalablyTyped - The Javascript ecosystem for Scala.js!

[![Join the chat at https://gitter.im/ScalablyTyped/community](https://badges.gitter.im/ScalablyTyped/community.svg)](https://gitter.im/ScalablyTyped/community)
[![Checkout the demos at https://github.com/ScalablyTyped/ScalablyTypedDemos/](https://img.shields.io/badge/Checkout-Demo-success.svg)](https://github.com/oyvindberg/ScalablyTypedDemos/)

This is the home of pre-built Scala.js typings for **${summary.successes.size}** Javascript libraries,
 which should span more or less the entire set of modern and popular libraries.

## Warning :collision: :bomb: :sunglasses:

These pre-built typing libraries are now **deprecated**.
Please see [scalablytyped.org](https://scalablytyped.org) for the shiny new sbt plugin.

Because of storage reasons the published libraries here **will be deleted** after a while.
Use the plugin for stable builds.

Currently all published artifacts are Scala 2.13 / Scala.js 0.6.
Use the plugin for older/newer versions of either.

If you want to keep exactly what you used before, remember that this is open source.
All the typing libraries come with build.sbt files, so you can clone the repo,
checkout the commit from the date of the distribution you are using,
 and change/build/publish the libraries.

## About

This is one of the biggest Scala repos on the planet${describeSize(locOutput)}

## How can i get started if I really don't want to use the plugin?

We recommend using sbt with [scalajs-bundler](https://scalacenter.github.io/scalajs-bundler/)
and the ScalablyTyped plugin to easily keep versions in sync (more on versions below).


These should be the main steps you would have to follow:

### `project/plugins.sbt`
ScalablyTyped is hosted at bintray, so make sure to include the resolver
```scala
  resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
  addSbtPlugin("org.scalablytyped" % "sbt-scalablytyped" % "$runId")
  If you're still on 2.12, this is the last distribution release.
  addSbtPlugin("org.scalablytyped" % "sbt-scalablytyped" % "202001240947")
```

### `build.sbt`
```scala
  /* reference the typing library */
  libraryDependencies ++= Seq(ScalablyTyped.D.d3),
  /* If the library is typed up in `DefinitelyTyped` (has `-dt-` in the version string) you'll also need this.
   * The reason why is that versions strings there are just comments, and frequently wrong. Automatically including
   *  that would break your build.
   */
  npmDependencies in Compile ++= Seq("d3" -> "5.5.0"),
```
The version of the typing normally includes the relevant version of the library,
 so you can often "go to definition" and see what you should put in `npmDependencies`.

The sbt plugin itself is nothing except for a bunch of versions guaranteed to be in sync
```scala
object D {
  val d3 = "org.scalablytyped" % "d3_sjs0.6_2.12" % "5.0-dt-20181018Z-171237"
  val `d3-array` = "org.scalablytyped" % "d3-array_sjs0.6_2.12" % "1.2-dt-20181018Z-e09a78"
  // ...
}
```
### Code away
After that you should be good to go and start coding:
```scala
  import typings.std.console
  console.warn("Hello, World!")
```

"""

  def describeSize(locOutput: Option[String]) = locOutput match {
    case Some(output) =>
      s""":
```

$output
```
"""
    case None => " with millions of lines of code"
  }

  def facades(summary: Summary) = {
    object FacadeName {
      def unapply(s: TsIdentLibrary): Option[String] =
        if (s.value.endsWith("-facade")) Some(s.value.replaceAllLiterally("-facade", ""))
        else None
    }

    summary.successes
      .collect { case FacadeName(name) => name }
      .map(x => "- " + s"[$x](facades/$x)")
      .mkString("\n")
  }
}
