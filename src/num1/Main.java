package num1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory a = new ConcreteFactory();
        System.out.println(a.createComplex());
        System.out.println(a.CreateComplex(1, 3));
    }
}
