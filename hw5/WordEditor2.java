
/**
 * Write a description of class WordEditor2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordEditor2
{
    ArrayList<String>dictionary = new ArrayList<String>();
    {
       try 
        {
              Scaner keyboard = new Scanner(new File("EnglishWordList.txt")); 
       while(keyboard.hasNext())
       {
           String str = reader.next();
        }
    }
    catch ( FileNotFoundException ex)
        {
        System.out.println(ex + " file not found");
         }
    
}
