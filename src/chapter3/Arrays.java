package chapter3;

public class Arrays {
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[5];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        System.out.println("April has " + month_days[3] + " days");
    }

}
