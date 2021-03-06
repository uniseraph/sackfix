package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class ComplexEventPriceTimeTypeField(override val value: Int) extends SfFieldInt(1489, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1489)ComplexEventPriceTimeType=(").append(value).append(")").append(ComplexEventPriceTimeTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object ComplexEventPriceTimeTypeField {
  val TagId = 1489 
  val Expiration=1
  val Immediate=2
  val SpecifiedDateTime=3
  lazy val fixDescriptionByValue = Map(1->"EXPIRATION",2->"IMMEDIATE",
    3->"SPECIFIED_DATE_TIME")
 
  def apply(value: String) = try {
    new ComplexEventPriceTimeTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ComplexEventPriceTimeType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ComplexEventPriceTimeTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ComplexEventPriceTimeTypeField]
  }

  def decode(a: Any) : Option[ComplexEventPriceTimeTypeField] = a match {
    case v: String => Some(ComplexEventPriceTimeTypeField(v))
    case v: Int => Some(ComplexEventPriceTimeTypeField(v))
    case v: ComplexEventPriceTimeTypeField => Some(v)
    case _ => scala.Option.empty[ComplexEventPriceTimeTypeField]
  } 
}
