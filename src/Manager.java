import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Brand> brandList = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();
    private static int firstId = 1;

    public Manager() {
        // Brands are created.
        brandList.add(new Brand(1, "Samsung"));
        brandList.add(new Brand(2, "Lenovo"));
        brandList.add(new Brand(3, "Apple"));
        brandList.add(new Brand(4, "Huawei"));
        brandList.add(new Brand(5, "Casper"));
        brandList.add(new Brand(6, "Asus"));
        brandList.add(new Brand(7, "HP"));
        brandList.add(new Brand(8, "Xiaomi"));
        brandList.add(new Brand(9, "Monster"));
    }

    // List the brands.
    public void listBrand() {
        System.out.format("%-10s %-25s\n", "Brand ID", "Brand Name");
        for (Brand brand : brandList) {
            System.out.format("%-10d %-25s\n", brand.getId(), brand.getName());
        }
    }

    // List the all products.
    public void listProduct() {
        System.out.format("%-5s %-20s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-15s\n", "ID", "Type", "Brand", "Name", "Price", "Discount Rate", "Storage", "Screen Size", "Ram", "Stock");
        for (Product product : productList) {
            System.out.format("%-5d %-20s %-15s %-30s %-15.2f %-15.2f %-15s %-15s %-15s %-15d\n", product.getId(), product.getType(), product.getBrand().getName(), product.getName(), product.getPrice(), product.getDiscountRate(), product.getStorage(), product.getScreenSize(), product.getRam(), product.getStock());
        }
    }

    // Find the brand by Brand ID
    private Brand findBrandById(int id) {
        for (Brand brand : brandList) {
            if (brand.getId() == id) {
                return brand;
            }
        }
        return null;
    }

    // Find the product by Product ID
    private Product findProductById(int productId) {
        for (Product product : productList) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    // Filter the product by Product ID
    public void filterProductById(int productId) {
        Product product = findProductById(productId);
        if (product != null) {
            System.out.format("%-5s %-20s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-15s\n", "ID", "Type", "Brand", "Name", "Price", "Discount", "Storage", "Screen Size", "Ram", "Stock");
            System.out.format("%-5s %-20s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-15s\n", product.getId(), product.getType(), product.getBrand().getName(), product.getName(), product.getPrice(), product.getDiscountRate(), product.getStorage(), product.getScreenSize(), product.getRam(), product.getStock());
        }
    }

    // Filter the products by Brand Name
    public void filterProductByBrandName(String brandName) {
        System.out.format("%-5s %-20s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-15s\n", "ID", "Type", "Brand", "Name", "Price", "Discount", "Storage", "Screen Size", "Ram", "Stock");
        for (Product product : productList) {
            if (product.getBrand().getName().equalsIgnoreCase(brandName)) {
                System.out.format("%-5s %-20s %-15s %-30s %-15s %-15s %-15s %-15s %-15s %-15s\n", product.getId(), product.getType(), product.getBrand().getName(), product.getName(), product.getPrice(), product.getDiscountRate(), product.getStorage(), product.getScreenSize(), product.getRam(), product.getStock());
            }
        }
    }

    // Delete a product using its Product ID
    public void deleteProductById(int id) {
        Product productToRemove = null;
        for (Product product : productList) {
            if (product.getId() == id) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            productList.remove(productToRemove);
        }
    }

    // Add a new notebook
    public void addNotebook(String type, int brandId, String name, double price, double discountRate, String storage, double screenSize, String ram, int stock) {
        Brand brand = findBrandById(brandId);
        if (brand != null) {
            Notebook notebook = new Notebook(firstId++, type, brand, name, price, discountRate, storage, screenSize, ram, stock);
            productList.add(notebook);
        }
    }

    // Add a new mobile phone
    public void addMobilePhone(String type, int brandId, String name, double price, double discountRate, String storage, double screenSize, String ram, int batteryPower, String color, int stock) {
        Brand brand = findBrandById(brandId);
        if (brand != null) {
            MobilePhone mobilePhone = new MobilePhone(firstId++, type, brand, name, price, discountRate, storage, screenSize, ram, batteryPower, color, stock);
            productList.add(mobilePhone);
        }
    }
}
