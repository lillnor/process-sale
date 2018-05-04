/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;
import model.Sale;

/**
 *
 * @author Robert Lillnor
 */
public class AccountingSystem {
    private Sale sale;
    
    /**
     * Sends information about sale to an external system to bookkeep.
     * @param sale the sale that is about to end.
     */
    public void bookkeep(Sale sale) {
        this.sale = sale;
    }
}
