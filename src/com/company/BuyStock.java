package com.company;

/**
 * This class is a command: it implements the Order interface.
 */
public class BuyStock implements Order {

    private Stock abcStock;
    private String previousStock;
    private String newStock;

    public void start()
    {
        this.previousStock = abcStock.getName();
        abcStock.setName(newStock);
    }

    public void undo()
    {
        abcStock.setName(previousStock);
    }


    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
