package za.ca.cput.testmaven3;
/**
 *
 * @author Taariq
 */
public class testMavenTdd3 
{
     public static void main(String[]args)
   {
       String a = new String ("taariq");
       String b = new String ("taariq");
       
       if(a==b) //(a==b) returns the object(e.g which is diffrent in this case and returns false), (a.equals(b))checks object string use(e.g which is the same and returns true)
       {
            System.out.println(true);
       }
       else
       {
           System.out.println(false);
       }
       
       
       String c = new String("Khan");
       String d = new String("Khan");
       
       if(c.equals(d))
       {
           System.out.println(true);
       }
       else
       {
           System.out.println(false);
       }
   }
}
