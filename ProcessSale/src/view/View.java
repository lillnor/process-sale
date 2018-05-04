package view;

import controller.Controller;

/**
 * This is a placeholder for the view. It contains only hardcoded calls to the controller.
 */
public class View {
    private Controller contr;
    
    /**
     * Constructs a new view, using the specified controller.
     * @param contr This controller will be used for all system operations.
     */
    public View(Controller contr) {
        this.contr = contr;
    }
    
    /**
     * Simulates a sample execution containing calls to all system operations.
     */
    public void sampleExecution() {
        System.out.println("Starting sample execution.");
        
        contr.startSale();
        System.out.println("After call to startSale()");
        System.out.println(contr.enterItemID("LK"));
        System.out.println(contr.enterItemIDAndQuantity("MK", 2));
        System.out.println(contr.enterItemIDAndQuantity("LK", 3));
        System.out.println(contr.enterItemID("SK"));
        System.out.println(contr.enterItemID("SK"));
        System.out.println(contr.enterItemID("MK"));
        System.out.println(contr.indicateAllItemsRegistered());
        System.out.println(contr.enterPaidCash(500));
        
        contr.startSale();
        System.out.println("After call to startSale()");
        System.out.println(contr.enterItemID("LK"));
        System.out.println(contr.indicateAllItemsRegistered());
        System.out.println(contr.enterPaidCash(10));  
    }
}
