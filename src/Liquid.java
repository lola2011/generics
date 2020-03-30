public class Liquid<T> {
private T value;

    public Liquid(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return (String) value;
    }

    public Liquid() {
    }
}

