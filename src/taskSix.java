public class taskSix {
    public static void main(String[] args)
    {
        int size = 1;
        for (int i = 6; i > size; i--)
        {
            for (int j = 6; j > size; j--)
            {
                if (i >= j)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
