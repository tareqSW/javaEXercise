public class Stock {
    private String symbol;
    private String name;
     double previousClosingPrice;
      double currentPrice;

    public Stock(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    public double getChangePercent() {
        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }
}
