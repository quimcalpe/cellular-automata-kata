package kata.cellular_automata

import kata.cellular_automata.Automata._
import org.scalatest._

final class RenderTest extends FlatSpec with Matchers {

  "Renderer " should "print x for 1s and space for 0s" in {
    // capture output temporally
    val output = new java.io.ByteArrayOutputStream()
    Console.withOut(output) {
      render(evolve(rule90, "1101010", 5))
    }
    output.toString shouldBe "xx x x \nxx    x\nxxx  x \nx xxx x\n  x x  \n x   x \n"
  }
}

