package lt.laurynas.pages.piguLt;

import lt.laurynas.pages.Common;
import lt.laurynas.pages.Locators;

public class LogInPage {

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickPrisijungtiIcon() {
        Common.clickElement(Locators.Pigu.LogIn.clickPrisijungtiIcon);

    }


    public static void inputEmailAddress(String actualEmailAddress) {
        Common.sendKeysToElement(
                actualEmailAddress,
                Locators.Pigu.LogIn.inputEmailAdress
        );
    }

    public static void inputPassword(String actualPassword) {
        Common.sendKeysToElement(
                actualPassword,
                Locators.Pigu.LogIn.inputPassword
        );
    }

    public static void clickPrisijungti() {
        Common.waitForElementToBeClickable(Locators.Pigu.LogIn.clickPrisijungtiButton);
        Common.clickElement(Locators.Pigu.LogIn.clickPrisijungtiButton);
    }


    public static String readMessage() {
        return Common.getElementText(Locators.Pigu.LogIn.readMessageText);
    }

    public static String checkElementText() {
        return Common.getElementText(Locators.Pigu.LogIn.checkElementText);
    }

    public static void moveToProfileIcon() {

        Common.moveToElement(Locators.Pigu.LogIn.clickProfileIcon);
    }

    public static void clickAtsijungti() {

        Common.clickElement(Locators.Pigu.LogIn.clickAtsijungtiButton);
    }

    public static String checkText() {
        return Common.getElementText(Locators.Pigu.LogIn.checkText);
    }


}
