package lt.laurynas.pages.piguLt;

import lt.laurynas.pages.Common;
import lt.laurynas.pages.Locators;

public class DviraciaiPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickAtsiimkiteSiandien() {
        Common.clickElement(Locators.Pigu.Dviraciai.clickAtsiimkiteSiandien);
    }


    public static void clickRekomenduojamasUgis() {
        Common.clickElement(Locators.Pigu.Dviraciai.clickRekomenduojamasUgis);
    }

    public static void clickIKrepseli() {
        Common.moveToElement(Locators.Pigu.Dviraciai.moveToElement);
        Common.waitForElementToBeClickable(Locators.Pigu.Dviraciai.clickButtonIKrepseli);
        Common.clickElementByAction(Locators.Pigu.Dviraciai.clickButtonIKrepseli);
    }

    public static void clickPirkti() {
        Common.clickElement(Locators.Pigu.Dviraciai.clickPirkti);
    }

    public static String checkText() {
        return Common.getElementText(Locators.Pigu.Dviraciai.getElementText);
    }
}
