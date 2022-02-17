package TareaNextDateTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import TareaNextDate.DateUtils;

public class DateUtilsTest {
    @ParameterizedTest
    @CsvSource({
            "5,mayo,2020,6 mayo 2020",
            "28,febrero,2020,29 febrero 2020",
            "28,febrero,2021,1 marzo 2021",
            
            
            "31,diciembre,2000,1 enero 2001",
            "31,enero,2021,1 febrero 2021",
            "30,abril,2021,1 mayo 2021",
            
            "-1,febrero,2021,dia incorrecto",
            "100,febrero,2021,dia incorrecto",
            "29,febrero,2021,dia incorrecto",
            
            "15,febrer,2021,mes incorrecto",
            "20,marzor,2021,mes incorrecto",
            
            "15,febrero,-5,gestion incorrecto",
            "20,marzo,-10,gestion incorrecto",
            
            "40,febrer,-5,ingresar nuevos datos",
            "44,afebrer,2000,ingresar nuevos datos",
            "40,febrero,-5,ingresar nuevos datos",
            "20,febreri,-5,ingresar nuevos datos",
    })


    public void verifyNextDate(int dia,String mes, int gestion, String expectedResult){
        DateUtils dateUtils = new DateUtils();
        String actualResult = dateUtils.nextDate(dia, mes, gestion);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR, el mensaje retornado es incorrecto!!");

    }
}
