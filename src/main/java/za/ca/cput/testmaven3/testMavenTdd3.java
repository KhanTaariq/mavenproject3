package za.ca.cput.testmaven3;


/**
 *I modified the code that was created by my leader
 * @author Taariq
 */
public class testMavenTdd3 {

    public static void main(String[] args) {

        String a = new String("taariq");
        String b = new String("taariq");
        String e = new String("taariq");

        if (a == b) //(a==b) returns the object(e.g which is diffrent in this case and returns false), (a.equals(b))checks object string use(e.g which is the same and returns true)
        {
            System.out.println(true);
            System.out.println("results:");
        } else {
            System.out.println(false);
            System.out.println("results:");
        }

        String c = new String("Khan");
        String d = new String("Khan");
        String f = new String("khan");
        if (c.equals(d)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
      
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    

=======
/**@File Descriptor: playgroundfortee
 * @Program Descriptor: This is my first Maven Project for Github 
 * @author: Tumelo Mzaca
 * @Date Created ***
 */
public class testMavenTdd3 
{


   static int add(int i, int i0)
   {
       return 0;
   }
   private String Taariq;
   private String Khan;
   
   public String getTaariq()
   {
       return Taariq;
   }
   public void setTaariq(String Taariq)
   {
       Taariq = Taariq;
   }
   public String getKhan()
   {
       return Khan;
   }
   public void setKhan(String Khan)
   {
       Khan = Khan;
   }
=======
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
        return "testMavenTdd3{" + "Tumelo='" + Tumelo + '\'' + ", Mzaca='" + Mzaca + '\''+'}';
    }
}
=======

   static int add(int i, int i0)
   {
       return 0;
   }
   private String Taariq;
   private String Khan;
   
   public String getTaariq()
   {
       return Taariq;
   }
   public void setTaariq(String Taariq)
   {
       Taariq = Taariq;
   }
   public String getKhan()
   {
       return Khan;
   }
   public void setKhan(String Khan)
   {
       Khan = Khan;
   }

    @Override
    public String toString()
    {
        return "testMavenTdd3{" + "Taariq='" + Taariq + '\'' + ", Khan='" +Khan+ '\''+'}';
    }

} 

   
=======

}


