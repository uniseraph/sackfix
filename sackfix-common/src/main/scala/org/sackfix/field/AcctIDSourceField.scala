package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class AcctIDSourceField(override val value: Int) extends SfFieldInt(660, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(660)AcctIDSource=(").append(value).append(")").append(AcctIDSourceField.fixDescriptionByValue.getOrElse(value,""))
}

object AcctIDSourceField {
  val TagId = 660 
  val Bic=1
  val SidCode=2
  val Tfm=3
  val Omgeo=4
  val DtccCode=5
  val Other=99
  lazy val fixDescriptionByValue = Map(1->"BIC",2->"SID_CODE",
    3->"TFM",4->"OMGEO",5->"DTCC_CODE",
    99->"OTHER")
 
  def apply(value: String) = try {
    new AcctIDSourceField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AcctIDSource("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AcctIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AcctIDSourceField]
  }

  def decode(a: Any) : Option[AcctIDSourceField] = a match {
    case v: String => Some(AcctIDSourceField(v))
    case v: Int => Some(AcctIDSourceField(v))
    case v: AcctIDSourceField => Some(v)
    case _ => scala.Option.empty[AcctIDSourceField]
  } 
}