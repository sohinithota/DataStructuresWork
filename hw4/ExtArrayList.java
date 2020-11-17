import java.util.*;
//import java.util.ArrayList;
public class ExtArrayList<E> extends ArrayList<E>
{
    public ExtArrayList<E> append(ExtArrayList<E> ea)
       {
           if(!isEmpty())
        {
            for(int i =0; i <ea.size();i++)
            
              this.add(ea.get(i));
              //System.out.println(x);
            
           return this;
        }
        else
        {
            System.out.println("LIST IS EMPTY");
            return null;
        }
    }
     public boolean consecutivePair(E e1, E e2)
     {
         if(!isEmpty())
         {
             for(int i=0; i<size()-1; i++)
             {
                 if((get(i).equals(e1))&&(get(i+1).equals(e2)))
                 {
                     return true;
                    }
                   
                }
            }
            else{
                System.out.println("array is empty");
            }
            return false;
        }
    }
        /*public static void main(String[]args)
     {
         
        
         ExtArrayList<Integer> words = new ExtArrayList<>();
         words.add(1);
         words.add(2);
         words.add(2);
         words.add(3);
         ExtArrayList<Integer> addingOn = new ExtArrayList<>();
         addingOn.add(4);
         addingOn.add(5);
         System.out.println(words.append(addingOn));
         
         System.out.println(words.consecutivePair(2,3));
          System.out.println(words.consecutivePair(4,3));
        }
        */
     

