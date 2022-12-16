package lt.laurynas.pages.piguLt;

import lt.laurynas.pages.Common;
import lt.laurynas.pages.Locators;

public class DviraciaiPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickAtsiimkiteSiandien() {
        Common.clickElement(Locators.Pigu.Dviraciai.clickAtsiimkiteRytojCheckbox);
    }


    public static void clickRekomenduojamasUgis() {
        Common.clickElement(Locators.Pigu.Dviraciai.clickRekomenduojamasUgisCheckbox);
    }

    public static void clickIKrepseli() {
        Common.moveToElement(Locators.Pigu.Dviraciai.moveToElement);
        Common.waitForElementToBeClickable(Locators.Pigu.Dviraciai.clickButtonIKrepseli);
        Common.clickElementByAction(Locators.Pigu.Dviraciai.clickButtonIKrepseli);
    }

    public static void clickPirkti() {
        Common.clickElement(Locators.Pigu.Dviraciai.clickPirktiButton);
    }

    public static String checkText() {
        return Common.getElementText(Locators.Pigu.Dviraciai.getElementTextFromCartIcon);
    }
}
