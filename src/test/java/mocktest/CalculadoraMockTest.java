package mocktest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import ejemploMock.CalculadoraMock;
import ejemploMock.MultiplicarServicio;

public class CalculadoraMockTest {
	// PASO2 crear el objeto
    MultiplicarServicio servicioMock = Mockito.mock(MultiplicarServicio.class);

    @Test
    public void verifyFactorial(){
        //PASO 3 crear el metodo y sus comportamiento
        Mockito.when(servicioMock.multi(1,1)).thenReturn(1);
        Mockito.when(servicioMock.multi(1,2)).thenReturn(2);
        Mockito.when(servicioMock.multi(2,3)).thenReturn(6);

        // PASO 4 enviar el objeto mockeado en el constrcutor
        CalculadoraMock calculadoraMock = new CalculadoraMock(servicioMock);
        int expectedResult=6;
        int actualResult=calculadoraMock.getFactorial(3);
        Assertions.assertEquals(expectedResult,actualResult,"Error el factorial el incorrecto");
        
        // verificacion mocks
    }
}
