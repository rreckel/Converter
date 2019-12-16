package typingsSlinky.semanticDashUiDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.semanticDashUiDashReact.distCommonjsElementsButtonButtonOrMod.ButtonOrProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ButtonOr {
  object raw
    extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button/ButtonOr", JSImport.Default)
    @js.native
    object componentImport extends js.Object
    
    override val component: String | js.Object = this.componentImport
    type Props = ButtonOrProps
  }
  
  /* The following DOM/SVG props were specified: className */
  def apply(as: js.Any = null, text: Double | String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    this.raw.apply(__obj.asInstanceOf[this.raw.Props])
  }
}
