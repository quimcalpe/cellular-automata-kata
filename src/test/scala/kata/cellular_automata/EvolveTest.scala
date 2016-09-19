package kata.cellular_automata

import kata.cellular_automata.Automata._
import org.scalatest._

final class EvolveTest extends FlatSpec with Matchers {

  "evolve function" should "forward evolution n steps" in {
    evolve(rule90, "1101010", 5) shouldBe List(
      "1101010",
      "1100001",
      "1110010",
      "1011101",
      "0010100",
      "0100010"
    )
  }
}

