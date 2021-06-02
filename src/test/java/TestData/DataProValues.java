package TestData;

import org.testng.annotations.DataProvider;

public class DataProValues {

    @DataProvider(name = "data-provider")
    public  Object [][] InvalidData(){
        return new Object [][] {
                {"Bilarn", "IBlassssssss"},
                {"UserInvalid", "PassInvalid"},
                {"Bilarn", "@Bilarn_server"}
        };
    }
}
