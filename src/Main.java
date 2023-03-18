import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Varztu pasaulis 2.0");

        Darbininkas d1 = new Darbininkas("Petras","Varztas",100,1);
        Darbininkas d2 = new Darbininkas("Ona","Poverzle",7000,0.5);
        Darbininkas d3 = new Darbininkas("Jonas","Verzle",1430,1.5);
        Darbininkas d4 = new Darbininkas("Tautvydas","Varztas",560,1);
        Darbininkas d5 = new Darbininkas("Vytautas","Poverzle",978,0.5);
        Darbininkas d6 = new Darbininkas("Bronius","Verzle",978,1);
        Darbininkas d7 = new Darbininkas("Hermanas","Poverzle",978,0.5);
        Darbininkas d8 = new Darbininkas("Izidorius","Varztas",1300,1);
        Darbininkas d9 = new Darbininkas("Sigitas","Auksine verzle",30,101);
        Darbininkas d10 = new Darbininkas("Iveta","Poverzle",888,0.5);

        LinkedList<Darbininkas> sarasas = new LinkedList<Darbininkas>();

        sarasas.add(d1); sarasas.add(d2); sarasas.add(d3); sarasas.add(d4); sarasas.add(d5);
        sarasas.add(d6); sarasas.add(d7); sarasas.add(d8); sarasas.add(d9); sarasas.add(d10);

        System.out.println("****************  Pradinis Sarasas ****************");
        atspauzdintiSarasa(sarasas);
        Collections.sort(sarasas);
        System.out.println("****************  Surusiuotas Sarasas ****************");
        atspauzdintiSarasa(sarasas);
        System.out.println("****************  Ismetami is saraso darbutojai kuriu detales kaina virsijo 100 EUR ****************");
        pasalinaIsSarasoDarbutojus(sarasas,100);
        atspauzdintiSarasa(sarasas);

    }

    static void atspauzdintiSarasa (LinkedList<Darbininkas> sarasas ){
        sarasas.forEach(darbininkas ->
                System.out.println(darbininkas));
    }

    static void pasalinaIsSarasoDarbutojus (LinkedList<Darbininkas> sarasas, int suma){
        Iterator<Darbininkas> i = sarasas.iterator();
        while (i.hasNext()){
            Darbininkas darbininkas= i.next();
            if (darbininkas.getDetalesKaina() < suma) {
                i.remove();
           }
        }
    }

}