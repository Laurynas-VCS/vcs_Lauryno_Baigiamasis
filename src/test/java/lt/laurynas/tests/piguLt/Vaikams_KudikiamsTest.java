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

        String expectedKiekis = "14598 €";
        String actualKiekis = "";

        Vaikams_KudikiamsPage.clickLaukoZaislai();
        Vaikams_KudikiamsPage.clickPaspirtukai();
        Vaikams_KudikiamsPage.selectProduct();
        Vaikams_KudikiamsPage.clickPirkti();
        Vaikams_KudikiamsPage.clickRinktisDaugiauPrekiu();
        Vaikams_KudikiamsPage.clickVisosPrekes();
        Vaikams_KudikiamsPage.clickVaikamsIrKudikiams();
        Vaikams_KudikiamsPage.clickLaukoZaislai();
        Vaikams_KudikiamsPage.clickPaspirtukai();
        Vaikams_KudikiamsPage.selectProduct();
        Vaikams_KudikiamsPage.clickPirkti();
        actualKiekis = Vaikams_KudikiamsPage.readMessage();

        Assert.assertEquals(actualKiekis, expectedKiekis);
    }
}
