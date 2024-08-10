package orangehrm.stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangehrm.pages.UserLoginPage;
import orangehrm.utilities.ConfigReader;
import orangehrm.utilities.Driver;
import org.testng.Assert;

public class UserLoginStepDefs {
    UserLoginPage login = new UserLoginPage();
    Faker faker =new Faker();

    @Given("Ansayfaya gidilir.")
    public void ansayfayaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("orangehrmUrl"));
    }

    @When("Username alanına  geçerli bir isim girilir.")
    public void usernameAlanınaGeçerliBirIsimGirilir() {
     login.userNameBox.sendKeys(ConfigReader.getProperty("username"));
    }

    @And("Password kısmına geçerli bir password girilir")
    public void passwordKısmınaGeçerliBirPasswordGirilir() {
        login.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Login butonuna tıklanır")
    public void loginButonunaTıklanır() {
        login.loginButton.click();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Kulanıcının login olduğu doğrulanır.")
    public void kulanıcınınLoginOlduğuDoğrulanır()  {
        Assert.assertEquals(login.adminText.getText(),"Admin");

    }

    @And("sayfayi kapatir.")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @When("Username alanı boş bırakılır.")
    public void usernameAlanıBoşBırakılır() {
        login.userNameBox.click();
    }

    @Then("Kulanıcının username kısmını boş bıraktıgında {string}  uyarı mesajı cıktıgı doğrulanır")
    public void kulanıcınınUsernameKısmınıBoşBıraktıgındaUyarıMesajıCıktıgıDoğrulanır(String text) {
    Assert.assertEquals(login.usernamePasswordRequiredMessage.getText(),text);
    }

    @And("Password kısmı boş bırakılır.")
    public void passwordKısmıBoşBırakılır() {
        login.passwordBox.click();
    }

    @Then("Kulanıcının password kısmını boş bıraktıgında {string}  uyarı mesajı cıktıgı doğrulanır")
    public void kulanıcınınPasswordKısmınıBoşBıraktıgındaUyarıMesajıCıktıgıDoğrulanır(String text) {
        Assert.assertEquals(login.usernamePasswordRequiredMessage.getText(),text);
    }

    @When("Username alanına geçersiz veri girilir")
    public void usernameAlanınaGeçersizVeriGirilir() {
        login.userNameBox.sendKeys(faker.number().digit());
    }

    @Then("Username alanına sayı ve ozel karakterler girildiginde {string} uyarı metni cıktıgı dogrulanır.")
    public void usernameAlanınaSayıVeOzelKarakterlerGirildigindeUyarıMetniCıktıgıDogrulanır(String text) {
        Assert.assertEquals(login.invalidcredentailsText.getText(),text);

    }
}
