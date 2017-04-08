package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoLegsField(override val value: Int) extends SfNumInGroup(555, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(555)NoLegs=(").append(value).append(")")
}

object NoLegsField {
  val TagId = 555  
  def apply(value: String) = try {
    new NoLegsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoLegs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoLegsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoLegsField]
  }

  def decode(a: Any) : Option[NoLegsField] = a match {
    case v: String => Some(NoLegsField(v))
    case v: Int => Some(NoLegsField(v))
    case v: NoLegsField => Some(v)
    case _ => scala.Option.empty[NoLegsField]
  } 
}