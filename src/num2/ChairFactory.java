package num2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair() {
        VictorianChair v = new VictorianChair(10);
        return v;
    }

    @Override
    public MagicChair createMagicChair() {
        MagicChair m = new MagicChair();
        return m;
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        FunctionalChair f = new FunctionalChair();
        return f;
    }
}
