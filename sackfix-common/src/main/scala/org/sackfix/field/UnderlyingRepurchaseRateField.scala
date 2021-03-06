package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingRepurchaseRateField(override val value: Float) extends SfFieldFloat(245, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(245)UnderlyingRepurchaseRate=(").append(value).append(")")
}

object UnderlyingRepurchaseRateField {
  val TagId = 245  
  def apply(value: String) = try {
    new UnderlyingRepurchaseRateField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingRepurchaseRate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingRepurchaseRateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingRepurchaseRateField]
  }

  def decode(a: Any) : Option[UnderlyingRepurchaseRateField] = a match {
    case v: String => Some(UnderlyingRepurchaseRateField(v))
    case v: Float => Some(UnderlyingRepurchaseRateField(v))
    case v: Double => Some(UnderlyingRepurchaseRateField(v.toFloat))
    case v: Int => Some(UnderlyingRepurchaseRateField(v.toFloat))
    case v: UnderlyingRepurchaseRateField => Some(v)
    case _ => scala.Option.empty[UnderlyingRepurchaseRateField]
  } 
}
