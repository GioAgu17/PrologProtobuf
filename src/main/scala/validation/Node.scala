// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package validation



@SerialVersionUID(0L)
final case class Node(
    description: String = "",
    id: Int = 0,
    parId: Int = 0,
    depth: Int = 0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Node] with com.trueaccord.lenses.Updatable[Node] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (description != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, description) }
      if (id != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, id) }
      if (parId != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, parId) }
      if (depth != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(4, depth) }
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
        val __v = description
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
      {
        val __v = parId
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
      {
        val __v = depth
        if (__v != 0) {
          _output__.writeInt32(4, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): validation.Node = {
      var __description = this.description
      var __id = this.id
      var __parId = this.parId
      var __depth = this.depth
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __description = _input__.readString()
          case 16 =>
            __id = _input__.readInt32()
          case 24 =>
            __parId = _input__.readInt32()
          case 32 =>
            __depth = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      validation.Node(
          description = __description,
          id = __id,
          parId = __parId,
          depth = __depth
      )
    }
    def withDescription(__v: String): Node = copy(description = __v)
    def withId(__v: Int): Node = copy(id = __v)
    def withParId(__v: Int): Node = copy(parId = __v)
    def withDepth(__v: Int): Node = copy(depth = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = description
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = id
          if (__t != 0) __t else null
        }
        case 3 => {
          val __t = parId
          if (__t != 0) __t else null
        }
        case 4 => {
          val __t = depth
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(description)
        case 2 => _root_.scalapb.descriptors.PInt(id)
        case 3 => _root_.scalapb.descriptors.PInt(parId)
        case 4 => _root_.scalapb.descriptors.PInt(depth)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = validation.Node
}

object Node extends com.trueaccord.scalapb.GeneratedMessageCompanion[validation.Node] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[validation.Node] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): validation.Node = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    validation.Node(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(2), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(3), 0).asInstanceOf[Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[validation.Node] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      validation.Node(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ValidationProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ValidationProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = validation.Node(
  )
  implicit class NodeLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, validation.Node]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, validation.Node](_l) {
    def description: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.description)((c_, f_) => c_.copy(description = f_))
    def id: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def parId: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.parId)((c_, f_) => c_.copy(parId = f_))
    def depth: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.depth)((c_, f_) => c_.copy(depth = f_))
  }
  final val DESCRIPTION_FIELD_NUMBER = 1
  final val ID_FIELD_NUMBER = 2
  final val PAR_ID_FIELD_NUMBER = 3
  final val DEPTH_FIELD_NUMBER = 4
}
