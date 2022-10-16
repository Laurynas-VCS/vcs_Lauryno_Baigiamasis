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
        Common.waitForElementToBeClickable(Locators.Pigu.LogIn.clickPrisijungti);
        Common.clickElement(Locators.Pigu.LogIn.clickPrisijungti);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String readMessage() {
        return Common.getElementText(Locators.Pigu.LogIn.readMessageText);
    }

    public static String checkElementText() {
        return Common.getElementText(Locators.Pigu.LogIn.checkElementText);
    }

    public static void clickProfileIcon() {
        Common.clickElementByAction(Locators.Pigu.LogIn.clickProfileItem);
    }

    public static void clickAtsijungti() {
     //   Common.waitForElementToBeClickable(Locators.Pigu.LogIn.clickAtsijungti);
        Common.clickElementByAction(Locators.Pigu.LogIn.clickAtsijungti);
    }
    public static String checkText(){
        return Common.getElementText(Locators.Pigu.LogIn.checkText);
    }
}
