package obiectConstructor;

import org.testng.annotations.Test;

public class CandidatLaPresedinteTest {

    @Test
    public void verificatPresedinteTest(){
        System.out.println("====Exemplul 1====");
        CandidatLaPresedinte candidatPromitator = new CandidatLaPresedinte("Vasile",10000);
        System.out.println("Numele candidatului promitator este: " + candidatPromitator.getNume() + " si are: " + candidatPromitator.getNumarVoturi() + " de voturi");
        System.out.println("====Exemplul 2====");
        CandidatLaPresedinte candidatSlab = new CandidatLaPresedinte("Ionica",3560);
        System.out.println("Numele candidatului slab este: " + candidatSlab.getNume() + " si are: " + candidatSlab.getNumarVoturi() + " de voturi");
        System.out.println("====Exemplul 3====");
        CandidatLaPresedinte candidatNecunoscut = new CandidatLaPresedinte("",3333);
        System.out.println("Numele candidatului necunoscut este: " + candidatNecunoscut.getNume() + " si are: " + candidatNecunoscut.getNumarVoturi() + " de voturi");




    }

}
