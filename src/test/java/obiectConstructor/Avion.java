package obiectConstructor;

public class Avion {
    // Constructorul are rol sa initializeze variabilele unei clase
    // Recunoastem un constructor dupa numele clasei
    // Pentru o clase putem avea 'n' constructori care se diferenteaza dupa parametrii
    // Intr-o clasa exista tot timpul un constructor default (fara parametrii)
    // Constructorul trebuie sa fie public
    // Obiect = instanta unei clase
    // Dintr-o clasa putem sa facem mai multe obiecte
    // Ca sa initializez un obiect , ne folosim de cuvantul cheie "new"
    // Cand se initializeaze un obiect se apeleaza constructorul clasei

    public String marca;
    public String model;
    public String tip;
    public String taraOrigine;
    public Integer capacitatePasageri;
    public Integer numarBagaje;
    public Integer echipajAvion;


    public Avion(String marca, String model, String tip, String taraOrigine, Integer capacitatePasageri, Integer numarBagaje, Integer echipajAvion) {
        this.marca = marca;
        this.model = model;
        this.tip = tip;
        this.taraOrigine = taraOrigine;
        this.capacitatePasageri = capacitatePasageri;
        this.numarBagaje = numarBagaje;
        this.echipajAvion = echipajAvion;
    }


    public Avion(String marca, String model, String tip, String taraOrigine, Integer capacitatePasageri,Integer echipajAvion) {
        this.marca = marca;
        this.model = model;
        this.tip = tip;
        this.taraOrigine = taraOrigine;
        this.capacitatePasageri = capacitatePasageri;
        this.echipajAvion = echipajAvion;
    }

    public void infoAvion(){
        System.out.println("Marca avionului este: " + marca);
        System.out.println("Modelul avionului este: " + model);
        System.out.println("Tipul avionului este: " + tip);
        System.out.println("Tara de origine a avionului este: " + taraOrigine);
        System.out.println("Capacitatea de pasageri a avionului este: " + capacitatePasageri);
        System.out.println("Echipajul avionului este de: " + echipajAvion + " persoane.");
        System.out.println("Marca avionului este: " + marca);
        if(numarBagaje != null){
            System.out.println("Numarul de bagaje suportat de avion este: " + numarBagaje);
        }else {
            System.out.println("Avionul nu are bagaje.");
        }

    }

}