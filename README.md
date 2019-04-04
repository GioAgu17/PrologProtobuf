# PrologProtobuf

Protobuf for programs interacting with the Prolog engine.

## Protobuf library
For the sake of scalability for future
development and architecture quality, we thought about implementing a server for the Prolog system. The
application communicates with the Server through Remote Procedure Calls (RPC). We 
adopted gRPC, a high-performance, open-source universal RPC framework. As 
Interface Description Language gRPC uses Protocol Buffers, a language-neutral,
platform-neutral extensible mechanism for serializing structured data. 
The services and the types of messages to be exchanged between client and server
are defined in a .proto file. Then, using a protobuf compiler for Scala (ScalaPB),
Scala classes for the definition of the services are generated. 
###Steps for the protobuf library creation
1.	Created an sbt project “protobuf_classes_Prolog” on IntelliJ Idea Ultimate Edition 2018.2.4, with JDK 9.0, SBT version 1.2.6 and Scala version 2.12.7
2.	Installed ScalaPB dependency for gRPC
3.	To automatically generate Scala classes for messages created a file named “project/scalapb.sbt” and added instructions for the sbt-protoc plugin as described here
4.	Added the following lines to “build.sbt” for generating classes in the folder “src/main/scala/validation”:
    ```
    PB.targets in Compile := Seq(
      scalapb.gen() -> (scalaSource in Compile).value )
    ```
5.	Run the SBT task “sbt compile” to generate Scala classes and compile them
6.	Added to “build.sbt” the following lines for including in the Jar the proto file:
    ```
    mappings in (Compile, packageBin) += {
      (baseDirectory.value / "src" / "main" / "protobuf"/ "validation.proto") -> "out/validation.proto"
    }
    ```
7.	Created a file named “project/assembly.sbt” and added the following lines to it:
    ```
       addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.8")
    ```
8.	Found deduplication error due to merge strategies in sbt assemply, for discarding them added the following lines to “build.sbt”:
    ```
    assemblyMergeStrategy in assembly := {
      case PathList("META-INF", xs @ _*) => MergeStrategy.discard
      case x => MergeStrategy.first
    }
    ```
9.	Run the SBT task “sbt assembly” and created the jar of the project “protobuf_classes_Prolog-assembly-0.1.jar”

**Important**: for running on Windows, geneating Scala code requires Python 2.x to be installed on your system, so I added the following lines to “build.sbt”:
    ```
    PB.pythonExe := "C:\\Python27\\Python.exe"
    ```
    
Resources: 
*	https://www.beyondthelines.net/computing/grpc-in-scala/ 
*	https://scalapb.github.io/
*	https://blog.bugsnag.com/libraries-for-grpc-services/
*	https://alvinalexander.com/scala/sbt-how-build-single-executable-jar-file-assembly
*	https://www.scala-sbt.org/1.x/docs/index.html
*	https://github.com/sbt/sbt-assembly 

### Project Structure
Inside the project, you can find the file `prologprotobuf/src/main/protobuf/validation.proto` 
written in the syntax of proto3 language (https://developers.google.com/protocol-buffers/docs/proto3). 
The file defines the grpc services and the types of messages exchanged between client and
server.
In the folder `prologprotobuf/src/main/scala/validation` there are the generated
Scala classes which are emplyed to implement the communication. 
Finally, the assembled jar is contained in `prologprotobuf/lib`, along with the current version.

## Built With


* [SBT](https://www.scala-sbt.org/) - Dependency Management
* [IntelliJ](https://www.jetbrains.com/idea/) - IntelliJ IDEA 2018.2.4 (Ultimate Edition)
                                                       JRE: 1.8.0_152-release-1248-b8 amd64
                                                       JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
                                                       Windows 10 10.0
* Scala SDK version 2-12.4                                          
## Authors

* **Giovanni Agugini Bassi** - Master student at University of Illinois at Chicago -*Initial work* 
                                                                                                    