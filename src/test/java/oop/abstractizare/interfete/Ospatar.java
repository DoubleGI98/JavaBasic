package oop.abstractizare.interfete;

public class Ospatar implements ServesteInterface{
    @Override
    public void PrimesteComanda(int numarComanda) {
        System.out.println("Ospatarul preia comanda cu numarul " + numarComanda);
    }

    @Override
    public void ServesteMancarea(String tipulMancarii, String numeClient) {
        System.out.println("Ospatarul duce mancarea " + tipulMancarii + " la clientul " + numeClient);
    }
}
