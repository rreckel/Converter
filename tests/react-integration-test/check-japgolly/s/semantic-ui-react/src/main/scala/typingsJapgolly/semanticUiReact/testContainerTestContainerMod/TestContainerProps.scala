package typingsJapgolly.semanticUiReact.testContainerTestContainerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestContainerProps
  extends StrictTestContainerProps
     with /* key */ StringDictionary[js.Any]

object TestContainerProps {
  @scala.inline
  def apply(
    requiredFn0Number: CallbackTo[Double],
    requiredFn0Void: Callback,
    requiredFn1Number: Double => CallbackTo[Double],
    requiredFn1Void: Double => Callback,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    optFn0Number: js.UndefOr[CallbackTo[Double]] = js.undefined,
    optFn0Void: js.UndefOr[Callback] = js.undefined,
    optFn1Number: /* x */ Double => CallbackTo[Double] = null,
    optFn1Void: /* x */ Double => Callback = null,
    text: js.UndefOr[Boolean] = js.undefined,
    textAlign: SemanticTEXTALIGNMENTS = null
  ): TestContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requiredFn0Number")(requiredFn0Number.toJsFn)
    __obj.updateDynamic("requiredFn0Void")(requiredFn0Void.toJsFn)
    __obj.updateDynamic("requiredFn1Number")(js.Any.fromFunction1((t0: Double) => requiredFn1Number(t0).runNow()))
    __obj.updateDynamic("requiredFn1Void")(js.Any.fromFunction1((t0: Double) => requiredFn1Void(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    optFn0Number.foreach(p => __obj.updateDynamic("optFn0Number")(p.toJsFn))
    optFn0Void.foreach(p => __obj.updateDynamic("optFn0Void")(p.toJsFn))
    if (optFn1Number != null) __obj.updateDynamic("optFn1Number")(js.Any.fromFunction1((t0: /* x */ Double) => optFn1Number(t0).runNow()))
    if (optFn1Void != null) __obj.updateDynamic("optFn1Void")(js.Any.fromFunction1((t0: /* x */ Double) => optFn1Void(t0).runNow()))
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestContainerProps]
  }
}

