package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class ApplReqTypeField(override val value: Int) extends SfFieldInt(1347, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1347)ApplReqType=(").append(value).append(")").append(ApplReqTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object ApplReqTypeField {
  val TagId = 1347 
  val RetransmissionOfApplicationMessagesForTheSpecifiedApplications=0
  val SubscriptionToTheSpecifiedApplications=1
  val RequestForTheLastAppllastseqnumPublishedForTheSpecifiedApplications=2
  val RequestValidSetOfApplications=3
  val UnsubscribeToTheSpecifiedApplications=4
  lazy val fixDescriptionByValue = Map(0->"RETRANSMISSION_OF_APPLICATION_MESSAGES_FOR_THE_SPECIFIED_APPLICATIONS",1->"SUBSCRIPTION_TO_THE_SPECIFIED_APPLICATIONS",
    2->"REQUEST_FOR_THE_LAST_APPLLASTSEQNUM_PUBLISHED_FOR_THE_SPECIFIED_APPLICATIONS",3->"REQUEST_VALID_SET_OF_APPLICATIONS",4->"UNSUBSCRIBE_TO_THE_SPECIFIED_APPLICATIONS")
 
  def apply(value: String) = try {
    new ApplReqTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ApplReqType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ApplReqTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplReqTypeField]
  }

  def decode(a: Any) : Option[ApplReqTypeField] = a match {
    case v: String => Some(ApplReqTypeField(v))
    case v: Int => Some(ApplReqTypeField(v))
    case v: ApplReqTypeField => Some(v)
    case _ => scala.Option.empty[ApplReqTypeField]
  } 
}
