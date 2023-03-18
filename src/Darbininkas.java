import java.util.Comparator;

public class Darbininkas implements Comparable<Darbininkas>{
    private String darbininkoVardas;
    private String detale;
    private int pagamintasKiekis;
    private double detalesKaina;
    private String norma;
    private double bendrasUzdarbis;

    public Darbininkas() {}

    public Darbininkas(String darbininkoVardas, String detale, int pagamintasKiekis, double detalesKaina) {
        this.darbininkoVardas = darbininkoVardas;
        this.detale = detale;
        this.pagamintasKiekis = pagamintasKiekis;
        this.detalesKaina = detalesKaina;
        this.norma = arIvykdeNorma();
        this.bendrasUzdarbis = bendrasUzdarbis();
    }

    public void setDarbininkoVardas(String darbininkoVardas){
        this.darbininkoVardas = darbininkoVardas;
    }
    public void setDetale(String detale){
        this.detale = detale;
    }
    public void setPagamintasKiekis (int pagamintasKiekis){
        this.pagamintasKiekis = pagamintasKiekis;
    }
    public void setDetalesKaina (double detalesKaina){
        this.detalesKaina = detalesKaina;
    }
    public String getDarbininkoVardas(){
        return darbininkoVardas;
    }
    public String getDetale (){
        return detale;
    }
    public int getPagamintasKiekis(){
        return pagamintasKiekis;
    }
    public double getDetalesKaina(){
        return detalesKaina;
    }


    public String arIvykdeNorma (){
        int norma = getPagamintasKiekis();
        String arYvykde;
        if (norma >= 1000) {
            arYvykde = "NORMA ĮVYKDYTA";
        }else {
            arYvykde = "NORMA NEĮVYKDYTA";
        }
        return arYvykde;
    }

    public double bendrasUzdarbis (){
        double suma = getPagamintasKiekis() * getDetalesKaina();
        return suma;
    }

    @Override
    public String toString() {
        return String.format("Darbuotojas %-10s \t Detale %-20s \t\t Vienetai %d \t Kaina %-10.1f \t%-20s \tBendras uzdarbis: %-10s",darbininkoVardas,detale,pagamintasKiekis,detalesKaina,norma,bendrasUzdarbis);
    }


    @Override
    public int compareTo(Darbininkas sarasas) {
        return Comparator
                .comparing(Darbininkas::getPagamintasKiekis).reversed()
                .thenComparing(Darbininkas::getDetale)
                .compare(this,sarasas);
    }
}
