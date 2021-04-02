package za.ca.cput.testmaven3;

/**
 *I modified the code that was reated by my leader
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

    

}
