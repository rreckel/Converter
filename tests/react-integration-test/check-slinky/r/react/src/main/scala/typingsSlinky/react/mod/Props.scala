package typingsSlinky.react.mod

import slinky.core.TagMod
import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Props / DOM Attributes
// ----------------------------------------------------------------------
/**
  * @deprecated. This was used to allow clients to pass `ref` and `key`
  * to `createElement`, which is no longer necessary due to intersection
  * types. If you need to declare a props object before passing it to
  * `createElement` or a factory, use `ClassAttributes<T>`:
  *
  * ```ts
  * var b: Button | null;
  * var props: ButtonProps & ClassAttributes<Button> = {
  *     ref: b => button = b, // ok!
  *     label: "I'm a Button"
  * };
  * ```
  */
@js.native
trait Props[T] extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var key: js.UndefOr[Key] = js.native
  var ref: js.UndefOr[LegacyRef[T]] = js.native
}

object Props {
  @scala.inline
  def apply[T](children: TagMod[Any] = null, key: Key = null, ref: LegacyRef[T] = null): Props[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  @scala.inline
  implicit class PropsOps[Self[t] <: Props[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other /* <: js.Any */](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildrenReactNodeArray(children: ReactNodeArray): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("children")(children.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withChildrenDouble(children: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("children")(children.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withChildrenBoolean(children: Boolean): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("children")(children.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "children")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withChildrenReactElement(children: slinky.core.facade.ReactElement): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("children")(children.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withChildrenObject(children: js.Object): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("children")(children.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withChildrenReactPortal(children: ReactPortal): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("children")(children.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withChildrenString(children: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("children")(children.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKeyString(key: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("key")(key.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKeyDouble(key: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("key")(key.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutKey: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "key")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRefRefObject(ref: ReactRef[T]): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ref")(ref.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRefFunction1(ref: /* instance */ T | Null => Unit): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ref")(js.Any.fromFunction1(ref))
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRefString(ref: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ref")(ref.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRef: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "ref")
        ret.asInstanceOf[Self[T]]
    }
  }
  
}

