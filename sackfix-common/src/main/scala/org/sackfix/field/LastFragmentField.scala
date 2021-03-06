package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20170404
  */
case class LastFragmentField(override val value: Boolean) extends SfFieldBoolean(893, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(893)LastFragment=(").append({if (value) "Y" else "N"}).append(")")
}

object LastFragmentField {
  val TagId = 893  
  def apply(value: String) = try {
    new LastFragmentField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("LastFragment.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LastFragment("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LastFragmentField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastFragmentField]
  }

  def decode(a: Any) : Option[LastFragmentField] = a match {
    case v: String => Some(LastFragmentField(v))
    case v: Boolean => Some(LastFragmentField(v))
    case v: LastFragmentField => Some(v)
    case _ => scala.Option.empty[LastFragmentField]
  } 
}
