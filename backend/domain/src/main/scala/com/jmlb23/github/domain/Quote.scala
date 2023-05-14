package com.github.jmlb23

import scala.util.Try
import scala.util.Failure
import scala.util.Success


case class NonEmptyString(content: String)

case object NonEmptyString {
  def apply(content: String): Try[NonEmptyString] = content match {
    case "" => Failure(new Exception)
    case null => Failure(new Exception)
    case _ => Success(new NonEmptyString(content))
  }
}

case class Quote private (author: NonEmptyString, text: NonEmptyString)
case object Quote {
  def apply(author: String, text: String): Try[Quote] = {
    for {
      _author <- NonEmptyString(author)
      _text <- NonEmptyString(text)
    } yield Quote(_author, _text)
  }
}