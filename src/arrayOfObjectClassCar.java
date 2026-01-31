public class arrayOfObjectClassCar {
    /*
    * Car hase following attributes
    *   - model
    *   - color
    * */

    String model;
    String color;

    /*
    * we will make a CONSTRUCTOR
    * we will pass String of mode and color
    * we will assign this. to model and color
    * */

    arrayOfObjectClassCar(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the "+ this.color +" "+ this.model);
    }
}
