package za.ca.cput.testmaven3;
/**@File Descriptor: playgroundfortee
 * @Program Descriptor: This is my first Maven Project for Github 
 * @author: Tumelo Mzaca
 * @Date Created ***
 */
public class testMavenTdd3 
{
     public static void main(String[]args)
   {
       String a = new String ("tumelo"); //Changed the string name from Taariq to Tumelo
       String b = new String ("tumelo");
       
       if(a==b) //(a==b) returns the object(e.g which is diffrent in this case and returns false), (a.equals(b))checks object string use(e.g which is the same and returns true)
       {
            System.out.println(true);
       }
       else
       {
           System.out.println(false);
       }
       
       
       String c = new String("Mzaca"); //Changed the string name from Khan to Mzaca
       String d = new String("Mzaca");
       
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
