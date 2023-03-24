import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class DoublyLinkedListTest {

    @Test
    public void testConstructor() {
        DoublyLinkedList<Album> dll = new DoublyLinkedList<>();
        assertNull(dll.head);
        assertNull(dll.tail);
    }

    @Test
    public void testAppend() {
        DoublyLinkedList<Album> dll = new DoublyLinkedList<>();
        assertNull(dll.head);
        assertNull(dll.tail);
        Album a1 = new Album(1,(new ArrayList<String>(List.of("The Beatles", "Cavetown"))),"An Ocean of Blue", 14);
        dll.append(a1);
        assertEquals(a1, dll.head.album);
        assertEquals(dll.tail.album, a1);
        Album a2 = new Album(2,(new ArrayList<String>(List.of("Teal Orchids", "The Runaways"))),"Parkbench UpsideDown", 8);
        dll.append(a2);
        assertEquals(a2, dll.head.next.album);
        assertEquals(dll.tail.album, a2);
    }
    @Test
    public void testInsertAtSpot() {
        DoublyLinkedList<Album> dll = new DoublyLinkedList<>();
        assertNull(dll.head);
        assertNull(dll.tail);
        Album a1 = new Album(1,(new ArrayList<String>(List.of("The Beatles", "Cavetown"))),"An Ocean of Blue", 14);
        Album a2 = new Album(2,(new ArrayList<String>(List.of("Teal Orchids", "The Runaways"))),"Parkbench UpsideDown", 8);
        Album a3 = new Album(3,(new ArrayList<String>(List.of("PostModern Jukebox"))),"Overalls", 3);
        Album a4 = new Album(4,(new ArrayList<String>(List.of("Watsky"))),"Intention", 9);
        Album a5 = new Album(5,(new ArrayList<String>(List.of("Owl City", "Nate Reuss"))),"Strawberry Avalanche", 18);
        Album a6 = new Album(6,(new ArrayList<String>(List.of("T. Swift", "Nate Reuss"))),"Avalanche of Power", 12);
        dll.append(a1);
        dll.append(a2);
        dll.insertAtSpot(1, a3);
        assertEquals(dll.tail.album, dll.head.next.next.album);
        dll.insertAtSpot(0, a4);
        assertEquals(a4, dll.head.album);
        dll.insertAtSpot(4, a5);
        assertEquals(a5 , dll.tail.album);
        dll.insertAtSpot(5, a6);
        assertEquals(a6 , dll.tail.album);
        assertEquals(a4 , dll.head.album);
        assertEquals(a1 , dll.head.next.next.album);
    }
}
