package home;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestCnn extends CommonAPI {

    @Test
    public void homePage(){
        getCurrentPageUrl();
    }
}
