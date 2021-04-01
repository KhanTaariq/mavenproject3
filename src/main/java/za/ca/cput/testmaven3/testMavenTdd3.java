package za.ca.cput.testmaven3;
/**@File Descriptor: playgroundfortee
 * @Program Descriptor: This is my first Maven Project for Github 
 * @author: Tumelo Mzaca
 * @Date Created ***
 */
public class testMavenTdd3 
{
       static int add(int a, int b)
   {
       return 0;
   }
       //Declare Variables
   private String Tumelo; //Changed the strings names
   private String Mzaca;
   
       //Getters and Setters
   public String getTumelo()
   {
       return Tumelo;
   }
   public void setTumelo(String Tumelo)
   {
       Tumelo = Tumelo;
   }
   public String getMzaca()
   {
       return Mzaca;
   }
   public void setMzaca(String Mzaca)
   {
       Mzaca = Mzaca;
   }
      //Override print report method and display output
    @Override
    public String toString()
    {
        return "testMavenTdd3{" + "Tumelo='" + Tumelo + '\'' + ", Mzaca='" +Mzaca+ '\''+'}';
    }
}