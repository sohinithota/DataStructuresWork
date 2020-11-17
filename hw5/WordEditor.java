
/**
 * Write a description of class WordEditor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;

public class WordEditor
{
    /*
      ArrayList<String>dictionary = new ArrayList<String>();
      Scanner keyboard = new Scanner("EnglishWordList.txt");
        while(keyboard.hasNext())
        {
            dictionary.add(keyboard.next());
        }
        ArrayList<String>goatStory = new ArrayList<String>();
        Scanner book = new Scanner("BillyGoatGruff.txt");
        while(book.hasNext())
        {
            goatStory.add(book.next());
        }
        */
   //boolean find() looks for word "x" in a file and returns true if found or false otherwise
   boolean Find(String x)
   {
       Scanner keyboard = null;
     try 
        {
        keyboard = new Scanner(new File("EnglishWordList.txt"));
         } 
    catch ( FileNotFoundException ex)
        {
        System.out.println(ex + " file not found");
         }
    while(keyboard.hasNext())
       {
           String nextLine = keyboard.next();
           if( nextLine.equals(x)) return true;
        }
        return false;
    }
    //boolean FindReplace (String x, String y) 
    // looks for the first occurrence of word "x"
    //in the file and replaces it with word "y" if found 
    //returning true, false otherwise.
    boolean FindReplace(String x, String y)
    {
        Scanner keyboard = null;
     try 
        {
        keyboard = new Scanner(new File("EnglishWordList.txt"));
         } 
    catch ( FileNotFoundException ex)
        {
        System.out.println(ex + " file not found");
         }
       while(keyboard.hasNextLine())
       {
           String nextLine = keyboard.next();
           if( nextLine.equals(x))
           { 
               nextLine.replaceFirst(x,y);
               return true;
            }
           //return true;
        }
        return false;
    } 
    boolean FindInsert (String x, String y)  
    // looks for the first occurrence of word "x" in the file 
    //and then insert "y" right after "x", if x is found, 
    //returning true, false otherwise.  
    {
        Scanner keyboard = null;
     try 
        {
        keyboard = new Scanner(new File("EnglishWordList.txt"));
         } 
    catch ( FileNotFoundException ex)
        {
        System.out.println(ex + " file not found");
         }
       while(keyboard.hasNextLine())
       {
           String nextLine = keyboard.next();
           if( nextLine.equals(x))
           { 
               nextLine.replaceFirst(x,x + " " + y);
               return true;
            }
           //return true;
        }
        return false;
    }    
    boolean Delete (String x)
    // looks for the first occurrence of word "x" 
    //in the file and deletes it from the file, returning 
    //true if x is found, returning false otherwise.
    {
        Scanner keyboard = null;
     try 
        {
        keyboard = new Scanner(new File("EnglishWordList.txt"));
         } 
    catch ( FileNotFoundException ex)
        {
        System.out.println(ex + " file not found");
         }
       while(keyboard.hasNextLine())
       {
           String nextLine = keyboard.next();
           if( nextLine.equals(x))
           { 
               nextLine.replaceFirst(x, "");
               return true;
            }
           //return true;
        }
        return false;
    }
     
    // finds the first occurrence of spelling error
    //and returns the misspelled word. 4
    //If no word is misspelled returns "Spell Check Passed".
    String spellCheck()
    {
      
        
       /* 
        for(int i = 0;i<=goatStory.size()-1;i++)
           {
               for(int x = 0; x<=dictionary.size()-1;i++)
               {
                   
                }    
            }
            */
    }    
}
