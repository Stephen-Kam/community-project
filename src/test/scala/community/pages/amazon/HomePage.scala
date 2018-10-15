package community.pages.amazon

import community.pages.generic.BasePage

object HomePage extends BasePage {

  def clickNavLink(link: String): Unit = link match {
    case "sign in" => click on "nav-link-yourAccount"
    case "prime" => click on "nav-link-prime"
    case "your lists" => click on "nav-link-wishlist"
    case "shopping basket" => click on "nav-cart"
    case _ => click on linkText(link)
  }


  override val url = ""

  def searchFor(query: String): Unit = {
    textField("twotabsearchtextbox").value = query
    clickButton("search")
  }

}
