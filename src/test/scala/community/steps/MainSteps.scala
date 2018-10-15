package community.steps

import community.pages.amazon.{HomePage, ProductPage, SearchSelectionPage}
import community.pages.generic.GenericFunctions
import cucumber.api.scala.{EN, ScalaDsl}

class MainSteps extends ScalaDsl
  with EN {

  Given("^A user is on the Amazon homepage$"){
    HomePage.navigateTo()
  }


  When("^The user searches for an (.*)"){ (item: String) =>
    HomePage.searchFor(item)
  }

  When("^Selects the first available result$") {
    SearchSelectionPage.clickFirstResult()
  }

  When("^The user clicks on the (.*) in the nav bar$") { (link: String) =>
    HomePage.clickNavLink(link)
  }

  Then("^The relevant item: (.*) will be displayed$"){ (product: String) =>
    ProductPage.verifyCorrectProduct(product)
  }

  Then("^They will be on the correct page for that (.*)$") { (link: String) =>
    GenericFunctions.verifyCorrectPage(link)
  }
}
