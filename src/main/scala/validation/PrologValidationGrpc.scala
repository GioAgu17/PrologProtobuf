package validation

object PrologValidationGrpc {
  val METHOD_ADD_FACT_NODE: _root_.io.grpc.MethodDescriptor[validation.Node, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "addFactNode"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Node))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_VALIDATE_EXTENSION: _root_.io.grpc.MethodDescriptor[validation.Extend, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "validateExtension"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Extend))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_VALIDATE_METHOD_SIGN: _root_.io.grpc.MethodDescriptor[validation.MethodSign, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "validateMethodSign"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.MethodSign))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_VALIDATE_CONSTRUCTOR_SIGN: _root_.io.grpc.MethodDescriptor[validation.ConstrSign, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "validateConstructorSign"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.ConstrSign))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_VALIDATE_THIS_INVOCATION: _root_.io.grpc.MethodDescriptor[validation.ThisInvocation, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "validateThisInvocation"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.ThisInvocation))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_VALIDATE_USE_RET_STMT: _root_.io.grpc.MethodDescriptor[validation.UseRetStmt, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "validateUseRetStmt"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.UseRetStmt))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_VALIDATE_RET_STMT: _root_.io.grpc.MethodDescriptor[validation.RetStmt, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "validateRetStmt"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.RetStmt))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_VALIDATE_SUPER_INVOCATION: _root_.io.grpc.MethodDescriptor[validation.SuperInvocation, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "validateSuperInvocation"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.SuperInvocation))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_VALIDATE_METHOD_INVOCATION: _root_.io.grpc.MethodDescriptor[validation.MethodInvocation, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "validateMethodInvocation"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.MethodInvocation))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_VALIDATE_CLASS_INSTANCE_CREATION: _root_.io.grpc.MethodDescriptor[validation.ClassCreation, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "validateClassInstanceCreation"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.ClassCreation))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_VALIDATE_VARIABLE_INITIALIZATION: _root_.io.grpc.MethodDescriptor[validation.VariableInitialization, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "validateVariableInitialization"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.VariableInitialization))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_ADD_TYPE: _root_.io.grpc.MethodDescriptor[validation.Type, validation.Response] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "addType"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Type))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Response))
      .build()
  
  val METHOD_GET_TYPE: _root_.io.grpc.MethodDescriptor[validation.Type, validation.TypeResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("PrologValidation", "getType"))
      .setRequestMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.Type))
      .setResponseMarshaller(new com.trueaccord.scalapb.grpc.Marshaller(validation.TypeResponse))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("PrologValidation")
      .setSchemaDescriptor(new _root_.com.trueaccord.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(validation.ValidationProto.javaDescriptor))
      .addMethod(METHOD_ADD_FACT_NODE)
      .addMethod(METHOD_VALIDATE_EXTENSION)
      .addMethod(METHOD_VALIDATE_METHOD_SIGN)
      .addMethod(METHOD_VALIDATE_CONSTRUCTOR_SIGN)
      .addMethod(METHOD_VALIDATE_THIS_INVOCATION)
      .addMethod(METHOD_VALIDATE_USE_RET_STMT)
      .addMethod(METHOD_VALIDATE_RET_STMT)
      .addMethod(METHOD_VALIDATE_SUPER_INVOCATION)
      .addMethod(METHOD_VALIDATE_METHOD_INVOCATION)
      .addMethod(METHOD_VALIDATE_CLASS_INSTANCE_CREATION)
      .addMethod(METHOD_VALIDATE_VARIABLE_INITIALIZATION)
      .addMethod(METHOD_ADD_TYPE)
      .addMethod(METHOD_GET_TYPE)
      .build()
  
  trait PrologValidation extends _root_.com.trueaccord.scalapb.grpc.AbstractService {
    override def serviceCompanion = PrologValidation
    def addFactNode(request: validation.Node): scala.concurrent.Future[validation.Response]
    def validateExtension(request: validation.Extend): scala.concurrent.Future[validation.Response]
    def validateMethodSign(request: validation.MethodSign): scala.concurrent.Future[validation.Response]
    def validateConstructorSign(request: validation.ConstrSign): scala.concurrent.Future[validation.Response]
    def validateThisInvocation(request: validation.ThisInvocation): scala.concurrent.Future[validation.Response]
    def validateUseRetStmt(request: validation.UseRetStmt): scala.concurrent.Future[validation.Response]
    def validateRetStmt(request: validation.RetStmt): scala.concurrent.Future[validation.Response]
    def validateSuperInvocation(request: validation.SuperInvocation): scala.concurrent.Future[validation.Response]
    def validateMethodInvocation(request: validation.MethodInvocation): scala.concurrent.Future[validation.Response]
    def validateClassInstanceCreation(request: validation.ClassCreation): scala.concurrent.Future[validation.Response]
    def validateVariableInitialization(request: validation.VariableInitialization): scala.concurrent.Future[validation.Response]
    def addType(request: validation.Type): scala.concurrent.Future[validation.Response]
    def getType(request: validation.Type): scala.concurrent.Future[validation.TypeResponse]
  }
  
  object PrologValidation extends _root_.com.trueaccord.scalapb.grpc.ServiceCompanion[PrologValidation] {
    implicit def serviceCompanion: _root_.com.trueaccord.scalapb.grpc.ServiceCompanion[PrologValidation] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = validation.ValidationProto.javaDescriptor.getServices().get(0)
  }
  
  trait PrologValidationBlockingClient {
    def serviceCompanion = PrologValidation
    def addFactNode(request: validation.Node): validation.Response
    def validateExtension(request: validation.Extend): validation.Response
    def validateMethodSign(request: validation.MethodSign): validation.Response
    def validateConstructorSign(request: validation.ConstrSign): validation.Response
    def validateThisInvocation(request: validation.ThisInvocation): validation.Response
    def validateUseRetStmt(request: validation.UseRetStmt): validation.Response
    def validateRetStmt(request: validation.RetStmt): validation.Response
    def validateSuperInvocation(request: validation.SuperInvocation): validation.Response
    def validateMethodInvocation(request: validation.MethodInvocation): validation.Response
    def validateClassInstanceCreation(request: validation.ClassCreation): validation.Response
    def validateVariableInitialization(request: validation.VariableInitialization): validation.Response
    def addType(request: validation.Type): validation.Response
    def getType(request: validation.Type): validation.TypeResponse
  }
  
  class PrologValidationBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[PrologValidationBlockingStub](channel, options) with PrologValidationBlockingClient {
    override def addFactNode(request: validation.Node): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_ADD_FACT_NODE, options), request)
    }
    
    override def validateExtension(request: validation.Extend): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_VALIDATE_EXTENSION, options), request)
    }
    
    override def validateMethodSign(request: validation.MethodSign): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_VALIDATE_METHOD_SIGN, options), request)
    }
    
    override def validateConstructorSign(request: validation.ConstrSign): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_VALIDATE_CONSTRUCTOR_SIGN, options), request)
    }
    
    override def validateThisInvocation(request: validation.ThisInvocation): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_VALIDATE_THIS_INVOCATION, options), request)
    }
    
    override def validateUseRetStmt(request: validation.UseRetStmt): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_VALIDATE_USE_RET_STMT, options), request)
    }
    
    override def validateRetStmt(request: validation.RetStmt): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_VALIDATE_RET_STMT, options), request)
    }
    
    override def validateSuperInvocation(request: validation.SuperInvocation): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_VALIDATE_SUPER_INVOCATION, options), request)
    }
    
    override def validateMethodInvocation(request: validation.MethodInvocation): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_VALIDATE_METHOD_INVOCATION, options), request)
    }
    
    override def validateClassInstanceCreation(request: validation.ClassCreation): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_VALIDATE_CLASS_INSTANCE_CREATION, options), request)
    }
    
    override def validateVariableInitialization(request: validation.VariableInitialization): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_VALIDATE_VARIABLE_INITIALIZATION, options), request)
    }
    
    override def addType(request: validation.Type): validation.Response = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_ADD_TYPE, options), request)
    }
    
    override def getType(request: validation.Type): validation.TypeResponse = {
      _root_.io.grpc.stub.ClientCalls.blockingUnaryCall(channel.newCall(METHOD_GET_TYPE, options), request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): PrologValidationBlockingStub = new PrologValidationBlockingStub(channel, options)
  }
  
  class PrologValidationStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[PrologValidationStub](channel, options) with PrologValidation {
    override def addFactNode(request: validation.Node): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_ADD_FACT_NODE, options), request))
    }
    
    override def validateExtension(request: validation.Extend): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_VALIDATE_EXTENSION, options), request))
    }
    
    override def validateMethodSign(request: validation.MethodSign): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_VALIDATE_METHOD_SIGN, options), request))
    }
    
    override def validateConstructorSign(request: validation.ConstrSign): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_VALIDATE_CONSTRUCTOR_SIGN, options), request))
    }
    
    override def validateThisInvocation(request: validation.ThisInvocation): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_VALIDATE_THIS_INVOCATION, options), request))
    }
    
    override def validateUseRetStmt(request: validation.UseRetStmt): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_VALIDATE_USE_RET_STMT, options), request))
    }
    
    override def validateRetStmt(request: validation.RetStmt): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_VALIDATE_RET_STMT, options), request))
    }
    
    override def validateSuperInvocation(request: validation.SuperInvocation): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_VALIDATE_SUPER_INVOCATION, options), request))
    }
    
    override def validateMethodInvocation(request: validation.MethodInvocation): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_VALIDATE_METHOD_INVOCATION, options), request))
    }
    
    override def validateClassInstanceCreation(request: validation.ClassCreation): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_VALIDATE_CLASS_INSTANCE_CREATION, options), request))
    }
    
    override def validateVariableInitialization(request: validation.VariableInitialization): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_VALIDATE_VARIABLE_INITIALIZATION, options), request))
    }
    
    override def addType(request: validation.Type): scala.concurrent.Future[validation.Response] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_ADD_TYPE, options), request))
    }
    
    override def getType(request: validation.Type): scala.concurrent.Future[validation.TypeResponse] = {
      com.trueaccord.scalapb.grpc.Grpc.guavaFuture2ScalaFuture(_root_.io.grpc.stub.ClientCalls.futureUnaryCall(channel.newCall(METHOD_GET_TYPE, options), request))
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): PrologValidationStub = new PrologValidationStub(channel, options)
  }
  
  def bindService(serviceImpl: PrologValidation, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
    _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
    .addMethod(
      METHOD_ADD_FACT_NODE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.Node, validation.Response] {
        override def invoke(request: validation.Node, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.addFactNode(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_VALIDATE_EXTENSION,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.Extend, validation.Response] {
        override def invoke(request: validation.Extend, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.validateExtension(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_VALIDATE_METHOD_SIGN,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.MethodSign, validation.Response] {
        override def invoke(request: validation.MethodSign, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.validateMethodSign(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_VALIDATE_CONSTRUCTOR_SIGN,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.ConstrSign, validation.Response] {
        override def invoke(request: validation.ConstrSign, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.validateConstructorSign(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_VALIDATE_THIS_INVOCATION,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.ThisInvocation, validation.Response] {
        override def invoke(request: validation.ThisInvocation, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.validateThisInvocation(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_VALIDATE_USE_RET_STMT,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.UseRetStmt, validation.Response] {
        override def invoke(request: validation.UseRetStmt, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.validateUseRetStmt(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_VALIDATE_RET_STMT,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.RetStmt, validation.Response] {
        override def invoke(request: validation.RetStmt, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.validateRetStmt(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_VALIDATE_SUPER_INVOCATION,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.SuperInvocation, validation.Response] {
        override def invoke(request: validation.SuperInvocation, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.validateSuperInvocation(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_VALIDATE_METHOD_INVOCATION,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.MethodInvocation, validation.Response] {
        override def invoke(request: validation.MethodInvocation, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.validateMethodInvocation(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_VALIDATE_CLASS_INSTANCE_CREATION,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.ClassCreation, validation.Response] {
        override def invoke(request: validation.ClassCreation, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.validateClassInstanceCreation(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_VALIDATE_VARIABLE_INITIALIZATION,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.VariableInitialization, validation.Response] {
        override def invoke(request: validation.VariableInitialization, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.validateVariableInitialization(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_ADD_TYPE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.Type, validation.Response] {
        override def invoke(request: validation.Type, observer: _root_.io.grpc.stub.StreamObserver[validation.Response]): Unit =
          serviceImpl.addType(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .addMethod(
      METHOD_GET_TYPE,
      _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[validation.Type, validation.TypeResponse] {
        override def invoke(request: validation.Type, observer: _root_.io.grpc.stub.StreamObserver[validation.TypeResponse]): Unit =
          serviceImpl.getType(request).onComplete(com.trueaccord.scalapb.grpc.Grpc.completeObserver(observer))(
            executionContext)
      }))
    .build()
  
  def blockingStub(channel: _root_.io.grpc.Channel): PrologValidationBlockingStub = new PrologValidationBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): PrologValidationStub = new PrologValidationStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = validation.ValidationProto.javaDescriptor.getServices().get(0)
  
}