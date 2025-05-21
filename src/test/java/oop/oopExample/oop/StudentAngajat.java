package oop.oopExample.oop;

public class StudentAngajat extends Persoana implements StudentInterface,AngajatInterface{

    public String companie;
    public Double salariu;
    public Integer experienta;

    private String facultate;
    private String cursuri;
    private Boolean bursa;

    public StudentAngajat(String nume, String prenume, Integer varsta, String companie, Double salariu, Integer experienta, String facultate, String cursuri, Boolean bursa) {
        super(nume, prenume, varsta);
        this.companie = companie;
        this.salariu = salariu;
        this.experienta = experienta;
        this.facultate = facultate;
        this.cursuri = cursuri;
        this.bursa = bursa;
    }

    public StudentAngajat(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }


    @Override
    public void doarme() {
        System.out.println("Studentul angajat doarme cand poate");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Studentul angajat primeste salariu de doua ori pe luna");
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Studentul angajat merge la munca dupa cursuri");
    }

    @Override
    public void munceste() {
        System.out.println("Studentul angajat doarme cand poate");
    }

    @Override
    public void isiIaConcediu() {
        System.out.println("Studentul angajat isi ia concediu cand are sesiune");
    }

    @Override
    public void invata() {
        System.out.println("Studentul angajat invata cand poate");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul angajat sustine examene");
    }

    @Override
    public void mergeLaPetreceri() {
        System.out.println("Studentul angajat nu prea merge la petreceri");
    }

    @Override
    public void mergeLaSeminar() {
        System.out.println("Studentul merge la seminarii cand poate");
    }
}
