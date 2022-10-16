package lt.laurynas.pages;

public class DviraciaiPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickAtsiimkiteSiandien() {
        Common.clickElement(Locators.Pigu.Dviraciai.clickAtsiimkiteSiandien);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void clickRekomenduojamasUgis() {
        Common.clickElement(Locators.Pigu.Dviraciai.clickRekomenduojamasUgis);
    }

    public static void clickToOpenProductPage(){
        // Common.waitForElementToBeClickable(Locators.Pigu.Dviraciai.clickOpenProductPage);// su wait neranda
        Common.clickElement(Locators.Pigu.Dviraciai.clickOpenProductPage);
    }


    public static void clickIKrepseli() {
        Common.clickElement(Locators.Pigu.Dviraciai.clickIKrepseli);
    }

    public static void clickPirkti() {
        Common.clickElement(Locators.Pigu.Dviraciai.clickPirkti);
    }

    public static String checkText() {
        return Common.getElementText(Locators.Pigu.Dviraciai.getElementText);
    }
}
