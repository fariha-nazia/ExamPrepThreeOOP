public class overloadedConstructorUser {
    /*
    * User hase
    *    - user name
    *    - email
    *    - age
    * */

//    Declaring the variables
        String userName;
        String email;
        int age;

    overloadedConstructorUser(String userName){
        this.userName = userName;
        this.email = "Not provided";
        this.age = 0;
    }
}
