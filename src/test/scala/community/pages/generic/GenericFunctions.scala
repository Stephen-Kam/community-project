package community.pages.generic

import community.pages.amazon._

object GenericFunctions extends BasePage {

  def verifyCorrectPage(link: String): Unit = link match {
    case "Your Amazon.co.uk" | "sign in" => on(SignInPage)
    case "Today's Deals" => on(TodaysDealsPage)
    case "Gift Cards & Top Up" => find(xpath("//*[@id=\"merchandised-content\"]/table/tbody/tr/td/img")).get.text should include ("Gift Cards & Top Up")
    case "Sell" => on(SellPage)
    case "Help" => on(HelpPage)
    case "prime" => on(PrimePage)
    case "your lists" => find(cssSelector("span[class='al-intro-banner-header']")).get.text shouldBe YourListsPage.header.get
    case "shopping basket" => on(ShoppingBasketPage)
  }

}
