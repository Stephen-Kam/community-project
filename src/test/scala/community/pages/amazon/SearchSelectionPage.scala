package community.pages.amazon

import community.pages.generic.BasePage
import org.openqa.selenium.By

object SearchSelectionPage extends BasePage {


  def clickFirstResult(): Unit =  driver.findElements(By.xpath("//*[@id='result_0']/div/div/div/div[2]/div[*]/div[1]/a/h2")).get(0).click()

  //*[@id="result_0"]/div/div/div/div[2]/div[2]/div[1]/a/h2
  //*[@id="result_0"]/div/div/div/div[2]/div[1]/div[1]/a/h2
  //*[@id="result_0"]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2
  //*[@id="result_3"]/div/div/div/div[2]/div[1]/div[1]/a/h2

}
