package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingPxField(override val value: Float) extends SfFieldFloat(810, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(810)UnderlyingPx=(").append(value).append(")")
}

object UnderlyingPxField {
  val TagId = 810  
  def apply(value: String) = try {
    new UnderlyingPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingPxField]
  }

  def decode(a: Any) : Option[UnderlyingPxField] = a match {
    case v: String => Some(UnderlyingPxField(v))
    case v: Float => Some(UnderlyingPxField(v))
    case v: Double => Some(UnderlyingPxField(v.toFloat))
    case v: Int => Some(UnderlyingPxField(v.toFloat))
    case v: UnderlyingPxField => Some(v)
    case _ => scala.Option.empty[UnderlyingPxField]
  } 
}