package orangehrm.stepDefinitions;

import io.cucumber.java.en.Then;
import orangehrm.pages.SearchPage;
import orangehrm.utilities.Driver;
import org.testng.Assert;

import java.time.Duration;

public class SearchStepDefs {
    SearchPage search =new SearchPage();
    @Then("Arama  sembolunun gorundugu dogrulanır.")
    public void aramaSembolununGorunduguDogrulanır() {
        Assert.assertTrue(search.searchIkon.isDisplayed());

    }

    @Then("Arama kutusunun  görüldügü dogrulanır.")
    public void aramaKutusununGörüldügüDogrulanır() {
        Assert.assertTrue(search.searchBox.isDisplayed());
    }

    @Then("Kullanıcının arama kutusuna  veri girebildigi dogrulanır.")
    public void kullanıcınınAramaKutusunaVeriGirebildigiDogrulanır() {
        search.searchBox.click();
        search.searchBox.sendKeys("Time");
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertEquals(search.timeText.getText(),"Time");
    }

    @Then("Arama sonucunun  arama terimi ile eslestigi dogrulanır")
    public void aramaSonucununAramaTerimiIleEslestigiDogrulanır() {
        search.searchBox.sendKeys("Performance");
        Assert.assertTrue(search.performanceText.isDisplayed());
    }

    @Then("Arama alanına sayı girildiginde sonuc dondurmedigi dogrulanir")
    public void aramaAlanınaSayıGirildigindeSonucDondurmedigiDogrulanir() {
        search.searchBox.sendKeys("123");
        Assert.assertTrue(search.emptyMenu.getText().isEmpty());
    }
}
