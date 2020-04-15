package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.`after-edge`
import typingsSlinky.react.reactStrings.`before-edge`
import typingsSlinky.react.reactStrings.`text-after-edge`
import typingsSlinky.react.reactStrings.`text-before-edge`
import typingsSlinky.react.reactStrings.alphabetic
import typingsSlinky.react.reactStrings.auto
import typingsSlinky.react.reactStrings.baseline
import typingsSlinky.react.reactStrings.bevel
import typingsSlinky.react.reactStrings.butt
import typingsSlinky.react.reactStrings.central
import typingsSlinky.react.reactStrings.evenodd
import typingsSlinky.react.reactStrings.hanging
import typingsSlinky.react.reactStrings.ideographic
import typingsSlinky.react.reactStrings.inherit
import typingsSlinky.react.reactStrings.initial
import typingsSlinky.react.reactStrings.isolated
import typingsSlinky.react.reactStrings.linearRGB
import typingsSlinky.react.reactStrings.mathematical
import typingsSlinky.react.reactStrings.medial
import typingsSlinky.react.reactStrings.middle
import typingsSlinky.react.reactStrings.miter
import typingsSlinky.react.reactStrings.no
import typingsSlinky.react.reactStrings.none
import typingsSlinky.react.reactStrings.nonzero
import typingsSlinky.react.reactStrings.replace
import typingsSlinky.react.reactStrings.round
import typingsSlinky.react.reactStrings.sRGB
import typingsSlinky.react.reactStrings.square
import typingsSlinky.react.reactStrings.sum
import typingsSlinky.react.reactStrings.terminal
import typingsSlinky.react.reactStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// this list is "complete" in that it contains every SVG attribute
// that React supports, but the types can be improved.
// Full list here: https://facebook.github.io/react/docs/dom-elements.html
//
// The three broad type categories are (in order of restrictiveness):
//   - "number | string"
//   - "string"
//   - union of string literals
@js.native
trait SVGAttributes[T]
  extends AriaAttributes
     with DOMAttributes[T] {
  // SVG Specific attributes
  var accentHeight: js.UndefOr[Double | String] = js.native
  var accumulate: js.UndefOr[none | sum] = js.native
  var additive: js.UndefOr[replace | sum] = js.native
  var alignmentBaseline: js.UndefOr[
    auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
  ] = js.native
  var allowReorder: js.UndefOr[no | yes] = js.native
  var alphabetic: js.UndefOr[Double | String] = js.native
  var amplitude: js.UndefOr[Double | String] = js.native
  var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.native
  var ascent: js.UndefOr[Double | String] = js.native
  var attributeName: js.UndefOr[String] = js.native
  var attributeType: js.UndefOr[String] = js.native
  var autoReverse: js.UndefOr[Double | String] = js.native
  var azimuth: js.UndefOr[Double | String] = js.native
  var baseFrequency: js.UndefOr[Double | String] = js.native
  var baseProfile: js.UndefOr[Double | String] = js.native
  var baselineShift: js.UndefOr[Double | String] = js.native
  var bbox: js.UndefOr[Double | String] = js.native
  var begin: js.UndefOr[Double | String] = js.native
  var bias: js.UndefOr[Double | String] = js.native
  var by: js.UndefOr[Double | String] = js.native
  var calcMode: js.UndefOr[Double | String] = js.native
  var capHeight: js.UndefOr[Double | String] = js.native
  // Attributes which also defined in HTMLAttributes
  // See comment in SVGDOMPropertyConfig.js
  var className: js.UndefOr[String] = js.native
  var clip: js.UndefOr[Double | String] = js.native
  var clipPath: js.UndefOr[String] = js.native
  var clipPathUnits: js.UndefOr[Double | String] = js.native
  var clipRule: js.UndefOr[Double | String] = js.native
  var color: js.UndefOr[String] = js.native
  var colorInterpolation: js.UndefOr[Double | String] = js.native
  var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
  var colorProfile: js.UndefOr[Double | String] = js.native
  var colorRendering: js.UndefOr[Double | String] = js.native
  var contentScriptType: js.UndefOr[Double | String] = js.native
  var contentStyleType: js.UndefOr[Double | String] = js.native
  var cursor: js.UndefOr[Double | String] = js.native
  var cx: js.UndefOr[Double | String] = js.native
  var cy: js.UndefOr[Double | String] = js.native
  var d: js.UndefOr[String] = js.native
  var decelerate: js.UndefOr[Double | String] = js.native
  var descent: js.UndefOr[Double | String] = js.native
  var diffuseConstant: js.UndefOr[Double | String] = js.native
  var direction: js.UndefOr[Double | String] = js.native
  var display: js.UndefOr[Double | String] = js.native
  var divisor: js.UndefOr[Double | String] = js.native
  var dominantBaseline: js.UndefOr[Double | String] = js.native
  var dur: js.UndefOr[Double | String] = js.native
  var dx: js.UndefOr[Double | String] = js.native
  var dy: js.UndefOr[Double | String] = js.native
  var edgeMode: js.UndefOr[Double | String] = js.native
  var elevation: js.UndefOr[Double | String] = js.native
  var enableBackground: js.UndefOr[Double | String] = js.native
  var end: js.UndefOr[Double | String] = js.native
  var exponent: js.UndefOr[Double | String] = js.native
  var externalResourcesRequired: js.UndefOr[Double | String] = js.native
  var fill: js.UndefOr[String] = js.native
  var fillOpacity: js.UndefOr[Double | String] = js.native
  var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.native
  var filter: js.UndefOr[String] = js.native
  var filterRes: js.UndefOr[Double | String] = js.native
  var filterUnits: js.UndefOr[Double | String] = js.native
  var floodColor: js.UndefOr[Double | String] = js.native
  var floodOpacity: js.UndefOr[Double | String] = js.native
  var focusable: js.UndefOr[Double | String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double | String] = js.native
  var fontSizeAdjust: js.UndefOr[Double | String] = js.native
  var fontStretch: js.UndefOr[Double | String] = js.native
  var fontStyle: js.UndefOr[Double | String] = js.native
  var fontVariant: js.UndefOr[Double | String] = js.native
  var fontWeight: js.UndefOr[Double | String] = js.native
  var format: js.UndefOr[Double | String] = js.native
  var from: js.UndefOr[Double | String] = js.native
  var fx: js.UndefOr[Double | String] = js.native
  var fy: js.UndefOr[Double | String] = js.native
  var g1: js.UndefOr[Double | String] = js.native
  var g2: js.UndefOr[Double | String] = js.native
  var glyphName: js.UndefOr[Double | String] = js.native
  var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.native
  var glyphOrientationVertical: js.UndefOr[Double | String] = js.native
  var glyphRef: js.UndefOr[Double | String] = js.native
  var gradientTransform: js.UndefOr[String] = js.native
  var gradientUnits: js.UndefOr[String] = js.native
  var hanging: js.UndefOr[Double | String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var horizAdvX: js.UndefOr[Double | String] = js.native
  var horizOriginX: js.UndefOr[Double | String] = js.native
  var href: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var ideographic: js.UndefOr[Double | String] = js.native
  var imageRendering: js.UndefOr[Double | String] = js.native
  var in: js.UndefOr[String] = js.native
  var in2: js.UndefOr[Double | String] = js.native
  var intercept: js.UndefOr[Double | String] = js.native
  var k: js.UndefOr[Double | String] = js.native
  var k1: js.UndefOr[Double | String] = js.native
  var k2: js.UndefOr[Double | String] = js.native
  var k3: js.UndefOr[Double | String] = js.native
  var k4: js.UndefOr[Double | String] = js.native
  var kernelMatrix: js.UndefOr[Double | String] = js.native
  var kernelUnitLength: js.UndefOr[Double | String] = js.native
  var kerning: js.UndefOr[Double | String] = js.native
  var keyPoints: js.UndefOr[Double | String] = js.native
  var keySplines: js.UndefOr[Double | String] = js.native
  var keyTimes: js.UndefOr[Double | String] = js.native
  var lang: js.UndefOr[String] = js.native
  var lengthAdjust: js.UndefOr[Double | String] = js.native
  var letterSpacing: js.UndefOr[Double | String] = js.native
  var lightingColor: js.UndefOr[Double | String] = js.native
  var limitingConeAngle: js.UndefOr[Double | String] = js.native
  var local: js.UndefOr[Double | String] = js.native
  var markerEnd: js.UndefOr[String] = js.native
  var markerHeight: js.UndefOr[Double | String] = js.native
  var markerMid: js.UndefOr[String] = js.native
  var markerStart: js.UndefOr[String] = js.native
  var markerUnits: js.UndefOr[Double | String] = js.native
  var markerWidth: js.UndefOr[Double | String] = js.native
  var mask: js.UndefOr[String] = js.native
  var maskContentUnits: js.UndefOr[Double | String] = js.native
  var maskUnits: js.UndefOr[Double | String] = js.native
  var mathematical: js.UndefOr[Double | String] = js.native
  var max: js.UndefOr[Double | String] = js.native
  var media: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var min: js.UndefOr[Double | String] = js.native
  var mode: js.UndefOr[Double | String] = js.native
  var name: js.UndefOr[String] = js.native
  var numOctaves: js.UndefOr[Double | String] = js.native
  var offset: js.UndefOr[Double | String] = js.native
  var opacity: js.UndefOr[Double | String] = js.native
  var operator: js.UndefOr[Double | String] = js.native
  var order: js.UndefOr[Double | String] = js.native
  var orient: js.UndefOr[Double | String] = js.native
  var orientation: js.UndefOr[Double | String] = js.native
  var origin: js.UndefOr[Double | String] = js.native
  var overflow: js.UndefOr[Double | String] = js.native
  var overlinePosition: js.UndefOr[Double | String] = js.native
  var overlineThickness: js.UndefOr[Double | String] = js.native
  var paintOrder: js.UndefOr[Double | String] = js.native
  var panose1: js.UndefOr[Double | String] = js.native
  var pathLength: js.UndefOr[Double | String] = js.native
  var patternContentUnits: js.UndefOr[String] = js.native
  var patternTransform: js.UndefOr[Double | String] = js.native
  var patternUnits: js.UndefOr[String] = js.native
  var pointerEvents: js.UndefOr[Double | String] = js.native
  var points: js.UndefOr[String] = js.native
  var pointsAtX: js.UndefOr[Double | String] = js.native
  var pointsAtY: js.UndefOr[Double | String] = js.native
  var pointsAtZ: js.UndefOr[Double | String] = js.native
  var preserveAlpha: js.UndefOr[Double | String] = js.native
  var preserveAspectRatio: js.UndefOr[String] = js.native
  var primitiveUnits: js.UndefOr[Double | String] = js.native
  var r: js.UndefOr[Double | String] = js.native
  var radius: js.UndefOr[Double | String] = js.native
  var refX: js.UndefOr[Double | String] = js.native
  var refY: js.UndefOr[Double | String] = js.native
  var renderingIntent: js.UndefOr[Double | String] = js.native
  var repeatCount: js.UndefOr[Double | String] = js.native
  var repeatDur: js.UndefOr[Double | String] = js.native
  var requiredExtensions: js.UndefOr[Double | String] = js.native
  var requiredFeatures: js.UndefOr[Double | String] = js.native
  var restart: js.UndefOr[Double | String] = js.native
  var result: js.UndefOr[String] = js.native
  // Other HTML properties supported by SVG elements in browsers
  var role: js.UndefOr[String] = js.native
  var rotate: js.UndefOr[Double | String] = js.native
  var rx: js.UndefOr[Double | String] = js.native
  var ry: js.UndefOr[Double | String] = js.native
  var scale: js.UndefOr[Double | String] = js.native
  var seed: js.UndefOr[Double | String] = js.native
  var shapeRendering: js.UndefOr[Double | String] = js.native
  var slope: js.UndefOr[Double | String] = js.native
  var spacing: js.UndefOr[Double | String] = js.native
  var specularConstant: js.UndefOr[Double | String] = js.native
  var specularExponent: js.UndefOr[Double | String] = js.native
  var speed: js.UndefOr[Double | String] = js.native
  var spreadMethod: js.UndefOr[String] = js.native
  var startOffset: js.UndefOr[Double | String] = js.native
  var stdDeviation: js.UndefOr[Double | String] = js.native
  var stemh: js.UndefOr[Double | String] = js.native
  var stemv: js.UndefOr[Double | String] = js.native
  var stitchTiles: js.UndefOr[Double | String] = js.native
  var stopColor: js.UndefOr[String] = js.native
  var stopOpacity: js.UndefOr[Double | String] = js.native
  var strikethroughPosition: js.UndefOr[Double | String] = js.native
  var strikethroughThickness: js.UndefOr[Double | String] = js.native
  var string: js.UndefOr[Double | String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeDasharray: js.UndefOr[String | Double] = js.native
  var strokeDashoffset: js.UndefOr[String | Double] = js.native
  var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.native
  var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.native
  var strokeMiterlimit: js.UndefOr[Double | String] = js.native
  var strokeOpacity: js.UndefOr[Double | String] = js.native
  var strokeWidth: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var surfaceScale: js.UndefOr[Double | String] = js.native
  var systemLanguage: js.UndefOr[Double | String] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tableValues: js.UndefOr[Double | String] = js.native
  var target: js.UndefOr[String] = js.native
  var targetX: js.UndefOr[Double | String] = js.native
  var targetY: js.UndefOr[Double | String] = js.native
  var textAnchor: js.UndefOr[String] = js.native
  var textDecoration: js.UndefOr[Double | String] = js.native
  var textLength: js.UndefOr[Double | String] = js.native
  var textRendering: js.UndefOr[Double | String] = js.native
  var to: js.UndefOr[Double | String] = js.native
  var transform: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var u1: js.UndefOr[Double | String] = js.native
  var u2: js.UndefOr[Double | String] = js.native
  var underlinePosition: js.UndefOr[Double | String] = js.native
  var underlineThickness: js.UndefOr[Double | String] = js.native
  var unicode: js.UndefOr[Double | String] = js.native
  var unicodeBidi: js.UndefOr[Double | String] = js.native
  var unicodeRange: js.UndefOr[Double | String] = js.native
  var unitsPerEm: js.UndefOr[Double | String] = js.native
  var vAlphabetic: js.UndefOr[Double | String] = js.native
  var vHanging: js.UndefOr[Double | String] = js.native
  var vIdeographic: js.UndefOr[Double | String] = js.native
  var vMathematical: js.UndefOr[Double | String] = js.native
  var values: js.UndefOr[String] = js.native
  var vectorEffect: js.UndefOr[Double | String] = js.native
  var version: js.UndefOr[String] = js.native
  var vertAdvY: js.UndefOr[Double | String] = js.native
  var vertOriginX: js.UndefOr[Double | String] = js.native
  var vertOriginY: js.UndefOr[Double | String] = js.native
  var viewBox: js.UndefOr[String] = js.native
  var viewTarget: js.UndefOr[Double | String] = js.native
  var visibility: js.UndefOr[Double | String] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var widths: js.UndefOr[Double | String] = js.native
  var wordSpacing: js.UndefOr[Double | String] = js.native
  var writingMode: js.UndefOr[Double | String] = js.native
  var x: js.UndefOr[Double | String] = js.native
  var x1: js.UndefOr[Double | String] = js.native
  var x2: js.UndefOr[Double | String] = js.native
  var xChannelSelector: js.UndefOr[String] = js.native
  var xHeight: js.UndefOr[Double | String] = js.native
  var xlinkActuate: js.UndefOr[String] = js.native
  var xlinkArcrole: js.UndefOr[String] = js.native
  var xlinkHref: js.UndefOr[String] = js.native
  var xlinkRole: js.UndefOr[String] = js.native
  var xlinkShow: js.UndefOr[String] = js.native
  var xlinkTitle: js.UndefOr[String] = js.native
  var xlinkType: js.UndefOr[String] = js.native
  var xmlBase: js.UndefOr[String] = js.native
  var xmlLang: js.UndefOr[String] = js.native
  var xmlSpace: js.UndefOr[String] = js.native
  var xmlns: js.UndefOr[String] = js.native
  var xmlnsXlink: js.UndefOr[String] = js.native
  var y: js.UndefOr[Double | String] = js.native
  var y1: js.UndefOr[Double | String] = js.native
  var y2: js.UndefOr[Double | String] = js.native
  var yChannelSelector: js.UndefOr[String] = js.native
  var z: js.UndefOr[Double | String] = js.native
  var zoomAndPan: js.UndefOr[String] = js.native
}

object SVGAttributes {
  @scala.inline
  def apply[T](
    AriaAttributes: AriaAttributes = null,
    DOMAttributes: DOMAttributes[T] = null,
    accentHeight: Double | String = null,
    accumulate: none | sum = null,
    additive: replace | sum = null,
    alignmentBaseline: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit = null,
    allowReorder: no | yes = null,
    alphabetic: Double | String = null,
    amplitude: Double | String = null,
    arabicForm: initial | medial | terminal | isolated = null,
    ascent: Double | String = null,
    attributeName: String = null,
    attributeType: String = null,
    autoReverse: Double | String = null,
    azimuth: Double | String = null,
    baseFrequency: Double | String = null,
    baseProfile: Double | String = null,
    baselineShift: Double | String = null,
    bbox: Double | String = null,
    begin: Double | String = null,
    bias: Double | String = null,
    by: Double | String = null,
    calcMode: Double | String = null,
    capHeight: Double | String = null,
    className: String = null,
    clip: Double | String = null,
    clipPath: String = null,
    clipPathUnits: Double | String = null,
    clipRule: Double | String = null,
    color: String = null,
    colorInterpolation: Double | String = null,
    colorInterpolationFilters: auto | sRGB | linearRGB | inherit = null,
    colorProfile: Double | String = null,
    colorRendering: Double | String = null,
    contentScriptType: Double | String = null,
    contentStyleType: Double | String = null,
    cursor: Double | String = null,
    cx: Double | String = null,
    cy: Double | String = null,
    d: String = null,
    decelerate: Double | String = null,
    descent: Double | String = null,
    diffuseConstant: Double | String = null,
    direction: Double | String = null,
    display: Double | String = null,
    divisor: Double | String = null,
    dominantBaseline: Double | String = null,
    dur: Double | String = null,
    dx: Double | String = null,
    dy: Double | String = null,
    edgeMode: Double | String = null,
    elevation: Double | String = null,
    enableBackground: Double | String = null,
    end: Double | String = null,
    exponent: Double | String = null,
    externalResourcesRequired: Double | String = null,
    fill: String = null,
    fillOpacity: Double | String = null,
    fillRule: nonzero | evenodd | inherit = null,
    filter: String = null,
    filterRes: Double | String = null,
    filterUnits: Double | String = null,
    floodColor: Double | String = null,
    floodOpacity: Double | String = null,
    focusable: Double | String = null,
    fontFamily: String = null,
    fontSize: Double | String = null,
    fontSizeAdjust: Double | String = null,
    fontStretch: Double | String = null,
    fontStyle: Double | String = null,
    fontVariant: Double | String = null,
    fontWeight: Double | String = null,
    format: Double | String = null,
    from: Double | String = null,
    fx: Double | String = null,
    fy: Double | String = null,
    g1: Double | String = null,
    g2: Double | String = null,
    glyphName: Double | String = null,
    glyphOrientationHorizontal: Double | String = null,
    glyphOrientationVertical: Double | String = null,
    glyphRef: Double | String = null,
    gradientTransform: String = null,
    gradientUnits: String = null,
    hanging: Double | String = null,
    height: Double | String = null,
    horizAdvX: Double | String = null,
    horizOriginX: Double | String = null,
    href: String = null,
    id: String = null,
    ideographic: Double | String = null,
    imageRendering: Double | String = null,
    in: String = null,
    in2: Double | String = null,
    intercept: Double | String = null,
    k: Double | String = null,
    k1: Double | String = null,
    k2: Double | String = null,
    k3: Double | String = null,
    k4: Double | String = null,
    kernelMatrix: Double | String = null,
    kernelUnitLength: Double | String = null,
    kerning: Double | String = null,
    keyPoints: Double | String = null,
    keySplines: Double | String = null,
    keyTimes: Double | String = null,
    lang: String = null,
    lengthAdjust: Double | String = null,
    letterSpacing: Double | String = null,
    lightingColor: Double | String = null,
    limitingConeAngle: Double | String = null,
    local: Double | String = null,
    markerEnd: String = null,
    markerHeight: Double | String = null,
    markerMid: String = null,
    markerStart: String = null,
    markerUnits: Double | String = null,
    markerWidth: Double | String = null,
    mask: String = null,
    maskContentUnits: Double | String = null,
    maskUnits: Double | String = null,
    mathematical: Double | String = null,
    max: Double | String = null,
    media: String = null,
    method: String = null,
    min: Double | String = null,
    mode: Double | String = null,
    name: String = null,
    numOctaves: Double | String = null,
    offset: Double | String = null,
    opacity: Double | String = null,
    operator: Double | String = null,
    order: Double | String = null,
    orient: Double | String = null,
    orientation: Double | String = null,
    origin: Double | String = null,
    overflow: Double | String = null,
    overlinePosition: Double | String = null,
    overlineThickness: Double | String = null,
    paintOrder: Double | String = null,
    panose1: Double | String = null,
    pathLength: Double | String = null,
    patternContentUnits: String = null,
    patternTransform: Double | String = null,
    patternUnits: String = null,
    pointerEvents: Double | String = null,
    points: String = null,
    pointsAtX: Double | String = null,
    pointsAtY: Double | String = null,
    pointsAtZ: Double | String = null,
    preserveAlpha: Double | String = null,
    preserveAspectRatio: String = null,
    primitiveUnits: Double | String = null,
    r: Double | String = null,
    radius: Double | String = null,
    refX: Double | String = null,
    refY: Double | String = null,
    renderingIntent: Double | String = null,
    repeatCount: Double | String = null,
    repeatDur: Double | String = null,
    requiredExtensions: Double | String = null,
    requiredFeatures: Double | String = null,
    restart: Double | String = null,
    result: String = null,
    role: String = null,
    rotate: Double | String = null,
    rx: Double | String = null,
    ry: Double | String = null,
    scale: Double | String = null,
    seed: Double | String = null,
    shapeRendering: Double | String = null,
    slope: Double | String = null,
    spacing: Double | String = null,
    specularConstant: Double | String = null,
    specularExponent: Double | String = null,
    speed: Double | String = null,
    spreadMethod: String = null,
    startOffset: Double | String = null,
    stdDeviation: Double | String = null,
    stemh: Double | String = null,
    stemv: Double | String = null,
    stitchTiles: Double | String = null,
    stopColor: String = null,
    stopOpacity: Double | String = null,
    strikethroughPosition: Double | String = null,
    strikethroughThickness: Double | String = null,
    string: Double | String = null,
    stroke: String = null,
    strokeDasharray: String | Double = null,
    strokeDashoffset: String | Double = null,
    strokeLinecap: butt | round | square | inherit = null,
    strokeLinejoin: miter | round | bevel | inherit = null,
    strokeMiterlimit: Double | String = null,
    strokeOpacity: Double | String = null,
    strokeWidth: Double | String = null,
    style: CSSProperties = null,
    surfaceScale: Double | String = null,
    systemLanguage: Double | String = null,
    tabIndex: Int | Double = null,
    tableValues: Double | String = null,
    target: String = null,
    targetX: Double | String = null,
    targetY: Double | String = null,
    textAnchor: String = null,
    textDecoration: Double | String = null,
    textLength: Double | String = null,
    textRendering: Double | String = null,
    to: Double | String = null,
    transform: String = null,
    `type`: String = null,
    u1: Double | String = null,
    u2: Double | String = null,
    underlinePosition: Double | String = null,
    underlineThickness: Double | String = null,
    unicode: Double | String = null,
    unicodeBidi: Double | String = null,
    unicodeRange: Double | String = null,
    unitsPerEm: Double | String = null,
    vAlphabetic: Double | String = null,
    vHanging: Double | String = null,
    vIdeographic: Double | String = null,
    vMathematical: Double | String = null,
    values: String = null,
    vectorEffect: Double | String = null,
    version: String = null,
    vertAdvY: Double | String = null,
    vertOriginX: Double | String = null,
    vertOriginY: Double | String = null,
    viewBox: String = null,
    viewTarget: Double | String = null,
    visibility: Double | String = null,
    width: Double | String = null,
    widths: Double | String = null,
    wordSpacing: Double | String = null,
    writingMode: Double | String = null,
    x: Double | String = null,
    x1: Double | String = null,
    x2: Double | String = null,
    xChannelSelector: String = null,
    xHeight: Double | String = null,
    xlinkActuate: String = null,
    xlinkArcrole: String = null,
    xlinkHref: String = null,
    xlinkRole: String = null,
    xlinkShow: String = null,
    xlinkTitle: String = null,
    xlinkType: String = null,
    xmlBase: String = null,
    xmlLang: String = null,
    xmlSpace: String = null,
    xmlns: String = null,
    xmlnsXlink: String = null,
    y: Double | String = null,
    y1: Double | String = null
  ): SVGAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (AriaAttributes != null) js.Dynamic.global.Object.assign(__obj, AriaAttributes)
    if (DOMAttributes != null) js.Dynamic.global.Object.assign(__obj, DOMAttributes)
    if (accentHeight != null) __obj.updateDynamic("accentHeight")(accentHeight.asInstanceOf[js.Any])
    if (accumulate != null) __obj.updateDynamic("accumulate")(accumulate.asInstanceOf[js.Any])
    if (additive != null) __obj.updateDynamic("additive")(additive.asInstanceOf[js.Any])
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (allowReorder != null) __obj.updateDynamic("allowReorder")(allowReorder.asInstanceOf[js.Any])
    if (alphabetic != null) __obj.updateDynamic("alphabetic")(alphabetic.asInstanceOf[js.Any])
    if (amplitude != null) __obj.updateDynamic("amplitude")(amplitude.asInstanceOf[js.Any])
    if (arabicForm != null) __obj.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
    if (ascent != null) __obj.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (attributeType != null) __obj.updateDynamic("attributeType")(attributeType.asInstanceOf[js.Any])
    if (autoReverse != null) __obj.updateDynamic("autoReverse")(autoReverse.asInstanceOf[js.Any])
    if (azimuth != null) __obj.updateDynamic("azimuth")(azimuth.asInstanceOf[js.Any])
    if (baseFrequency != null) __obj.updateDynamic("baseFrequency")(baseFrequency.asInstanceOf[js.Any])
    if (baseProfile != null) __obj.updateDynamic("baseProfile")(baseProfile.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (by != null) __obj.updateDynamic("by")(by.asInstanceOf[js.Any])
    if (calcMode != null) __obj.updateDynamic("calcMode")(calcMode.asInstanceOf[js.Any])
    if (capHeight != null) __obj.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipPathUnits != null) __obj.updateDynamic("clipPathUnits")(clipPathUnits.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorInterpolationFilters != null) __obj.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
    if (colorProfile != null) __obj.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (contentScriptType != null) __obj.updateDynamic("contentScriptType")(contentScriptType.asInstanceOf[js.Any])
    if (contentStyleType != null) __obj.updateDynamic("contentStyleType")(contentStyleType.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (decelerate != null) __obj.updateDynamic("decelerate")(decelerate.asInstanceOf[js.Any])
    if (descent != null) __obj.updateDynamic("descent")(descent.asInstanceOf[js.Any])
    if (diffuseConstant != null) __obj.updateDynamic("diffuseConstant")(diffuseConstant.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (divisor != null) __obj.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (dur != null) __obj.updateDynamic("dur")(dur.asInstanceOf[js.Any])
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (edgeMode != null) __obj.updateDynamic("edgeMode")(edgeMode.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (enableBackground != null) __obj.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (exponent != null) __obj.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
    if (externalResourcesRequired != null) __obj.updateDynamic("externalResourcesRequired")(externalResourcesRequired.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterRes != null) __obj.updateDynamic("filterRes")(filterRes.asInstanceOf[js.Any])
    if (filterUnits != null) __obj.updateDynamic("filterUnits")(filterUnits.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fy != null) __obj.updateDynamic("fy")(fy.asInstanceOf[js.Any])
    if (g1 != null) __obj.updateDynamic("g1")(g1.asInstanceOf[js.Any])
    if (g2 != null) __obj.updateDynamic("g2")(g2.asInstanceOf[js.Any])
    if (glyphName != null) __obj.updateDynamic("glyphName")(glyphName.asInstanceOf[js.Any])
    if (glyphOrientationHorizontal != null) __obj.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (glyphRef != null) __obj.updateDynamic("glyphRef")(glyphRef.asInstanceOf[js.Any])
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (hanging != null) __obj.updateDynamic("hanging")(hanging.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizAdvX != null) __obj.updateDynamic("horizAdvX")(horizAdvX.asInstanceOf[js.Any])
    if (horizOriginX != null) __obj.updateDynamic("horizOriginX")(horizOriginX.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ideographic != null) __obj.updateDynamic("ideographic")(ideographic.asInstanceOf[js.Any])
    if (imageRendering != null) __obj.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (in2 != null) __obj.updateDynamic("in2")(in2.asInstanceOf[js.Any])
    if (intercept != null) __obj.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
    if (k != null) __obj.updateDynamic("k")(k.asInstanceOf[js.Any])
    if (k1 != null) __obj.updateDynamic("k1")(k1.asInstanceOf[js.Any])
    if (k2 != null) __obj.updateDynamic("k2")(k2.asInstanceOf[js.Any])
    if (k3 != null) __obj.updateDynamic("k3")(k3.asInstanceOf[js.Any])
    if (k4 != null) __obj.updateDynamic("k4")(k4.asInstanceOf[js.Any])
    if (kernelMatrix != null) __obj.updateDynamic("kernelMatrix")(kernelMatrix.asInstanceOf[js.Any])
    if (kernelUnitLength != null) __obj.updateDynamic("kernelUnitLength")(kernelUnitLength.asInstanceOf[js.Any])
    if (kerning != null) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (keyPoints != null) __obj.updateDynamic("keyPoints")(keyPoints.asInstanceOf[js.Any])
    if (keySplines != null) __obj.updateDynamic("keySplines")(keySplines.asInstanceOf[js.Any])
    if (keyTimes != null) __obj.updateDynamic("keyTimes")(keyTimes.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (lengthAdjust != null) __obj.updateDynamic("lengthAdjust")(lengthAdjust.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (limitingConeAngle != null) __obj.updateDynamic("limitingConeAngle")(limitingConeAngle.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerHeight != null) __obj.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (markerUnits != null) __obj.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
    if (markerWidth != null) __obj.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskContentUnits != null) __obj.updateDynamic("maskContentUnits")(maskContentUnits.asInstanceOf[js.Any])
    if (maskUnits != null) __obj.updateDynamic("maskUnits")(maskUnits.asInstanceOf[js.Any])
    if (mathematical != null) __obj.updateDynamic("mathematical")(mathematical.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numOctaves != null) __obj.updateDynamic("numOctaves")(numOctaves.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overlinePosition != null) __obj.updateDynamic("overlinePosition")(overlinePosition.asInstanceOf[js.Any])
    if (overlineThickness != null) __obj.updateDynamic("overlineThickness")(overlineThickness.asInstanceOf[js.Any])
    if (paintOrder != null) __obj.updateDynamic("paintOrder")(paintOrder.asInstanceOf[js.Any])
    if (panose1 != null) __obj.updateDynamic("panose1")(panose1.asInstanceOf[js.Any])
    if (pathLength != null) __obj.updateDynamic("pathLength")(pathLength.asInstanceOf[js.Any])
    if (patternContentUnits != null) __obj.updateDynamic("patternContentUnits")(patternContentUnits.asInstanceOf[js.Any])
    if (patternTransform != null) __obj.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
    if (patternUnits != null) __obj.updateDynamic("patternUnits")(patternUnits.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (pointsAtX != null) __obj.updateDynamic("pointsAtX")(pointsAtX.asInstanceOf[js.Any])
    if (pointsAtY != null) __obj.updateDynamic("pointsAtY")(pointsAtY.asInstanceOf[js.Any])
    if (pointsAtZ != null) __obj.updateDynamic("pointsAtZ")(pointsAtZ.asInstanceOf[js.Any])
    if (preserveAlpha != null) __obj.updateDynamic("preserveAlpha")(preserveAlpha.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (primitiveUnits != null) __obj.updateDynamic("primitiveUnits")(primitiveUnits.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (refX != null) __obj.updateDynamic("refX")(refX.asInstanceOf[js.Any])
    if (refY != null) __obj.updateDynamic("refY")(refY.asInstanceOf[js.Any])
    if (renderingIntent != null) __obj.updateDynamic("renderingIntent")(renderingIntent.asInstanceOf[js.Any])
    if (repeatCount != null) __obj.updateDynamic("repeatCount")(repeatCount.asInstanceOf[js.Any])
    if (repeatDur != null) __obj.updateDynamic("repeatDur")(repeatDur.asInstanceOf[js.Any])
    if (requiredExtensions != null) __obj.updateDynamic("requiredExtensions")(requiredExtensions.asInstanceOf[js.Any])
    if (requiredFeatures != null) __obj.updateDynamic("requiredFeatures")(requiredFeatures.asInstanceOf[js.Any])
    if (restart != null) __obj.updateDynamic("restart")(restart.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (slope != null) __obj.updateDynamic("slope")(slope.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (specularConstant != null) __obj.updateDynamic("specularConstant")(specularConstant.asInstanceOf[js.Any])
    if (specularExponent != null) __obj.updateDynamic("specularExponent")(specularExponent.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (spreadMethod != null) __obj.updateDynamic("spreadMethod")(spreadMethod.asInstanceOf[js.Any])
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
    if (stdDeviation != null) __obj.updateDynamic("stdDeviation")(stdDeviation.asInstanceOf[js.Any])
    if (stemh != null) __obj.updateDynamic("stemh")(stemh.asInstanceOf[js.Any])
    if (stemv != null) __obj.updateDynamic("stemv")(stemv.asInstanceOf[js.Any])
    if (stitchTiles != null) __obj.updateDynamic("stitchTiles")(stitchTiles.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    if (strikethroughPosition != null) __obj.updateDynamic("strikethroughPosition")(strikethroughPosition.asInstanceOf[js.Any])
    if (strikethroughThickness != null) __obj.updateDynamic("strikethroughThickness")(strikethroughThickness.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (surfaceScale != null) __obj.updateDynamic("surfaceScale")(surfaceScale.asInstanceOf[js.Any])
    if (systemLanguage != null) __obj.updateDynamic("systemLanguage")(systemLanguage.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tableValues != null) __obj.updateDynamic("tableValues")(tableValues.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetX != null) __obj.updateDynamic("targetX")(targetX.asInstanceOf[js.Any])
    if (targetY != null) __obj.updateDynamic("targetY")(targetY.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textLength != null) __obj.updateDynamic("textLength")(textLength.asInstanceOf[js.Any])
    if (textRendering != null) __obj.updateDynamic("textRendering")(textRendering.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (u1 != null) __obj.updateDynamic("u1")(u1.asInstanceOf[js.Any])
    if (u2 != null) __obj.updateDynamic("u2")(u2.asInstanceOf[js.Any])
    if (underlinePosition != null) __obj.updateDynamic("underlinePosition")(underlinePosition.asInstanceOf[js.Any])
    if (underlineThickness != null) __obj.updateDynamic("underlineThickness")(underlineThickness.asInstanceOf[js.Any])
    if (unicode != null) __obj.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
    if (unicodeBidi != null) __obj.updateDynamic("unicodeBidi")(unicodeBidi.asInstanceOf[js.Any])
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
    if (unitsPerEm != null) __obj.updateDynamic("unitsPerEm")(unitsPerEm.asInstanceOf[js.Any])
    if (vAlphabetic != null) __obj.updateDynamic("vAlphabetic")(vAlphabetic.asInstanceOf[js.Any])
    if (vHanging != null) __obj.updateDynamic("vHanging")(vHanging.asInstanceOf[js.Any])
    if (vIdeographic != null) __obj.updateDynamic("vIdeographic")(vIdeographic.asInstanceOf[js.Any])
    if (vMathematical != null) __obj.updateDynamic("vMathematical")(vMathematical.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vertAdvY != null) __obj.updateDynamic("vertAdvY")(vertAdvY.asInstanceOf[js.Any])
    if (vertOriginX != null) __obj.updateDynamic("vertOriginX")(vertOriginX.asInstanceOf[js.Any])
    if (vertOriginY != null) __obj.updateDynamic("vertOriginY")(vertOriginY.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (viewTarget != null) __obj.updateDynamic("viewTarget")(viewTarget.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    if (wordSpacing != null) __obj.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
    if (writingMode != null) __obj.updateDynamic("writingMode")(writingMode.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (xChannelSelector != null) __obj.updateDynamic("xChannelSelector")(xChannelSelector.asInstanceOf[js.Any])
    if (xHeight != null) __obj.updateDynamic("xHeight")(xHeight.asInstanceOf[js.Any])
    if (xlinkActuate != null) __obj.updateDynamic("xlinkActuate")(xlinkActuate.asInstanceOf[js.Any])
    if (xlinkArcrole != null) __obj.updateDynamic("xlinkArcrole")(xlinkArcrole.asInstanceOf[js.Any])
    if (xlinkHref != null) __obj.updateDynamic("xlinkHref")(xlinkHref.asInstanceOf[js.Any])
    if (xlinkRole != null) __obj.updateDynamic("xlinkRole")(xlinkRole.asInstanceOf[js.Any])
    if (xlinkShow != null) __obj.updateDynamic("xlinkShow")(xlinkShow.asInstanceOf[js.Any])
    if (xlinkTitle != null) __obj.updateDynamic("xlinkTitle")(xlinkTitle.asInstanceOf[js.Any])
    if (xlinkType != null) __obj.updateDynamic("xlinkType")(xlinkType.asInstanceOf[js.Any])
    if (xmlBase != null) __obj.updateDynamic("xmlBase")(xmlBase.asInstanceOf[js.Any])
    if (xmlLang != null) __obj.updateDynamic("xmlLang")(xmlLang.asInstanceOf[js.Any])
    if (xmlSpace != null) __obj.updateDynamic("xmlSpace")(xmlSpace.asInstanceOf[js.Any])
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
    if (xmlnsXlink != null) __obj.updateDynamic("xmlnsXlink")(xmlnsXlink.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAttributes[T]]
  }
  @scala.inline
  implicit class SVGAttributesOps[Self[t] <: SVGAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other /* <: js.Any */](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAccentHeightString(accentHeight: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("accentHeight")(accentHeight.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAccentHeightDouble(accentHeight: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("accentHeight")(accentHeight.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAccentHeight: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "accentHeight")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAccumulateNone(accumulate: none): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("accumulate")(accumulate.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAccumulateSum(accumulate: sum): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("accumulate")(accumulate.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAccumulate: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "accumulate")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAdditiveReplace(additive: replace): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("additive")(additive.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAdditiveSum(additive: sum): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("additive")(additive.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAdditive: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "additive")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlignmentBaselineInherit(alignmentBaseline: inherit): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlignmentBaselineMathematical(alignmentBaseline: mathematical): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def `withAlignmentBaselineText-after-edge`(alignmentBaseline: `text-after-edge`): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def `withAlignmentBaselineText-before-edge`(alignmentBaseline: `text-before-edge`): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAlignmentBaseline: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "alignmentBaseline")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlignmentBaselineHanging(alignmentBaseline: hanging): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def `withAlignmentBaselineAfter-edge`(alignmentBaseline: `after-edge`): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlignmentBaselineCentral(alignmentBaseline: central): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlignmentBaselineIdeographic(alignmentBaseline: ideographic): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def `withAlignmentBaselineBefore-edge`(alignmentBaseline: `before-edge`): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlignmentBaselineAuto(alignmentBaseline: auto): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlignmentBaselineBaseline(alignmentBaseline: baseline): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlignmentBaselineMiddle(alignmentBaseline: middle): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlignmentBaselineAlphabetic(alignmentBaseline: alphabetic): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAllowReorderYes(allowReorder: yes): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("allowReorder")(allowReorder.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAllowReorderNo(allowReorder: no): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("allowReorder")(allowReorder.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAllowReorder: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "allowReorder")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlphabeticString(alphabetic: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alphabetic")(alphabetic.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAlphabeticDouble(alphabetic: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("alphabetic")(alphabetic.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAlphabetic: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "alphabetic")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAmplitudeString(amplitude: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("amplitude")(amplitude.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAmplitudeDouble(amplitude: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("amplitude")(amplitude.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAmplitude: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "amplitude")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withArabicFormInitial(arabicForm: initial): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withArabicFormMedial(arabicForm: medial): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutArabicForm: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "arabicForm")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withArabicFormIsolated(arabicForm: isolated): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withArabicFormTerminal(arabicForm: terminal): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("arabicForm")(arabicForm.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAscentString(ascent: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAscentDouble(ascent: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ascent")(ascent.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAscent: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "ascent")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAttributeName(attributeName: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAttributeName: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "attributeName")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAttributeType(attributeType: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("attributeType")(attributeType.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAttributeType: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "attributeType")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAutoReverseString(autoReverse: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("autoReverse")(autoReverse.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAutoReverseDouble(autoReverse: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("autoReverse")(autoReverse.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAutoReverse: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "autoReverse")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAzimuthString(azimuth: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("azimuth")(azimuth.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withAzimuthDouble(azimuth: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("azimuth")(azimuth.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutAzimuth: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "azimuth")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBaseFrequencyString(baseFrequency: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("baseFrequency")(baseFrequency.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBaseFrequencyDouble(baseFrequency: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("baseFrequency")(baseFrequency.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutBaseFrequency: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "baseFrequency")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBaseProfileString(baseProfile: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("baseProfile")(baseProfile.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBaseProfileDouble(baseProfile: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("baseProfile")(baseProfile.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutBaseProfile: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "baseProfile")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBaselineShiftString(baselineShift: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBaselineShiftDouble(baselineShift: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutBaselineShift: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "baselineShift")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBboxString(bbox: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBboxDouble(bbox: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutBbox: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "bbox")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBeginString(begin: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("begin")(begin.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBeginDouble(begin: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("begin")(begin.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutBegin: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "begin")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBiasString(bias: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("bias")(bias.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withBiasDouble(bias: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("bias")(bias.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutBias: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "bias")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withByString(by: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("by")(by.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withByDouble(by: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("by")(by.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutBy: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "by")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withCalcModeString(calcMode: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("calcMode")(calcMode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withCalcModeDouble(calcMode: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("calcMode")(calcMode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutCalcMode: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "calcMode")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withCapHeightString(capHeight: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withCapHeightDouble(capHeight: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("capHeight")(capHeight.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutCapHeight: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "capHeight")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withClassName(className: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("className")(className.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "className")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withClipString(clip: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("clip")(clip.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withClipDouble(clip: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("clip")(clip.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutClip: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "clip")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withClipPath(clipPath: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutClipPath: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "clipPath")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withClipPathUnitsString(clipPathUnits: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("clipPathUnits")(clipPathUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withClipPathUnitsDouble(clipPathUnits: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("clipPathUnits")(clipPathUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutClipPathUnits: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "clipPathUnits")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withClipRuleString(clipRule: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withClipRuleDouble(clipRule: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutClipRule: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "clipRule")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColor(color: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("color")(color.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutColor: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "color")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColorInterpolationString(colorInterpolation: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColorInterpolationDouble(colorInterpolation: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutColorInterpolation: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "colorInterpolation")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColorInterpolationFiltersLinearRGB(colorInterpolationFilters: linearRGB): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColorInterpolationFiltersInherit(colorInterpolationFilters: inherit): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColorInterpolationFiltersAuto(colorInterpolationFilters: auto): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColorInterpolationFiltersSRGB(colorInterpolationFilters: sRGB): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("colorInterpolationFilters")(colorInterpolationFilters.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutColorInterpolationFilters: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "colorInterpolationFilters")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColorProfileString(colorProfile: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColorProfileDouble(colorProfile: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("colorProfile")(colorProfile.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutColorProfile: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "colorProfile")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColorRenderingString(colorRendering: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withColorRenderingDouble(colorRendering: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutColorRendering: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "colorRendering")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withContentScriptTypeString(contentScriptType: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("contentScriptType")(contentScriptType.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withContentScriptTypeDouble(contentScriptType: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("contentScriptType")(contentScriptType.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutContentScriptType: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "contentScriptType")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withContentStyleTypeString(contentStyleType: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("contentStyleType")(contentStyleType.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withContentStyleTypeDouble(contentStyleType: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("contentStyleType")(contentStyleType.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutContentStyleType: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "contentStyleType")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withCursorString(cursor: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withCursorDouble(cursor: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutCursor: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "cursor")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withCxString(cx: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("cx")(cx.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withCxDouble(cx: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("cx")(cx.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutCx: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "cx")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withCyString(cy: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("cy")(cy.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withCyDouble(cy: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("cy")(cy.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutCy: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "cy")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withD(d: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("d")(d.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutD: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "d")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDecelerateString(decelerate: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("decelerate")(decelerate.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDecelerateDouble(decelerate: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("decelerate")(decelerate.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDecelerate: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "decelerate")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDescentString(descent: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("descent")(descent.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDescentDouble(descent: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("descent")(descent.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDescent: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "descent")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDiffuseConstantString(diffuseConstant: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("diffuseConstant")(diffuseConstant.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDiffuseConstantDouble(diffuseConstant: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("diffuseConstant")(diffuseConstant.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDiffuseConstant: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "diffuseConstant")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDirectionString(direction: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("direction")(direction.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDirectionDouble(direction: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("direction")(direction.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDirection: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "direction")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDisplayString(display: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("display")(display.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDisplayDouble(display: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("display")(display.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDisplay: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "display")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDivisorString(divisor: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDivisorDouble(divisor: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("divisor")(divisor.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDivisor: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "divisor")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDominantBaselineString(dominantBaseline: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDominantBaselineDouble(dominantBaseline: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDominantBaseline: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "dominantBaseline")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDurString(dur: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("dur")(dur.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDurDouble(dur: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("dur")(dur.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDur: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "dur")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDxString(dx: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("dx")(dx.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDxDouble(dx: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("dx")(dx.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDx: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "dx")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDyString(dy: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("dy")(dy.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withDyDouble(dy: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("dy")(dy.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutDy: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "dy")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withEdgeModeString(edgeMode: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("edgeMode")(edgeMode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withEdgeModeDouble(edgeMode: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("edgeMode")(edgeMode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutEdgeMode: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "edgeMode")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withElevationString(elevation: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withElevationDouble(elevation: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutElevation: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "elevation")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withEnableBackgroundString(enableBackground: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withEnableBackgroundDouble(enableBackground: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("enableBackground")(enableBackground.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutEnableBackground: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "enableBackground")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withEndString(end: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("end")(end.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withEndDouble(end: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("end")(end.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutEnd: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "end")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withExponentString(exponent: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withExponentDouble(exponent: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("exponent")(exponent.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutExponent: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "exponent")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withExternalResourcesRequiredString(externalResourcesRequired: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("externalResourcesRequired")(externalResourcesRequired.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withExternalResourcesRequiredDouble(externalResourcesRequired: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("externalResourcesRequired")(externalResourcesRequired.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutExternalResourcesRequired: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "externalResourcesRequired")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFill(fill: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fill")(fill.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFill: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fill")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFillOpacityString(fillOpacity: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFillOpacityDouble(fillOpacity: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFillOpacity: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fillOpacity")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFillRuleInherit(fillRule: inherit): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFillRuleNonzero(fillRule: nonzero): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFillRuleEvenodd(fillRule: evenodd): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFillRule: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fillRule")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFilter(filter: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("filter")(filter.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFilter: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "filter")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFilterResString(filterRes: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("filterRes")(filterRes.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFilterResDouble(filterRes: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("filterRes")(filterRes.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFilterRes: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "filterRes")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFilterUnitsString(filterUnits: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("filterUnits")(filterUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFilterUnitsDouble(filterUnits: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("filterUnits")(filterUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFilterUnits: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "filterUnits")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFloodColorString(floodColor: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFloodColorDouble(floodColor: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFloodColor: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "floodColor")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFloodOpacityString(floodOpacity: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFloodOpacityDouble(floodOpacity: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFloodOpacity: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "floodOpacity")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFocusableString(focusable: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFocusableDouble(focusable: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFocusable: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "focusable")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontFamily(fontFamily: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFontFamily: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fontFamily")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontSizeString(fontSize: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontSizeDouble(fontSize: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFontSize: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fontSize")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontSizeAdjustString(fontSizeAdjust: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontSizeAdjustDouble(fontSizeAdjust: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFontSizeAdjust: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fontSizeAdjust")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontStretchString(fontStretch: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontStretchDouble(fontStretch: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFontStretch: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fontStretch")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontStyleString(fontStyle: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontStyleDouble(fontStyle: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFontStyle: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fontStyle")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontVariantString(fontVariant: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontVariantDouble(fontVariant: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFontVariant: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fontVariant")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontWeightString(fontWeight: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFontWeightDouble(fontWeight: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFontWeight: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fontWeight")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFormatString(format: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("format")(format.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFormatDouble(format: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("format")(format.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFormat: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "format")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFromString(from: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("from")(from.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFromDouble(from: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("from")(from.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFrom: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "from")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFxString(fx: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fx")(fx.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFxDouble(fx: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fx")(fx.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFx: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fx")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFyString(fy: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fy")(fy.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withFyDouble(fy: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("fy")(fy.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutFy: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "fy")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withG1String(g1: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("g1")(g1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withG1Double(g1: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("g1")(g1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutG1: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "g1")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withG2String(g2: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("g2")(g2.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withG2Double(g2: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("g2")(g2.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutG2: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "g2")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withGlyphNameString(glyphName: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("glyphName")(glyphName.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withGlyphNameDouble(glyphName: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("glyphName")(glyphName.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutGlyphName: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "glyphName")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withGlyphOrientationHorizontalString(glyphOrientationHorizontal: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withGlyphOrientationHorizontalDouble(glyphOrientationHorizontal: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("glyphOrientationHorizontal")(glyphOrientationHorizontal.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutGlyphOrientationHorizontal: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "glyphOrientationHorizontal")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withGlyphOrientationVerticalString(glyphOrientationVertical: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withGlyphOrientationVerticalDouble(glyphOrientationVertical: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutGlyphOrientationVertical: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "glyphOrientationVertical")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withGlyphRefString(glyphRef: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("glyphRef")(glyphRef.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withGlyphRefDouble(glyphRef: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("glyphRef")(glyphRef.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutGlyphRef: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "glyphRef")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withGradientTransform(gradientTransform: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutGradientTransform: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "gradientTransform")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withGradientUnits(gradientUnits: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutGradientUnits: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "gradientUnits")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withHangingString(hanging: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("hanging")(hanging.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withHangingDouble(hanging: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("hanging")(hanging.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutHanging: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "hanging")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withHeightString(height: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("height")(height.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withHeightDouble(height: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("height")(height.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutHeight: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "height")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withHorizAdvXString(horizAdvX: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("horizAdvX")(horizAdvX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withHorizAdvXDouble(horizAdvX: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("horizAdvX")(horizAdvX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutHorizAdvX: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "horizAdvX")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withHorizOriginXString(horizOriginX: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("horizOriginX")(horizOriginX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withHorizOriginXDouble(horizOriginX: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("horizOriginX")(horizOriginX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutHorizOriginX: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "horizOriginX")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withHref(href: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("href")(href.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutHref: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "href")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withId(id: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("id")(id.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "id")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withIdeographicString(ideographic: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ideographic")(ideographic.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withIdeographicDouble(ideographic: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ideographic")(ideographic.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutIdeographic: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "ideographic")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withImageRenderingString(imageRendering: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withImageRenderingDouble(imageRendering: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("imageRendering")(imageRendering.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutImageRendering: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "imageRendering")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withIn(in: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("in")(in.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutIn: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "in")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withIn2String(in2: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("in2")(in2.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withIn2Double(in2: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("in2")(in2.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutIn2: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "in2")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withInterceptString(intercept: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withInterceptDouble(intercept: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutIntercept: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "intercept")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKString(k: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("k")(k.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKDouble(k: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("k")(k.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutK: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "k")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withK1String(k1: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("k1")(k1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withK1Double(k1: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("k1")(k1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutK1: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "k1")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withK2String(k2: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("k2")(k2.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withK2Double(k2: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("k2")(k2.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutK2: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "k2")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withK3String(k3: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("k3")(k3.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withK3Double(k3: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("k3")(k3.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutK3: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "k3")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withK4String(k4: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("k4")(k4.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withK4Double(k4: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("k4")(k4.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutK4: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "k4")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKernelMatrixString(kernelMatrix: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("kernelMatrix")(kernelMatrix.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKernelMatrixDouble(kernelMatrix: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("kernelMatrix")(kernelMatrix.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutKernelMatrix: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "kernelMatrix")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKernelUnitLengthString(kernelUnitLength: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("kernelUnitLength")(kernelUnitLength.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKernelUnitLengthDouble(kernelUnitLength: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("kernelUnitLength")(kernelUnitLength.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutKernelUnitLength: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "kernelUnitLength")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKerningString(kerning: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKerningDouble(kerning: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutKerning: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "kerning")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKeyPointsString(keyPoints: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("keyPoints")(keyPoints.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKeyPointsDouble(keyPoints: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("keyPoints")(keyPoints.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutKeyPoints: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "keyPoints")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKeySplinesString(keySplines: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("keySplines")(keySplines.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKeySplinesDouble(keySplines: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("keySplines")(keySplines.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutKeySplines: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "keySplines")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKeyTimesString(keyTimes: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("keyTimes")(keyTimes.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withKeyTimesDouble(keyTimes: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("keyTimes")(keyTimes.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutKeyTimes: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "keyTimes")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLang(lang: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("lang")(lang.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutLang: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "lang")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLengthAdjustString(lengthAdjust: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("lengthAdjust")(lengthAdjust.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLengthAdjustDouble(lengthAdjust: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("lengthAdjust")(lengthAdjust.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutLengthAdjust: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "lengthAdjust")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLetterSpacingString(letterSpacing: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLetterSpacingDouble(letterSpacing: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutLetterSpacing: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "letterSpacing")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLightingColorString(lightingColor: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLightingColorDouble(lightingColor: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutLightingColor: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "lightingColor")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLimitingConeAngleString(limitingConeAngle: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("limitingConeAngle")(limitingConeAngle.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLimitingConeAngleDouble(limitingConeAngle: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("limitingConeAngle")(limitingConeAngle.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutLimitingConeAngle: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "limitingConeAngle")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLocalString(local: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("local")(local.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withLocalDouble(local: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("local")(local.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutLocal: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "local")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMarkerEnd(markerEnd: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMarkerEnd: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "markerEnd")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMarkerHeightString(markerHeight: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMarkerHeightDouble(markerHeight: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMarkerHeight: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "markerHeight")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMarkerMid(markerMid: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMarkerMid: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "markerMid")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMarkerStart(markerStart: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMarkerStart: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "markerStart")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMarkerUnitsString(markerUnits: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMarkerUnitsDouble(markerUnits: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMarkerUnits: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "markerUnits")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMarkerWidthString(markerWidth: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMarkerWidthDouble(markerWidth: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMarkerWidth: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "markerWidth")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMask(mask: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("mask")(mask.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMask: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "mask")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMaskContentUnitsString(maskContentUnits: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("maskContentUnits")(maskContentUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMaskContentUnitsDouble(maskContentUnits: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("maskContentUnits")(maskContentUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMaskContentUnits: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "maskContentUnits")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMaskUnitsString(maskUnits: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("maskUnits")(maskUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMaskUnitsDouble(maskUnits: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("maskUnits")(maskUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMaskUnits: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "maskUnits")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMathematicalString(mathematical: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("mathematical")(mathematical.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMathematicalDouble(mathematical: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("mathematical")(mathematical.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMathematical: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "mathematical")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMaxString(max: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("max")(max.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMaxDouble(max: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("max")(max.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMax: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "max")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMedia(media: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("media")(media.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMedia: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "media")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMethod(method: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("method")(method.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMethod: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "method")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMinString(min: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("min")(min.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withMinDouble(min: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("min")(min.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMin: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "min")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withModeString(mode: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("mode")(mode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withModeDouble(mode: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("mode")(mode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutMode: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "mode")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withName(name: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("name")(name.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "name")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withNumOctavesString(numOctaves: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("numOctaves")(numOctaves.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withNumOctavesDouble(numOctaves: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("numOctaves")(numOctaves.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutNumOctaves: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "numOctaves")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOffsetString(offset: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("offset")(offset.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOffsetDouble(offset: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("offset")(offset.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOffset: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "offset")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOpacityString(opacity: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOpacityDouble(opacity: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOpacity: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "opacity")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOperatorString(operator: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("operator")(operator.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOperatorDouble(operator: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("operator")(operator.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOperator: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "operator")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOrderString(order: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("order")(order.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOrderDouble(order: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("order")(order.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOrder: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "order")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOrientString(orient: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("orient")(orient.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOrientDouble(orient: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("orient")(orient.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOrient: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "orient")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOrientationString(orientation: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOrientationDouble(orientation: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOrientation: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "orientation")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOriginString(origin: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("origin")(origin.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOriginDouble(origin: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("origin")(origin.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOrigin: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "origin")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOverflowString(overflow: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOverflowDouble(overflow: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOverflow: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "overflow")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOverlinePositionString(overlinePosition: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("overlinePosition")(overlinePosition.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOverlinePositionDouble(overlinePosition: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("overlinePosition")(overlinePosition.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOverlinePosition: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "overlinePosition")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOverlineThicknessString(overlineThickness: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("overlineThickness")(overlineThickness.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withOverlineThicknessDouble(overlineThickness: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("overlineThickness")(overlineThickness.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutOverlineThickness: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "overlineThickness")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPaintOrderString(paintOrder: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("paintOrder")(paintOrder.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPaintOrderDouble(paintOrder: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("paintOrder")(paintOrder.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPaintOrder: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "paintOrder")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPanose1String(panose1: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("panose1")(panose1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPanose1Double(panose1: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("panose1")(panose1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPanose1: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "panose1")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPathLengthString(pathLength: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("pathLength")(pathLength.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPathLengthDouble(pathLength: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("pathLength")(pathLength.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPathLength: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "pathLength")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPatternContentUnits(patternContentUnits: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("patternContentUnits")(patternContentUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPatternContentUnits: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "patternContentUnits")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPatternTransformString(patternTransform: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPatternTransformDouble(patternTransform: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPatternTransform: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "patternTransform")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPatternUnits(patternUnits: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("patternUnits")(patternUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPatternUnits: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "patternUnits")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPointerEventsString(pointerEvents: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPointerEventsDouble(pointerEvents: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPointerEvents: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "pointerEvents")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPoints(points: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("points")(points.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPoints: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "points")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPointsAtXString(pointsAtX: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("pointsAtX")(pointsAtX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPointsAtXDouble(pointsAtX: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("pointsAtX")(pointsAtX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPointsAtX: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "pointsAtX")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPointsAtYString(pointsAtY: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("pointsAtY")(pointsAtY.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPointsAtYDouble(pointsAtY: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("pointsAtY")(pointsAtY.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPointsAtY: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "pointsAtY")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPointsAtZString(pointsAtZ: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("pointsAtZ")(pointsAtZ.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPointsAtZDouble(pointsAtZ: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("pointsAtZ")(pointsAtZ.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPointsAtZ: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "pointsAtZ")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPreserveAlphaString(preserveAlpha: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("preserveAlpha")(preserveAlpha.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPreserveAlphaDouble(preserveAlpha: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("preserveAlpha")(preserveAlpha.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPreserveAlpha: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "preserveAlpha")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPreserveAspectRatio(preserveAspectRatio: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPreserveAspectRatio: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "preserveAspectRatio")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPrimitiveUnitsString(primitiveUnits: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("primitiveUnits")(primitiveUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withPrimitiveUnitsDouble(primitiveUnits: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("primitiveUnits")(primitiveUnits.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutPrimitiveUnits: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "primitiveUnits")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRString(r: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("r")(r.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRDouble(r: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("r")(r.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutR: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "r")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRadiusString(radius: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("radius")(radius.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRadiusDouble(radius: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("radius")(radius.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRadius: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "radius")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRefXString(refX: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("refX")(refX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRefXDouble(refX: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("refX")(refX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRefX: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "refX")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRefYString(refY: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("refY")(refY.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRefYDouble(refY: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("refY")(refY.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRefY: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "refY")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRenderingIntentString(renderingIntent: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("renderingIntent")(renderingIntent.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRenderingIntentDouble(renderingIntent: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("renderingIntent")(renderingIntent.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRenderingIntent: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "renderingIntent")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRepeatCountString(repeatCount: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("repeatCount")(repeatCount.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRepeatCountDouble(repeatCount: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("repeatCount")(repeatCount.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRepeatCount: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "repeatCount")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRepeatDurString(repeatDur: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("repeatDur")(repeatDur.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRepeatDurDouble(repeatDur: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("repeatDur")(repeatDur.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRepeatDur: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "repeatDur")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRequiredExtensionsString(requiredExtensions: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("requiredExtensions")(requiredExtensions.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRequiredExtensionsDouble(requiredExtensions: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("requiredExtensions")(requiredExtensions.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRequiredExtensions: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "requiredExtensions")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRequiredFeaturesString(requiredFeatures: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("requiredFeatures")(requiredFeatures.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRequiredFeaturesDouble(requiredFeatures: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("requiredFeatures")(requiredFeatures.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRequiredFeatures: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "requiredFeatures")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRestartString(restart: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("restart")(restart.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRestartDouble(restart: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("restart")(restart.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRestart: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "restart")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withResult(result: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("result")(result.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutResult: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "result")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRole(role: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("role")(role.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRole: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "role")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRotateString(rotate: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRotateDouble(rotate: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRotate: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "rotate")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRxString(rx: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("rx")(rx.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRxDouble(rx: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("rx")(rx.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRx: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "rx")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRyString(ry: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ry")(ry.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withRyDouble(ry: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("ry")(ry.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutRy: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "ry")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withScaleString(scale: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("scale")(scale.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withScaleDouble(scale: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("scale")(scale.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutScale: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "scale")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSeedString(seed: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("seed")(seed.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSeedDouble(seed: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("seed")(seed.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutSeed: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "seed")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withShapeRenderingString(shapeRendering: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withShapeRenderingDouble(shapeRendering: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutShapeRendering: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "shapeRendering")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSlopeString(slope: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("slope")(slope.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSlopeDouble(slope: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("slope")(slope.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutSlope: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "slope")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSpacingString(spacing: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSpacingDouble(spacing: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutSpacing: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "spacing")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSpecularConstantString(specularConstant: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("specularConstant")(specularConstant.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSpecularConstantDouble(specularConstant: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("specularConstant")(specularConstant.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutSpecularConstant: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "specularConstant")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSpecularExponentString(specularExponent: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("specularExponent")(specularExponent.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSpecularExponentDouble(specularExponent: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("specularExponent")(specularExponent.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutSpecularExponent: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "specularExponent")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSpeedString(speed: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("speed")(speed.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSpeedDouble(speed: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("speed")(speed.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutSpeed: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "speed")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSpreadMethod(spreadMethod: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("spreadMethod")(spreadMethod.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutSpreadMethod: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "spreadMethod")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStartOffsetString(startOffset: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStartOffsetDouble(startOffset: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStartOffset: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "startOffset")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStdDeviationString(stdDeviation: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stdDeviation")(stdDeviation.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStdDeviationDouble(stdDeviation: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stdDeviation")(stdDeviation.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStdDeviation: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "stdDeviation")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStemhString(stemh: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stemh")(stemh.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStemhDouble(stemh: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stemh")(stemh.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStemh: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "stemh")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStemvString(stemv: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stemv")(stemv.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStemvDouble(stemv: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stemv")(stemv.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStemv: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "stemv")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStitchTilesString(stitchTiles: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stitchTiles")(stitchTiles.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStitchTilesDouble(stitchTiles: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stitchTiles")(stitchTiles.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStitchTiles: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "stitchTiles")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStopColor(stopColor: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStopColor: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "stopColor")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStopOpacityString(stopOpacity: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStopOpacityDouble(stopOpacity: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStopOpacity: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "stopOpacity")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrikethroughPositionString(strikethroughPosition: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strikethroughPosition")(strikethroughPosition.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrikethroughPositionDouble(strikethroughPosition: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strikethroughPosition")(strikethroughPosition.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStrikethroughPosition: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "strikethroughPosition")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrikethroughThicknessString(strikethroughThickness: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strikethroughThickness")(strikethroughThickness.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrikethroughThicknessDouble(strikethroughThickness: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strikethroughThickness")(strikethroughThickness.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStrikethroughThickness: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "strikethroughThickness")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStringString(string: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("string")(string.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStringDouble(string: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("string")(string.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutString: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "string")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStroke(stroke: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStroke: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "stroke")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeDasharrayString(strokeDasharray: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeDasharrayDouble(strokeDasharray: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStrokeDasharray: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "strokeDasharray")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeDashoffsetString(strokeDashoffset: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeDashoffsetDouble(strokeDashoffset: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStrokeDashoffset: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "strokeDashoffset")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeLinecapSquare(strokeLinecap: square): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStrokeLinecap: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "strokeLinecap")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeLinecapButt(strokeLinecap: butt): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeLinecapInherit(strokeLinecap: inherit): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeLinecapRound(strokeLinecap: round): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeLinejoinInherit(strokeLinejoin: inherit): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStrokeLinejoin: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "strokeLinejoin")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeLinejoinRound(strokeLinejoin: round): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeLinejoinBevel(strokeLinejoin: bevel): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeLinejoinMiter(strokeLinejoin: miter): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeMiterlimitString(strokeMiterlimit: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeMiterlimitDouble(strokeMiterlimit: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStrokeMiterlimit: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "strokeMiterlimit")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeOpacityString(strokeOpacity: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeOpacityDouble(strokeOpacity: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStrokeOpacity: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "strokeOpacity")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeWidthString(strokeWidth: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStrokeWidthDouble(strokeWidth: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStrokeWidth: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "strokeWidth")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withStyle(
      style: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Properties<string | number> */ js.Any
    ): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("style")(style.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutStyle: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "style")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSurfaceScaleString(surfaceScale: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("surfaceScale")(surfaceScale.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSurfaceScaleDouble(surfaceScale: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("surfaceScale")(surfaceScale.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutSurfaceScale: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "surfaceScale")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSystemLanguageString(systemLanguage: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("systemLanguage")(systemLanguage.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withSystemLanguageDouble(systemLanguage: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("systemLanguage")(systemLanguage.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutSystemLanguage: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "systemLanguage")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTabIndexInt(tabIndex: Int): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTabIndexDouble(tabIndex: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTabIndex: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "tabIndex")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTableValuesString(tableValues: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("tableValues")(tableValues.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTableValuesDouble(tableValues: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("tableValues")(tableValues.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTableValues: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "tableValues")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTarget(target: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("target")(target.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTarget: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "target")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTargetXString(targetX: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("targetX")(targetX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTargetXDouble(targetX: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("targetX")(targetX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTargetX: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "targetX")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTargetYString(targetY: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("targetY")(targetY.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTargetYDouble(targetY: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("targetY")(targetY.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTargetY: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "targetY")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTextAnchor(textAnchor: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTextAnchor: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "textAnchor")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTextDecorationString(textDecoration: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTextDecorationDouble(textDecoration: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTextDecoration: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "textDecoration")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTextLengthString(textLength: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("textLength")(textLength.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTextLengthDouble(textLength: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("textLength")(textLength.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTextLength: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "textLength")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTextRenderingString(textRendering: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("textRendering")(textRendering.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTextRenderingDouble(textRendering: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("textRendering")(textRendering.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTextRendering: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "textRendering")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withToString(to: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("to")(to.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withToDouble(to: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("to")(to.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTo: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "to")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withTransform(transform: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("transform")(transform.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutTransform: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "transform")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withType(`type`: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "type")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withU1String(u1: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("u1")(u1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withU1Double(u1: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("u1")(u1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutU1: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "u1")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withU2String(u2: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("u2")(u2.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withU2Double(u2: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("u2")(u2.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutU2: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "u2")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnderlinePositionString(underlinePosition: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("underlinePosition")(underlinePosition.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnderlinePositionDouble(underlinePosition: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("underlinePosition")(underlinePosition.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutUnderlinePosition: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "underlinePosition")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnderlineThicknessString(underlineThickness: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("underlineThickness")(underlineThickness.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnderlineThicknessDouble(underlineThickness: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("underlineThickness")(underlineThickness.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutUnderlineThickness: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "underlineThickness")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnicodeString(unicode: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnicodeDouble(unicode: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutUnicode: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "unicode")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnicodeBidiString(unicodeBidi: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("unicodeBidi")(unicodeBidi.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnicodeBidiDouble(unicodeBidi: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("unicodeBidi")(unicodeBidi.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutUnicodeBidi: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "unicodeBidi")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnicodeRangeString(unicodeRange: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnicodeRangeDouble(unicodeRange: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutUnicodeRange: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "unicodeRange")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnitsPerEmString(unitsPerEm: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("unitsPerEm")(unitsPerEm.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withUnitsPerEmDouble(unitsPerEm: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("unitsPerEm")(unitsPerEm.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutUnitsPerEm: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "unitsPerEm")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVAlphabeticString(vAlphabetic: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vAlphabetic")(vAlphabetic.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVAlphabeticDouble(vAlphabetic: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vAlphabetic")(vAlphabetic.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutVAlphabetic: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "vAlphabetic")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVHangingString(vHanging: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vHanging")(vHanging.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVHangingDouble(vHanging: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vHanging")(vHanging.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutVHanging: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "vHanging")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVIdeographicString(vIdeographic: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vIdeographic")(vIdeographic.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVIdeographicDouble(vIdeographic: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vIdeographic")(vIdeographic.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutVIdeographic: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "vIdeographic")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVMathematicalString(vMathematical: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vMathematical")(vMathematical.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVMathematicalDouble(vMathematical: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vMathematical")(vMathematical.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutVMathematical: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "vMathematical")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withValues(values: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("values")(values.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutValues: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "values")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVectorEffectString(vectorEffect: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVectorEffectDouble(vectorEffect: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutVectorEffect: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "vectorEffect")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVersion(version: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("version")(version.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutVersion: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "version")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVertAdvYString(vertAdvY: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vertAdvY")(vertAdvY.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVertAdvYDouble(vertAdvY: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vertAdvY")(vertAdvY.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutVertAdvY: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "vertAdvY")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVertOriginXString(vertOriginX: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vertOriginX")(vertOriginX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVertOriginXDouble(vertOriginX: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vertOriginX")(vertOriginX.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutVertOriginX: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "vertOriginX")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVertOriginYString(vertOriginY: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vertOriginY")(vertOriginY.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVertOriginYDouble(vertOriginY: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("vertOriginY")(vertOriginY.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutVertOriginY: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "vertOriginY")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withViewBox(viewBox: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutViewBox: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "viewBox")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withViewTargetString(viewTarget: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("viewTarget")(viewTarget.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withViewTargetDouble(viewTarget: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("viewTarget")(viewTarget.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutViewTarget: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "viewTarget")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVisibilityString(visibility: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withVisibilityDouble(visibility: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutVisibility: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "visibility")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withWidthString(width: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("width")(width.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withWidthDouble(width: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("width")(width.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutWidth: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "width")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withWidthsString(widths: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("widths")(widths.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withWidthsDouble(widths: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("widths")(widths.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutWidths: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "widths")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withWordSpacingString(wordSpacing: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withWordSpacingDouble(wordSpacing: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("wordSpacing")(wordSpacing.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutWordSpacing: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "wordSpacing")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withWritingModeString(writingMode: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("writingMode")(writingMode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withWritingModeDouble(writingMode: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("writingMode")(writingMode.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutWritingMode: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "writingMode")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXString(x: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("x")(x.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXDouble(x: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("x")(x.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutX: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "x")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withX1String(x1: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("x1")(x1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withX1Double(x1: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("x1")(x1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutX1: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "x1")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withX2String(x2: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("x2")(x2.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withX2Double(x2: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("x2")(x2.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutX2: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "x2")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXChannelSelector(xChannelSelector: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xChannelSelector")(xChannelSelector.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXChannelSelector: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xChannelSelector")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXHeightString(xHeight: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xHeight")(xHeight.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXHeightDouble(xHeight: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xHeight")(xHeight.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXHeight: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xHeight")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXlinkActuate(xlinkActuate: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xlinkActuate")(xlinkActuate.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXlinkActuate: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xlinkActuate")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXlinkArcrole(xlinkArcrole: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xlinkArcrole")(xlinkArcrole.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXlinkArcrole: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xlinkArcrole")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXlinkHref(xlinkHref: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xlinkHref")(xlinkHref.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXlinkHref: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xlinkHref")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXlinkRole(xlinkRole: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xlinkRole")(xlinkRole.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXlinkRole: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xlinkRole")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXlinkShow(xlinkShow: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xlinkShow")(xlinkShow.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXlinkShow: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xlinkShow")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXlinkTitle(xlinkTitle: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xlinkTitle")(xlinkTitle.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXlinkTitle: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xlinkTitle")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXlinkType(xlinkType: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xlinkType")(xlinkType.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXlinkType: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xlinkType")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXmlBase(xmlBase: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xmlBase")(xmlBase.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXmlBase: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xmlBase")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXmlLang(xmlLang: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xmlLang")(xmlLang.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXmlLang: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xmlLang")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXmlSpace(xmlSpace: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xmlSpace")(xmlSpace.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXmlSpace: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xmlSpace")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXmlns(xmlns: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXmlns: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xmlns")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withXmlnsXlink(xmlnsXlink: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("xmlnsXlink")(xmlnsXlink.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutXmlnsXlink: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "xmlnsXlink")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withYString(y: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("y")(y.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withYDouble(y: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("y")(y.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutY: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "y")
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withY1String(y1: String): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("y1")(y1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withY1Double(y1: Double): Self[T] = {
        val ret = this.duplicate.asInstanceOf[js.Dynamic]
        ret.updateDynamic("y1")(y1.asInstanceOf[js.Any])
        ret.asInstanceOf[Self[T]]
    }
    @scala.inline
    def withoutY1: Self[T] = {
        val ret = this.duplicate
        js.special.delete(ret, "y1")
        ret.asInstanceOf[Self[T]]
    }
  }
  
}

