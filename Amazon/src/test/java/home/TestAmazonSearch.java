package home;

import org.testng.annotations.Test;
import page.SearchItems;

public class TestAmazonSearch extends SearchItems {

    @Test
    public void testHome(){
     searchItems();
    }

}
