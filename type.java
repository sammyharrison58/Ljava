public class type {
    private String name;
    private int value;

    public type(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        type example = new type("Example", 42);
        System.out.println(example.getName() + ": " + example.getValue());
    }

}
