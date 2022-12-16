package lt.laurynas.tests.piguLt;

import lt.laurynas.pages.piguLt.DviraciaiPage;
import lt.laurynas.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DviraciaiTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        DviraciaiPage.open("https://pigu.lt/lt/dviraciai");
    }

    @Test
    private void puttingChosenMerchandiseToBuyingCart() {

        String expectedText = "1";
        String actualText = "";

        DviraciaiPage.clickAtsiimkiteSiandien();
        DviraciaiPage.clickRekomenduojamasUgis();
        DviraciaiPage.clickIKrepseli();
        DviraciaiPage.clickPirkti();
        actualText = DviraciaiPage.checkText();

        Assert.assertTrue(actualText.contains(expectedText),
                String.format("Actual [%s]; Expected [%s]",
                        actualText,
                        expectedText)
        );


    }
}
