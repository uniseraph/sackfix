package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class NestedUserDataValueField(override val value: String) extends SfFieldString(9002, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(9002)NestedUserDataValue=(").append(value).append(")")
}

object NestedUserDataValueField {
  val TagId = 9002  
  def decode(a: Option[Any]) : Option[NestedUserDataValueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NestedUserDataValueField]
  }

  def decode(a: Any) : Option[NestedUserDataValueField] = a match {
    case v: String => Some(NestedUserDataValueField(v))
    case v: NestedUserDataValueField => Some(v)
    case _ => scala.Option.empty[NestedUserDataValueField]
  } 
}