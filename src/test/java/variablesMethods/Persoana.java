package variablesMethods;

import org.testng.annotations.Test;

public class Persoana {


    // O clasa in Java este o structura ce defineste atat atributele/variabilele cat si metodele unui obiect
    // Tipurile de date in Java sunt de 2 feluri:
    // Tipuri de date primitive - stocheaza direct valoarea >> sunt 8 tipuri de date
    // Byte - (8 biti)
    // Short - (16 biti)
    // int - (32 biti)
    // long - (64 biti)
    // double -(numere zecimale)
    //float -(numere zecimale, precizie mai mica)
    // char - (caractere individuale)
    // boolean (valori logice true/false)
    // tipuri de date de referinta (sau neprimitive), stocheaza doar referintele catre un obiect
    // clasa/interfata/array-uri


    // Tipuri de variabile in Java

//    1. Variabile de instanta(sau variante globale)
//    2. Variabile locale (sau variabile din interiorul metodei)
//
//    O metoda, este un bloc de cod , care indeplineste o functie specifica (o actiune, un comportament)
//    Metode fara return (sau void) >> ruleaza logica din interior si nu returneaza nimic
//    Modificator de acces(public ,private ,protected) void, numeleMetodei(cu/fara parametrii){
//
 //   Logica/corpul metodei

//
//    }
//    Metode cu return >>

    //    Modificator de acces(public ,private ,protected) tipulReturnat(int/string) numeleMetodei(cu/fara parametrii){
//
    //   Logica/corpul metodei

//       return valoarea de tipulReturnat
//
//    }

    // Declaram variabile de instanta (globale)
    String numelePersoanei = "Popescu";
    String prenumelePersoanei = "Andrei";
    char sexulPersoanei = 'M';
    int anDeNastere = 1977;


    //metoda de test
    @Test // anotare

    public void afisareVariabileGlobaleTest (){

        System.out.println("Persoana are numele: " + numelePersoanei);
        System.out.println("Persoana are prenumele: " + prenumelePersoanei);
        System.out.println("Persoana e de sexul: " + sexulPersoanei);


    }

    @Test

    public void afisareDetaliiPersoana(){

        // Declaram niste variabile locale

        double inaltimeaPersoanei = 1.90;
        int varstaPersoanei = 40;
        String adresaPersoanei = "Strada Prapului nr 15";

        System.out.println("Detaliile persoanei sunt: ");
        System.out.println("Persoana are numele: " + numelePersoanei);
        System.out.println("Persoana are prenumele: " + prenumelePersoanei);
        System.out.println("Persoana e de sexul: " + sexulPersoanei);
        System.out.println("Inaltimea persoanei este: " + inaltimeaPersoanei);
        System.out.println("Varsta persoanei este: " + varstaPersoanei);
        System.out.println("Adresa persoanei este: " + adresaPersoanei);

    }
    @Test
    public void afisareDetaliiProfesionale(){

        System.out.println("Varsta actuala a persoanei este: " + calculeazaVarsta(2025) + " ani");
        System.out.println("Este persoana adulta?: " + esteAdult(16));
        System.out.println("Este persoana adulta?: " + esteAdult(calculeazaVarsta(2025)));

    }

    public int calculeazaVarsta(int anulActual){

        return anulActual-anDeNastere;

    }

    public boolean esteAdult(int varsta){

        return varsta >= 18;

    }
}
