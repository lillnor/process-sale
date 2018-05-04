package integration;

/**
 * A DTO that contains information about an item that can be bought at the store.
 */
public final class ItemDTO {
	private final int price;
	private final String descript;
	private final double tax;
        private final String itemID;
        private final int quantity;
	
	/**
	 * Creates a new ItemDTO containing information about an item
         * that can be bought, with quantity being set to 1.
	 * @param price The price of the item.
	 * @param descript The description of the item.
	 * @param tax The tax percentage of the item.
	 * @param itemID The identifier of the item.
	 */
	public ItemDTO(int price, String descript, double tax, String itemID) {
            this.price      = price;
            this.descript   = descript;
            this.tax        = tax;
            this.itemID     = itemID;
            this.quantity   = 1;
	}
        
        /**
         * Creates a new ItemDTO that copies the values of another ItemDTO.
         * @param item the ItemDTO that values are to be copied from.
         */
        public ItemDTO(ItemDTO item) {
            this.price      = item.price;
            this.descript   = item.descript;
            this.tax        = item.tax;
            this.itemID     = item.itemID;
            this.quantity   = item.quantity;
	}
        
        /**
         * Creates a new ItemDTO that copies the values of another ItemDTO,
         * but with a new quantity.
         * @param item the ItemDTO that values are to be copied from.
         * @param quantity the new quantity of the item.
         */
        public ItemDTO(ItemDTO item, int quantity) {
            this.price      = item.price;
            this.descript   = item.descript;
            this.tax        = item.tax;
            this.itemID     = item.itemID;
            this.quantity   = quantity;
	}

    /**
     * @return the price of this item.
     */
    public int getPrice() {
            return price;
	}
	
    /**
     * @return the description of this item.
     */
    public String getDescription() {
            return descript;
	}
	
    /**
     * @return the tax percentage of this item.
     */
    public double getTax() {
            return tax;
	}
	
    /**
     * @return the ID of this item.
     */
    public String getID() {
            return itemID;
        }
        
    /**
     * @return the quantity of this item.
     */
    public int getQuantity() {
            return quantity;
        }
        
    @Override
    public boolean equals(Object other){
        if (other == null || !(other instanceof ItemDTO)) {
            return false;
        }
        ItemDTO otherItem = (ItemDTO) other;
        return this.getID().equals(otherItem.getID());
    }
}
