import scala.collection.immutable.Map
import scala.collection.immutable.ListMap

object ExamenBigData {

  def retournerListe(a : List[String]) : List[String]= {
    val lis: List[String] = a.filter(l=>l.endsWith("n"))

    return lis
  }

  def liste_double():Unit = {
    val Maliste = List(("ecommercemag.fr"," "),
      ("https://www.journalducm.com/contact/","Payant"),
      ("https://www.zatsaz.com/"," "),
      ("https://www.lerevenu.com/"," "),
      ("https://www.cadre-dirigfdeant-magazine.com/","Payant"),
      ("https://www.silicon.fr/services/contact#annoner","Payant"),
      ("https://www.channelbiz.fr/nous-contacter/"," "),
      ("https://www.itespresso.fr/"," "),
      ("https://www.industrie-mag.com/article4.html","invite"),
      ("https://www.jesuisundev.com/article-invite/","invite"),
      ("https://www.numerama.com/"," ")
    )

    val liste2  = (ListMap(Maliste:_*).keys.toList.map(l => l.replace("https://www.","").split("/")(0) ) zip ListMap(Maliste:_*).values).toList // funsionner liste de tuple

  }
  def main(args: Array[String]): Unit = {
    retournerListe(List("julien","Paul","jean","rac","trec","joel","ed","chris","maurice"))
  }
}
