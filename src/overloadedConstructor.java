public class overloadedConstructor {
    public static void main(String[] args){
        /*
        * Overloaded Constructor
        *   - Allow a class to have multiple constructors
        *   - with different parameter lists
        *   - Enable objects to be initialized in various ways.
        * */

        overloadedConstructorUser user1 = new overloadedConstructorUser("Spongebob");

        System.out.println(user1.userName);
        System.out.println(user1.email);
        System.out.println(user1.age);
    }
}
