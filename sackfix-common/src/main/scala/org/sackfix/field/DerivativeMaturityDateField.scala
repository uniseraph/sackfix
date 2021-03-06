package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeMaturityDateField(override val value: LocalDate) extends SfFieldLocalMktDate(1252, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1252)DerivativeMaturityDate=(").append(value).append(")")
}

object DerivativeMaturityDateField {
  val TagId = 1252  
  def apply(value: String) = try {
    new DerivativeMaturityDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DerivativeMaturityDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DerivativeMaturityDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeMaturityDateField]
  }

  def decode(a: Any) : Option[DerivativeMaturityDateField] = a match {
    case v: String => Some(DerivativeMaturityDateField(v))
    case v: LocalDate => Some(DerivativeMaturityDateField(v))
    case v: DerivativeMaturityDateField => Some(v)
    case _ => scala.Option.empty[DerivativeMaturityDateField]
  } 
}
