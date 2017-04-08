package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class TrdRegTimestampTypeField(override val value: Int) extends SfFieldInt(770, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(770)TrdRegTimestampType=(").append(value).append(")").append(TrdRegTimestampTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object TrdRegTimestampTypeField {
  val TagId = 770 
  val ExecutionTime=1
  val TimeIn=2
  val TimeOut=3
  val BrokerReceipt=4
  val BrokerExecution=5
  val DeskReceipt=6
  lazy val fixDescriptionByValue = Map(1->"EXECUTION_TIME",2->"TIME_IN",
    3->"TIME_OUT",4->"BROKER_RECEIPT",5->"BROKER_EXECUTION",
    6->"DESK_RECEIPT")
 
  def apply(value: String) = try {
    new TrdRegTimestampTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TrdRegTimestampType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TrdRegTimestampTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TrdRegTimestampTypeField]
  }

  def decode(a: Any) : Option[TrdRegTimestampTypeField] = a match {
    case v: String => Some(TrdRegTimestampTypeField(v))
    case v: Int => Some(TrdRegTimestampTypeField(v))
    case v: TrdRegTimestampTypeField => Some(v)
    case _ => scala.Option.empty[TrdRegTimestampTypeField]
  } 
}