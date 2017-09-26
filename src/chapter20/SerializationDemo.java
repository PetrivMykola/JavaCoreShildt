package chapter20;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        //Object serialization

        try (ObjectOutputStream objOStr =
                     new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass object1 = new MyClass("Hello", -584, 2.7);
            System.out.println("object1: " + object1);

            objOStr.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Exception during serization: " + e);
        }

        try (ObjectInputStream objIStr =
                     new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass) objIStr.readObject();
            System.out.println("object2: " + object2);

        } catch (Exception e) {
            System.out.println("Exception during serization: " + e);
        }
    }
}
         class MyClass implements Serializable {
            String s;
            int i;
            double d;

            MyClass(String s, int i, double d) {
                this.s = s;
                this.i = i;
                this.d = d;
            }

           public  String toString() {
                return "s= "+ s + "; i=" + i + "; d= " + d;
            }
        }



