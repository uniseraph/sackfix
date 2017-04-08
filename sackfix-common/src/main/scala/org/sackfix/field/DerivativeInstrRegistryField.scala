package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeInstrRegistryField(override val value: String) extends SfFieldString(1257, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1257)DerivativeInstrRegistry=(").append(value).append(")")
}

object DerivativeInstrRegistryField {
  val TagId = 1257  
  def decode(a: Option[Any]) : Option[DerivativeInstrRegistryField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeInstrRegistryField]
  }

  def decode(a: Any) : Option[DerivativeInstrRegistryField] = a match {
    case v: String => Some(DerivativeInstrRegistryField(v))
    case v: DerivativeInstrRegistryField => Some(v)
    case _ => scala.Option.empty[DerivativeInstrRegistryField]
  } 
}