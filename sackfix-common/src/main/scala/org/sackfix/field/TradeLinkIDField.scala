package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class TradeLinkIDField(override val value: String) extends SfFieldString(820, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(820)TradeLinkID=(").append(value).append(")")
}

object TradeLinkIDField {
  val TagId = 820  
  def decode(a: Option[Any]) : Option[TradeLinkIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradeLinkIDField]
  }

  def decode(a: Any) : Option[TradeLinkIDField] = a match {
    case v: String => Some(TradeLinkIDField(v))
    case v: TradeLinkIDField => Some(v)
    case _ => scala.Option.empty[TradeLinkIDField]
  } 
}
