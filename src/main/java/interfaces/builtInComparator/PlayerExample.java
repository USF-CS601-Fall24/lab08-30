package interfaces.builtInComparator;

import java.util.*;

// Create two classes that implement  the Comparator interface:
// 1) one that compares players by batting average (call it ComparatorByBattingAverage)
// (scores within eps = 0.01 are considered equal).
// 2) one that compares players by name (call it ComparatorByName)
// Use each of them to sort the list of players below
public class PlayerExample {
    public static void main(String[] args) {
        Player p1 = new Player("A", 0.367);
        Player p2 = new Player("B", 0.312);
        Player p3 = new Player("C", 0.389);

        List<Player> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // Call the sorting method in Collections, passing a comparator by batting average; print the result
        // Call the sorting method in Collections, passing a comparator by name; Print the result
        // FILL IN CODE

    }
}
