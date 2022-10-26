
public class Product {

	private int productNumber;
	private String productName;
	private Double price;
	
	public Product(int productNumber, String productName, Double price) {
		this.productNumber = productNumber;
		this.productName = productName;
		this.price = price;
	}
	
	public int getProductNumber() {
		return productNumber;
	}
	
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	} 
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
}
