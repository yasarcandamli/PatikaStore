public class MobilePhone extends Product {
    private int batteryPower;
    private String color;

    public MobilePhone(int id, String type, Brand brand, String name, double price, double discountRate, int storage, double screenSize, int ram, int batteryPower, String color, int stock) {
        super(id, type, brand, name, price, discountRate, storage, screenSize, ram, stock);
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
