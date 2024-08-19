import model.Stock;
import portfolio.Portfolio;

public class Main {
    public static void main(String[] args){

        Stock apple = new Stock("Apple");
        apple.setPrice("2023-01-01", 150.0);
        apple.setPrice("2024-01-01", 180.0);

        Stock google = new Stock("Google");
        google.setPrice("2023-01-01", 100.0);
        google.setPrice("2024-01-01", 120.0);

        Portfolio portfolio = new Portfolio();
        portfolio.addStock(apple);
        portfolio.addStock(google);

        double profit = portfolio.calculateProfit("2023-01-01", "2024-01-01");
        System.out.println("Profit: "+ profit);

        double annualReturn = portfolio.calculateAnnualizeReturn("2023-01-01", "2024-01-01", 1);
        System.out.println("Annualized Return: " + annualReturn);
    }
}