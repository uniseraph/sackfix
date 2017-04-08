package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class OrdStatusField(override val value: String) extends SfFieldString(39, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(39)OrdStatus=(").append(value).append(")").append(OrdStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object OrdStatusField {
  val TagId = 39 
  val New="0"
  val PartiallyFilled="1"
  val Filled="2"
  val DoneForDay="3"
  val Canceled="4"
  val Replaced="5"
  val PendingCancel="6"
  val Stopped="7"
  val Rejected="8"
  val Suspended="9"
  val PendingNew="A"
  val Calculated="B"
  val Expired="C"
  val AcceptedForBidding="D"
  val PendingReplace="E"
  lazy val fixDescriptionByValue = Map("0"->"NEW","1"->"PARTIALLY_FILLED",
    "2"->"FILLED","3"->"DONE_FOR_DAY","4"->"CANCELED",
    "5"->"REPLACED","6"->"PENDING_CANCEL","7"->"STOPPED",
    "8"->"REJECTED","9"->"SUSPENDED","A"->"PENDING_NEW",
    "B"->"CALCULATED","C"->"EXPIRED","D"->"ACCEPTED_FOR_BIDDING",
    "E"->"PENDING_REPLACE")
 
  def decode(a: Option[Any]) : Option[OrdStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OrdStatusField]
  }

  def decode(a: Any) : Option[OrdStatusField] = a match {
    case v: String => Some(OrdStatusField(v))
    case v: Char => Some(OrdStatusField(v.toString))
    case v: OrdStatusField => Some(v)
    case _ => scala.Option.empty[OrdStatusField]
  } 
}