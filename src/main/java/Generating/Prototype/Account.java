package Generating.Prototype;

public abstract class Account implements Cloneable {

    // Переопределять с осторожностью!!!
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    abstract String accountType();
}
