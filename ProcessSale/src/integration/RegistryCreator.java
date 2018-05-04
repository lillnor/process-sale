package integration;

/**
 * This class is responsible for instantiating all registries.
 */
public class RegistryCreator {
	private final ItemRegistry itemRegistry = new ItemRegistry();
        
    /**
     * @return gets the item registry.
     */
    public ItemRegistry getItemRegistry() {
		return itemRegistry;
	}
}
