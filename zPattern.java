public class zPattern {
    public static void main(String[] args) {
        int numTiles = 8;
        System.out.println("<--Start Program-->");
        for(int i=0; i<numTiles; i++)
        {
            for(int j=0; j<numTiles; j++)
            {
                //Create the Horizontal Lines
                if(i==0 || i==numTiles-1)
                {
                    System.out.print("1");
                }
                //Create Vertical Line
                else if(i+j==numTiles-1)
                {
                    System.out.print("1");
                }
                //Stagger Vertical Line
                else
                {
                    System.out.print(" ");
                }
            }
            //Update each line with break
            System.out.println();
        }
        System.out.println("<--End Program-->");

        //Pattern 2
        int secondNumTiles = 8;
        System.out.println("<--Start Program-->");
        for(int i=0; i<secondNumTiles; i++)
        {
            for(int j=0; j<secondNumTiles; j++)
            {
                //Create the Horizontal Lines
                if(i%2==0)
                {
                    System.out.print("1");
                }
                //Create Connecting Right Edge
                else if((i-1)%4==0 & j==secondNumTiles-1)
                {
                    System.out.print("1");
                }
                //Create Connecting Left Edge
                else if((i+1)%4==0 && j==0){
                    System.out.print("1");
                }
                //Create Empty Spaces to Alternate Edges
                else
                {
                    System.out.print(" ");
                }
            }
            //Update each line with break
            System.out.println();
        }
        System.out.println("<--End Program-->");

        System.out.println("<--Start Program-->");
        //Print Alternating Symbols in Shape of Triangle
        for(int j=0; j<5; j++){
            for(int i=0; i<=j; i++){
                System.out.print(((i+j)%2==0 ? "*" : "#"));
            }
            System.out.println();

        }
        System.out.println("<--End Program-->");

        System.out.println("<--Start Program-->");
        //Count even numbers
        int[] numbers = {1, 4, 3, 6, 8, 5, 3, 1, 9, 7};
        int result = 0;
        for(int i = 0; i < numbers.length; i++) {
            result += (numbers[i] % 2 == 0 ? 1 : 0);
        }
        System.out.println(result);
        System.out.println("<--End Program-->");

        System.out.println("<--Start Program-->");
        //Find array average
        int[] numbersTwo = {1, 4, 3, 6, 8, 5, 3, 1, 9, 7};
        double resultTwo = 0.0;
        for(int i = 0; i < numbersTwo.length; i++) {
            resultTwo += numbersTwo[i];
        }
        resultTwo /= numbersTwo.length;
        System.out.println(resultTwo);
        System.out.println("<--End Program-->");

        System.out.println("<--Start Program-->");
        //Count Number of Equal Pairs in Array
        int[] numbersThree = {1, 4, 3, 6, 8, 5, 3, 1, 9, 7};
        int resultThree = 0;
        for(int i=0; i < numbersThree.length; i++) {
            for(int j=i+1; j < numbersThree.length; j++) {
                resultThree += (numbersThree[i] == numbersThree[j] ? 1 : 0);
            }
        }
        System.out.println(resultThree);
        System.out.println("<--End Program-->");

        System.out.println("<--Start Program-->");
        //Count Number of Odd Pairs in Array
        int[] numbersFour = {1, 4, 3, 6, 8, 5, 3, 1, 9, 7};
        int resultFour = 0;
        
        System.out.println("<--End Program-->");
    }
}