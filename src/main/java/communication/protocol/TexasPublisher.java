package communication.protocol;

public interface TexasPublisher<T> {
    boolean publishToQueue(T Event);
}
