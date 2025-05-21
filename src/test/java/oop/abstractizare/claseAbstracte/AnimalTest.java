package oop.abstractizare.claseAbstracte;

import org.testng.annotations.Test;

public class AnimalTest {


        @Test
        public void testMethod(){
            System.out.println("====Exemplul 1====");
            Elefant Cici = new Elefant();
            Cici.mananca();
            Cici.infoAnimal();
            Cici.doarme();

            System.out.println("====Exemplu 2====");
            Aligator Mimi = new Aligator();
            Mimi.mananca();
            Mimi.setNume("Mini");
            Mimi.setCuloare("Verde");
            Mimi.setGreutate(98);
            Mimi.infoAnimal();
            Mimi.doarme();

            System.out.println("====Exemplul 3====");
            Dinozaur Gigi = new Dinozaur();
            Gigi.setNume("Gigi");
            Gigi.setGreutate(760);
            Gigi.setCuloare("Roz");
            Gigi.mananca();
            Gigi.infoAnimal();
            Gigi.doarme();

            //
            // Clasa abstracta nu se poate instanta(sa faci un obiect)
           // Animal Animal = new Animal();

        }
    }

