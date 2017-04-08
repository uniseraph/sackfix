package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoPartySubIDsField(override val value: Int) extends SfNumInGroup(802, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(802)NoPartySubIDs=(").append(value).append(")")
}

object NoPartySubIDsField {
  val TagId = 802  
  def apply(value: String) = try {
    new NoPartySubIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoPartySubIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoPartySubIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoPartySubIDsField]
  }

  def decode(a: Any) : Option[NoPartySubIDsField] = a match {
    case v: String => Some(NoPartySubIDsField(v))
    case v: Int => Some(NoPartySubIDsField(v))
    case v: NoPartySubIDsField => Some(v)
    case _ => scala.Option.empty[NoPartySubIDsField]
  } 
}