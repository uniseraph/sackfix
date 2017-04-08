package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class QtyTypeField(override val value: Int) extends SfFieldInt(854, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(854)QtyType=(").append(value).append(")").append(QtyTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object QtyTypeField {
  val TagId = 854 
  val Units=0
  val Contracts=1
  val UnitsOfMeasurePerTimeUnit=2
  lazy val fixDescriptionByValue = Map(0->"UNITS",1->"CONTRACTS",
    2->"UNITS_OF_MEASURE_PER_TIME_UNIT")
 
  def apply(value: String) = try {
    new QtyTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new QtyType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[QtyTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QtyTypeField]
  }

  def decode(a: Any) : Option[QtyTypeField] = a match {
    case v: String => Some(QtyTypeField(v))
    case v: Int => Some(QtyTypeField(v))
    case v: QtyTypeField => Some(v)
    case _ => scala.Option.empty[QtyTypeField]
  } 
}