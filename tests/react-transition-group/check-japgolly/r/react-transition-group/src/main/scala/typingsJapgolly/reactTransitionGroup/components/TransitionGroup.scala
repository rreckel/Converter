package typingsJapgolly.reactTransitionGroup.components

import japgolly.scalajs.react.Children.Varargs
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.JsForwardRefComponent.force
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.abbr
import typingsJapgolly.reactTransitionGroup.transitionGroupMod.TransitionGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object TransitionGroup {
  def apply(
    props: (TransitionGroupProps[abbr, js.Any]) with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    (TransitionGroupProps[abbr, js.Any]) with js.Object, 
    typingsJapgolly.reactTransitionGroup.mod.TransitionGroup, 
    Unit, 
    (TransitionGroupProps[abbr, js.Any]) with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    val f = force[(TransitionGroupProps[abbr, js.Any]) with js.Object, Varargs, typingsJapgolly.reactTransitionGroup.mod.TransitionGroup](this.componentImport)
    f(__obj.asInstanceOf[(TransitionGroupProps[abbr, js.Any]) with js.Object])(children :_*)
  }
  @JSImport("react-transition-group", "TransitionGroup")
  @js.native
  object componentImport extends js.Object
  
}

