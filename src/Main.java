//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car = new Car();

//        car.isRunning = true;
//        System.out.println(car.model);
//        System.out.println(car.year);
//        System.out.println(car.make);
//        System.out.println(car.price);
//        System.out.println(car.isRunning);

        System.out.println(car.isRunning);

        car.start();
        System.out.println(car.isRunning);

        car.stop();
        System.out.println(car.isRunning);

        car.drive();

        car.brake();


    }
}