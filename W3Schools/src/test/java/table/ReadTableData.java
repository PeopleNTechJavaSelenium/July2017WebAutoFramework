package table;

import data.table.ScrapeTableData;
import org.testng.annotations.Test;

public class ReadTableData extends ScrapeTableData{
    @Test
    public void testTable(){
        readData();
    }
}
