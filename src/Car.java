public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;
    private String regCode;

    public int getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }
    public String getModel() {
        return model;
    }
    public String getRegCode() {
        return regCode;
    }

    public Car(int id, String brand, String model, int year, String color, int price, String regCode) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regCode = regCode;
    }

    public String toString(){
        return "id: " + Integer.toString(this.id) +
                "\nbrand: "  + this.brand +
                ", "  + this.model+
                "\nyear: "  + Integer.toString(this.year) +
                "\ncolor: "  + this.color +
                ", price: "  + Integer.toString(this.price) +
                ", regCode: "  + this.regCode + "\n";

    }

}
