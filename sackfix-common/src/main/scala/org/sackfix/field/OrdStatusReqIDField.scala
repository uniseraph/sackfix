package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class OrdStatusReqIDField(override val value: String) extends SfFieldString(790, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(790)OrdStatusReqID=(").append(value).append(")")
}

object OrdStatusReqIDField {
  val TagId = 790  
  def decode(a: Option[Any]) : Option[OrdStatusReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OrdStatusReqIDField]
  }

  def decode(a: Any) : Option[OrdStatusReqIDField] = a match {
    case v: String => Some(OrdStatusReqIDField(v))
    case v: OrdStatusReqIDField => Some(v)
    case _ => scala.Option.empty[OrdStatusReqIDField]
  } 
}
