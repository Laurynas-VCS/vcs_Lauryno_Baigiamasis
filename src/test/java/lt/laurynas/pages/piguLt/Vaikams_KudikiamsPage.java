package lt.laurynas.pages.piguLt;

import lt.laurynas.pages.Common;
import lt.laurynas.pages.Locators;

public class Vaikams_KudikiamsPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickLaukoZaislai() {
        Common.waitForElementToBeClickable(Locators.Pigu.Vaikams_Kudikiams.clickLaukoZaislai);
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickLaukoZaislai);
    }

    public static void clickKudikiuPrekes() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickKudikiuPrekes);
    }

    public static void clickPaspirtukai() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickPaspirtukai);
    }

    public static void clickIKrepseli() {

        Common.clickElementByAction(Locators.Pigu.Vaikams_Kudikiams.clickOnWantedProduct);
    }

    public static void clickPirkti() {

        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickPirkti);
    }

    public static void clickRinktisDaugiauPrekiu() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickRinktisDaugiauPrekiu);
    }

    public static void clickVisosPrekes() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickVisosPrekes);
    }

    public static void clickVaikamsIrKudikiams() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickVaikamsIrKudikiams);
    }


    public static void clickMaitinimoPriemones() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickMaitinimoPriemones);
    }

    public static void clickMaitinimoKedutes() {
        Common.clickElement(Locators.Pigu.Vaikams_Kudikiams.clickMaitinimoKedutes);
    }

    public static void clickIKrepseli2() {
        Common.clickElementByAction(Locators.Pigu.Vaikams_Kudikiams.clickIKrepseli2);
    }

    public static String getTextA() {
        return Common.getElementText(Locators.Pigu.Vaikams_Kudikiams.getTextA);
    }

    public static String getTextB() {
        return Common.getElementText(Locators.Pigu.Vaikams_Kudikiams.getTextB);
    }
}
