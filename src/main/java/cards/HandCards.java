package cards;

import entity.Card;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Slf4j
@Getter
@AllArgsConstructor
public class HandCards {
    private List<Card> cards;

    private HandResult handResult;

    private static class HandsComparionHelper {
        private static Optional<Combination> calculateCombination(List<Card> cards) {
            if (cards == null || cards.size() < 7)
                return Optional.empty();

            return null;
        }
    }
}
