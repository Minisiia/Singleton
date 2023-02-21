package singleton;

/**
 * Write a program for tracking sales in an online store using the Singleton pattern.
 * Steps:
 * Create a SalesRecord class with a private constructor to prevent the creation of instances outside of the class.
 * Add a static instance field to store the single instance of the class.
 * Implement the getInstance() method, which will check if an instance of the class exists and, if not, create one. The method should return this single instance.
 * Add methods for recording sales information, such as recordSale(), which will be called for each sale.
 * Implement methods for obtaining sales statistics, such as the getTotalSales() method, which will return the total number of sales.
 */
public class Main {
    public static void main(String[] args) {
        SalesRecord record = SalesRecord.getInstance();
        record.recordSale(25);
        record.recordSale(30);
        int totalSales = record.getTotalSales();
        System.out.println("Total sales: " + totalSales);
    }
}
