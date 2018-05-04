package startup;

import controller.Controller;
import integration.RegistryCreator;
import integration.Printer;
import integration.AccountingSystem;
import integration.InventorySystem;
import view.View;

/**
 * Starts the entire application.
 */
public class Main {
    /**
     * @param args The program does not take any command line parameters. 
     */
    public static void main(String[] args) {
    	RegistryCreator regCreator    = new RegistryCreator();
        Printer printer               = new Printer();
        AccountingSystem accounting   = new AccountingSystem();
        InventorySystem inventory     = new InventorySystem();
        Controller contr              = new Controller(regCreator, printer, accounting, inventory);
        View view                     = new View(contr);
        view.sampleExecution();
    }
}
