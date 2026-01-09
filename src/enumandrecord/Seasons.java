package enumandrecord;

public enum Seasons implements MyInterface {
    WINTER("cold") {
        @Override
        public void method() {
            System.out.println("Winter method");
        }
    }, SPRING("raining"),
    SUMMER("warm"),
    AUTUMN("windy");

    private final String description;

    Seasons(String description) {
        this.description = description;
    }

    public void printDescription() {
        System.out.println(description);
    }

    @Override
    public void method() {
        System.out.println("umumi");
    }

}
