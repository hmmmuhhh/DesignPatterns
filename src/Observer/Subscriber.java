package Observer;

public class Subscriber {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String article) {
        System.out.println(name + " has been notified about the new article: " + article);
    }
}
