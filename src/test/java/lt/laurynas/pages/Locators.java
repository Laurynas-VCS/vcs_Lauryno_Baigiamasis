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

            public static By clickAtsiimkiteSiandien = By.xpath("//label[@for='item445514263500']");


            public static By clickRekomenduojamasUgis = By.xpath("//label[@for='item72816089948']");

            public static By clickButtonIKrepseli =
                    By.xpath("(//a[@class='btn-primary btn-full-width btn'])[1]");

            public static By moveToElement = By.id("productBlock8634462");
            public static By clickPirkti = By.xpath("//a[@id='buy']");

            public static By getElementText = By.xpath("//span[@class='c-counter c-counter--primary']");

        }

        public static class Vaikams_Kudikiams {

            public static By clickButtonLaukoZaislai =
                    By.xpath("//p[contains(text(),'Lauko žaislai')]");

            public static By clickKudikiuPrekes = By.xpath("//p[contains(.,'Kūdikių prekės')]");

            public static By clickPaspirtukai = By.xpath("//p[contains(text(),'Paspirtukai')]");

            public static By clickMaitinimoPriemones =
                    By.xpath("//p[contains(text(),'Maitinimo priemonės')]");

            public static By clickMaitinimoKedutes = By.xpath("//p[contains(text(),'Maitinimo kėdutės')]");
            public static By clickOnWantedProduct = By.xpath
                    ("(//a[@class='btn-primary btn-full-width btn'])[1]");

            public static By clickIKrepseli2 =
                    By.xpath("(//a[@class='btn-primary btn-full-width btn'])[1]");

            public static By clickPirkti = By.xpath("//a[@id='buy']");

            public static By clickRinktisDaugiauPrekiu =
                    By.xpath("//a[@class='btn btn-secondary has-icon-left']");

            public static By clickVisosPrekes = By.xpath("//*[@id='menuBurger']/span");

            public static By clickVaikamsIrKudikiams =
                    By.xpath("//h2[contains(text(),'Vaikams ir kūdikiams')]");

            public static By getText =
                    By.xpath("//span[@class='c-counter c-counter--primary']");


        }

    }
}
