package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class IOIRefIDField(override val value: String) extends SfFieldString(26, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(26)IOIRefID=(").append(value).append(")")
}

object IOIRefIDField {
  val TagId = 26  
  def decode(a: Option[Any]) : Option[IOIRefIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[IOIRefIDField]
  }

  def decode(a: Any) : Option[IOIRefIDField] = a match {
    case v: String => Some(IOIRefIDField(v))
    case v: IOIRefIDField => Some(v)
    case _ => scala.Option.empty[IOIRefIDField]
  } 
}