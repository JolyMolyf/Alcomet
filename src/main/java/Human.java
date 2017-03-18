import java.io.*;

public class Human implements Serializable {
  private  double p;
  private  boolean g;

    public double getP() {
        return p ;
    }

    public boolean isG() {
        return g;
    }

    public void setP(double p) {
        this.p = p;
    }

    public void setG(boolean g) {
        this.g = g;
    }

    public Human(double p, boolean g) {
        this.p = p;
        this.g = g;
    }

   
    public void savetofile()
    {
        try {
            FileOutputStream par = new FileOutputStream("properties.data" );
            ObjectOutputStream objc = new ObjectOutputStream(par);
            objc.writeObject(this);
        }
        catch (IOException e) {

        }
    }

    public static Human readFromFile() {
        Human r = null;
        try {
            FileInputStream par = new FileInputStream("properties.data" );
            ObjectInputStream objc = new ObjectInputStream(par);
            r = (Human)objc.readObject();
        }
        catch (IOException e) {

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return r;
    }
}
