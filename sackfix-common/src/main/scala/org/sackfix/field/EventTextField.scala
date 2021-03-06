package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class EventTextField(override val value: String) extends SfFieldString(868, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(868)EventText=(").append(value).append(")")
}

object EventTextField {
  val TagId = 868  
  def decode(a: Option[Any]) : Option[EventTextField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EventTextField]
  }

  def decode(a: Any) : Option[EventTextField] = a match {
    case v: String => Some(EventTextField(v))
    case v: EventTextField => Some(v)
    case _ => scala.Option.empty[EventTextField]
  } 
}
