public class arrayOfObjectsCar {
    public static void main(String[] args) {

/*        arrayOfObjectClassCar car1 = new arrayOfObjectClassCar("Mustang", "Red");
        arrayOfObjectClassCar car2 = new arrayOfObjectClassCar("Corvette", "Blue");
        arrayOfObjectClassCar car3 = new arrayOfObjectClassCar("Charger", "Yellow");

        arrayOfObjectClassCar[] cars = {car1, car2, car3};*/

        arrayOfObjectClassCar[] cars = {new arrayOfObjectClassCar("Mustang", "Red"),
                                        new arrayOfObjectClassCar("Corvette", "Blue"),
                                        new arrayOfObjectClassCar("Charger", "Yellow")};

       for(arrayOfObjectClassCar car : cars){
           car.drive();

       }

    }
}
