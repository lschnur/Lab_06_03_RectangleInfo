import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        int lngth= 0;
        int hight =0;
        int hypot =0;
        int area = 0;
        int perim =0;

        System.out.println("Enter in the length of the first side" );
        if(in.hasNextInt())
        {
           lngth= in.nextInt();
            System.out.println("Enter in the height of the triangle");
        }
        if(in.hasNextInt())
        {
            hight = in.nextInt();
            hypot = lngth*lngth* hight*hight;
            perim= lngth+hight+hypot;
            area= (lngth*hight) * 1/2;
            System.out.println("The area of the triangle is "+area+" The perimiter of the triangle is "+ perim);


        }
        else
        {
            System.out.println("You have entered an invalid number");
        }




    }
}