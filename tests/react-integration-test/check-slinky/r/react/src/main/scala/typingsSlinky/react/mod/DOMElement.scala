package typingsSlinky.react.mod

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// string fallback for custom web-components
@js.native
trait DOMElement[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */] extends ReactElement {
  var ref: LegacyRef[T] = js.native
}

object DOMElement {
  @scala.inline
  def apply[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */](props: js.Any, `type`: js.Any, key: Key = null, ref: LegacyRef[T] = null): DOMElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMElement[P, T]]
  }
  @scala.inline
  implicit class DOMElementOps[Self[p /* <: typingsSlinky.react.mod.HTMLAttributes[T] | typingsSlinky.react.mod.SVGAttributes[T] */, t /* <: typingsSlinky.std.Element */] <: slinky.core.facade.ReactElement, P <: HTMLAttributes[T] | SVGAttributes[T], T <: Element] (val x: Self[P, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, T]]
    @scala.inline
    def combineWith[Other /* <: js.Any */](other: Other): (Self[P, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, T]) with Other]
    @scala.inline
    def withRefRefObject(ref: ReactRef[T]): Self[P, T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ref")(ref.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[P, T]]
    }
    @scala.inline
    def withRefFunction1(ref: /* instance */ T | Null => Unit): Self[P, T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ref")(js.Any.fromFunction1(ref))
        ret.asInstanceOf[Self[P, T]]
    }
    @scala.inline
    def withRefString(ref: String): Self[P, T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ref")(ref.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[P, T]]
    }
    @scala.inline
    def withoutRef: Self[P, T] = {
        val ret = this.duplicate
        js.special.delete(ret, "ref")
        ret.asInstanceOf[Self[P, T]]
    }
  }
  
}

