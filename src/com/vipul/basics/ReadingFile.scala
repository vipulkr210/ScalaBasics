package com.vipul.basics

import scala.io.Source

object ReadingFile {
  def main(args: Array[String]) = {
    val file = Source.fromFile("D://ScalaWorkspace/TrainingSession/ScalaPractice/src/com/vipul/basics/ReadingFile.scala")
    for (line <- file.getLines) {
      println(line)
    }
  }
}
 