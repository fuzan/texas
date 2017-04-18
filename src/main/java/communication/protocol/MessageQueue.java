package communication.protocol;

public interface MessageQueue<T, EventSource> {
    void publishEvent(T event);

    T subscribeEvent(EventSource source);
}
