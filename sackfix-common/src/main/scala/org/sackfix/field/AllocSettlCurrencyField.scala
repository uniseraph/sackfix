package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class AllocSettlCurrencyField(override val value: String) extends SfFieldString(736, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(736)AllocSettlCurrency=(").append(value).append(")")
}

object AllocSettlCurrencyField {
  val TagId = 736  
  def decode(a: Option[Any]) : Option[AllocSettlCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocSettlCurrencyField]
  }

  def decode(a: Any) : Option[AllocSettlCurrencyField] = a match {
    case v: String => Some(AllocSettlCurrencyField(v))
    case v: AllocSettlCurrencyField => Some(v)
    case _ => scala.Option.empty[AllocSettlCurrencyField]
  } 
}