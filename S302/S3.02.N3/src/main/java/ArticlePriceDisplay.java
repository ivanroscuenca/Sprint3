import java.util.List;

public class ArticlePriceDisplay {

    private List<Article> articles;
    private CurrencyConverter coinConverter;

    public ArticlePriceDisplay(List<Article> articles, CurrencyConverter coinConverter) {
        this.articles = articles;
        this.coinConverter = coinConverter;
    }

    public void displayPrices(String currency){
        System.out.println(" Prices in " + currency + ":");
        for (Article article : articles){
            double price = coinConverter.convert(article.getPrice(), currency);
            System.out.println("For the article :"+ article.getName() + ", the price is : " + price  );
        }
        System.out.println("------------------------------------------------------");
    }
}
