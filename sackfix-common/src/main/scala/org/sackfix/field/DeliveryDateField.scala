package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class DeliveryDateField(override val value: LocalDate) extends SfFieldLocalMktDate(743, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(743)DeliveryDate=(").append(value).append(")")
}

object DeliveryDateField {
  val TagId = 743  
  def apply(value: String) = try {
    new DeliveryDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DeliveryDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DeliveryDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DeliveryDateField]
  }

  def decode(a: Any) : Option[DeliveryDateField] = a match {
    case v: String => Some(DeliveryDateField(v))
    case v: LocalDate => Some(DeliveryDateField(v))
    case v: DeliveryDateField => Some(v)
    case _ => scala.Option.empty[DeliveryDateField]
  } 
}