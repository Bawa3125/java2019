/**
 * Write a description of class MakePassword here.
 *
 * @author (Muhammad Suleiman Bawa)
 * @version (a version number or a date)
 */
public class MakePassword
{
   public static void main (String[] args){
      String FirstName = "Suleiman";
      String MiddleName = "Bawa";
      String LastName = "Muhammad";
      int age = 26;

      //extract initials
      String initials =
            FirstName.substring(0,1)+
            MiddleName.substring(0,1)+
            LastName.substring(3,4);

      //append age
      String password = initials.toLowerCase() +age;
      System.out.prinf("Your Password =%20s",password);

    }
}