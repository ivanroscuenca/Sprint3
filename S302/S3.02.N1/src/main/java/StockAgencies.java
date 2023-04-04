public class StockAgencies implements Observer {

    //create observers
    private String name;

    public StockAgencies(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println( name + " the actual Price is "+ stockPrice);
    }


}
