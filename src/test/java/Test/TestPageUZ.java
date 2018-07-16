package Test;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestPageUZ extends WebDriverSettings {


    @Test
    public void TestUzElements() throws Exception{

        Thread.sleep(8000);

        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Assert.assertTrue(isElementPresent(By.linkText("Bosh sahifa")));
        Assert.assertTrue(isElementPresent(By.linkText("Xizmatlar")));
        Assert.assertTrue(isElementPresent(By.linkText("Afzalliklar")));
        Assert.assertTrue(isElementPresent(By.linkText("Kontaktlar")));
        Assert.assertTrue(isElementPresent(By.linkText("Kirish")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.theme-btn.sm-margin-h")));
        Assert.assertEquals("Yagona ilova. Barcha holatlar uchun",
                driver.findElement(By.cssSelector("h2")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("li > a > img")));
        Assert. assertTrue(isElementPresent(By.xpath("//section[@id='section-1']/div/div/div/ul/li[2]/a/img")));
        Assert.assertEquals("Istalgan vaqtda va istalgan joyingizda sizga o'z mablag’laringizni boshqarish va to’lovlarni amalga oshirishga xizmat qiluvchi eng zamonaviy mobil ilovadan foydalaning.", driver.findElement(By.cssSelector("p.p-20")).getText());
        Assert.assertEquals("Biz bilan har qanday xizmatlar uchun to’lovlarni amalga oshirish mumkin",
                driver.findElement(By.cssSelector("div.block > h2")).getText());
        Assert.assertEquals("Ilovaning afzalliklari",
                driver.findElement(By.cssSelector("h2.title.text-center")).getText());
        Assert.assertEquals("mobil ilovalar)",
                driver.findElement(By.xpath("//section[@id='feature']/div/div/div/div/div/div[2]/h4/b[4]")).getText());
        Assert.assertEquals("Intuitiv tushunarli to'lov jarayoni",
                driver.findElement(By.xpath("//section[@id='feature']/div/div/div/div[2]/div/div[2]/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='feature']/div/div/div/div[3]/div/div[2]/h4")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='feature']/div/div/div/div[4]/div/div[2]/h4")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='feature']/div/div/div/div[5]/div/div[2]/h4")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='feature']/div/div/div/div[6]/div/div[2]/h4")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='feature']/div/div/div/div[7]/div/div[2]/h4")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='feature']/div/div/div/div[8]/div/div[2]/h4")));
        Assert.assertTrue(isElementPresent(By.cssSelector("i.fa.fa-desktop")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='service']/div/div/div/div[2]/div/div")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='service']/div/div/div/div[3]/div/div")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='service']/div/div/div/div[4]/div/div/i")));
        Assert.assertEquals("+998 (71) 200-00-85",
                driver.findElement(By.cssSelector("a.phone")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[3]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("i.icon-social-instagram")));
        Assert.assertTrue(isElementPresent(By.cssSelector("i.icon-paper-plane")));
        Assert.assertTrue(isElementPresent(By.cssSelector("i.icon-social-facebook")));
        Assert.assertTrue(isElementPresent(By.cssSelector("img[alt=\"play\"]")));
        Assert.assertTrue(isElementPresent(By.xpath("(//img[@alt='play'])[2]")));
        Assert.assertTrue(isElementPresent(By.linkText("support@u-pay.uz")));
        Assert.assertTrue(isElementPresent(By.linkText("Upay.uz")));
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(text(),'+998 (71)\n                            200-00-85')]")));
        Assert.assertTrue(isElementPresent(By.linkText("@upayuz")));
        Assert.assertTrue(isElementPresent(By.xpath("//div[@id='footer']/div/div[2]/div/div[2]/label")));

    }

    @Test
    public void Mobile() throws Exception{


        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);


        driver.findElement(By.cssSelector("label")).click();
            Thread.sleep(8000);

        }

    @Test
    public void IntServices() throws Exception{

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//section[@id='services']/div/div[2]/div[2]/div/a/label")).click();
        Thread.sleep(8000);

    }

    @Test
    public void communal() throws Exception{

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//section[@id='services']/div/div[2]/div[3]/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Telephonty() throws Exception{

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Telefoniya")).click();
        Thread.sleep(8000);
    }

    @Test
    public void TV() throws Exception{


        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//section[@id='services']/div/div[3]/div[2]/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Taxes() throws Exception{


        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//section[@id='services']/div/div[3]/div[3]/div/a/label")).click();
        Thread.sleep(8000);

    }

    @Test
    public void Insurance() throws Exception{


        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//section[@id='services']/div/div[4]/div/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Credit() throws Exception{


        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//section[@id='services']/div/div[4]/div[2]/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void ServicesInt() throws Exception{


        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//section[@id='services']/div/div[4]/div[3]/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Amusement() throws Exception{


        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);


        driver.findElement(By.xpath("//section[@id='services']/div/div[5]/div/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void GovServices() throws Exception{


        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Davlat xizmatlari")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Education() throws Exception{


        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.linkText("Ta'lim")).click();
        Thread.sleep(8000);
    }

    @Test
    public void LinkToRegistrationUZ() throws Exception{

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.border-left-none")).click();

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("button.theme-btn.sm-margin-h")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Bizning tizimimizdan foydalanish uchun sizda onlayn karta bo'lishi va unga sms xabarnoma xizmati yoqilgan bo'lishi kerak.",
                driver.findElement(By.cssSelector("p.info-1.text-center")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.modal-header.text-center > img")));

        driver.findElement(By.linkText("Ha")).click();
        Thread.sleep(8000);


    }

    @Test
    public void InstructionUZ() throws Exception{

        driver.findElement(By.cssSelector("a.border-left-none")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.theme-btn.sm-margin-h")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Yoq")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Bu mijoz telefon raqamiga karta orqali amalga oshirilgan muomalalar haqida matnli xabarnoma yuborishning bazaviy ko'rinishi. Ushbu xizmatni yoqish orqali karta egasi o'zining telefon raqamiga har bir amalga oshirilgan pul muomalasi yani xarajatlar yoki daromadlar haqidagi bank ma'lumotlarini SMS-xabarnoma ko'rinishida qabul qilish imkoniyatiga ega bo'ladi.",
                driver.findElement(By.cssSelector("div.sms-info.text-center > p")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.btn.theme-btn")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Qadam 1",
                driver.findElement(By.cssSelector("h3.fs-title")).getText());
        Assert.assertEquals("Karta qabul qiluvchi qurilmaga kartangizni qo'ying.",
                driver.findElement(By.cssSelector("p.fs-subtitle")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Qadam 2",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > h3.fs-title")).getText());
        Thread.sleep(2000);
        Assert.assertEquals("Kerakli tilni tanlang.",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > div.main-info > p.fs-subtitle")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.right.carousel-control")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Qadam 3",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > h3.fs-title")).getText());
        Assert.assertEquals("Karta pin lodini tering.",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > div.main-info > p.fs-subtitle")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Qadam 4",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > h3.fs-title")).getText());
        Assert.assertEquals("Ushbu menyuda «SMS-info» xizmatini tanlang.",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > div.main-info > p.fs-subtitle")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Qadam 5",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > h3.fs-title")).getText());
        Assert.assertEquals("Bu menyuda esa «Xizmatni yoqish»ni tanlang.",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > div.main-info > p.fs-subtitle")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Qadam 6",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > h3.fs-title")).getText());
        Assert.assertEquals("«Telefon raqami» maydoniga tegishli bo'lgan mobil telefon raqamingizni xalqaro formatda 998XXXXXXXXX (boshida + belgisisiz) kiriting va raqamlar to'griligiga ishonch hosil qilgach «Keyingi» tugmachasini bosing.",
                driver.findElement(By.cssSelector("p.fs-subtitle.txt-justify")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.close.abs-close")).click();
        Thread.sleep(5000);

    }

    @Test
    public void LinkToLogin() throws Exception{

        driver.findElement(By.cssSelector("a.border-left-none")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Kirish")).click();
        Thread.sleep(8000);
    }



}

