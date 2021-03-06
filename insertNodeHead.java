// Solution by SHoumik Roychowdhury

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        
        SinglyLinkedListNode head = new SinglyLinkedListNode(data);
        SinglyLinkedListNode curr = head;
        curr.next = llist;
        return head;

    }

