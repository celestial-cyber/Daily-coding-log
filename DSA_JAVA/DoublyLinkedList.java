public class DoublyLinkedList {

    // Node class
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    // Constructor
    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // Print list
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print reverse
    public void printReverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Get head
    public void getHead() {
        if (head == null)
            System.out.println("Head: null");
        else
            System.out.println("Head: " + head.value);
    }

    // Get tail
    public void getTail() {
        if (tail == null)
            System.out.println("Tail: null");
        else
            System.out.println("Tail: " + tail.value);
    }

    // Get length
    public void getLength() {
        System.out.println("Length: " + length);
    }

    // Append
    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        length++;
    }

    // Prepend
    public void prepend(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        length++;
    }

    // Remove Last
    public Node removeLast() {

        if (length == 0)
            return null;

        Node temp = tail;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }

        length--;

        return temp;
    }

    // Remove First
    public Node removeFirst() {

        if (length == 0)
            return null;

        Node temp = head;

        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }

        length--;

        return temp;
    }

    // Get node by index
    public Node get(int index) {

        if (index < 0 || index >= length) {
            return null;
        }

        Node temp;

        if (index < length / 2) {
            temp = head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

        } else {
            temp = tail;

            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }

        return temp;
    }

    // Set value
    public boolean set(int index, int value) {

        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }

    // Insert
    public boolean insert(int index, int value) {

        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);

        Node before = get(index - 1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;

        before.next = newNode;
        after.prev = newNode;

        length++;

        return true;
    }

    // Remove by index
    public Node remove(int index) {

        if (index < 0 || index >= length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == length - 1) {
            return removeLast();
        }

        Node temp = get(index);

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        temp.next = null;
        temp.prev = null;

        length--;

        return temp;
    }

    // Reverse List
    public void reverse() {

        Node temp = null;
        Node current = head;

        while (current != null) {

            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

    // Check if value exists
    public boolean contains(int value) {

        Node temp = head;

        while (temp != null) {

            if (temp.value == value) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // Partition List
    public void partitionList(int x) {

        if (head == null)
            return;

        Node lessHead = null;
        Node lessTail = null;

        Node greaterHead = null;
        Node greaterTail = null;

        Node current = head;

        while (current != null) {

            Node nextNode = current.next;

            current.next = null;
            current.prev = null;

            if (current.value < x) {

                if (lessHead == null) {
                    lessHead = current;
                    lessTail = current;
                } else {
                    lessTail.next = current;
                    current.prev = lessTail;
                    lessTail = current;
                }

            } else {

                if (greaterHead == null) {
                    greaterHead = current;
                    greaterTail = current;
                } else {
                    greaterTail.next = current;
                    current.prev = greaterTail;
                    greaterTail = current;
                }
            }

            current = nextNode;
        }

        if (lessHead == null) {
            head = greaterHead;
            tail = greaterTail;
        } else {
            head = lessHead;
            lessTail.next = greaterHead;

            if (greaterHead != null) {
                greaterHead.prev = lessTail;
            }

            tail = (greaterTail != null) ? greaterTail : lessTail;
        }
    }

    // Main Method
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList(10);

        dll.append(20);
        dll.append(5);
        dll.append(30);
        dll.append(15);

        System.out.println("Original List:");
        dll.printList();

        dll.partitionList(15);

        System.out.println("After Partition:");
        dll.printList();

        System.out.println("Contains 20? " + dll.contains(20));

        dll.reverse();

        System.out.println("After Reverse:");
        dll.printList();

        dll.getHead();
        dll.getTail();
        dll.getLength();
    }
}