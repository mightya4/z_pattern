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
            }
        }
        System.out.println("<--End Program-->");
    }
}