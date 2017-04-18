package communication.protocol;

import java.util.concurrent.Callable;

public interface TexasSubs<T> {
    void subs(T event);

    void registerHandler(T event, Callable<T> eventHandler);
}
