package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingSettlPriceField(override val value: Float) extends SfFieldFloat(732, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(732)UnderlyingSettlPrice=(").append(value).append(")")
}

object UnderlyingSettlPriceField {
  val TagId = 732  
  def apply(value: String) = try {
    new UnderlyingSettlPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingSettlPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingSettlPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingSettlPriceField]
  }

  def decode(a: Any) : Option[UnderlyingSettlPriceField] = a match {
    case v: String => Some(UnderlyingSettlPriceField(v))
    case v: Float => Some(UnderlyingSettlPriceField(v))
    case v: Double => Some(UnderlyingSettlPriceField(v.toFloat))
    case v: Int => Some(UnderlyingSettlPriceField(v.toFloat))
    case v: UnderlyingSettlPriceField => Some(v)
    case _ => scala.Option.empty[UnderlyingSettlPriceField]
  } 
}
