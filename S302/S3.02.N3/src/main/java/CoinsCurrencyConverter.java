import java.util.HashMap;
import java.util.Map;

public class CoinsCurrencyConverter implements  CurrencyConverter {

    private Map<String,Double> exchangeCoins;

    public CoinsCurrencyConverter() {
        this.exchangeCoins = new HashMap<>();
        exchangeCoins.put("EUR",0.90);
        exchangeCoins.put("USD",1.10);
        exchangeCoins.put("GBP",0.80);
    }

    @Override
    public double convert(double amount, String currency) {
        double exchangecoin = exchangeCoins.getOrDefault(currency,1.0);
        double coin = (amount*exchangecoin);
        return coin;
    }
}
