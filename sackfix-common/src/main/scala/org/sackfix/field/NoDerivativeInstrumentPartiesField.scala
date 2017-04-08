package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoDerivativeInstrumentPartiesField(override val value: Int) extends SfNumInGroup(1292, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1292)NoDerivativeInstrumentParties=(").append(value).append(")")
}

object NoDerivativeInstrumentPartiesField {
  val TagId = 1292  
  def apply(value: String) = try {
    new NoDerivativeInstrumentPartiesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoDerivativeInstrumentParties("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoDerivativeInstrumentPartiesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoDerivativeInstrumentPartiesField]
  }

  def decode(a: Any) : Option[NoDerivativeInstrumentPartiesField] = a match {
    case v: String => Some(NoDerivativeInstrumentPartiesField(v))
    case v: Int => Some(NoDerivativeInstrumentPartiesField(v))
    case v: NoDerivativeInstrumentPartiesField => Some(v)
    case _ => scala.Option.empty[NoDerivativeInstrumentPartiesField]
  } 
}