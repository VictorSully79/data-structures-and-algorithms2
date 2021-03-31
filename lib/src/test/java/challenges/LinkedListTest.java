package challenges;

import challenges.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LinkedListTest {
    @Test public void firstTest () {
        LinkedList isItFilling = new LinkedList();
        isItFilling.insert("two");
        isItFilling.insert("four");
        isItFilling.insert("six");
        isItFilling.insert("eight");
        isItFilling.insert("Who do we appreciate?");

        isItFilling.insert("is it showing here");
        isItFilling.display();

    }
    @Test public void secondTest () {
        LinkedList filledList = new LinkedList();
        filledList.insert("two");
        filledList.insert("four");
        filledList.insert("six");
        filledList.insert("eight");
        filledList.insert("Who do we appreciate?");
        boolean equalsNode = filledList.includes("six");
        assertTrue(equalsNode);


    }
    @Test public void thirdTest (){
        LinkedList insertLast = new LinkedList();
        insertLast.insert("four");
        insertLast.insert("five");
        insertLast.insert("six");
        insertLast.append("one");
        insertLast.insertBefore("five", "eleven");
        insertLast.display();

    }
    @Test public void fourthTest(){
        LinkedList after = new LinkedList();
        after.insert ("one");
        after.insert("two");
        after.insert("three");
        after.insert("four");
        after.insertAfter("two", "twelve");
        after.display();

    }
}
