package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeSettleOnOpenFlagField(override val value: String) extends SfFieldString(1254, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1254)DerivativeSettleOnOpenFlag=(").append(value).append(")")
}

object DerivativeSettleOnOpenFlagField {
  val TagId = 1254  
  def decode(a: Option[Any]) : Option[DerivativeSettleOnOpenFlagField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeSettleOnOpenFlagField]
  }

  def decode(a: Any) : Option[DerivativeSettleOnOpenFlagField] = a match {
    case v: String => Some(DerivativeSettleOnOpenFlagField(v))
    case v: DerivativeSettleOnOpenFlagField => Some(v)
    case _ => scala.Option.empty[DerivativeSettleOnOpenFlagField]
  } 
}
