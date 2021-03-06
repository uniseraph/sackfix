package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegStrikePriceField(override val value: Float) extends SfFieldFloat(612, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(612)LegStrikePrice=(").append(value).append(")")
}

object LegStrikePriceField {
  val TagId = 612  
  def apply(value: String) = try {
    new LegStrikePriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegStrikePrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegStrikePriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegStrikePriceField]
  }

  def decode(a: Any) : Option[LegStrikePriceField] = a match {
    case v: String => Some(LegStrikePriceField(v))
    case v: Float => Some(LegStrikePriceField(v))
    case v: Double => Some(LegStrikePriceField(v.toFloat))
    case v: Int => Some(LegStrikePriceField(v.toFloat))
    case v: LegStrikePriceField => Some(v)
    case _ => scala.Option.empty[LegStrikePriceField]
  } 
}
