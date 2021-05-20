import scala.collection.immutable.Map

object ExamenBigData {

  def retournerListe(a : List[String]) : List[String]= {
    val lis: List[String] = a.filter(l=>l.endsWith("n"))

    return lis
  }

  def liste_double():Unit = {
    val liste : Map[String,String] = Map(
      "ecommercemag.fr"->" ",
      "https://www.journalducm.com/contact/"->"Payant",
      "https://www.zatsaz.com/"->" ",
      "https://www.lerevenu.com/"->"",
      "https://www.cadre-dirigfdeant-magazine.com/"->"Payant",
      "https://www.silcon.fr/services/contact#annoncer"->"Payant",
      "https://www.channelbiz.fr/nous-contact"->" ",
      "https://www.itespresso.fr"->" ",
      "https://www.industrie-mag.com/article4.html"->"Invité",
      "https://www.jesuisundev.com/article-invite/"->"Invité",
      "https://www.numerama.com"->" "
    )
  val tab =liste.toList

  }
  def main(args: Array[String]): Unit = {
    retournerListe(List("julien","Paul","jean","rac","trec","joel","ed","chris","maurice"))
  }
}
