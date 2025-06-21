package FSE_WEEK1_DESIGN_PATTERNS.observerpattern;

import java.util.*;

interface Observer {
    void update(String stock, double price);
}

interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public void setStockData(String name, double price) {
        this.stockName = name;
        this.price = price;
        notifyObservers();
    }

    public void register(Observer o) { observers.add(o); }
    public void deregister(Observer o) { observers.remove(o); }
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockName, price);
        }
    }
}

class MobileApp implements Observer {
    public void update(String stock, double price) {
        System.out.println("MobileApp - " + stock + ": " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();

        market.register(mobile);
        market.setStockData("TCS", 3450);
    }
}
