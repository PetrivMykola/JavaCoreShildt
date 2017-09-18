package chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (Exception e) {
            System.out.println("Generic Exception catch." + e);
        }
        /*This catch is never reached because
        ArithmeticException is a subclass of Exception.*/

        //catch (ArithmeticException e){
          //  System.out.println("This is nevee reached");
        //}
    }
}
