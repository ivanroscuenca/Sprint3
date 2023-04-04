import java.util.ArrayList;
import java.util.List;

public class StockAgent implements SubjectObservable {
    private List<Observer> observers;
    private double initialPrice;

    //constructor
    public StockAgent() {
        this.observers = new ArrayList<>();
        initialPrice = 0;
    }

    //methods
//register observer agencies
    public void registerAgency(Observer obs) {
        observers.add(obs);
    }

    // set stock details if price is different or equal
    public void setStockAgent(double stockPrice) {
        if (stockPrice > initialPrice) {
            System.out.println("Price is up :");
            notifyChanges(stockPrice);
            initialPrice = stockPrice;
        }else if (stockPrice < initialPrice) {
                System.out.println("Price is down :");
                notifyChanges(stockPrice);
                initialPrice=stockPrice;
        } else {
            System.out.println("Price is the same :");
            notifyChanges(stockPrice);
        }
    }

    // notify changes to update
    @Override
    public void notifyChanges(double stockPrice) {
        for (Observer obs : observers) {
            obs.update(stockPrice);
        }
    }

}