package inclass;

import java.io.IOException;

import com.google.gson.JsonSyntaxException;

public interface ExchangeRateService {

	ExchangeRate getRate(String fromCurrencyParameter, String toCurrencyParameter) throws IOException, JsonSyntaxException;

}
