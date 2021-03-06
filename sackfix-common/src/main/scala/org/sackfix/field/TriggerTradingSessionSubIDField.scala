package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class TriggerTradingSessionSubIDField(override val value: String) extends SfFieldString(1114, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1114)TriggerTradingSessionSubID=(").append(value).append(")")
}

object TriggerTradingSessionSubIDField {
  val TagId = 1114  
  def decode(a: Option[Any]) : Option[TriggerTradingSessionSubIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TriggerTradingSessionSubIDField]
  }

  def decode(a: Any) : Option[TriggerTradingSessionSubIDField] = a match {
    case v: String => Some(TriggerTradingSessionSubIDField(v))
    case v: TriggerTradingSessionSubIDField => Some(v)
    case _ => scala.Option.empty[TriggerTradingSessionSubIDField]
  } 
}
