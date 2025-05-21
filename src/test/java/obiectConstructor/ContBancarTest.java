package obiectConstructor;

import org.testng.annotations.Test;

public class ContBancarTest {
    @Test
    public void metodaContBancarTest(){
        System.out.println("====Exemplul 1====");
        ContBancar contValid = new ContBancar("Gabriel",150.55);
        contValid.infoCont();
        ContBancar contInvalid = new ContBancar("Valeriu",95.66);
        System.out.println("====Exemplul 2====");
        contInvalid.infoCont();
    }

}
