package Assignment5;
/*5. Builder Pattern & Encapsulation: Immutable Product
Use Builder design to create immutable class with encapsulation.
•	Create an immutable Product class with private final fields such as name, code, price, and optional category.
•	Use a static nested Builder inside the Product class. Provide methods like withName(), withPrice(), etc., that apply validation (e.g. non-negative price).
•	The outer class should have only getter methods, no setters.
•	The builder returns a new Product instance only when all validations succeed.   */
public class Product {
    private final String name;
    private final String code;
    private final double price;
    private final String category; 
    private Product(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.price = builder.price;
        this.category = builder.category;
    }
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public static class Builder {
        private String name;
        private String code;
        private double price;
        private String category;
        public Builder withName(String name) {
            this.name = name;
            return this;
        }
        public Builder withCode(String code) {
            this.code = code;
            return this;
        }
        public Builder withPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }
            this.price = price;
            return this;
        }
        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }
        public Product build() {
            if (name == null || code == null) {
                throw new IllegalStateException("Name and code are required.");
            }
            return new Product(this);
        }
    }
    public String toString() {
        return "Product Details:\n" +
               "Name: " + name + "\n" +
               "Code: " + code + "\n" +
               "Price: ₹" + price + "\n" +
               "Category: " + (category != null ? category : "N/A");
    }
    public static void main(String[] args) {
        Product product = new Product.Builder()
                .withName("Laptop")
                .withCode("LP1001")
                .withPrice(55000)
                .withCategory("Electronics")
                .build();
        System.out.println(product);
    }
}