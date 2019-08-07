import org.junit.Test;

import static org.junit.Assert.*;

public class CumulativePoetryTest {

    @Test
    public void printTillDayTestOne() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString= "This is the house that Jack built.\n";
        assertEquals(cp.printTillDay(1),testString);
    }

    @Test
    public void printTillDayTestTwo() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString= "This is the malth that lay in\n"+
        "the house that Jack built.\n";
        assertEquals(cp.printTillDay(2),testString);
    }

    @Test
    public void printTillDayTestThree() {
        CumulativePoetry cp=new CumulativePoetry();

        String testString= "This is the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n";

        assertEquals(cp.printTillDay(3),testString);
    }

    @Test
    public void printTillDayTestFour() {
        CumulativePoetry cp=new CumulativePoetry();

        String testString= "This is the cat that killed\n"+
                "the rat that ate\n"+
                "the malth that lay in\n"+
                "the house that Jack built.\n";

        assertEquals(cp.printTillDay(4),testString);
    }

    @Test
    public void printTillDayTestFive() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString= "This is the dog that worried\n"+
        "the cat that killed\n"+
        "the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n";

        assertEquals(cp.printTillDay(5),testString);
    }

    @Test
    public void printTillDayTestSix() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString="This is that cow with the crumpled horn that tossed\n"+
                "the dog that worried\n"+
                "the cat that killed\n"+
                "the rat that ate\n"+
                "the malth that lay in\n"+
                "the house that Jack built.\n";

        assertEquals(cp.printTillDay(6),testString);
    }

    @Test
    public void printTillDayTestSeven() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString= "This is the maiden all forlorn that milked\n"+
                "that cow with the crumpled horn that tossed\n"+
                "the dog that worried\n"+
                "the cat that killed\n"+
                "the rat that ate\n"+
                "the malth that lay in\n"+
                "the house that Jack built.\n";

        assertEquals(cp.printTillDay(7),testString);
    }

   @Test
    public void printTillDayTestEight() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString= "This is the man all tattered and torn that kissed\n"+
                "the maiden all forlorn that milked\n"+
                "that cow with the crumpled horn that tossed\n"+
                "the dog that worried\n"+
                "the cat that killed\n"+
                "the rat that ate\n"+
                "the malth that lay in\n"+
                "the house that Jack built.\n";

        assertEquals(cp.printTillDay(8),testString);
    }

    @Test
    public void printTillDayTestNine() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString= "This is the priest all shaven and shorn that married\n"+
                "the man all tattered and torn that kissed\n"+
                "the maiden all forlorn that milked\n"+
                "that cow with the crumpled horn that tossed\n"+
                "the dog that worried\n"+
                "the cat that killed\n"+
                "the rat that ate\n"+
                "the malth that lay in\n"+
                "the house that Jack built.\n";

        assertEquals(cp.printTillDay(9),testString);
    }

    @Test
    public void printTillDayTestTen() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString= "This is the rooster that crowed in the morn that woke\n"+
                "the priest all shaven and shorn that married\n"+
                "the man all tattered and torn that kissed\n"+
                "the maiden all forlorn that milked\n"+
                "that cow with the crumpled horn that tossed\n"+
                "the dog that worried\n"+
                "the cat that killed\n"+
                "the rat that ate\n"+
                "the malth that lay in\n"+
                "the house that Jack built.\n";

        assertEquals(cp.printTillDay(10),testString);
    }

    @Test
    public void printTillDayTestEleven() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString= "This is the farmer sowing his corn that kept\n"+
                "the rooster that crowed in the morn that woke\n"+
                "the priest all shaven and shorn that married\n"+
                "the man all tattered and torn that kissed\n"+
                "the maiden all forlorn that milked\n"+
                "that cow with the crumpled horn that tossed\n"+
                "the dog that worried\n"+
                "the cat that killed\n"+
                "the rat that ate\n"+
                "the malth that lay in\n"+
                "the house that Jack built.\n";

        assertEquals(cp.printTillDay(11),testString);
    }

    @Test
    public void printTillDayTestTwelve() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString= "This is the horse and the hound and the horn that belonged to\n"+
                "the farmer sowing his corn that kept\n"+
                "the rooster that crowed in the morn that woke\n"+
                "the priest all shaven and shorn that married\n"+
                "the man all tattered and torn that kissed\n"+
                "the maiden all forlorn that milked\n"+
                "that cow with the crumpled horn that tossed\n"+
                "the dog that worried\n"+
                "the cat that killed\n"+
                "the rat that ate\n"+
                "the malth that lay in\n"+
                "the house that Jack built.\n";

        assertEquals(cp.printTillDay(12),testString);
    }
    @Test
    public void printRecite() {
        CumulativePoetry cp=new CumulativePoetry();
        String testString= "Day 1\n"+
        "This is the house that Jack built.\n"+
                "Day 2\n"+
        "This is the malth that lay in\n"+
        "the house that Jack built.\n"+
                "Day 3\n"+
        "This is the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n"+
                "Day 4\n"+
        "This is the cat that killed\n"+
        "the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n"+
                "Day 5\n"+
        "This is the dog that worried\n"+
        "the cat that killed\n"+
        "the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n"+
                "Day 6\n"+
        "This is that cow with the crumpled horn that tossed\n"+
        "the dog that worried\n"+
        "the cat that killed\n"+
        "the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n"+
                "Day 7\n"+
        "This is the maiden all forlorn that milked\n"+
        "that cow with the crumpled horn that tossed\n"+
        "the dog that worried\n"+
        "the cat that killed\n"+
        "the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n"+
                "Day 8\n"+
        "This is the man all tattered and torn that kissed\n"+
        "the maiden all forlorn that milked\n"+
        "that cow with the crumpled horn that tossed\n"+
        "the dog that worried\n"+
        "the cat that killed\n"+
        "the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n"+
                "Day 9\n"+
        "This is the priest all shaven and shorn that married\n"+
        "the man all tattered and torn that kissed\n"+
        "the maiden all forlorn that milked\n"+
        "that cow with the crumpled horn that tossed\n"+
        "the dog that worried\n"+
        "the cat that killed\n"+
        "the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n"+
                "Day 10\n"+
        "This is the rooster that crowed in the morn that woke\n"+
        "the priest all shaven and shorn that married\n"+
        "the man all tattered and torn that kissed\n"+
        "the maiden all forlorn that milked\n"+
        "that cow with the crumpled horn that tossed\n"+
        "the dog that worried\n"+
        "the cat that killed\n"+
        "the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n"+
                "Day 11\n"+
        "This is the farmer sowing his corn that kept\n"+
        "the rooster that crowed in the morn that woke\n"+
        "the priest all shaven and shorn that married\n"+
        "the man all tattered and torn that kissed\n"+
        "the maiden all forlorn that milked\n"+
        "that cow with the crumpled horn that tossed\n"+
        "the dog that worried\n"+
        "the cat that killed\n"+
        "the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n"+
                "Day 12\n"+
        "This is the horse and the hound and the horn that belonged to\n"+
        "the farmer sowing his corn that kept\n"+
        "the rooster that crowed in the morn that woke\n"+
        "the priest all shaven and shorn that married\n"+
        "the man all tattered and torn that kissed\n"+
        "the maiden all forlorn that milked\n"+
        "that cow with the crumpled horn that tossed\n"+
        "the dog that worried\n"+
        "the cat that killed\n"+
        "the rat that ate\n"+
        "the malth that lay in\n"+
        "the house that Jack built.\n";

        assertEquals(cp.printRecite(),testString);
    }


}
