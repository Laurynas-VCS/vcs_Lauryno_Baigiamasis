package lt.laurynas.tests.piguLt;

import lt.laurynas.pages.piguLt.Vaikams_KudikiamsPage;
import lt.laurynas.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Vaikams_KudikiamsTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        Vaikams_KudikiamsPage.open("https://pigu.lt/lt/vaikams-kudikiams");
    }

    @Test
    private void putTwoProductsInKrepselis() {

        String expectedText = "2";
        String actualTextA = "";


        Vaikams_KudikiamsPage.clickLaukoZaislai();
        Vaikams_KudikiamsPage.clickPaspirtukai();
        Vaikams_KudikiamsPage.clickIKrepseli();
        Vaikams_KudikiamsPage.clickPirkti();
        Vaikams_KudikiamsPage.clickRinktisDaugiauPrekiu();
        Vaikams_KudikiamsPage.clickVisosPrekes();
        Vaikams_KudikiamsPage.clickVaikamsIrKudikiams();
        Vaikams_KudikiamsPage.clickKudikiuPrekes();
        Vaikams_KudikiamsPage.clickMaitinimoPriemones();
        Vaikams_KudikiamsPage.clickMaitinimoKedutes();
        Vaikams_KudikiamsPage.clickIKrepseli2();
        Vaikams_KudikiamsPage.clickPirkti();
        actualTextA = Vaikams_KudikiamsPage.getTextA();


        Assert.assertTrue(actualTextA.contains(expectedText),
                String.format("Actual [%s]; Expected [%s]",
                        actualTextA,
                        expectedText)
        );

    }
}
