package altPachet;

import org.testng.annotations.Test;

public class CelMaiPachet {

    @Test
    public void testMethod(){

        verificareNumarParImparPozitivNegativ(5);
        verificareNumarParImparPozitivNegativ(3);
        verificareNumarParImparPozitivNegativ(-3);
        verificareNumarParImparPozitivNegativ(-2);
        verificareNumarParImparPozitivNegativ(0);

    }

    public void verificareNumarParImparPozitivNegativ(int valoare){

        if(valoare > 0){
            if(valoare % 2 ==0){
                System.out.println("Numarul: " + valoare + " este par si pozitiv.");

            }else{
                System.out.println("Numarul: " + valoare + " este impar si pozitiv.");

            }

             if(valoare < 0){

                if(valoare % 2 == 0){
                    System.out.println("Numarul: " + valoare + "este par si negativ.");

                }else if(valoare == 0){
                    System.out.println("Numarul: " + valoare + "este impar si negativ.");
                }

                else{
                    System.out.println("Numarul: " + valoare + "este egal cu 0.");

                }

            }

        }

    }


}
