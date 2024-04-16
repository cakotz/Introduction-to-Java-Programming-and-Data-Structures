import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Creates a stock object,.
        Stock stock = new Stock("ORCL", "Oracle", 34.5, 34.35);

        System.out.println(stock.getSymbol() + " - " + stock.getName() +
                        "\nPrevious Closing Price: " + stock.getPreviousClosingPrice() +
                        "\nCurrent Price: " + stock.getCurrentPrice() +
                        "\nChange Percentage: " + stock.getChangePercent() + "%");
    }
}