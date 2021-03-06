package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class TotNumAssignmentReportsField(override val value: Int) extends SfFieldInt(832, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(832)TotNumAssignmentReports=(").append(value).append(")")
}

object TotNumAssignmentReportsField {
  val TagId = 832  
  def apply(value: String) = try {
    new TotNumAssignmentReportsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotNumAssignmentReports("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotNumAssignmentReportsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotNumAssignmentReportsField]
  }

  def decode(a: Any) : Option[TotNumAssignmentReportsField] = a match {
    case v: String => Some(TotNumAssignmentReportsField(v))
    case v: Int => Some(TotNumAssignmentReportsField(v))
    case v: TotNumAssignmentReportsField => Some(v)
    case _ => scala.Option.empty[TotNumAssignmentReportsField]
  } 
}
