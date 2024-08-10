@Login
Feature:US_01 Kullanıcı sayfaya Login olabilmelidir.

  Background:
    Given Ansayfaya gidilir.
@PositiveScenario
  Scenario:TC_01:Kullanıcı Username ve Password girerek siteye login olmalıdır
    When Username alanına  geçerli bir isim girilir.
    And Password kısmına geçerli bir password girilir
    And Login butonuna tıklanır
    Then Kulanıcının login olduğu doğrulanır.
    And sayfayi kapatir.

@NegativeScenario01
  Scenario:TC_02:Username girmeli, bu alan boş geçildiğinde "Required" uyarı metni gelmeli
    When Username alanı boş bırakılır.
    And Password kısmına geçerli bir password girilir
    And Login butonuna tıklanır
    Then Kulanıcının username kısmını boş bıraktıgında "Required"  uyarı mesajı cıktıgı doğrulanır
    And sayfayi kapatir.

  @NegativeScenario02
  Scenario:TC_03:Password girmeli,bu alan boş geçildiğinde "Required" uyarı metni gelmeli
    When Username alanına  geçerli bir isim girilir.
    And Password kısmı boş bırakılır.
    And Login butonuna tıklanır
    Then Kulanıcının password kısmını boş bıraktıgında "Required"  uyarı mesajı cıktıgı doğrulanır
    And sayfayi kapatir.

  @NegativeScenario03
  Scenario:TC_04:Username alanı harflerden oluşmalı, sayı ve özel karakter girildiğinde girildiğinde" Invalid credentials" uyarı mesajı vermeli.
    When Username alanına geçersiz veri girilir
    And Password kısmına geçerli bir password girilir
    And Login butonuna tıklanır
    Then Username alanına sayı ve ozel karakterler girildiginde "Invalid credentials" uyarı metni cıktıgı dogrulanır.
    And sayfayi kapatir.