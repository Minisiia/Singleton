package singleton;

public class SalesRecord {
    private static SalesRecord instance;
    private int totalSales = 0;
    // Конструктор приватный, чтобы предотвратить создание экземпляров вне класса.
    private SalesRecord(){

    }
    /**
     * Returns the single instance of the SalesRecord class.
     * If the instance does not exist, it will be created.
     * @return the single instance of the SalesRecord class
     */
    public static SalesRecord getInstance() {
        if (instance == null)
            instance = new SalesRecord();
        return instance;
    }
    /**
     * Records the amount of a sale in the SalesRecord instance.
     * @param amount the amount of the sale
     */
    public void recordSale(int amount) {
        totalSales += amount;
    }
    /**
     * Returns the total number of sales recorded in the SalesRecord instance.
     * @return the total number of sales recorded
     */
    public int getTotalSales() {
        return totalSales;
    }
}
