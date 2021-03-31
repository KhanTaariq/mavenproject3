package za.ca.cput.testmaven3;
/**@File Descriptor: testMavenRdd3
 * @Program Descriptor: This is my first Maven Project for Github 
 * @author: Tumelo Mzaca
 * @Date Created *
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
