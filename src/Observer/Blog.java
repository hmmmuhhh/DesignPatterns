package Observer;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private String article;
    private final List<Subscriber> subscribers;

    public Blog() {
        subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishArticle(String article) {
        this.article = article;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(article);
        }
    }
}
