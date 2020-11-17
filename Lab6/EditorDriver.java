
/**
 * Write a description of class EditorDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EditorDriver
{
   public static void main(String[] args) {
       
       ReadFiles rf = new ReadFiles();
       rf.readTextFile();
       rf.readDictionary();
       PrimitiveJavaEditor pje = new PrimitiveJavaEditor();
       long t1 = System.currentTimeMillis();
       pje.spellCheckAll();
       long t2 = System.currentTimeMillis();
       System.out.println("time taken is " + ((t2-t1)/1000.0));
       //stop clock
       
       //here is where you would do the loop
       // check for input numbers 1 through 10 via keyboard and call
       //the methods accordingly.  
       
       /*
        * time before hash for Alcott: 69 seconds and 7081 mispelled words
        * time before hash for BillyGoat: .001 seconds and 21 mispelled words
        * time after hash for Alcott: .019 seconds
        * time after hash for BillyGoat: .001 seconds
        */
       //time is .001 seconds and there are 21 misspelled words 
    }
}
