#BlueJ class context
comment0.target=Equation
comment0.text=\r\n\ Write\ a\ description\ of\ class\ Equation\ here.\r\n\r\n\ @author\ (your\ name)\r\n\ @version\ (a\ version\ number\ or\ a\ date)\r\n
comment1.params=args
comment1.target=void\ main(java.lang.String[])
numComments=2
/**
 * Write a description of class Equation here.
 *
 * @author (Muhammad Suleiman Bawa)
 * @version (a version number or a date)
 */
public class Equation
{
   public static void main (String []args){
    double a,b,c,root1,root2;
    a=1;
    b=-5;
    c=6;
    root1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
    System.out.println(root1);
    root2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
    System.out.println(root2);
    }
}