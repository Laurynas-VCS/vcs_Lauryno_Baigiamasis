package lt.laurynas.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Pigu {
        public static class LogIn {

            public static By clickPrisijungtiIcon = By.xpath("//*[@id='headeMenu']/li[1]");

            public static By inputEmailAdress = By.xpath("//input[@placeholder='El. paštas']");

            public static By inputPassword =
                    By.xpath("//div[@class='form-row has-icon ']//input[@type='password']");

            public static By clickPrisijungti = By.xpath("//input[@value='Prisijungti']");

            public static By readMessageText = By.xpath("//div[@class='error-message']");

            public static By checkElementText = By.xpath("//a[@class='name']");

            public static By clickProfileItem = By.xpath("//*[@id='headeMenu']/li[1]/a/i");

            public static By clickAtsijungti = By.xpath("//i[@class='c-icon--exit']");

            public static By checkText = By.xpath("//*[@id='loginModal']/div[1]/div[1]/form/h1");
        }

        public static class Dviraciai {

            public static By clickAtsiimkiteSiandien = By.xpath("//label[@for='item445514263500']");



            public static By clickRekomenduojamasUgis = By.xpath("//label[@for='item72816089758']");

            public static By clickIKrepseli = By.xpath("//*[@id='productBlock42447503']/div/div/a[2]");

            public static By clickOpenProductPage =
                    By.xpath
                            ("//div[@id='productBlock42447503']" +
                                    "//div[@class='product-item-inner-hover pbot']");

            public static By clickPirkti = By.xpath("//a[@id='buy']");

            public static By getElementText = By.xpath("//strong[@class='float_left']");

        }
    }
}
