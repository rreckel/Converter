package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.`additions text`
import typingsSlinky.react.reactStrings.`inline`
import typingsSlinky.react.reactStrings.additions
import typingsSlinky.react.reactStrings.all
import typingsSlinky.react.reactStrings.ascending
import typingsSlinky.react.reactStrings.assertive
import typingsSlinky.react.reactStrings.both
import typingsSlinky.react.reactStrings.copy
import typingsSlinky.react.reactStrings.date
import typingsSlinky.react.reactStrings.descending
import typingsSlinky.react.reactStrings.dialog
import typingsSlinky.react.reactStrings.execute
import typingsSlinky.react.reactStrings.grammar
import typingsSlinky.react.reactStrings.grid
import typingsSlinky.react.reactStrings.horizontal
import typingsSlinky.react.reactStrings.link
import typingsSlinky.react.reactStrings.list
import typingsSlinky.react.reactStrings.listbox
import typingsSlinky.react.reactStrings.location
import typingsSlinky.react.reactStrings.menu
import typingsSlinky.react.reactStrings.mixed
import typingsSlinky.react.reactStrings.move
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.off
import typingsSlinky.react.reactStrings.other
import typingsSlinky.react.reactStrings.page
import typingsSlinky.react.reactStrings.polite
import typingsSlinky.react.reactStrings.popup
import typingsSlinky.react.reactStrings.removals
import typingsSlinky.react.reactStrings.spelling
import typingsSlinky.react.reactStrings.step
import typingsSlinky.react.reactStrings.text
import typingsSlinky.react.reactStrings.time
import typingsSlinky.react.reactStrings.tree
import typingsSlinky.react.reactStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// All the WAI-ARIA 1.1 attributes from https://www.w3.org/TR/wai-aria-1.1/
@js.native
trait AriaAttributes extends js.Object {
  /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
  var `aria-activedescendant`: js.UndefOr[String] = js.native
  /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
  var `aria-atomic`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
    * presented if they are made.
    */
  var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
  /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
  var `aria-busy`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
    * @see aria-pressed @see aria-selected.
    */
  var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Defines the total number of columns in a table, grid, or treegrid.
    * @see aria-colindex.
    */
  var `aria-colcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
    * @see aria-colcount @see aria-colspan.
    */
  var `aria-colindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-colindex @see aria-rowspan.
    */
  var `aria-colspan`: js.UndefOr[Double] = js.native
  /**
    * Identifies the element (or elements) whose contents or presence are controlled by the current element.
    * @see aria-owns.
    */
  var `aria-controls`: js.UndefOr[String] = js.native
  /** Indicates the element that represents the current item within a container or set of related elements. */
  var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
  /**
    * Identifies the element (or elements) that describes the object.
    * @see aria-labelledby
    */
  var `aria-describedby`: js.UndefOr[String] = js.native
  /**
    * Identifies the element that provides a detailed, extended description for the object.
    * @see aria-describedby.
    */
  var `aria-details`: js.UndefOr[String] = js.native
  /**
    * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
    * @see aria-hidden @see aria-readonly.
    */
  var `aria-disabled`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what functions can be performed when a dragged object is released on the drop target.
    * @deprecated in ARIA 1.1
    */
  var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
  /**
    * Identifies the element that provides an error message for the object.
    * @see aria-invalid @see aria-describedby.
    */
  var `aria-errormessage`: js.UndefOr[String] = js.native
  /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
  var `aria-expanded`: js.UndefOr[Boolean] = js.native
  /**
    * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
    * allows assistive technology to override the general default of reading in document source order.
    */
  var `aria-flowto`: js.UndefOr[String] = js.native
  /**
    * Indicates an element's "grabbed" state in a drag-and-drop operation.
    * @deprecated in ARIA 1.1
    */
  var `aria-grabbed`: js.UndefOr[Boolean] = js.native
  /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
  /**
    * Indicates whether the element is exposed to an accessibility API.
    * @see aria-disabled.
    */
  var `aria-hidden`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the entered value does not conform to the format expected by the application.
    * @see aria-errormessage.
    */
  var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
  /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
  var `aria-keyshortcuts`: js.UndefOr[String] = js.native
  /**
    * Defines a string value that labels the current element.
    * @see aria-labelledby.
    */
  var `aria-label`: js.UndefOr[String] = js.native
  /**
    * Identifies the element (or elements) that labels the current element.
    * @see aria-describedby.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.native
  /** Defines the hierarchical level of an element within a structure. */
  var `aria-level`: js.UndefOr[Double] = js.native
  /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
  var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
  /** Indicates whether an element is modal when displayed. */
  var `aria-modal`: js.UndefOr[Boolean] = js.native
  /** Indicates whether a text box accepts multiple lines of input or only a single line. */
  var `aria-multiline`: js.UndefOr[Boolean] = js.native
  /** Indicates that the user may select more than one item from the current selectable descendants. */
  var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
  /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
  var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
    * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
    * @see aria-controls.
    */
  var `aria-owns`: js.UndefOr[String] = js.native
  /**
    * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
    * A hint could be a sample value or a brief description of the expected format.
    */
  var `aria-placeholder`: js.UndefOr[String] = js.native
  /**
    * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-setsize.
    */
  var `aria-posinset`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "pressed" state of toggle buttons.
    * @see aria-checked @see aria-selected.
    */
  var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
  /**
    * Indicates that the element is not editable, but is otherwise operable.
    * @see aria-disabled.
    */
  var `aria-readonly`: js.UndefOr[Boolean] = js.native
  /**
    * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
    * @see aria-atomic.
    */
  var `aria-relevant`: js.UndefOr[additions | (`additions text`) | all | removals | text] = js.native
  /** Indicates that user input is required on the element before a form may be submitted. */
  var `aria-required`: js.UndefOr[Boolean] = js.native
  /** Defines a human-readable, author-localized description for the role of an element. */
  var `aria-roledescription`: js.UndefOr[String] = js.native
  /**
    * Defines the total number of rows in a table, grid, or treegrid.
    * @see aria-rowindex.
    */
  var `aria-rowcount`: js.UndefOr[Double] = js.native
  /**
    * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
    * @see aria-rowcount @see aria-rowspan.
    */
  var `aria-rowindex`: js.UndefOr[Double] = js.native
  /**
    * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
    * @see aria-rowindex @see aria-colspan.
    */
  var `aria-rowspan`: js.UndefOr[Double] = js.native
  /**
    * Indicates the current "selected" state of various widgets.
    * @see aria-checked @see aria-pressed.
    */
  var `aria-selected`: js.UndefOr[Boolean] = js.native
  /**
    * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
    * @see aria-posinset.
    */
  var `aria-setsize`: js.UndefOr[Double] = js.native
  /** Indicates if items in a table or grid are sorted in ascending or descending order. */
  var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
  /** Defines the maximum allowed value for a range widget. */
  var `aria-valuemax`: js.UndefOr[Double] = js.native
  /** Defines the minimum allowed value for a range widget. */
  var `aria-valuemin`: js.UndefOr[Double] = js.native
  /**
    * Defines the current value for a range widget.
    * @see aria-valuetext.
    */
  var `aria-valuenow`: js.UndefOr[Double] = js.native
  /** Defines the human readable text alternative of aria-valuenow for a range widget. */
  var `aria-valuetext`: js.UndefOr[String] = js.native
}

object AriaAttributes {
  @scala.inline
  def apply(
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null
  ): AriaAttributes = {
    val __obj = js.Dynamic.literal()
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaAttributes]
  }
  @scala.inline
  implicit class AriaAttributesOps[Self <: AriaAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other /* <: js.Any */](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-activedescendant`(`aria-activedescendant`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-activedescendant`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-activedescendant")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-atomic`(`aria-atomic`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-atomic`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-atomic")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-autocompleteList`(`aria-autocomplete`: list): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-autocomplete`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-autocomplete")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-autocompleteInline`(`aria-autocomplete`: `inline`): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-autocompleteBoth`(`aria-autocomplete`: both): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-autocompleteNone`(`aria-autocomplete`: none): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-busy`(`aria-busy`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-busy`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-busy")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-checkedMixed`(`aria-checked`: mixed): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-checkedBoolean`(`aria-checked`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-checked`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-checked")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-colcountInt`(`aria-colcount`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-colcountDouble`(`aria-colcount`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-colcount`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-colcount")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-colindexInt`(`aria-colindex`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-colindexDouble`(`aria-colindex`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-colindex`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-colindex")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-colspanInt`(`aria-colspan`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-colspanDouble`(`aria-colspan`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-colspan`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-colspan")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-controls`(`aria-controls`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-controls`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-controls")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-currentStep`(`aria-current`: step): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-currentDate`(`aria-current`: date): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-current`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-current")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-currentTime`(`aria-current`: time): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-currentPage`(`aria-current`: page): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-currentBoolean`(`aria-current`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-currentLocation`(`aria-current`: location): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-describedby`(`aria-describedby`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-describedby`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-describedby")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-details`(`aria-details`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-details`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-details")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-disabled`(`aria-disabled`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-disabled`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-disabled")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-dropeffectExecute`(`aria-dropeffect`: execute): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-dropeffectMove`(`aria-dropeffect`: move): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-dropeffectCopy`(`aria-dropeffect`: copy): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-dropeffectLink`(`aria-dropeffect`: link): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-dropeffectNone`(`aria-dropeffect`: none): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-dropeffect`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-dropeffect")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-dropeffectPopup`(`aria-dropeffect`: popup): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-errormessage`(`aria-errormessage`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-errormessage`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-errormessage")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-expanded`(`aria-expanded`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-expanded`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-expanded")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-flowto`(`aria-flowto`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-flowto`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-flowto")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-grabbed`(`aria-grabbed`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-grabbed`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-grabbed")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-haspopupDialog`(`aria-haspopup`: dialog): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-haspopupGrid`(`aria-haspopup`: grid): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-haspopupTree`(`aria-haspopup`: tree): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-haspopupListbox`(`aria-haspopup`: listbox): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-haspopup`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-haspopup")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-haspopupMenu`(`aria-haspopup`: menu): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-haspopupBoolean`(`aria-haspopup`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-hidden`(`aria-hidden`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-hidden`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-hidden")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-invalidSpelling`(`aria-invalid`: spelling): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-invalidBoolean`(`aria-invalid`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-invalidGrammar`(`aria-invalid`: grammar): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-invalid`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-invalid")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-keyshortcuts`(`aria-keyshortcuts`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-keyshortcuts`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-keyshortcuts")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-label`(`aria-label`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-label`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-label")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-labelledby`(`aria-labelledby`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-labelledby`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-labelledby")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-levelInt`(`aria-level`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-levelDouble`(`aria-level`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-level`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-level")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-livePolite`(`aria-live`: polite): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-liveAssertive`(`aria-live`: assertive): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-liveOff`(`aria-live`: off): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-live`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-live")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-modal`(`aria-modal`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-modal`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-modal")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-multiline`(`aria-multiline`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-multiline`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-multiline")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-multiselectable`(`aria-multiselectable`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-multiselectable`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-multiselectable")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-orientationHorizontal`(`aria-orientation`: horizontal): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-orientationVertical`(`aria-orientation`: vertical): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-orientation`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-orientation")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-owns`(`aria-owns`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-owns`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-owns")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-placeholder`(`aria-placeholder`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-placeholder`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-placeholder")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-posinsetInt`(`aria-posinset`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-posinsetDouble`(`aria-posinset`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-posinset`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-posinset")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-pressedMixed`(`aria-pressed`: mixed): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-pressedBoolean`(`aria-pressed`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-pressed`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-pressed")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-readonly`(`aria-readonly`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-readonly`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-readonly")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-relevantAll`(`aria-relevant`: all): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-relevantAdditions text`(`aria-relevant`: `additions text`): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-relevantRemovals`(`aria-relevant`: removals): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-relevantText`(`aria-relevant`: text): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-relevantAdditions`(`aria-relevant`: additions): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-relevant`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-relevant")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-required`(`aria-required`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-required`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-required")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-roledescription`(`aria-roledescription`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-roledescription`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-roledescription")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-rowcountInt`(`aria-rowcount`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-rowcountDouble`(`aria-rowcount`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-rowcount`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-rowcount")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-rowindexInt`(`aria-rowindex`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-rowindexDouble`(`aria-rowindex`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-rowindex`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-rowindex")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-rowspanInt`(`aria-rowspan`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-rowspanDouble`(`aria-rowspan`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-rowspan`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-rowspan")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-selected`(`aria-selected`: Boolean): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-selected`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-selected")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-setsizeInt`(`aria-setsize`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-setsizeDouble`(`aria-setsize`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-setsize`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-setsize")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-sort`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-sort")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-sortAscending`(`aria-sort`: ascending): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-sortNone`(`aria-sort`: none): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-sortOther`(`aria-sort`: other): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-sortDescending`(`aria-sort`: descending): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-valuemaxInt`(`aria-valuemax`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-valuemaxDouble`(`aria-valuemax`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-valuemax`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-valuemax")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-valueminInt`(`aria-valuemin`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-valueminDouble`(`aria-valuemin`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-valuemin`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-valuemin")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-valuenowInt`(`aria-valuenow`: Int): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-valuenowDouble`(`aria-valuenow`: Double): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-valuenow`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-valuenow")
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withAria-valuetext`(`aria-valuetext`: String): Self = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self]
    }
    @scala.inline
    def `withoutAria-valuetext`: Self = {
        val ret = this.duplicate
        js.special.delete(ret, "aria-valuetext")
        ret.asInstanceOf[Self]
    }
  }
  
}

