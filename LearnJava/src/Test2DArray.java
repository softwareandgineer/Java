public class Test2DArray {
    public static void main(String[] args)
    {
        int a[][] = new int[3][4];

        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 4; col++)
            {
                a[row][col] = row * 10 + col;
            }
        }

        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 4; col++)
            {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }

        //2D Irregular Arrary
        int b[][] = new int[3][];

        b[0] = new int[] {1,2,3};
        b[1] = new int[] {4,5,6,7,8};
        b[2] = new int[7];
        for(int i = 0; i < b[2].length; i++)
            b[2][i] = i*100;

        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
