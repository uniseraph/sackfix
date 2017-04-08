package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class ExpireTimeField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(126, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(126)ExpireTime=(").append(value).append(")")
}

object ExpireTimeField {
  val TagId = 126  
  def apply(value: String) = try {
    new ExpireTimeField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ExpireTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ExpireTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExpireTimeField]
  }

  def decode(a: Any) : Option[ExpireTimeField] = a match {
    case v: String => Some(ExpireTimeField(v))
    case v: LocalDateTime => Some(ExpireTimeField(v))
    case v: ExpireTimeField => Some(v)
    case _ => scala.Option.empty[ExpireTimeField]
  } 
}