package SimpleSyntax;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BasicSyntax {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("INICIO >>>> Esto se ejecuta solo 1 vez");
    }
    
    @AfterClass
    public static void afterClass(){
        System.out.println("FINAL >>> Esto se ejecuta solo 1 vez ");
    }
    
    @Before
    public void setup(){
        System.out.println(" BEFORE> Esto se ejecuta antes de CADA test");
    }

    @After
    public void cleanup(){
        System.out.println("AFTER > Esto se ejecuta despues de CADA test");
    }

    @Test
    public void verifyThing(){
        System.out.println("*** Esto es un prueba 1 ");
    }

    @Test
    public void verifyThing2(){
        System.out.println("Esto es un prueba 2");
    }

}
