package num1;

public class ConcreteFactory implements CompexAbstractFactory {
    @Override
    public Complex createComplex() {
        Complex b = new Complex();
        return b;
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        Complex c = new Complex(real, image);
        return c;
    }
}
