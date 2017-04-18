package cards;

import entity.Card;
import entity.Color;
import junit.framework.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CombinationTest {

    private List<Card> cards = new ArrayList<>();
    private List<Card> none_flush_straight_cards = new ArrayList<>();

    @BeforeMethod
    public void setUp() throws Exception {
        Card c1 = new Card(Color.CLUB, "six");
        Card c2 = new Card(Color.CLUB, "seven");
        Card c3 = new Card(Color.CLUB, "eight");
        Card c4 = new Card(Color.CLUB, "nine");
        Card c5 = new Card(Color.CLUB, "ten");

        cards.add(c1);
        cards.add(c2);
        cards.add(c3);
        cards.add(c4);
        cards.add(c5);

        Card c6 = new Card(Color.DIAMOND, "J");
        none_flush_straight_cards.add(c1);
        none_flush_straight_cards.add(c2);
        none_flush_straight_cards.add(c3);
        none_flush_straight_cards.add(c4);
        none_flush_straight_cards.add(c6);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        cards.clear();
        none_flush_straight_cards.clear();
    }

    @Test
    public void testIsRoyalFlush() throws Exception {

    }

    @Test
    public void testIsStraight() throws Exception {
        Combination combination = new Combination(cards);
        Assert.assertTrue(combination.isStraight());

        combination = new Combination(none_flush_straight_cards);
        Assert.assertFalse(combination.isStraight());
    }

    @Test
    public void testIsQuad() throws Exception {

    }

    @Test
    public void testIsFlush() throws Exception {
        Combination combination = new Combination(cards);
        Assert.assertTrue(combination.isFlush());

        combination = new Combination(none_flush_straight_cards);
        Assert.assertFalse(combination.isFlush());
    }

    @Test
    public void testIsFullHouse() throws Exception {

    }

    @Test
    public void testIsSet() throws Exception {

    }

}