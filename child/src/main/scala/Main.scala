import cats.effect._
import cats.effect.concurrent.MVar

object Main extends App with MyContextShift {
  MVar[IO].empty[Unit]
}