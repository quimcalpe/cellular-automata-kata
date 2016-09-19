package kata.cellular_automata

object Automata {

  def evolve(f: String => String, input: String, times: Int): List[String] = {
    var res = List(input)
    for(i <- 1 to times) {
      res = ("0" + res.head + "0").sliding(3).map(f(_)).toList.mkString :: res
    }
    res.reverse
  }

  def render(lines: List[String]): Unit = {
    print(lines.map(_.replace("1", "x").replace("0", " ").concat("\n")).mkString)
  }

  def rule30(s: String): String = s match {
    case "000" | "101" | "110" | "111" => "0"
    case "001" | "010" | "011" | "100" => "1"
  }

  def rule90(s: String): String = s match {
    case "000" | "010" | "101" | "111" => "0"
    case "001" | "011" | "100" | "110" => "1"
  }
}
