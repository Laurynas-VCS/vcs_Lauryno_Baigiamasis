package lt.laurynas.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Pigu {
        public static class LogIn {

            public static By clickPrisijungtiIcon = By.xpath("//*[@id='headeMenu']/li[1]");

            public static By inputEmailAdress = By.xpath("//input[@placeholder='El. paštas']");

            public static By inputPassword =
                    By.xpath("//div[@class='form-row has-icon ']//input[@type='password']");

            public static By clickPrisijungtiButton = By.xpath("//input[@value='Prisijungti']");

            public static By readMessageText = By.xpath("//div[@class='error-message']");

            public static By checkElementText = By.xpath("//a[@class='name']");

            public static By clickProfileIcon = By.xpath("//li[@class='c-user-menu-item'][1]");

            public static By clickAtsijungtiButton = By.xpath("//i[@class='c-icon--exit']");

            public static By checkText = By.xpath("//*[@id='loginModal']/div[1]/div[1]/form/h1");
        }

        public static class Dviraciai {

            public static By clickAtsiimkiteRytojCheckbox = By.xpath("//label[@for='item445514263500']");


            public static By clickRekomenduojamasUgisCheckbox =
                    By.xpath("//label[@for='item72816089948']");

            public static By clickButtonIKrepseli =
                    By.xpath("(//a[@class='btn-primary btn-full-width btn'])[1]");

            public static By moveToElement = By.id("productBlock8634462");
            public static By clickPirktiButton = By.xpath("//a[@id='buy']");

            public static By getElementTextFromCartIcon =
                    By.xpath("//span[@class='c-counter c-counter--primary']");

        }

        public static class Vaikams_Kudikiams {

            public static By clickButtonLaukoZaislai =
                    By.xpath("//p[contains(text(),'Lauko žaislai')]");

            public static By clickKudikiuPrekesImage = By.xpath("//p[contains(.,'Kūdikių prekės')]");

            public static By clickPaspirtukaiImage = By.xpath("//p[contains(text(),'Paspirtukai')]");

            public static By clickMaitinimoPriemonesImage =
                    By.xpath("//p[contains(text(),'Maitinimo priemonės')]");

            public static By clickMaitinimoKedutesImage = By.xpath("//p[contains(text(),'Maitinimo kėdutės')]");
            public static By clickOnWantedProductButton = By.xpath
                    ("(//a[@class='btn-primary btn-full-width btn'])[1]");

            public static By clickIKrepseli2Button =
                    By.xpath("(//a[@class='btn-primary btn-full-width btn'])[1]");

            public static By clickPirktiButton = By.xpath("//a[@id='buy']");

            public static By clickRinktisDaugiauPrekiuButton =
                    By.xpath("//a[@class='btn btn-secondary has-icon-left']");

            public static By clickVisosPrekesButton = By.xpath("//*[@id='menuBurger']/span");

            public static By clickVaikamsIrKudikiamsImage =
                    By.xpath("//h2[contains(text(),'Vaikams ir kūdikiams')]");

            public static By getTextFromCartIcon =
                    By.xpath("//span[@class='c-counter c-counter--primary']");


        }

    }
}
