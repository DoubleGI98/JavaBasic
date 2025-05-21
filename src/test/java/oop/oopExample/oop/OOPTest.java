package oop.oopExample.oop;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void oopExampleTest(){
        System.out.println("====Exemplul student====");
        Student Ionel = new Student("Popescu","Ionel",25,"Facultatea de Automatica si Informatica Aplicata","Rezistenta materialelor",true);
//        Ionel.infoStudent();
//        Ionel.setNume("Porumbescu");
//        Ionel.infoPersoana();
        Ionel.mananca();

        Ionel.invata();
        Ionel.invata(4);
        Ionel.invata("Chimie");

        System.out.println("====Exemplul angajat====");
        Angajat Vasile = new Angajat("Pop","Vasile",32,"Dell",6000.05,7);
//        Vasile.infoAngajat();
//        Vasile.infoPersoana();
        Vasile.mananca();

        Vasile.marire("Senior");
        Vasile.marire(10.5);
        Vasile.marire("vechime",750);



//        Vasile.infoAngajat();
//        Vasile.setSalariu(3500.05);
//        Vasile.infoPersoana();
//        Vasile.infoAngajat();

        Ionel.sustineExamene();
        Ionel.mergeLaPetreceri();
        Ionel.mergeLaSeminar();

        Vasile.mergeLaMunca();
        Vasile.isiIaConcediu();
        Vasile.munceste();
        Vasile.primesteSalariu();

        System.out.println("====Exemplu student angajat====");

        StudentAngajat Elena = new StudentAngajat("Ionescu","Elena",27);
        Elena.mergeLaMunca();
        Elena.mergeLaPetreceri();
        Elena.sustineExamene();
        Elena.isiIaConcediu();
        Elena.primesteSalariu();
        Elena.infoPersoana();

    }

}
