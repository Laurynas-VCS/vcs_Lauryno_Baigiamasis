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

            public static By clickProfileIcon = By.xpath("//li[@class='c-user-menu-item'][1]");

            public static By clickAtsijungti = By.xpath("//i[@class='c-icon--exit']");

            public static By checkText = By.xpath("//*[@id='loginModal']/div[1]/div[1]/form/h1");
        }

        public static class Dviraciai {

            public static By clickAtsiimkiteSiandien = By.xpath("//label[@for='item445514263500']");


            public static By clickRekomenduojamasUgis = By.xpath("//label[@for='item72816089948']");

            public static By clickIKrepseli =
                    By.xpath("//*//*[@id='productBlock11379016']/div/div/a[2]");


            public static By clickPirkti = By.xpath("//a[@id='buy']");

            public static By getElementText = By.xpath("//div[@class='product-name']//a[@target='_blank']");

        }

        public static class Vaikams_Kudikiams {

            public static By clickLaukoZaislai = By.xpath("//*[@id='categoriesGrid']/div[1]/a/p");

            public static By clickKudikiuPrekes = By.xpath("//*[@id='categoriesGrid']/div[2]/a/p");

            public static By clickPaspirtukai = By.xpath("//*[@id='categoriesGrid']/div[1]/a/p");

            public static By clickMaitinimoPriemones = By.xpath("//*[@id='categoriesGrid']/div[2]/a/p");

            public static By clickMaitinimoKedutes = By.xpath("//*[@id='categoriesGrid']/div[1]/a/p");
            public static By clickOnWantedProduct = By.xpath
                    ("//*[@id='productBlock52175083']/div/div/a[2]");

            public static By clickIKrepseli2 = By.xpath("//*[@id='productBlock57625764']/div/div/a[2]");

            public static By clickPirkti = By.xpath("//a[@id='buy']");

            public static By clickRinktisDaugiauPrekiu =
                    By.xpath("//a[@class='btn btn-secondary has-icon-left']");

            public static By clickVisosPrekes = By.xpath("//*[@id='menuBurger']/span");

            public static By clickVaikamsIrKudikiams = By.xpath("//h2[@class='style-yellow']");

            public static By getTextA =
                    By.xpath("(//div[@class='product-name']//a[@target='_blank'])[1]");

            public static By getTextB =
                    By.xpath("(//div[@class='product-name']//a[@target='_blank'])[2]");
        }
    }
}
