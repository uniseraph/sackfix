package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class FloorPriceField(override val value: Float) extends SfFieldFloat(1200, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1200)FloorPrice=(").append(value).append(")")
}

object FloorPriceField {
  val TagId = 1200  
  def apply(value: String) = try {
    new FloorPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new FloorPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[FloorPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[FloorPriceField]
  }

  def decode(a: Any) : Option[FloorPriceField] = a match {
    case v: String => Some(FloorPriceField(v))
    case v: Float => Some(FloorPriceField(v))
    case v: Double => Some(FloorPriceField(v.toFloat))
    case v: Int => Some(FloorPriceField(v.toFloat))
    case v: FloorPriceField => Some(v)
    case _ => scala.Option.empty[FloorPriceField]
  } 
}
