import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest
{
    @Test
    public void removeEmptySize ()
    {
        Queue q = new Queue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        int expected = 0;
        int actual = q.getSize();
        assertEquals(expected, actual);
    }
    @Test
    public void removeEmptyHead ()
    {
        Queue q = new Queue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        String expected = null;
        String actual = q.peekHead();
        assertEquals(expected, actual);
    }
    @Test
    public void removeEmptyTail ()
    {
        Queue q = new Queue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        String expected = null;
        String actual = q.peekTail();
        assertEquals(expected, actual);
    }
    @Test
    public void addOnceSize ()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        int expected = 1;
        int actual = q.getSize();
        assertEquals(expected, actual);
    }
    @Test
    public void addOnceTail()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        String expected = "Sofia";
        String actual = q.peekTail();
        assertEquals(expected, actual);
    }
    @Test
    public void addOnceHead()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        String expected = "Sofia";
        String actual = q.peekHead();
        assertEquals(expected, actual);
    }
    @Test
    public void addTwiceSize()
    {
       Queue q = new Queue();
       q.enqueue("Sofia");
       q.enqueue("Jayden");
       int expected = 2;
       int actual = q.getSize();
       assertEquals(expected, actual);
    }
    @Test
    public void addTwiceTail()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        String actual = q.peekTail();
        String expected = "Jayden";
        assertEquals(expected, actual);
    }
    @Test
    public void addTwiceHead()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        String actual = q.peekHead();
        String expected = "Sofia";
        assertEquals(expected, actual);
    }
    @Test
    public void addRemoveOnceSize()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.dequeue();
        int expected = 0;
        int actual = q.getSize();
        assertEquals(expected, actual);
    }
    @Test
    public void addRemoveOnceTail()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.dequeue();
        String expected = null;
        String actual = q.peekTail();
        assertEquals(null, actual);
    }
    @Test
    public void addRemoveOnceHead()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.dequeue();
        String expected = null;
        String actual = q.peekHead();
        assertEquals(null, actual);
    }
    @Test
    public void addTwiceRemoveOnceSize()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        q.dequeue();
        int expected = 1;
        int actual = q.getSize();
        assertEquals(expected, actual);
    }
    @Test
    public void addTwiceRemoveOnceTail()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        q.dequeue();
        String expected = "Jayden";
        String actual = q.peekTail();
        assertEquals(expected, actual);
    }
    @Test
    public void addTwiceRemoveOnceHead()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        q.dequeue();
        String expected = "Jayden";
        String actual = q.peekHead();
        assertEquals(expected, actual);
    }
    @Test
    public void addTwiceRemoveTwiceSize()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        q.dequeue();
        q.dequeue();
        int expected = 0;
        int actual = q.getSize();
        assertEquals(expected, actual);
    }
    @Test
    public void addTwiceRemoveTwiceTail()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        q.dequeue();
        q.dequeue();
        String actual = q.peekTail();
        String expected = null;
        assertEquals(expected, actual);
    }
    @Test
    public void addTwiceRemoveTwiceHead()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        q.dequeue();
        q.dequeue();
        String actual = q.peekHead();
        String expected = null;
        assertEquals(expected, actual);
    }
    @Test
    public void addRemoveAddSize()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.dequeue();
        q.enqueue("Jayden");
        int actual = q.getSize();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void addRemoveAddTail()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.dequeue();
        q.enqueue("Jayden");
        String expected = "Jayden";
        String actual = q.peekTail();
        assertEquals(expected, actual);
    }
    @Test
    public void addRemoveAddHead()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.dequeue();
        q.enqueue("Jayden");
        String expected = "Jayden";
        String actual = q.peekHead();
        assertEquals(expected, actual);
    }
    @Test
    public void addRemoveRepeatSize()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.dequeue();
        q.enqueue("Jayden");
        q.dequeue();
        int expected = 0;
        int actual = q.getSize();
        assertEquals(expected, actual);
    }
    @Test
    public void addRemoveRepeatTail()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.dequeue();
        q.enqueue("Jayden");
        q.dequeue();
        String expected = null;
        String actual = q.peekTail();
        assertEquals(expected, actual);
    }
    @Test
    public void addRemoveRepeatHead()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.dequeue();
        q.enqueue("Jayden");
        q.dequeue();
        String expected = null;
        String actual = q.peekHead();
        assertEquals(expected, actual);
    }
    @Test
    public void randomV1Size()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        q.enqueue("Ryan");
        q.enqueue("George");
        int expected = 4;
        int actual = q.getSize();
        assertEquals(expected, actual);
    }
    @Test
    public void randomV1Tail()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        q.enqueue("Ryan");
        q.enqueue("George");
        String expected = "George";
        String actual = q.peekTail();
    }
    @Test
    public void randomV1Head()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.enqueue("Jayden");
        q.enqueue("Ryan");
        q.enqueue("George");
        String expected = "Sofia";
        String actual = q.peekHead();
    }









}