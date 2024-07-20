package observerdesign;

public class Demo {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber atul = new Subscriber("Atul");
        channel.subscriber(atul);

        Subscriber amit = new Subscriber("Amit");
        channel.subscriber(amit);
        channel.newVideoUploaded("Lear Design Pattern");
        channel.newVideoUploaded("Lear Angular");
    }
}
