import java.util.Arrays;
import java.util.Random;

public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }
        
        return randomArray;
    }
    
    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        System.out.println( Arrays.toString( array ));
    }
    
    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     *  @returns the average
     */
    public static void sumAndAverage()
    {
        double sum = 0;
        double average = 0;
        int count = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int i = 0; i < array.length; i++ )
        {
            sum += array[ i ];
            count++;
        }

        average = sum / count;
        
        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int[] array = createRandomArray(10,50);
        for(int i = 0; i<array.length; i++)
        {
            System.out.print(array[i]);
            if(i<(array.length-1))
            {
                System.out.print("|");
            }
        }

    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index
     */
    public static void linearSearch( int valueToFind )
    {
        int [] randm = createRandomArray(10,3);

        int index = 0;
        for(int i = 0; i < randm.length; i++)
        {
            if(randm[i] == valueToFind)
            {
                index = i;
                System.out.println("Index: " + i);
            }
        }

        for(int i = 0; i < randm.length; i++)
        {
            System.out.println(randm[i]);
        }

    }

    /*
     * Array Algorithm #4: Swap Elements
     *  creates an array filled with random numbers
     *  prints the array
     *  swaps the elements at the two specified indexes
     *  prints the array
     */
    public static void swapElements( int index1, int index2 )
    {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        
        for(int i=0; i <=9; i++)
        {
            Random number = new Random();
            array1 [i] = number.nextInt();
            array2 [i] = number.nextInt();
        }
        for(int i = 0; i <array1.length; i++)
        {
            System.out.print(i+":"+array1[i]+" ");
        }
        System.out.println();
        for(int i = 0; i <array2.length; i++)
        {
            System.out.print(i+":"+array2[i]+" ");
        }
        System.out.println();
        
        int goto2 = array1[index1];
        int goto1 = array2[index2];
        
        array1[index1] = goto1;
        array2[index2] = goto2;
        
        for(int i = 0; i <array1.length; i++)
        {
            System.out.print(i+":"+array1[i]+" ");
        }
        System.out.println();
        for(int i = 0; i <array2.length; i++)
        {
            System.out.print(i+":"+array2[i]+" ");
        }

    }

    /*
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int[] array = CommonArrayAlgorithms.createRandomArray(10, 20);
        int max = 0;
        System.out.println("The numbers are:");
        for (int number : array)
        {
            System.out.print(number + "\t");
            if (number >= max)
            {
                max = number;
            }
        }
        System.out.print("\nThe greatest number in the array is: " + max);

    }

    /*
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     */
    public static void findMin()
    {
        //generate random array
        int[] array = createRandomArray( 10, 50 );
        
        //initialize initial guess at minimum value
        int min = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            //if current element of array is less than current value for min, replace it
            if (array[i] < min)
            {
                min = array[i];
            }
        }


        printArray( array );
        System.out.println( "Least number: " + min);

    }

    /*
     * Array Algorithm #6: Copying Arrays
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] copyArray()
    {
    int[] a = randArray(1000);
    int[] b = new int[a.length];
    for (int i = 0; i < a.length; i++) {
        b[i] = a[a.length-i-1];
    }
    printArray(a);
    printArray(b);
    return b;

    }
    
    public static int[] randArray(int l) {
    int[] a = new int[l];
    for (int i = 0; i < a.length; i++) {
        a[i] = (int)(Math.random()*100+1);
    }
    return a;
}


}