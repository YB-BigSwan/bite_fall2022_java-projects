import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Item> itemList = new ArrayList<Item>();
	private DecimalFormat twoDecimal = new DecimalFormat("0.00");
	
	public ShoppingCart() {
		itemList = new ArrayList<Item>();
	}
	
	public void add(Product product, int quantity) {
		Item item = new Item(product, quantity);
		itemList.add(item);
	}
	
	public void remove(Product product) {
		for(int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getProduct().equals(product)) {
				itemList.remove(itemList.get(i));
			}
		}
	}
	
	public Double getTotalPrice() {
		
		Double totalPrice = 0.0;
		for (int i = 0; i < itemList.size(); i++) {
			totalPrice += itemList.get(i).getSubtotal(); 
		}
		return totalPrice;
	}
	
	public String toString() {
		String output = "";
		
		if(itemList.size() >= 1) {
			System.out.println("=== Shopping cart ===");
			for (int i = 0; i < itemList.size(); i++) {
				output += itemList.get(i).getProduct().getProductNumber() + ": " + itemList.get(i).getProduct().getProductName() + ", quantity: " + itemList.get(i).getQuantity() + ", unit price: " + twoDecimal.format(itemList.get(i).getProduct().getPrice()) + ", subtotal: " + twoDecimal.format(itemList.get(i).getSubtotal()) + "\n";
			}
			output = output + "TOTAL PRICE: " + twoDecimal.format(getTotalPrice()) + " euros\n";
		} else {
			output = "There are no items in the shopping cart.\n";
		}
		return output;
	}
}
