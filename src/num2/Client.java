package num2;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("sitting on a " + this.chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;

    }
}
