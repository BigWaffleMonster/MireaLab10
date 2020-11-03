package num2;

public class FunctionalChair implements Chair{
    int c = 0;
    public int sum(int a, int b){
        c = a + b;
        return a+b;
    }

    @Override
    public String toString() {
        return "FunctionalChair";
    }
}
