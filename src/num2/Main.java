package num2;

public class Main {
    public static void main(String[] args) {
        Client c = new Client();
        Chair ch = new MagicChair();
        c.setChair(ch);
        c.sit();
    }
}
