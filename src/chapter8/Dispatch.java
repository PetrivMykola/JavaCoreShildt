package chapter8;

 class Aa {
     void callme() {
         System.out.println("Inside Aa callme method");
     }
 }

 class Ab extends Aa{
     //override callme
     void callme() {
         System.out.println("Inside Ab callme method");
     }
 }
 class Ac extends Aa{
     void callme() {
         System.out.println("Inside Ac callme method");
     }
 }

public class Dispatch {
    public static void main(String[] args) {
        Aa a = new Aa();
        Ab b = new Ab();
        Ac c = new Ac();

        Aa r; // obtain a reference of type A

        r = a; // r refers to an Aa object
        r.callme(); // calls Aa version of callme

        r = b; // r refers to a Ab object
        r.callme(); // calls Ab version of callme

        r = c; // r refers to a Ac object
        r.callme();
    }
 }
