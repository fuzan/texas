package communication.message;

import entity.Card;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
public class DealerCardsMessage {
    Map<Integer, List<Card>> cards;
    Integer nextPosition;
}
