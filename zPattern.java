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
          
            }
            //Update each line with break
            System.out.println();
        }
        System.out.println("<--End Program-->");
    }
}