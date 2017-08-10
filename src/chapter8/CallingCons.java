package chapter8;

class G {
    G() {
        System.out.println("Inside G constructor.");
    }
}

class D extends G{
    D() {
        System.out.println("Inside D constructor.");
    }
}

class E extends D{
    E() {
        System.out.println("Inside E constructor.");
    }
}

class  CallingCons {
    public static void main(String[] args) {
        E e = new E();
    }
}