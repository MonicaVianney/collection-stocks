package portfolio;

import model.Stock;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private List<Stock> stocks;

    public Portfolio() {
        this.stocks = new ArrayList<>();
    }

    public void addStock(Stock stock){
        stocks.add(stock);
    }

    public double calculateProfit(String startDate, String endDate){
        double totalProfit = 0.0;

        for (Stock stock : stocks){
            double startPrice = stock.getPrice(startDate);
            double endPrice = stock.getPrice(endDate);
            totalProfit += (endPrice - startPrice);
        }
        return totalProfit;
    }

    public double calculateAnnualizeReturn(String startDate, String endDate, int yearsBetween){
        double profit = calculateProfit(startDate, endDate);
        return profit / yearsBetween;
    }
}
