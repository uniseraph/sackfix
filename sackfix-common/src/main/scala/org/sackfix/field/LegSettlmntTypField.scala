package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegSettlmntTypField(override val value: String) extends SfFieldString(587, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(587)LegSettlmntTyp=(").append(value).append(")")
}

object LegSettlmntTypField {
  val TagId = 587  
  def decode(a: Option[Any]) : Option[LegSettlmntTypField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegSettlmntTypField]
  }

  def decode(a: Any) : Option[LegSettlmntTypField] = a match {
    case v: String => Some(LegSettlmntTypField(v))
    case v: Char => Some(LegSettlmntTypField(v.toString))
    case v: LegSettlmntTypField => Some(v)
    case _ => scala.Option.empty[LegSettlmntTypField]
  } 
}