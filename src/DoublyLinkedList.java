public class DoublyLinkedList<T extends Comparable<T>> {
    Node<Album> head = null;
    Node<Album> tail = null;
    Node<Album> tempNode = null;
    int listLength = 0;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Node append(Album album) {
        // create the new node
        Node toAppend = new Node(album);
        if (this.head == null) {
            this.head = toAppend;
            this.tail = toAppend;
        } else {
            this.tail.next = toAppend;
            toAppend.previous = this.tail;
            this.tail = toAppend;
//            Node lastNode = this.head;
//            while (lastNode.next != null) {
//                lastNode = lastNode.next;
//            }
//            lastNode.next = toAppend;
        }
        listLength++;
        return toAppend;
        return nothing;
    }
    //hello world!

    public Node insertAtSpot(int spot, Album album) {
        // create the new node
        if (spot > listLength || spot < 0) {
            throw new IllegalArgumentException("You must choose an index within the list's length. Head = 0, next item = 1.");
        }
        else {
            Node toAppend = new Node(album);
            Node tempNode = this.head;
            if (spot == 0) {
                this.head.previous = toAppend;
                toAppend.next = head;
                this.head.next = tempNode;
                this.head = toAppend;
            } else {
                while (spot > 0) {
                    tempNode = tempNode.next;
                    spot--;
                }
                toAppend.previous = tempNode.previous;
                toAppend.next = tempNode;
                Node<Album> previousNode = tempNode.previous;
                tempNode.previous = toAppend;
                previousNode.next = toAppend;
            }
            this.tail = this.tail.next;
            listLength++;
            return toAppend;
        }
    }


}
