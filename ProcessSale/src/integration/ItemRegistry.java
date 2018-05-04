package integration;

import java.util.ArrayList;
import java.util.List;

/**
 * The handler for the database that contains all items in the store.
 * The database is hard coded into the handler, however.
 */
public class ItemRegistry {
	private final List<ItemDTO> items = new ArrayList<>();
	
        /**
         * creates a new instance and adds items to the registry.
         */
	ItemRegistry() {
		addItems();
	}
	
	/**
	 * Finds an item in the registry with an identifier that matches the one entered by the cashier.
	 * @param itemID The identifier entered by the cashier.
	 * @return The item in the registry with the matching identifier.
	 */
	public ItemDTO findItem(String itemID) {
		for (ItemDTO item : items) {
			if(item.getID().equals(itemID))
				return new ItemDTO(item);
		}
		//no matching items:
		return null;
	}
        
        /**
         * @param index the index that the item is taken from.
         * @return the item in the registry list with the specified index.
         */
        public ItemDTO getItem(int index){
            return items.get(index);
        }
	
	/**
	 * Adds a collection of items to the registry.
	 */
	private void addItems() {
		items.add(new ItemDTO (10, "liten kaffe", 0.12, "LK"));
		items.add(new ItemDTO (15, "mellan kaffe", 0.12, "MK"));
		items.add(new ItemDTO (20, "stor kaffe", 0.12, "SK"));
	}
}
