
public class Main {

    public static void main(String[] args) {

        StockAgent agent1 = new StockAgent();

        StockAgencies agency1 = new StockAgencies("Lily Agency");
        StockAgencies agency2 = new StockAgencies("Agency Nolan");

        agent1.registerAgency(agency1);
        agent1.registerAgency(agency2);

        agent1.setStockAgent(150);

        agent1.setStockAgent(250);

        agent1.setStockAgent(50);

        agent1.setStockAgent(50);







    }
}
