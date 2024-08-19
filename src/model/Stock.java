package model;

import java.util.HashMap;
import java.util.Map;

public class Stock {
    private String name;
    private Map<String, Double> priceHistory;

    public Stock(String name) {
        this.name = name;
        this.priceHistory = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String date, double price){
        priceHistory.put(date, price);
    }

    public double getPrice(String date){
        return priceHistory.getOrDefault(date, 0.0);
    }
}
