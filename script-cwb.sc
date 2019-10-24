import scala.io.Source

:load utilities.sc

val myLines: Vector[String] = loadFile("text/TheLadiesParadise.txt")

val charHisto: Vector[(Char, Int)] = {
	myLines.mkString(" ").toVector.filter( _.toHexString != "feff").filter( _ != ' ').groupBy( c => c).toVector.map( t => {
		(t._1, t._2.size)
	}).sortBy(_._2).reverse
}

val justChars: Vector[Char] = charHisto.map(_._1)

val charCodes: Vector[String] = {
	justChars.map( c => {
		s"'${c}' => ${c.toHexString}"
	})
}

showMe(charCodes)