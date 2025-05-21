package oop.oopExample.oop;

public abstract class Persoana {
    //Oop = Programare orientata pe obiect (object oriented programming)
    // Patru principii importante: mostenire,incapsulare,polimorfism si abstractizare;
    //Mostenirea in Java este conceptul prin care o clasa(clasa copil) mosteneste o alta clasa(clasa parinte);
    //In momentul in care o clasa mosteneste alta clasa , clasa copil are vizibilitate asupra variabilelor/metodelor din clasa parinte
    // In java se poate mosteni o singura clasa cu ajutorul cuvantului cheie "extends";
    //In momentul in care o clasa mosteneste o alta clasa , clasa copil apeleaza constructorul din parinte
    //Si constructorul din clasa parinte spre copil se apeleaza cu cuvantul cheie "super"

    // Incapsularea procesul prin care tinem private anumite informatii in asa fel incat aceasta sa nu poata fi accesata
    // Ca sa putem face informatiile private vom face variabilele/metodele din public in privat
    // Modificicatori de acces
    // public = codul se poate accesa de oriunde si din orice clasa;
    // private = codul se poate accesa doar din clasa de unde s-a scris codul;
    // protected = codul se poate accesa doar din pachetul in care s-a scris codul dar si de catre subclase(Conceptul OOP de mostenire)
    // default Codul se poate accesa doar din pachetul in care s-a scris codul;
    // Ca sa extragem(modificam) o valoare a unei variabile private ne folosim de metodele get/set(getter/setter);

    // Polimorfism = Conceptul prin care definim mai multe implementari pentru o metoda
    // Este de doua tipuri: Static(overloading) si Dinamic(Overreading)

    // Polimorfismul dinamic intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    // Polimorfismul static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea tipului sau nr de parametrii

    // Abstractizarea = este procesul de reducere a complexitatii prin ascunderea detaliilor de implementare si expunerea doar a functionalitatii
    // Se realizeaza prin clase abstracte si/sau interfete
    // Clasele abstracte = se declara folosind cuvantul cheie 'abstract'
    //Pot contine atat metode abstracte (fara corp/cod sau implementare) cat si metode concrete (metodele obisnuite,cu implementare)
    //Nu pot fi instantiate(nu poti sa faci un obiect din clasa abstracta)
    //Ea poate fi utilizate numai ca superclasa pt alte clase care extind clasa abstracta
    //Poate avea variabile si atribute ca si o clasa normala




    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
    }

    public abstract void doarme();

    // Polimorfism dinamic ------> Prima implementare a metodei
    public void mananca(){
        System.out.println("Persoana mananca de plictiseala");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}



