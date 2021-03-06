package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingLegSecurityAltIDSourceField(override val value: String) extends SfFieldString(1336, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1336)UnderlyingLegSecurityAltIDSource=(").append(value).append(")")
}

object UnderlyingLegSecurityAltIDSourceField {
  val TagId = 1336  
  def decode(a: Option[Any]) : Option[UnderlyingLegSecurityAltIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegSecurityAltIDSourceField]
  }

  def decode(a: Any) : Option[UnderlyingLegSecurityAltIDSourceField] = a match {
    case v: String => Some(UnderlyingLegSecurityAltIDSourceField(v))
    case v: UnderlyingLegSecurityAltIDSourceField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegSecurityAltIDSourceField]
  } 
}
