name := "protobuf_classes_Prolog"

version := "0.1"

scalaVersion := "2.12.7"

PB.targets in Compile := Seq(
  scalapb.gen() -> (scalaSource in Compile).value )

libraryDependencies ++= Seq(
  "com.trueaccord.scalapb" %% "scalapb-runtime"      % com.trueaccord.scalapb.compiler.Version.scalapbVersion % "protobuf",
  // for gRPC
  "io.grpc"                %  "grpc-netty"           % "1.9.0",
  "com.trueaccord.scalapb" %% "scalapb-runtime-grpc" % com.trueaccord.scalapb.compiler.Version.scalapbVersion,
  // for JSON conversion
  "com.trueaccord.scalapb" %% "scalapb-json4s"       % "0.3.2"
)


mappings in (Compile, packageBin) += {
  (baseDirectory.value / "src" / "main" / "protobuf"/ "validation.proto") -> "out/validation.proto"
}

PB.pythonExe := "C:\\Python27\\Python.exe"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}