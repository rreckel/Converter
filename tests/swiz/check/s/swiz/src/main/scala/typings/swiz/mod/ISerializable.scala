package typings.swiz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISerializable extends js.Object {
  def getSerializerType(): String = js.native
}

object ISerializable {
  @scala.inline
  def apply(getSerializerType: () => String): ISerializable = {
    val __obj = js.Dynamic.literal(getSerializerType = js.Any.fromFunction0(getSerializerType))
    __obj.asInstanceOf[ISerializable]
  }
}

