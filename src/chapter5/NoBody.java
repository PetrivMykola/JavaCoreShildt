package chapter5;

public class NoBody {
    public static void main(String[] args) {
        int i = 100, j = 200;

        // find midpoint between i and j
        while(++i < --j); // no body in this loop

        System.out.println("Midpointb is " + i);
    }
}
