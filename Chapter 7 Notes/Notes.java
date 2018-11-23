
/**
 * Write a description of class Notes here.
 * 
 * @author mcallaghan 
 * @version 19 november 2018
 */
public class Notes
{
    public static void createArrayOfEvens()
    {
        /*
         * An array stores an ordered collection of multiple elements of the same type.  The type can 
         *      be a primitive (e.g. int) or an object(e.g. Turtle).
         *      
         * An array is like an object in that it must be declared and intitialized.  Uses new operator.
         * 
         * Heres an example that creates an array that stores 10 int values.
         * 
         * The number in the square brackets specifies the elements in the array.
         * 
         * All elements are initialized to 0( or false; null).
         */
        int[] evens = new int[10];
        
        
        /*
         * Set all the values of the elements in teh array to the first ten positive even integers.
         * 
         * "length" is used to query the number of elements in the array.
         * 
         * square brackets are used to reference a specific element of the array.
         */
        for(int i = 0; i < evens.length; i++)
        {
            evens[ i ] = (i + 1) * 2;
        }
        
        // print the array's elements
        for(int i = 0; i < evens.length; i++)
        {
            System.out.println(i + ": " + evens[i] );
        }
        
        System.out.println( evens );  // prints the reference to the array
    }
    
    public static void createArrayOfOdds()
    {
        /*
         * An array literal (i.e., curly brackets and comma-separated values)
         *      can be used to initialize an array, but only when the array is declared.  
         *      The size of the array is determined by the number of elements in the array literal.
         */
        int[] odds = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        
        //odds = {1, 3, 5, 7, 9, 11, 13, 15, 17, 20};  // this won't compile
        
        /*
         * Bounds errors
         *      Arrays have a fized size once initialized.  The index we specify must
         *      refer to a valid element.  Otherwise, an ArrayIndexOutOfBounds exception is generated.
         */
        
        for(int i = 0; i <= odds.length; i++)
        {
            //System.out.println(i + ": " + odds[i]);  // the exception tells you useful info!
        }
        
        /*
         * Array references
         *   variables of type array, contain a reference to the array.
         *   assigning one array to another, copies the reference,
         *   not the array's elements.
         */
        int[] moreOdds = odds;
        
        /*
         * This code changes the value of the element in the array, which is
         *    referenced by both variables.
         */
        odds[2] = 6;
        System.out.println(moreOdds[2]);
        
        
        /*
         * Enhanced for loop
         *      similar to the "for...in... " structure in Python
         *      iterates over the values in an array, and accesses each element.
         */
        for(int number : odds)
        {
            System.out.println( number);
        }
        
        /*
         * Limitations of enhanced for loops
         *      the local variable (e.g. number) contains a copy of the value in the element.
         *      cannot modify the values of the element in the array
         *      cannot easily determine the index of an element.
         */
        for(int number : odds)
        {
            number += 1;
            System.out.println( number);
        }
        
        for(int number : odds)
        {
            System.out.println( number);
        }
    }
    
    
    
    
    
    
    
}
