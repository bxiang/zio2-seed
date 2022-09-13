package rtj
import zio._
import zio.Console._

object Fibers extends ZIOAppDefault {

  override def run = printLine("Hello world!")

}
