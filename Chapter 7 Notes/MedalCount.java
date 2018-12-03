
/**
 * Write a description of class MedalCount here.
 * 
 * @author mcallaghan 
 * @version 12/3/2018
 */
public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;

    /*
     * Can use array literals to create 2D arrays by nesting curly brackets
     */
    private int[][] counts =
        {
            {1, 0, 1 },
            {1, 1, 0 },
            {0, 0, 1 },
            {1, 0, 0 },
            {0, 1, 1 },
            {0, 1, 1 },
            {1, 1, 0 }
        };

    /**
     * Constructor fro objects of the MedalCount class
     */
    public MedalCount()
    {
        /*
         * Alternative way to create a 2D Array.  It would be followed by nested loops to
         *   intitalize each element.
         */
        // this.counts = new int[COUNTIRES][MEDALS];
    }

    public void printTable()
    {
        // GOOD: for( int row = 0; row < COUNTRIES; row++ )
        // BETTER:
        for(int row = 0; row < this.counts.length; row++)
        {
            // GOOD: for(int col = 0; col < MEDALS; col++)
            // BETTER: for(int col = 0; col < this.counts[0].length; col++)
            // BEST: 
            for(int col = 0; col < this.counts[row].length; col++)
            {
                System.out.print( this.counts[row][col] + "\t");
            }
            System.out.println();
        }
    }    

    /**
     * Sum the medals for the specified country index
     * 
     * @param countryIndex the index of teh country in the table whose
     */
    public int sumMedalsForCountry(int countryIndex)
    {
        int sum = 0;

        for(int col = 0; col < this.counts[countryIndex].length; col++)
        {
            sum += this.counts[countryIndex][col];
        }
        return sum;
    }

    
    
    
    
}
