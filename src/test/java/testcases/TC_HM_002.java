package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.NewCarPage;

public class TC_HM_002 extends BaseTest{


    @Test
    public void TC_HM_002(){

        HomePage hp = new HomePage(driver);
        hp.verifyMenus();
        hp.navigateToSearch();
        NewCarPage ncp = new NewCarPage(driver);
        ncp.carTitles();

    }
}
