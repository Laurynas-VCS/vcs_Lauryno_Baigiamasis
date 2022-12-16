package lt.laurynas.pages.piguLt;

import lt.laurynas.pages.Common;
import lt.laurynas.pages.Locators;

public class Vaikams_KudikiamsPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickLaukoZaislai() {
        Common.waitForElementToBeClickable(Locators.Pigu.Vaikams_Kudikiams.clickButtonLaukoZaislai);
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickButtonLaukoZaislai);
    }

    public static void clickKudikiuPrekes() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickKudikiuPrekesImage);
    }

    public static void clickPaspirtukai() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickPaspirtukaiImage);
    }

    public static void clickIKrepseli() {

        Common.clickElementByAction(Locators.Pigu.Vaikams_Kudikiams.clickOnWantedProductButton);
    }

    public static void clickPirkti() {

        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickPirktiButton);
    }

    public static void clickRinktisDaugiauPrekiu() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickRinktisDaugiauPrekiuButton);
    }

    public static void clickVisosPrekes() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickVisosPrekesButton);
    }

    public static void clickVaikamsIrKudikiams() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickVaikamsIrKudikiamsImage);
    }


    public static void clickMaitinimoPriemones() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickMaitinimoPriemonesImage);
    }

    public static void clickMaitinimoKedutes() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickMaitinimoKedutesImage);
    }

    public static void clickIKrepseli2() {
        Common.clickElementByAction(Locators.Pigu.Vaikams_Kudikiams.clickIKrepseli2Button);
    }

    public static String getTextA() {
        return Common.getElementText(Locators.Pigu.Vaikams_Kudikiams.getTextFromCartIcon);
    }

}
