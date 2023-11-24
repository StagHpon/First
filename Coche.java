import java.util.Objects;

public class Coche {
    private String matricula;
    private String marca;
    private int nPuertas;
    private boolean eco;

    public Coche(String mat, String mar, int nPuertas, boolean eco){
        matricula = mat;
        this.marca = marca;
        this.nPuertas = nPuertas;
        this.eco = eco;
    }
    public Coche(){
        this("","",0,false);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public boolean isEco() {
        return eco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", nPuertas=" + nPuertas +
                ", eco=" + eco +
                '}';
    }
}
