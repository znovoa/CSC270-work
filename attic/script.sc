import scala.io.Source

:load utilities.sc

val myLines: Vector[String] = loadFile("text/TheLadiesParadise.txt")

val oneBigString: String = myLines.mkString(" ")

val myChars:  Vector[Char] = oneBigString.toVector.filter( c => {
	c.toHexString != "feff"
})

val myBetterChars: Vector[String] = myChars.map(_.toString)

val noSpaces: Vector[String] = myBetterChars.filter(_ != " ")

val groupedChars: Vector[ (String, Vector[String] ) ] = {
  noSpaces.groupBy(c => c ).toVector
}

val charHistoUnsorted: Vector[ (String, Int) ] = {
  groupedChars.map( c => {
    ( c._1, c._2.size )
  })
}

val charHisto: Vector[ (String, Int) ] = charHistoUnsorted.sortBy( _._2 ).reverse

val someHisto: Vector[ ( String, Int ) ] = charHisto

val codes: Vector[String] = someHisto.map( t => {
	val myChar: Char = t._1.toVector.head
	myChar.toHexString
})

for ( h <- charHisto ) println( s"${h._1}\t${h._2}" )
