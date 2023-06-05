package lesson7;

public class SimpleBox<T> {
    private T value;

    public SimpleBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
