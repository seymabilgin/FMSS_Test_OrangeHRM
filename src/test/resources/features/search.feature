@Search
  Feature: US02_Kullanıcı search kısmına girdigi verileri aratabilmeli
    Background:
      Given Ansayfaya gidilir.
      When Username alanına  geçerli bir isim girilir.
      And Password kısmına geçerli bir password girilir
      And Login butonuna tıklanır
@TC01
      Scenario: TC01:Arama sembolu  görünür olmalıdır.
  Then Arama  sembolunun gorundugu dogrulanır.
  And sayfayi kapatir.
@TC02
      Scenario: TC02:Arama kutusu,  belirgin bir şekilde görünmelidir.
  Then Arama kutusunun  görüldügü dogrulanır.
  And sayfayi kapatir.

@TC03
      Scenario: TC03:Kullanıcı arama kutusuna bir anahtar kelime veya terim girebilmelidir.
  Then Kullanıcının arama kutusuna  veri girebildigi dogrulanır.
  And sayfayi kapatir.
@TC04
      Scenario: TC04:Arama sonuçları, kullanıcının arama terimi ile eşleşen veri öğelerini içermelidir.
  Then Arama sonucunun  arama terimi ile eslestigi dogrulanır
  And sayfayi kapatir.
@TC05
      Scenario: TC05:Arama  alanına harf girilmeli, sayı ve özel karakter girildiğinde arama sonucu döndürmemeli
  Then Arama alanına sayı girildiginde sonuc dondurmedigi dogrulanir
  And sayfayi kapatir.


