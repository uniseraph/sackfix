package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class StreamAsgnReqTypeField(override val value: Int) extends SfFieldInt(1498, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1498)StreamAsgnReqType=(").append(value).append(")").append(StreamAsgnReqTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object StreamAsgnReqTypeField {
  val TagId = 1498 
  val StreamAssignmentForNewCustomer=1
  val StreamAssignmentForExistingCustomer=2
  lazy val fixDescriptionByValue = Map(1->"STREAM_ASSIGNMENT_FOR_NEW_CUSTOMER",2->"STREAM_ASSIGNMENT_FOR_EXISTING_CUSTOMER")
 
  def apply(value: String) = try {
    new StreamAsgnReqTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StreamAsgnReqType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StreamAsgnReqTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StreamAsgnReqTypeField]
  }

  def decode(a: Any) : Option[StreamAsgnReqTypeField] = a match {
    case v: String => Some(StreamAsgnReqTypeField(v))
    case v: Int => Some(StreamAsgnReqTypeField(v))
    case v: StreamAsgnReqTypeField => Some(v)
    case _ => scala.Option.empty[StreamAsgnReqTypeField]
  } 
}
