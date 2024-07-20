package observerdesign;

public interface Subject {
    void subscriber(Observer ob);
    void unsubscriber(Observer ob);
    void newVideoUploaded(String title);
}
