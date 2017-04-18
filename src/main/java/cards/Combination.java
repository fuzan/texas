package cards;

import entity.Card;
import entity.Color;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Combination {

    /**
     * Ten, Jack, Queen, King, Ace
     */
    Integer[] royalFlush = new Integer[]{10, 11, 12, 13, 14};

    private List<Card> cards;

    public Combination(List<Card> cards) {
        this.cards = cards;
        Collections.sort(cards, (card1, card2) -> card1.getValue() - card2.getValue());
    }

    public boolean isRoyalFlush() {
        final Color color = cards.get(0).getColor();
        final long count = IntStream.range(0, cards.size())
                .filter(i -> cards.get(i).getValue() == royalFlush[i])
                .filter(i -> cards.get(i).getColor().equals(color))
                .count();
        return count == 5;
    }

    public boolean isStraight() {
        final AtomicInteger firstValue = new AtomicInteger(cards.get(0).getValue());
        final Integer count = IntStream.range(0, cards.size())
                .map(i -> cards.get(i).getValue() - firstValue.getAndIncrement())
                .sum();
        return count == 0;
    }

    public boolean isQuad() {
        final Integer value = cards.get(0).getValue();
        final long count = IntStream.range(0, cards.size())
                .filter(i -> cards.get(i).getValue() == value)
                .count();
        return count == 4;
    }

    public boolean isFlush() {
        final Color color = cards.get(0).getColor();
        final long count = IntStream.range(0, cards.size())
                .filter(i -> cards.get(i).getColor().equals(color))
                .count();
        return count == 5;
    }

    public boolean isFullHouse() {
        final Integer firstCard = cards.get(0).getValue();
        final Integer lastCard = cards.get(cards.size()).getValue();
        final long count = IntStream.range(0, cards.size())
                .filter(i -> cards.get(i).getValue() == firstCard)
                .count();

        final long count2 = IntStream.range(0, cards.size())
                .filter(i -> cards.get(i).getValue() == lastCard)
                .count();

        return count == 2 && count2 == 3 || count == 3 && count2 == 2;
    }

    public boolean isSet() {
        final Map<Integer, AtomicInteger> countMap = new HashMap();
        cards.stream().forEach(c -> {
            countMap.putIfAbsent(c.getValue(), new AtomicInteger(0));
            countMap.get(c).getAndIncrement();
        });
        final Optional<Integer> count = countMap.entrySet().stream()
                .map(k -> k.getValue().intValue())
                .filter(v -> v == 3)
                .findAny();
        return count.get() == 1;
    }

    public Integer getHighestCard() {
        Collections.sort(cards, (card1, card2) -> card1.getValue() - card2.getValue());
        return cards.get(cards.size()).getValue();
    }
}
