package community.utils

import community.pages.generic.BasePage
import cucumber.api.scala.ScalaDsl
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.scalatest.selenium.WebBrowser
import org.scalatest.{Assertion, Matchers}

trait Driver extends ScalaDsl with Matchers with WebBrowser {

  implicit val driver: WebDriver = SingletonDriver.getInstance().get

  implicit val w: WebDriverWait = new WebDriverWait(driver, 5)

  def on(page: BasePage): Assertion = {
    val wait = new WebDriverWait(driver, 10)
    val _ = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("a")))
    assert(page.isCurrentPage, s"\n${page.url} was either not loaded or the header was incorrect. " +
      s"\n${page.currentUrl} was loaded instead" +
      s"\nExpected heading was: ${page.header.get}" +
      s"\nActual heading was:   ${find(cssSelector("h1")).get.text}")
  }
}
