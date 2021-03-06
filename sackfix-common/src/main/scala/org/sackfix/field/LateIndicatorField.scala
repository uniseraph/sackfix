package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20170404
  */
case class LateIndicatorField(override val value: Boolean) extends SfFieldBoolean(978, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(978)LateIndicator=(").append({if (value) "Y" else "N"}).append(")")
}

object LateIndicatorField {
  val TagId = 978  
  def apply(value: String) = try {
    new LateIndicatorField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("LateIndicator.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LateIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LateIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LateIndicatorField]
  }

  def decode(a: Any) : Option[LateIndicatorField] = a match {
    case v: String => Some(LateIndicatorField(v))
    case v: Boolean => Some(LateIndicatorField(v))
    case v: LateIndicatorField => Some(v)
    case _ => scala.Option.empty[LateIndicatorField]
  } 
}
