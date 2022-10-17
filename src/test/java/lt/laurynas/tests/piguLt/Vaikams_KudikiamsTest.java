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

        String expectedTextA = "Lionelo Whizz";
        String actualTextA = "";
        String expectedTextB = "Kinderkraft";
        String actualTextB = "";

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
        actualTextB = Vaikams_KudikiamsPage.getTextB();

        Assert.assertTrue(actualTextA.contains(expectedTextA),
                String.format("Actual [%s]; Expected [%s]",
                actualTextA,
                expectedTextA)
        );

        Assert.assertTrue(actualTextB.contains(expectedTextB),
                String.format("Actual [%s]; Expected [%s]",
                        actualTextB,
                        expectedTextB)
        );
    }
}
