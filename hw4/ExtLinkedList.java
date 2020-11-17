
/**
 * Write a description of class ExtLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class ExtLinkedList<E> extends LinkedList<E>
{
    
    /*
     * create a new linked list and add to that 
     */
  public ExtLinkedList<E> evenList()
  {
      ExtLinkedList<E> link2 = new ExtLinkedList<>();
      int number = 0 ;
      if(!isEmpty())
      {
           for(int i = 0; i<this.size();i+=2)
           {
               E val = get(i);
               link2.add(val);
            }
            return link2;
        }
        else
        {
            System.out.println("LIST IS EMPTY");
            return null;
        }
    }
   public ExtLinkedList<E> intersect(ExtLinkedList<E> eli)
   {
       ExtLinkedList<E> newList = new ExtLinkedList<>();
       if(!isEmpty())
       {
       for(int i = 0; i<this.size();i++)
       {
           for(int x = 0 ; x< eli.size(); x++)
           {
               if(get(i).equals(eli.get(x)))
               {
                   E val = get(i);
                   if(!newList.contains(val))
                   newList.add(val);
                }
            }
            
        }
    }
   else
   {
       System.out.println( "the list is empty");
    }
    return newList;
}

    
   public static void main(String []args)
   {
       ExtLinkedList<Integer> numbers = new ExtLinkedList<>();
      // numbers.add(1);
       numbers.add(1);
       numbers.add(3);
       numbers.add(4);
       numbers.add(4);
       numbers.add(4);
       numbers.add(6);
       numbers.add(47);
       
      System.out.println(numbers.evenList());
       
      ExtLinkedList<Integer> nums = new ExtLinkedList<>();
      // numbers.add(1);
       nums.add(1);
       nums.add(4);
       nums.add(5);
       nums.add(7);
       System.out.println(numbers.intersect(nums));
     
       
    }   
       
}
