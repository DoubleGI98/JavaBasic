package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {



    @Test
    public void testMethod(){


//        verificareNumar(5);
//        verificareNumar(1);

        //verificareNumarParImparPozitivNegativ(-3);





        System.out.println("Evaluarea elevului este: " + evaluareNota('B'));
        //System.out.println("O alta evaluare a elevului este: " + notaEvaluare('C'));

       // System.out.println("O alta evaluare a elevului este: " + notaEvaluare('A'));
         // Nu functioneaza deoarece functia de println printeaza doar valori stocate, iar notaEvaluare este o metoda
        // de tip void (adica nu are o valoare stocata , insa reda un rezultat)

        notaEvaluare('A');
//        notaEvaluare('B');
//        notaEvaluare('C');

    }

    // structura de control "if" este folosita pentru a evolua o conditie booleana si pentru a executa un bloc de cod
    //daca aceasta conditie se indeplineste
    //if (conditie){
    // bloc de cod ce o sa fie executat daca conditia este adevarata
    // }else {
    // bloc de cod care o sa fie executat daca conditia este falsa

    // }
    // }

    public void verificareNumar(int numar){

        if(numar > 3){
            System.out.println("Numarul: " + numar + " este mai mare decat 3.");
        } else{
            System.out.println("Numarul: " + numar + " este mai mic decat 3.");
        }

    }

    // diferenta intre if si else if
 // daca if este folosit pentru prima conditie pentru care vrem sa evaluam
 // else if este folosit pentru conditii suplimentare daca if este fals
    // else este folosit pentru a executa un bloc de cod atunci daca toate conditiile sunt false
    // este indicat sa foloseasca if si else if impreuna daca mai ai multe conditii de evaluat

//  public void verificareNumarParImparPozitivNegativ(int valoare){
//
//        if(valoare > 0) {
//            if (valoare % 2 == 0) {
//                System.out.println("Numarul: " + valoare + " este par si pozitiv.");
//
//            } else {
//                System.out.println("Numarul: " + valoare + " este impar si pozitiv.");
//
//            }
//
//        }else if(valoare < 0){
//
//                if(valoare % 2 == 0){
//                    System.out.println("Numarul: " + valoare + "este par si negativ.");
//
//                }else {
//                    System.out.println("Numarul: " + valoare + "este impar si negativ");
//                }
//
//                else{
//                    System.out.println("Numarul: " + valoare + "este zero");
//
//                }
//
//            }
//
//        }
//
//  }

  // "switch" este o structura de control care permite evaluarea unei expresii si executarea unuia din mai multe blocuri de cod.
//  este de obicei mai mult folosit cand sunt mai multe cazuri posibile, fiecare caz este asociat unui bloc de cod specific
//    switch(expresia){
//      case valoareaUnu:
    // bloc de cod pentru cazul in care expresia are valoarea - valoareaUnu
    // break;
    //  case valoareDoi:
    // bloc de cod pentru cazul in care expresia are valoarea - valoareDoi
    // break;
    // alte case-uri posibile:
    // default :
    // bloc de cod care se executa daca niciunu dintre cazuri nu se potriveste
    // }

    public String evaluareNota(char nota){

        switch(nota){
            case 'A':
                return "Excelent";
               // break;
            case 'B':
                return "Foarte bine";
               // break;
            case 'C':
                return "Bine";
            //break;
            case 'D':
                return "Satisfacator";
            //break;
            case 'F':
                return "Repetent";
            //break;
            default :
                return nota + " Nu este un calificativ acceptat";
        }

    }

    // Tema , Creaza un switch intr-o metoda void (cu break)

    public void notaEvaluare(char nota){

        switch(nota){
            case 'A':
                System.out.println("O alta evaluare a elevului este: Excelent");
           // break;
            case 'B':
                System.out.println("O alta evaluare a elevului este: Foarte bine");
            //break;
            case 'C':
                System.out.println("O alta evaluare a elevului este: Bine");
            break;
            case 'D':
                System.out.println("O alta evaluare a elevului este: Satisfacator");
            break;
            case 'F':
                System.out.println("O alta evaluare a elevului este: Repetent");
            break;
            default :
                System.out.println("O alta evaluare a elevului este: Nu este un calificativ acceptat");
        }


    }


    public void evaluareNotav1(char nota) {
        switch (nota) {
            case 'A' -> System.out.println("Excelent");
            case 'B' -> System.out.println("Foarte bine");
            case 'C' -> System.out.println("Bine");
            case 'D' -> System.out.println("Satisfacator");
            case 'F' -> System.out.println("Repetent");
            default -> System.out.println("Unknown");
        }
    }

    public void verificareNumarParImparPositivNegativ(int valoare) {
        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul: " + valoare + " este par si pozitiv");
            } else {
                System.out.println("Numarul: " + valoare + " este impar si pozitiv");
            }
        } else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul: " + valoare + " este par si negativ");
            }
        }
    }
}







