package ScalablyTyped
package CldrjsLib.CldrjsModule.selfNamespace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @name CldrStatic
     * @memberof cldr
     * @kind interface
     *
     * @description
     * The cldr class definition.
     */

trait CldrStatic extends js.Object {
  val supplemental: CldrjsLib.CldrjsCldrDotJsDashSupplementalModule.CldrjsModule.SupplementalStatic
  def get(path: java.lang.String): js.Any
  def off(event: java.lang.String, listener: js.Function2[/* path */ java.lang.String, /* value */ js.Any, scala.Unit]): scala.Unit
  def on(event: java.lang.String, listener: js.Function2[/* path */ java.lang.String, /* value */ js.Any, scala.Unit]): scala.Unit
  def once(event: java.lang.String, listener: js.Function2[/* path */ java.lang.String, /* value */ js.Any, scala.Unit]): scala.Unit
}
