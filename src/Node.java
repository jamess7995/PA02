public class Node<Album> {
    protected Album album;
    Node<Album> next;
    Node<Album> previous;

    public Node(Album album) {
        this.previous = null;
        this.album = album;
        this.next = null;
    }

    public Node() {
        next = null;
        previous = null;
    }


    @Override
    public String toString() {
        return album.toString();
    }

}