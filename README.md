# DataStructuresWork
Some Java code I completed while taking Comp 271 (Data Structures and Algorithms) at Loyola University Chicago. All of these projects have been worked on through BlueJ. 
Please do not contact me asking questions about this course if you are currently enrolled as it is your responsibility to complete the work.
Feel free to reach out otherwise: sthota@luc.edu. 

Here are some basic descriptions of the work. Inside of each Zip file, you will find the actual assignment and progress I made on each individual one.

hw4: create an ExtArrayList<E> class by extending the ArrayList<E> class to include these methods: 
  public ExtArrayList<E>append(ExtArrayList<E> ea)
    appends the values in ea to the end of this ExtArrayList and returns the new ExtArrayList
  public boolean consecutivePair(E e1, E e2) 
     checks if this ExtArrayList has two consecutive elements that are equal to e1 and e2 from the
      //beginning to the end of the list in that order and returns true, otherwise returns false
      
    Create an ExtLinkedList<E> class by extending the LinkedList<E> class to include the following methods
and estimate the run-time complexity of each method.
  public ExtLinkedList<E> evenList()
// gets the elements E in locations 0,2,4,6,… of this list and puts them in a new ExtLinkedList<E>
in that order and returns it
  public ExtLinkedList<E> intsersect (ExtLinkedList<E> eli)
// picks out elements that are common to this ExtLinkedList and eli
// and returns them in the form of a new ExtLinkedList

hw5:
- The goal is to design and implement a  basic text editor in Java.
- assignment description in zip. This one is lengthy

hw7:
- moving through a maze recursively through using a 2d array
- goal to move through the maze using a nonrecursive method, followed by a recursive one

hw10:
- Text file editor that finds all of the words in the Automative file that occur in the dictionary as well.
- top 5 frequent words, followed by top 5 least frequent words
the least frequent words are:
descriptor, the frequency is = 1
pico, the frequency is = 1
ccw, the frequency is = 1
polluting, the frequency is = 1
antonio, the frequency is = 1

the most frequent words are:
overall, the frequency is = 20908
helpful, the frequency is = 20611
summary, the frequency is = 20497
asin, the frequency is = 20474
great, the frequency is = 8974

final hw assignment of class. 

lab 5: 
Queue Data Structure
Implement the following operations for Queue in one file and Deque in the other.

Operations: add() adds at one end called tail and delete () deletes at the other end called head. and returns the value deleted.
Deque:
addTail()
deleteTail()
addHead()
deleteHead()

lab 6:
1. Unzip all files. 
2. In this lab you will use Hash data structure to store information from a certain data file (you figure it out) and time the code for spellCheckAll method.
3. You will perform two timing experiments, one with existing data structure (as such ) in the code and the other with hash data structure.
4. You will do this for both story files.  
5. Submit only the Java code you made changes to and the timing results in a text file (there should be 4 - two for each story file).
