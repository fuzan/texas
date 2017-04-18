package communication;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TexasEvent {
    BettingOperation operation;
    DealerOperation dealerOperation;
    Integer amount;
    Integer currentPosition;
}
