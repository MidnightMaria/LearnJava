class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

public class ConstructorFlow {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}