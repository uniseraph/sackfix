package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class MaturityDayField(override val value: Int) extends SfFieldInt(205, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(205)MaturityDay=(").append(value).append(")")
}

object MaturityDayField {
  val TagId = 205  
  def apply(value: String) = try {
    new MaturityDayField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MaturityDay("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MaturityDayField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MaturityDayField]
  }

  def decode(a: Any) : Option[MaturityDayField] = a match {
    case v: String => Some(MaturityDayField(v))
    case v: Int => Some(MaturityDayField(v))
    case v: MaturityDayField => Some(v)
    case _ => scala.Option.empty[MaturityDayField]
  } 
}
