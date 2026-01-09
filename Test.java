public class Test
{
    public static void main(String[] args)
    {
        int x= 4;
        int y= 0;
        for (int z = 0; z < 5; z++)
        {
            if (( --x > 2 ) && (++y > 2))
            {
                y++;
                x++;
            }
        }
        System.out.println(x + " " + y);


    }
}