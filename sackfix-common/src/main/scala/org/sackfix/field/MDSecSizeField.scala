package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class MDSecSizeField(override val value: Float) extends SfFieldFloat(1179, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1179)MDSecSize=(").append(value).append(")")
}

object MDSecSizeField {
  val TagId = 1179  
  def apply(value: String) = try {
    new MDSecSizeField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MDSecSize("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MDSecSizeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDSecSizeField]
  }

  def decode(a: Any) : Option[MDSecSizeField] = a match {
    case v: String => Some(MDSecSizeField(v))
    case v: Float => Some(MDSecSizeField(v))
    case v: Double => Some(MDSecSizeField(v.toFloat))
    case v: Int => Some(MDSecSizeField(v.toFloat))
    case v: MDSecSizeField => Some(v)
    case _ => scala.Option.empty[MDSecSizeField]
  } 
}
