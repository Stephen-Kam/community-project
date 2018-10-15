package community.pages.generic

import community.utils.Driver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}

trait BasePage extends Driver {

  val url: String = ""

  val header: Option[String] = None

  def navigateTo(): Unit = go to s"https://www.amazon.co.uk/$url"

  def clickButton(button: String): Unit = button match {
    case "search" => click on find(cssSelector("input[value='Go']")).get
  }

  def isCurrentPage: Boolean = {
    val wait: WebDriverWait = new WebDriverWait(driver, 5)
    wait.until(ExpectedConditions.urlContains(this.url))
    checkHeader(header.getOrElse("The website doesn't have an H1 header"))
  }

  def checkHeader(text: String): Boolean = find(cssSelector("h1")).exists(_.text == text)

}
