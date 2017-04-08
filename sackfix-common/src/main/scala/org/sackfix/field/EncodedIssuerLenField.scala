package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class EncodedIssuerLenField(override val value: Int) extends SfFieldInt(348, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(348)EncodedIssuerLen=(").append(value).append(")")
}

object EncodedIssuerLenField {
  val TagId = 348  
  def apply(value: String) = try {
    new EncodedIssuerLenField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EncodedIssuerLen("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EncodedIssuerLenField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedIssuerLenField]
  }

  def decode(a: Any) : Option[EncodedIssuerLenField] = a match {
    case v: String => Some(EncodedIssuerLenField(v))
    case v: Int => Some(EncodedIssuerLenField(v))
    case v: EncodedIssuerLenField => Some(v)
    case _ => scala.Option.empty[EncodedIssuerLenField]
  } 
}