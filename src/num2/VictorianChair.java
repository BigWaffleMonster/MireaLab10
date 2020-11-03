package num2;

public class VictorianChair implements Chair{
    private int age;

    public int getAge() {
        return age;
    }

    VictorianChair(int a){
        age = a;
    }

    @Override
    public String toString() {
        return "VictorianChair";
    }
}
