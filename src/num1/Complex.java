package num1;

public class Complex {
    private int re;
    private int im;

    public Complex() {
        this.re = 1;
        this.im = 1;
    }

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }
}
