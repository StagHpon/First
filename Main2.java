public class Main2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Coche[] parking = new Coche[4];
        imprimeArray(parking);
        Coche coche_shakira = new Coche("0001PIK","mercedes",3,false);
        parking[0]=coche_shakira
        imprimeArray(parking);
        coche_shakira=null;
        imprimeArray(parking);
        parking[0]=null;
        imprimeArray(parking);
        System.out.println(coche_shakira);
    }

    public static void imprimeArray(String[] args) {

    }
        for(Coche c:a){//parking){
            System.out.println(c);
        }
    }
}
