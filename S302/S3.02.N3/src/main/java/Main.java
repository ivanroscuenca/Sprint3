import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //create a list of articles
        List<Article> articles = new ArrayList<>();
        articles.add( new Article("t-shirt", 10.00));
        articles.add( new Article("shirt", 20.00));
        articles.add( new Article("pull", 30.00));
        articles.add( new Article("jacket", 50.00));
        articles.add( new Article("parka", 100.00));
        //instance of currency converter
        CurrencyConverter converter = new CoinsCurrencyConverter();

        //instance of articles display prices and pass converter
        ArticlePriceDisplay a1 = new ArticlePriceDisplay(articles,converter);

        //create articles display prices and pass different currencies
        a1.displayPrices("USD");
        a1.displayPrices("EUR");
        a1.displayPrices("GBP");

        }

    }

