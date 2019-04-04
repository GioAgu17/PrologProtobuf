// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package validation



@SerialVersionUID(0L)
final case class SuperInvocation(
    paramLst: String = "",
    parId: Int = 0,
    depth: Int = 0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[SuperInvocation] with com.trueaccord.lenses.Updatable[SuperInvocation] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (paramLst != "") { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, paramLst) }
      if (parId != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, parId) }
      if (depth != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, depth) }
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
        val __v = paramLst
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = parId
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      {
        val __v = depth
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): validation.SuperInvocation = {
      var __paramLst = this.paramLst
      var __parId = this.parId
      var __depth = this.depth
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __paramLst = _input__.readString()
          case 16 =>
            __parId = _input__.readInt32()
          case 24 =>
            __depth = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      validation.SuperInvocation(
          paramLst = __paramLst,
          parId = __parId,
          depth = __depth
      )
    }
    def withParamLst(__v: String): SuperInvocation = copy(paramLst = __v)
    def withParId(__v: Int): SuperInvocation = copy(parId = __v)
    def withDepth(__v: Int): SuperInvocation = copy(depth = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = paramLst
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = parId
          if (__t != 0) __t else null
        }
        case 3 => {
          val __t = depth
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(paramLst)
        case 2 => _root_.scalapb.descriptors.PInt(parId)
        case 3 => _root_.scalapb.descriptors.PInt(depth)
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = validation.SuperInvocation
}

object SuperInvocation extends com.trueaccord.scalapb.GeneratedMessageCompanion[validation.SuperInvocation] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[validation.SuperInvocation] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): validation.SuperInvocation = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    validation.SuperInvocation(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(2), 0).asInstanceOf[Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[validation.SuperInvocation] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      validation.SuperInvocation(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ValidationProto.javaDescriptor.getMessageTypes.get(10)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ValidationProto.scalaDescriptor.messages(10)
  def messageCompanionForFieldNumber(__number: Int): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = validation.SuperInvocation(
  )
  implicit class SuperInvocationLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, validation.SuperInvocation]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, validation.SuperInvocation](_l) {
    def paramLst: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.paramLst)((c_, f_) => c_.copy(paramLst = f_))
    def parId: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.parId)((c_, f_) => c_.copy(parId = f_))
    def depth: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.depth)((c_, f_) => c_.copy(depth = f_))
  }
  final val PARAMLST_FIELD_NUMBER = 1
  final val PARID_FIELD_NUMBER = 2
  final val DEPTH_FIELD_NUMBER = 3
}
