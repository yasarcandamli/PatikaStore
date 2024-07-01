import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager {
    private List<Brand> brandList = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();
    private static int firstId = 1;

    public Manager() {
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
}
