package Test;




import org.junit.Assert;
import org.junit.Test;
import Settings.WebDriverSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class TestPage extends WebDriverSettings {

    @Test
    public void TestingPage() throws Exception{

        Thread.sleep(15000);
        Assert.assertTrue(isElementPresent(By.cssSelector("img.img-responsive")));
        Assert.assertTrue(isElementPresent(By.linkText("Главная")));
        Assert.assertTrue(isElementPresent(By.linkText("Услуги")));
        Assert.assertTrue(isElementPresent(By.linkText("Преимущества")));
        Assert.assertTrue(isElementPresent(By.linkText("Контакты")));
        Assert.assertTrue(isElementPresent(By.linkText("Вход")));
        Assert.assertEquals("Регистрация",
                driver.findElement(By.cssSelector("button.theme-btn.sm-margin-h")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("a.border-left-none")));
        Assert.assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'ru')])[2]")));
        Assert.assertEquals("UPAY - Универсальный сервис электронных платежей",
                driver.getTitle());
        Assert.assertEquals("Одно приложение. Все случаи.",
                driver.findElement(By.cssSelector("h2")).getText());
        Assert.assertEquals("Пользуйтесь самым современным приложением, которое даёт вам полный доступ к управлению счетами и возможность оплачивать в любое время и в любом месте.", driver.findElement(By.cssSelector("p.p-20")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("li > a > img")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='section-1']/div/div/div/ul/li[2]/a/img")));
        Assert.assertEquals("У нас можно оплачивать любую услугу",
                driver.findElement(By.cssSelector("div.block > h2")).getText());
        Assert.assertEquals("Преимущества приложения",
                driver.findElement(By.cssSelector("h2.title.text-center")).getText());
        Assert.assertEquals("Удобный способ оплаты (Web, SMS, USSD, мобильные приложения)",
                driver.findElement(By.cssSelector("h4.media-heading")).getText());
        Assert.assertEquals("Интуитивно понятный процесс оплаты",
                driver.findElement(By.xpath("//section[@id='feature']/div/div/div/div[2]/div/div[2]/h4")).getText());
        Assert.assertEquals("Быстрое зачисление денег",
                driver.findElement(By.xpath("//section[@id='feature']/div/div/div/div[3]/div/div[2]/h4")).getText());
        Assert.assertEquals("Онлайн-проверка статуса оплаты",
                driver.findElement(By.xpath("//section[@id='feature']/div/div/div/div[4]/div/div[2]/h4")).getText());
        Assert.assertEquals("Мониторинг платежей",
                driver.findElement(By.xpath("//section[@id='feature']/div/div/div/div[5]/div/div[2]/h4")).getText());
        Assert.assertEquals("Добавление операции в «Регулярные платежи» для удобства",
                driver.findElement(By.xpath("//section[@id='feature']/div/div/div/div[6]/div/div[2]/h4")).getText());
        Assert.assertEquals("Функция «Автоплатеж»",
                driver.findElement(By.xpath("//section[@id='feature']/div/div/div/div[7]/div/div[2]/h4")).getText());
        Assert.assertEquals("Оперативная служба поддержки.",
                driver.findElement(By.xpath("//section[@id='feature']/div/div/div/div[8]/div/div[2]/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='service']/div/div/div/div/div/div")));
        Assert.assertEquals("Функциональность",
                driver.findElement(By.cssSelector("h3")).getText());
        Assert.assertEquals("Оплата с QR-кода",
                driver.findElement(By.xpath("//section[@id='service']/div/div/div/div[2]/div/h3")).getText());
        Assert.assertEquals("Опция Touch ID",
                driver.findElement(By.xpath("//section[@id='service']/div/div/div/div[3]/div/h3")).getText());
        Assert.assertEquals("Сервис",
                driver.findElement(By.xpath("//section[@id='service']/div/div/div/div[4]/div/h3")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='service']/div/div/div/div[4]/div/div/i")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='service']/div/div/div/div[3]/div/div/i")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='service']/div/div/div/div[2]/div/div")));
        Assert.assertEquals("Оплата по QR-коду",
                driver.findElement(By.xpath("//section[@id='utility-2']/div/div/div/div/h2")).getText());
        Assert.assertEquals("QR – код. Вы можете оплачивать покупки в жизни или интернете за несколько секунд! С помощью приложения UPAY от Maroqand Ваш смартфон способен сканировать ценники с QR-кодом и производить оплату. Для этого достаточно выбрать карту для оплаты, считать QR-код, и подтвердить перевод средств.", driver.findElement(By.xpath("//section[@id='utility-2']/div/div/div/div/p")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("i.icon-social-facebook")));
        Assert.assertTrue(isElementPresent(By.cssSelector("i.icon-social-instagram")));
        Assert.assertTrue(isElementPresent(By.cssSelector("i.icon-paper-plane")));
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[3]")));
        Assert.assertEquals("+998 (71) 200-00-85",
                driver.findElement(By.cssSelector("a.phone")).getText());
        Assert.assertEquals("Страница на Facebook: Upay.uz",
                driver.findElement(By.xpath("//div[@id='footer']/div/div[2]/div/div[3]/label")).getText());
        Assert.assertTrue(isElementPresent(By.linkText("Upay.uz")));
        Assert.assertEquals("Почта: support@u-pay.uz",
                driver.findElement(By.xpath("//div[@id='footer']/div/div[2]/div/div[3]/label[2]")).getText());
        Assert.assertEquals("Тел.: +998 (71) 200-00-85",
                driver.findElement(By.xpath("//div[@id='footer']/div/div[2]/div/div[2]/label[2]")).getText());
        Assert.assertEquals("Телеграм: @upayuz",
                driver.findElement(By.xpath("//div[@id='footer']/div/div[2]/div/div[2]/label[3]")).getText());
        Assert.assertTrue(isElementPresent(By.linkText("@upayuz")));
        Assert.assertTrue(isElementPresent(By.linkText("support@u-pay.uz")));
        Assert.assertTrue(isElementPresent(By.cssSelector("img[alt=\"play\"]")));
        Assert.assertTrue(isElementPresent(By.xpath("(//img[@alt='play'])[2]")));
    }


    @Test
    public void Mobile() throws Exception{

        driver.findElement(By.cssSelector("label")).click();
        Thread.sleep(8000);

    }

    @Test
    public void IntServices() throws Exception{

        driver.findElement(By.xpath("//section[@id='services']/div/div[2]/div[2]/div/a/label")).click();
        Thread.sleep(8000);

    }

    @Test
    public void communal() throws Exception{

        driver.findElement(By.xpath("//section[@id='services']/div/div[2]/div[3]/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Telephony() throws Exception{

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(8000);
    }

    @Test
    public void TV() throws Exception{
        driver.findElement(By.linkText("Телевидение")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Taxes() throws Exception{
        driver.findElement(By.xpath("//section[@id='services']/div/div[3]/div[3]/div/a/label")).click();
        Thread.sleep(8000);

    }

    @Test
    public void Insurance() throws Exception{
        driver.findElement(By.xpath("//section[@id='services']/div/div[4]/div/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Credit() throws Exception{
        driver.findElement(By.xpath("//section[@id='services']/div/div[4]/div[2]/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void ServicesInt() throws Exception{
        driver.findElement(By.xpath("//section[@id='services']/div/div[4]/div[3]/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Amusement() throws Exception{

        driver.findElement(By.xpath("//section[@id='services']/div/div[5]/div/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void GovServices() throws Exception{
        driver.findElement(By.xpath("//section[@id='services']/div/div[5]/div[2]/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Education() throws Exception{
        driver.findElement(By.xpath("//section[@id='services']/div/div[5]/div[3]/div/a/label")).click();
        Thread.sleep(8000);
    }

    @Test
    public void LinkToRegistration() throws Exception{
        driver.findElement(By.cssSelector("button.theme-btn.sm-margin-h")).click();
        Thread.sleep(3000);
        Assert.assertEquals("Для того чтобы использовать нашу систему у вас должна быть онлайн карта и подключенная к ней услуга смс информирование.",
                driver.findElement(By.cssSelector("p.info-1.text-center")).getText());
        Thread.sleep(2000);
        driver.findElement(By.linkText("Да")).click();
        Thread.sleep(8000);
    }

    @Test
    public void Instruction() throws Exception{

        driver.findElement(By.cssSelector("button.theme-btn.sm-margin-h")).click();
        Thread.sleep(3000);
        Assert.assertEquals("Для того чтобы использовать нашу систему у вас должна быть онлайн карта и подключенная к ней услуга смс информирование.",
                driver.findElement(By.cssSelector("p.info-1.text-center")).getText());
        Thread.sleep(2000);

        driver.findElement(By.linkText("Нет")).click();
        Thread.sleep(2000);
        Assert.assertEquals("В базовом виде - это отсылка на телефон клиента банком текстовых сообщений с информацией обо всех авторизайиях по карте. " +
                        "Подключив данную услугу, держатель карты будет получать на свой мобильный телефон от банка информационные СМС-сообщения после каждой операции, произведенной по карте: как расходной, так приходной.",
                driver.findElement(By.cssSelector("div.sms-info.text-center > p")).getText());

        driver.findElement(By.cssSelector("button.btn.theme-btn")).click();
        Thread.sleep(1000);
        Assert.assertEquals("Шаг 1",
                driver.findElement(By.cssSelector("h3.fs-title")).getText());
        Assert.assertEquals("Вставьте карту в картоприёмник устройства.",
                driver.findElement(By.cssSelector("p.fs-subtitle")).getText());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(1000);
        Assert.assertEquals("Шаг 2",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > h3.fs-title")).getText());
        Assert.assertEquals("Выберите нужный язык.",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > div.main-info > p.fs-subtitle")).getText());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(1000);
        Assert.assertEquals("Шаг 3",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > h3.fs-title")).getText());
        Assert.assertEquals("Введите пин-код вставленной карты.",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > div.main-info > p.fs-subtitle")).getText());
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(1000);

        Assert.assertEquals("Шаг 4",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > h3.fs-title")).getText());
        Assert.assertEquals("Выберите пункт меню \"УСЛУГА SMS-ИНФОРМИРОВАНИЯ\"",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > div.main-info > p.fs-subtitle")).getText());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(1000);
        Assert.assertEquals("Шаг 5",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > h3.fs-title")).getText());
        Assert.assertEquals("Выберите пункт меню \"ПОДКЛЮЧИТЬ УСЛУГУ\".",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > div.main-info > p.fs-subtitle")).getText());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(1000);
        Assert.assertEquals("Шаг 6",
                driver.findElement(By.cssSelector("div.item.active > fieldset.text-center > h3.fs-title")).getText());
        Assert.assertEquals("Введите номер мобильного телефона, который Вы хотите привязать к своей карте в поле \"Номер телефона\" в международном формате 998XXYYYYYYY (без знака \"+\" в начале), проверьте правильность ввода номера и нажмите кнопку \"Далее\".",
                driver.findElement(By.cssSelector("p.fs-subtitle.txt-justify")).getText());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='carousel-example-generic']/div[3]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.close.abs-close")).click();
        Thread.sleep(5000);

    }

    @Test
    public void LinkToLogin() throws Exception{

        Thread.sleep(3000);
        driver.findElement(By.linkText("Вход")).click();
        Thread.sleep(8000);

    }
}


