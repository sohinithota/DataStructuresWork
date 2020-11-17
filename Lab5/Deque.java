import java.util.*;
public class Deque <E> extends LinkedList<E>
{
    //head at first and tail at the last
  public void addTail(E e)
  {
      addLast(e);
    }
  public E deleteTail()
   {
       if(!isEmpty())
       {
           return removeLast();
        }
        else
        {
            System.out.println("list is empty");
            return null;
        }
   }
  public void addHead(E e)
    {
        addFirst(e);
    }
  public E deleteHead()
    {
        if(!isEmpty())
       {
           return removeFirst();
        }
        else
        {
            System.out.println("list is empty");
            return null;
        }
    }
}
