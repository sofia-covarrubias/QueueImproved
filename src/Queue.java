public class Queue
{
    private Node head;
    private Node tail;
    private int size;

    public Queue ()
    {
        head = null;
        tail = null;
        size = 0;
    } // end Queue constructor

    public void enqueue (String newData)
    {
        tail = new Node(newData, tail);
        if (size == 0)
        {
            head = tail;
        } // end if
        size++;
    } // end enqueue

    public void dequeue ()
    {
        Node temp;
        Node position = tail;
        if (size > 2)
        {
            for (int i = 0; i < (size - 2); i++) {
                position.getLink();
            }
            temp = position;
            position.getLink();
            head = temp;
        }
        else if (size == 1)
        {
            head = null;
            tail = null;
        }
        else if (size == 2)
        {
            temp = position; // storing the information of the head in a temporary variable
            position = null; // the head is made null
            tail = temp;
            head = tail; // tail becomes the new head
            // might need tail = head, but who knows
        }
        size--;
        if (size < 0)
        {
            size = 0;
        }
    }

    public void show ()
    {
        Node position = tail;
        int count = 0;
        while (position.getData() != null && count < size)
        {
            System.out.println(position.getData());
            position = position.getLink();
            count++;
        }
    }

    public int getSize ()
    {
        return size;
    } // end getSize

    public String peekHead ()
    {
        if (head == null)
        {
            return null;
        }
        else
        {
            return head.getData();
        }
    } // end peekHead

    public String peekTail ()
    {
        if (tail == null)
        {
            return null;
        }
        else
        {
            return tail.getData();
        }
    } // end peekTail

    private class Node
    {
        private String data;
        private Node link;

        public Node (String data, Node link)
        {
            this.data = data;
            this.link = link;
        } // end Node constructor

        public String getData ()
        {
            return data;
        } // end getter
        public Node getLink ()
        {
            return link;
        } // end getter
        public void setData(String data)
        {
            this.data = data;
        }

        public String toString ()
        {
            return "Data: " + data + " is linked to " + link;
        } // end toString
    } // end Node class
} // end Queue class