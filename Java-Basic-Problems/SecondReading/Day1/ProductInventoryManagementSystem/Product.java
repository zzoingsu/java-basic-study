package SecondReading.Day1.ProductInventoryManagementSystem;

public class Product {
	private final int productId;
	private String productName;
	private int price;
	private int stock;
	
	public Product(int productId, String productName, int price, int stock) {
		validateProductName(productName);
		validatePrice(price);
		validateStock(stock);
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stock = stock;
		
	}
	public void setProductName(String productName) {
		validateProductName(productName);
		this.productName = productName;
	}
	
	public void setPrice(int price) {
		validatePrice(price);
		this.price = price;
	}
	
	public void increaseStock(int amount) {
		validateAmount(amount);
		this.stock += amount;
		System.out.println("재고 증가 완료");
	}
	
	public void decreaseStock(int amount) {
		validateAmount(amount);
		this.stock -= amount;
		System.out.println("재고 감소 완료");
	}
	
	private void validateProductName(String productName) {
        if(productName == null || productName.isBlank()) {
            throw new IllegalArgumentException("상품명은 비어 있을 수 없습니다");
        }
    }

    private void validatePrice(int price) {
        if(price <= 0) {
            throw new IllegalArgumentException("상품가격은 0원 이하가 될 수 없습니다");
        }
    }

    private void validateStock(int stock) {
        if(stock < 0) {
            throw new IllegalArgumentException("상품재고는 음수가 될 수 없습니다");
        }
    }

    private void validateAmount(int amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("수량은 0보다 커야 합니다");
        }
    }
    
	@Override
	public String toString() {
		return "Product{id= " + productId + ", name=" + productName + ", price=" + price + ", stock=" + stock + "}"; 
	}
}
