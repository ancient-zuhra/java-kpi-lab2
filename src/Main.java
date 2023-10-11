import java.util.Arrays;
import java.time.Year;

public class Main {
    public static int LIST_LENGTH = 10;
    public static Car[] setCarList(){
        Car[] carList;
        carList = new Car[LIST_LENGTH];
        carList[0] = new Car(1, "Audi", "A7", 2011, "blue", 25000, "AE2141II");
        carList[1] = new Car(2, "Citroen", "C4", 2017, "white", 10000, "AE5098TA");
        carList[2] = new Car(3, "Toyota", "RAV4", 2017, "white", 13000, "AH4151IK");
        carList[3] = new Car(4, "Audi", "A7", 2015, "black", 20000, "AH4344HH");
        carList[4] = new Car(5, "Hyundai", "Sonata", 2012, "silver", 11000, "KA1452EK");
        carList[5] = new Car(6, "Hyundai", "Elantra", 2011, "red", 8000, "BC0003KO");
        carList[6] = new Car(7, "Volkswagen", "Beetle", 2016, "blue", 12000, "AH5775TA");
        return carList;
    }
    public static void main(String[] args) {
        Car[] carList = new Car[LIST_LENGTH];
        carList = setCarList();

        System.out.println("Here is the list of all cars: ");
        for (Car car: carList){
            if (car != null) {
                System.out.println(car.toString());
            }
        }
        // task1
        String carBrand = "Audi";
        System.out.println("Here is the list of " + carBrand + " cars:");
        for (Car car: listByBrand(carBrand, carList))
                System.out.println(car.toString());
        //task2
        String carModel = "A7";
        int carAge = 10;
        System.out.println("Here is the list of " + carModel + " cars, older than "+ carAge +" years:");
        for (Car car: listByModelAndUsage(carModel, carAge, carList))
                System.out.println(car.toString());
        //task3
        int carYear = 2011;
        int carPrice = 10;
        System.out.println("Here is the list of cars released in " + carYear + ",more expensive than "+ carPrice +" dollars:");
        for (Car car: listByYearAndPrice(carYear, carPrice, carList))
                System.out.println(car.toString());
        //task4
        String carColor = "white";
        System.out.println("Here is the list of " + carBrand+" " + carModel + " cars, which are not "+ carColor + ":");
        for (Car car: listByBrandModelNotColor(carBrand, carModel, carColor, carList))
            System.out.println(car.toString());
    }
    public static Car[] listByBrand(String brand,
                                    Car[] carList){
        return Arrays.stream(carList)
                .filter(car -> car != null&&
                        car.getBrand().equals(brand))
                .toArray(Car[]::new);
    }
    public static Car[] listByModelAndUsage(String model,
                                            int age,
                                            Car[] carList){
        Year currentYear = Year.now();
        return Arrays.stream(carList)
                .filter(car -> car != null&&
                        car.getModel().equals(model)&&
                        car.getYear() - currentYear.getValue() < age)
                .toArray(Car[]::new);
    }
    public static Car[] listByBrandModelNotColor(String brand,
                                                 String model,
                                                 String color,
                                                 Car[] carList){
        return Arrays.stream(carList)
                .filter(car -> car != null&&
                        car.getModel().equals(model)&&
                        car.getBrand().equals(brand)&&
                        !car.getColor().equals(color))
                .toArray(Car[]::new);
    }
    public static Car[] listByYearAndPrice(int year,
                                                 int price,
                                                 Car[] carList){
        return Arrays.stream(carList)
                .filter(car -> car != null&&
                (car.getYear() == year)&&
                (car.getPrice() > price))
                .toArray(Car[]::new);
    }
}