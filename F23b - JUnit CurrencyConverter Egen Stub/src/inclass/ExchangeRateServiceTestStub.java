package inclass;


import java.io.IOException;

import com.google.gson.JsonSyntaxException;

public class ExchangeRateServiceTestStub implements ExchangeRateService {
    
    public ExchangeRate getRate(String source, String target) throws IOException, JsonSyntaxException {
    	
    	ExchangeRate er = new ExchangeRate();
    	er.rate = 8;
    	return er;
    }

}
