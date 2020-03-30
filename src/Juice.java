public class Juice<Z> extends Liquid {
private Z type;
    @Override
    public String toString() {
        return type + " juice";
    }

    public Z getType() {
        return type;
    }

    public Juice( Z type) {
        this.type = type;
    }
}
