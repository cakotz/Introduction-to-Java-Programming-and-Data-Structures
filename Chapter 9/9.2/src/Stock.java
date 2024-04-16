public class Stock {
    /*
    String symbol - Specifies the symbol of the stock object.
    String name - Specifies the name of the stock object.
    double previousClosingPrice - Specifies the previous closing price of the stock object.
    double currentPrice - Specifies the current price of the stock object.
     */
    private String symbol = "";
    private String name = "";
    private double previousClosingPrice = 0;
    private double currentPrice = 0;

    //Getters and setters for symbol, name, previousClosingPrice, and currentPrice
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    //Argument constructor
    Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    //Returns the percentage change between previousClosingPrice and currentPrice.
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
