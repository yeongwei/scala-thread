package com.example

object Main {
  def main(args: Array[String]) = {
    for (i <- 1 to 3)
      new Thread(new AbstractApplication(s"Instance(${i})")).start()
  }
}

class AbstractApplication(name: String) extends Runnable {
  override def run = while (true) {
    if (math.random < 0.5)
      println(s"[${name}] ${System.currentTimeMillis()} Hello World!")
    Thread.sleep(3000)
  }
}