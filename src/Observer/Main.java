package Observer;

public class Main {
    public static void main(String[] args) {
        Subscriber loser = new Subscriber("JustAGuy:)");
        Subscriber jeremy = new Subscriber("XxJeremyTheGreat5000xX");

        Blog techBlog = new Blog();
        Blog foodBlog = new Blog();

        techBlog.addSubscriber(loser);
        techBlog.addSubscriber(jeremy);
        foodBlog.addSubscriber(loser);
        foodBlog.addSubscriber(jeremy);

        techBlog.publishArticle("5 Quick Recipes for Busy Weeknights!");
        foodBlog.publishArticle("5 Useful Tips For Covering Up Bloody Crime Scenes!");
    }
}
