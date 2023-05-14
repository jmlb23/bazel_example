package com.github.jmlb23

import cats.effect._

object Main extends IOApp {
  def run(args: List[String]): IO[ExitCode] =
    args match {
      case name :: xs =>
        IO(println(s"Hello, $name.")).as(ExitCode.Success)
      case Nil =>
        IO(System.err.println("Usage: MyApp name")).as(ExitCode(2))
    }
}