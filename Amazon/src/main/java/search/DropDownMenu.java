package search;
import base.CommonAPI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by PIIT_NYA on 5/14/2017.
 */
public class DropDownMenu extends CommonAPI {

    public List<String> getMenus(){
        List<String> items = new ArrayList<String>();
        items = getTextFromWebElements("#searchDropdownBox option");
        return items;
    }

    public void typeOnInputSearch(List<String> data)throws InterruptedException{
        for(int i=0; i<5; i++) {
            typeByCss("#twotabsearchtextbox", data.get(i));
            input();
            sleepFor(2);
            clearBox();
        }
    }
    public void input() {
        keysInput("#twotabsearchtextbox");
    }
    public void clearBox() {
        clearInput("#twotabsearchtextbox");
    }

    public void dropDownSearch()throws InterruptedException{
        List<String> items = getMenus();
        typeOnInputSearch(items);
    }
}
