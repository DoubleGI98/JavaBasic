package oop.abstractizare.interfete;

public interface GatesteInterface {

    //Interfata e un protocul pe care clasele trebuie sa le implementeze (ofera raspuns la lipsa mostenirii multiple)
    // O clasa poate mostenii mai multe interfete
    // Interfata contine doar metode abstracte *interfata poate sa contina si metode cu implementare dar pot sa ai doua tipuri de metode
    //(default: public void sau static void)
    // Interfetele pot extinde alte interfete
    //Ai cuvantul cheie 'Interface'
    //Putem sa mostenim o interfata cu cuvantul cheie 'implements'


    void PregatesteMancarea(String tipDeMancare);


}
