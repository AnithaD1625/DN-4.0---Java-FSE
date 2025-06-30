import java.util.*;

class Product {
    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
               "productId=" + productId +
               ", productName='" + productName + '\'' +
               ", price=" + price +
               '}';
    }
}

public class ECommerceSearch {

    public static List<Product> searchProducts(List<Product> products, String keyword) {
        List<Product> result = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();

        for (Product product : products) {
            if (product.productName.toLowerCase().contains(lowerKeyword)) {
                result.add(product);
            }
        }

        result.sort(Comparator.comparing(p -> p.productName.toLowerCase()));
        return result;
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "iPhone 14", 799.99),
            new Product(2, "Samsung Galaxy S23", 699.99),
            new Product(3, "Apple Watch", 399.99),
            new Product(4, "OnePlus 11", 649.99)
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine();

        List<Product> matched = searchProducts(products, keyword);

        System.out.println("\nSearch Results:");
        for (Product p : matched) {
            System.out.println(p);
        }

        scanner.close();
    }
}
