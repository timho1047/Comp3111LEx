package Lab2c;

/*  Comp3111LEx\Lab2c\Computer.java */
public class Computer implements Chargeable{
    protected String secret;
    public Computer(){
        secret = "computer secret";
    }
    public void work(){
        System.out.println("A computer is working");
    }
    public void charge(){
        System.out.println("Charge this computer");
    }
}
