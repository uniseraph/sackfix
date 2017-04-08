package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ExchangeRuleField(override val value: String) extends SfFieldString(825, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(825)ExchangeRule=(").append(value).append(")")
}

object ExchangeRuleField {
  val TagId = 825  
  def decode(a: Option[Any]) : Option[ExchangeRuleField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExchangeRuleField]
  }

  def decode(a: Any) : Option[ExchangeRuleField] = a match {
    case v: String => Some(ExchangeRuleField(v))
    case v: ExchangeRuleField => Some(v)
    case _ => scala.Option.empty[ExchangeRuleField]
  } 
}