package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class OfferYieldField(override val value: Float) extends SfFieldFloat(634, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(634)OfferYield=(").append(value).append(")")
}

object OfferYieldField {
  val TagId = 634  
  def apply(value: String) = try {
    new OfferYieldField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OfferYield("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OfferYieldField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OfferYieldField]
  }

  def decode(a: Any) : Option[OfferYieldField] = a match {
    case v: String => Some(OfferYieldField(v))
    case v: Float => Some(OfferYieldField(v))
    case v: Double => Some(OfferYieldField(v.toFloat))
    case v: Int => Some(OfferYieldField(v.toFloat))
    case v: OfferYieldField => Some(v)
    case _ => scala.Option.empty[OfferYieldField]
  } 
}