object ExamenBigData {

  def retournerListe(a : List[String]) : List[String]= {
    val lis: List[String] = a.filter(l=>l.endsWith("n"))

    return lis
  }

  def main(args: Array[String]): Unit = {

  }
}
