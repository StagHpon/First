public class Main {
    public static void main(String[] args) {
    Coche c1 = new Coche("5050CCD","Renault",4,false);
    Coche c2 = new Coche("5050CCD","Renault",4,false);
    Coche c3 = new Coche("8080MNM","Toyota",5,true);
    Coche c4 = c1;

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));
    }
}
