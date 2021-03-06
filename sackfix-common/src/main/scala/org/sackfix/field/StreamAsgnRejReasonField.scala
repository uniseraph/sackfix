package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class StreamAsgnRejReasonField(override val value: Int) extends SfFieldInt(1502, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1502)StreamAsgnRejReason=(").append(value).append(")").append(StreamAsgnRejReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object StreamAsgnRejReasonField {
  val TagId = 1502 
  val UnknownClient=0
  val ExceedsMaximumSize=1
  val UnknownOrInvalidCurrencyPair=2
  val NoAvailableStream=3
  val Other=99
  lazy val fixDescriptionByValue = Map(0->"UNKNOWN_CLIENT",1->"EXCEEDS_MAXIMUM_SIZE",
    2->"UNKNOWN_OR_INVALID_CURRENCY_PAIR",3->"NO_AVAILABLE_STREAM",99->"OTHER")
 
  def apply(value: String) = try {
    new StreamAsgnRejReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StreamAsgnRejReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StreamAsgnRejReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StreamAsgnRejReasonField]
  }

  def decode(a: Any) : Option[StreamAsgnRejReasonField] = a match {
    case v: String => Some(StreamAsgnRejReasonField(v))
    case v: Int => Some(StreamAsgnRejReasonField(v))
    case v: StreamAsgnRejReasonField => Some(v)
    case _ => scala.Option.empty[StreamAsgnRejReasonField]
  } 
}
