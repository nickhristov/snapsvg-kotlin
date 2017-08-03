package org.github.snapsvg

import org.w3c.dom.Element
import org.w3c.dom.Node
import kotlin.js.Json

external class SnapElement {
    fun attr (name:String) : Any
    fun attr (json: Json) : Unit
    fun getBBox() : SnapBoundingBox
}

external class SnapBoundingBox {
    val width: Number
    val height: Number
    val x: Number
    val y: Number
}

external class Paper {
    val node : Element
    fun circle(x:Number, y: Number, r:Number) : SnapElement

    fun rect(x:Number, y:Number, width: Number, height: Number,
             rx : Number = definedExternally, ry: Number = definedExternally): SnapElement

    fun image(src : String, x : Number, y : Number, width : Number, height : Number) : SnapElement

    fun line(x1:Number, y1:Number, x2:Number, y2 :Number) : SnapElement

    fun polyline(points: Array<Number>) : SnapElement

    fun path(commands:String) :SnapElement

    fun text(x:Number, y:Number, text: String) : SnapElement
}

external fun Snap(width: Number, height: Number) : Paper
external fun Snap(element: Element): Paper
external fun Snap(query: String) : Paper

external object Snap {

}
