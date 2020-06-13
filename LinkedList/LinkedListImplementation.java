class Node
{
    int data;
    Node next;
    Node(int data) //assigning values to the fields of node.
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    Node head = null;
    Node start;
    public void insert(int data)
    {
        //insertion at the end of the list
        if(head == null) //list is empty
        {
            head = new Node(data);
            start = head;
            head.next = null;
        }
        else //at least one node in list
        {
            head.next = new Node(data);
            head.next.next  = null;
            head = head.next;
        }
    }
}
