package page;

import base.CommonAPI;

public class SearchItems extends CommonAPI {

    public void searchItems(){
        System.out.println(driver.getTitle());
        typeByCss("#twotabsearchtextbox", "Java Books");
        clickByCss(".nav-input");
        clearInput("#twotabsearchtextbox");
        typeByCss("#twotabsearchtextbox", "Selenium Books");
        clickByCss(".nav-input");
        clearInput("#twotabsearchtextbox");
        System.out.println(driver.getCurrentUrl());
    }
}
