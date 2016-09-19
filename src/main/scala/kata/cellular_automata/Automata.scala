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
    case "000" => "0"
    case "001" => "1"
    case "010" => "1"
    case "011" => "1"
    case "100" => "1"
    case "101" => "0"
    case "110" => "0"
    case "111" => "0"
  }

  def rule90(s: String): String = s match {
    case "000" | "010" | "101" | "111" => "0"
    case "001" | "011" | "100" | "110" => "1"
  }
}
