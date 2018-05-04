/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;
import model.Receipt;

/**
 * The printer that is responsible to print receipts.
 */
public class Printer {
    
    /**
     * Prints a receipt.
     * @param receipt the receipt that is printed.
     */
    public void printReceipt(Receipt receipt) {
        System.out.println(receipt.createReceiptString());
    }
}
