package data.table;

import base.CommonAPI;

public class ScrapeTableData extends CommonAPI {

    public void readData(){
        String rowValue = getTextByCss(".w3-responsive .w3-table-all.notranslate tr:nth-child(3)");
        System.out.println(rowValue);
    }
}
