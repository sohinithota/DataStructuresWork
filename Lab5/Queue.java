import java.util.*;
public class Queue<E> extends LinkedList<E>
{
    //add at the tail of the queue
    //first is the tail 
    public void enqueue(E e)
    {
        addFirst(e);
        
    }
    
    //delete at the end of the queue and return the 
    //value that is deleted
    public E deque()
    {
        if(!isEmpty())
        {
        return removeLast();
        }
        else
        {
            System.out.println("queue is empty...");
            return null;
        }
    }
}
