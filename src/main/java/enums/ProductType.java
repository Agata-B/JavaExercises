package enums;

public enum ProductType {

    FRUITS("Fruits", 001),
    VEGETABLES("Vegetables", 002),
    MEAT("Meat", 003),
    JUICE("Juice", 004);


    private final String name;
    private final int code;

    ProductType(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", code: " + code;
    }
}
