package communication;

import communication.protocol.TexasPublisher;

import java.util.concurrent.Callable;
import java.util.function.Function;

public interface MessageBus<T> {

    //publish a message to message bus async
    boolean publishToMessageBus(TexasPublisher publisher, T event);

    // subscribe an event, and consume it
    void subscribeToEvent(T event, Function<T, Callable> action);
}
