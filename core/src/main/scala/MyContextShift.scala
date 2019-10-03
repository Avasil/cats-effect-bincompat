import cats.effect._
import cats.implicits._

import scala.concurrent.ExecutionContext

trait MyContextShift {
  implicit val cs: ContextShift[IO] = new ContextShift[IO] {
    override def shift: IO[Unit] = IO.unit

    override def evalOn[A](ec: ExecutionContext)(fa: IO[A]): IO[A] = fa
  }
}