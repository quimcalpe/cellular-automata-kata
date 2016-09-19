package kata.cellular_automata

import kata.cellular_automata.Automata._
import org.scalatest._

final class RulesTest extends FlatSpec with Matchers {

  "Rule30 specification" should "conform his rules" in {
      rule30("000") shouldBe "0"
      rule30("001") shouldBe "1"
      rule30("010") shouldBe "1"
      rule30("011") shouldBe "1"
      rule30("100") shouldBe "1"
      rule30("101") shouldBe "0"
      rule30("110") shouldBe "0"
      rule30("111") shouldBe "0"
    }

  "Rule90 specification" should "conform his rules" in {
      rule90("000") shouldBe "0"
      rule90("001") shouldBe "1"
      rule90("010") shouldBe "0"
      rule90("011") shouldBe "1"
      rule90("100") shouldBe "1"
      rule90("101") shouldBe "0"
      rule90("110") shouldBe "1"
      rule90("111") shouldBe "0"
  }
}

