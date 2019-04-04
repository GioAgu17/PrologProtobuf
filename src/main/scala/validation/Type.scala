// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package validation



@SerialVersionUID(0L)
final case class Type(
    `type`: String = "",
    id: Int = 0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Type] with com.trueaccord.lenses.Updatable[Type] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (`type` != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, `type`) }
      if (id != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, id) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = `type`
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = id
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): validation.Type = {
      var __type = this.`type`
      var __id = this.id
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __type = _input__.readString()
          case 16 =>
            __id = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      validation.Type(
          `type` = __type,
          id = __id
      )
    }
    def withType(__v: String): Type = copy(`type` = __v)
    def withId(__v: Int): Type = copy(id = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = `type`
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = id
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(`type`)
        case 2 => _root_.scalapb.descriptors.PInt(id)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = validation.Type
}

object Type extends com.trueaccord.scalapb.GeneratedMessageCompanion[validation.Type] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[validation.Type] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): validation.Type = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    validation.Type(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[validation.Type] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      validation.Type(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ValidationProto.javaDescriptor.getMessageTypes.get(11)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ValidationProto.scalaDescriptor.messages(11)
  def messageCompanionForFieldNumber(__number: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = validation.Type(
  )
  implicit class TypeLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, validation.Type]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, validation.Type](_l) {
    def `type`: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def id: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.id)((c_, f_) => c_.copy(id = f_))
  }
  final val TYPE_FIELD_NUMBER = 1
  final val ID_FIELD_NUMBER = 2
}
