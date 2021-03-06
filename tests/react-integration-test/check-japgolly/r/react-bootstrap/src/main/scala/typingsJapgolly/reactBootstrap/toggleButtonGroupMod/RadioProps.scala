package typingsJapgolly.reactBootstrap.toggleButtonGroupMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactBootstrap.reactBootstrapStrings.radio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioProps extends js.Object {
  /** Required if `type` is set to "radio" */
  var name: String = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var `type`: radio = js.native
}

object RadioProps {
  @scala.inline
  def apply(name: String, `type`: radio, onChange: /* value */ js.Any => Callback = null): RadioProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onChange(t0).runNow()))
    __obj.asInstanceOf[RadioProps]
  }
}

