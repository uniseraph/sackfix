package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldMonthYear
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegMaturityMonthYearField(override val value: LocalDate) extends SfFieldMonthYear(610, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(610)LegMaturityMonthYear=(").append(value).append(")")
}

object LegMaturityMonthYearField {
  val TagId = 610  
  def apply(value: String) = try {
    new LegMaturityMonthYearField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegMaturityMonthYear("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegMaturityMonthYearField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegMaturityMonthYearField]
  }

  def decode(a: Any) : Option[LegMaturityMonthYearField] = a match {
    case v: String => Some(LegMaturityMonthYearField(v))
    case v: LocalDate => Some(LegMaturityMonthYearField(v))
    case v: LegMaturityMonthYearField => Some(v)
    case _ => scala.Option.empty[LegMaturityMonthYearField]
  } 
}