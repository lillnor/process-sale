/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import integration.ItemDTO;

/**
 * The receipt of a sale.
 */
public class Receipt {
    private final Sale sale;
    
    /**
     * Creates a new instance.
     * @param sale the sale that the receipt is printed for.
     */
    public Receipt(Sale sale) {
        this.sale = sale;
    }
    
    /**
     * Takes information from <code>sale</code> and creates a well-formatted
     * string with the content of the receipt
     * @return String that represents the receipt.
     */
    public String createReceiptString(){
        StringBuilder builder = new StringBuilder();
        appendLine(builder, "*KVITTO*");
        endSection(builder);
        
        builder.append("Transaktionstid: ");
        appendLine(builder, sale.getSaleTime().toString());
        endSection(builder);
        
        for(ItemDTO item : sale.getItems())
            listItem(builder, item);
        endSection(builder);
        
        builder.append("Total kostnad: ");
        appendLine(builder, Integer.toString(sale.getRunningTotal()) + "kr");
        builder.append("Total moms: ");
        appendLine(builder, Double.toString(sale.getTotalTaxes()) + "kr");
        builder.append("Växel: ");
        appendLine(builder, Integer.toString(sale.getChange()) + "kr");
        endSection(builder);
        
        return builder.toString();
    }
    
    private void appendLine(StringBuilder builder, String line) {
        builder.append(line);
        builder.append("\n");
    }
    
    private void endSection(StringBuilder builder) {
        builder.append("\n");
    }
        
    private void listItem(StringBuilder builder, ItemDTO item){
        builder.append(item.getQuantity()).append("x ");
        builder.append(item.getDescription()).append(" ");
        builder.append("(").append(item.getPrice()).append("kr)    ");
        builder.append(item.getPrice()*item.getQuantity()).append("kr");
        builder.append("\n");
    }
}
