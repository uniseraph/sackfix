package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoDerivativeSecurityAltIDField(override val value: Int) extends SfNumInGroup(1218, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1218)NoDerivativeSecurityAltID=(").append(value).append(")")
}

object NoDerivativeSecurityAltIDField {
  val TagId = 1218  
  def apply(value: String) = try {
    new NoDerivativeSecurityAltIDField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoDerivativeSecurityAltID("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoDerivativeSecurityAltIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoDerivativeSecurityAltIDField]
  }

  def decode(a: Any) : Option[NoDerivativeSecurityAltIDField] = a match {
    case v: String => Some(NoDerivativeSecurityAltIDField(v))
    case v: Int => Some(NoDerivativeSecurityAltIDField(v))
    case v: NoDerivativeSecurityAltIDField => Some(v)
    case _ => scala.Option.empty[NoDerivativeSecurityAltIDField]
  } 
}
