package controller;
import java.util.*;


public class CalculateBMI {

    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        double height =s.nextDouble();
        double Weight =s.nextDouble();

        Second obj = new Second();
        double value1= obj.calculate(height,Weight);
        String a = Second.sec1(value1);
        System.out.println(a);
        System.out.println(value1);
        
    }
}
class Second
{
   public static double sec(double weight,double height)
    {
        return ((weight/height)/(height))*10000;
    }
    public static String sec1(double value1)
    {
        //double value1;
        if(value1<18.5)
        {
            return "Under Weight";
        }
        else if(value1>=18.5 && value1<24.9)
        {
            return "Normal";
        }
        else if(value1>=25 && value1<29.9)
        {
            return "Over Weight";
        }
        else if(value1>=30 && value1<34.9)
        {
            return "Obese";
        }
        else
        {
            return "Extremely Obese";
        }
    }

}
