package community.pages.amazon

import community.pages.generic.BasePage

object ProductPage extends BasePage {

  def verifyCorrectProduct(item: String): Unit =  item match {
    case "xbox one x" => verifyProductPage("Xbox One X")
    case "ps4 pro" => verifyProductPage("Sony PlayStation 4 Pro Console")
    case "nintendo switch fortnite" => verifyProductPage("Nintendo Switch")
    case "black ops 4"=> verifyProductPage("Black Ops 4")

  }

  private def verifyProductPage(title: String): Unit = find("productTitle").get.text should include (title)

}
