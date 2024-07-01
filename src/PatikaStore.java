import java.util.Scanner;

public class PatikaStore {
    private Manager manager;
    Scanner input = new Scanner(System.in);

    public PatikaStore(Manager manager) {
        this.manager = manager;
        addSampleData(this.manager);
        initialize();
    }

    // Initialize the program
    public void initialize() {
        while (true) {
            System.out.println("### PATIKA STORE ###");
            System.out.println("1 - Add Product");
            System.out.println("2 - List Products");
            System.out.println("3 - Delete Product");
            System.out.println("4 - Filter Products by ID");
            System.out.println("5 - Filter Products by Brand");
            System.out.println("0 - Exit");
            System.out.print("Please, enter the operation: ");

            int operation = input.nextInt();
            input.nextLine();

            switch (operation) {
                case 1:
                    addProduct();
                    System.out.println();
                    break;
                case 2:
                    this.manager.listProduct();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Please, enter the Product ID you want to delete: ");
                    int deleteId = input.nextInt();
                    this.manager.deleteProductById(deleteId);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Please, enter the ID you want to filter: ");
                    int filterId = input.nextInt();
                    this.manager.filterProductById(filterId);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Please, enter the Brand you want to filter: ");
                    String filterBrand = input.nextLine();
                    this.manager.filterProductByBrandName(filterBrand);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exit is in progress...");
                    input.close();
                    return;
                default:
                    System.out.println("You have made an invalid selection!");
            }
        }
    }

    // Add new product (mobile phone or notebook)
    public void addProduct() {
        System.out.println("1 - Add Mobile Phone");
        System.out.println("2 - Add Notebook");
        System.out.print("Please, enter the operation: ");

        int operation = input.nextInt();
        input.nextLine();

        // Take common features of mobile phone and notebook
        this.manager.listBrand();
        System.out.print("Brand ID: ");
        int brandId = input.nextInt();
        input.nextLine();

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Price: ");
        Double price = input.nextDouble();
        input.nextLine();

        System.out.print("Discount Rate: ");
        Double discountRate = input.nextDouble();
        input.nextLine();

        System.out.print("Storage: ");
        String storage = input.nextLine();

        System.out.print("Screen Size: ");
        double screenSize = input.nextDouble();
        input.nextLine();

        System.out.print("ram: ");
        String ram = input.nextLine();

        System.out.print("Stock: ");
        int stock = input.nextInt();
        input.nextLine();

        // If the new product is Mobile Phone, take non-common features
        if (operation == 1) {
            String type = "Mobile Phone";

            System.out.print("Battery Power: ");
            int batterPower = input.nextInt();
            input.nextLine();

            System.out.print("Color: ");
            String color = input.nextLine();

            this.manager.addMobilePhone(type, brandId, name, price, discountRate, storage, screenSize, ram, batterPower, color, stock);
        } else if (operation == 2) {
            String type = "Notebook";

            this.manager.addNotebook(type, brandId, name, price, discountRate, storage, screenSize, ram, stock);
        } else {
            System.out.println("You have made an invalid selection!");
        }
    }

    // Add sample datas to the system
    private static void addSampleData(Manager manager) {
        manager.addMobilePhone("Mobile Phone", 1, "Samsung Galaxy Z Fold5", 89999, 15, "1 TB", 6.2, "12 GB", 4400, "Black", 5500);
        manager.addMobilePhone("Mobile Phone", 1, "Samsung Galaxy Z Fold5 Test", 92000, 10, "1 TB", 6.2, "16 GB", 4400, "Space Gray", 3200);
        manager.addMobilePhone("Mobile Phone", 3, "Iphone 15 Pro Max", 96000, 12, "1 TB", 6.7, "8 GB", 4852, "Natural Titanium", 4000);
        manager.addMobilePhone("Mobile Phone", 4, "Huawei Mate X3", 89998.80, 10, "512 GB", 6.4, "12 GB", 4800, "Green", 2000);
        manager.addMobilePhone("Mobile Phone", 8, "Xiaomi 14 Ultra", 69499, 8, "512 GB", 6.73, "16 GB", 5000, "White", 6200);

        manager.addNotebook("Notebook", 6, "Asus Rog Strix Scar 18", 264041.53, 5, "4 TB", 18, "96 GB", 1000);
        manager.addNotebook("Notebook", 7, "Hp Omen 17-CK2003NT", 239465, 7, "1 TB", 17.3, "64 GB", 750);
        manager.addNotebook("Notebook", 2, "Lenovo Thinkpad Mws P16 V2", 224419.99, 6, "4 TB", 16, "192 GB", 800);
        manager.addNotebook("Notebook", 9, "Monster Markut M7 V6.2.2", 210499, 9, "2 TB", 17.3, "64 GB", 900);
    }
}