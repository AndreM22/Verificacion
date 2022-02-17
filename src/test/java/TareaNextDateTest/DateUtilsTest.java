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
            "15,mayoabril,2021,mes incorrecto",
            
            "15,febrero,-5,gestion incorrecto",
            "20,marzo,-10,gestion incorrecto",
            
            "40,febrer,-5,ingresar nuevos datos",
            "44,afebrer,2000,ingresar nuevos datos",
            "40,febrero,-5,ingresar nuevos datos",
            "20,febreri,-5,ingresar nuevos datos",
            
            "30,enero,2020,31 enero 2020",
            "31,enero,2020,1 febrero 2020",
            "27,febrero,2021,28 febrero 2021",
            "29,febrero,2020,1 marzo 2020",
            "30,marzo,2020,31 marzo 2020",
            "31,marzo,2020,1 abril 2020",
            "29,abril,2020,30 abril 2020",
            "30,abril,2020,1 mayo 2020",
            "30,mayo,2020,31 mayo 2020",
            "31,mayo,2020,1 junio 2020",
            "29,junio,2020,30 junio 2020",
            "30,junio,2020,1 julio 2020",
            "30,julio,2020,31 julio 2020",
            "31,julio,2020,1 agosto 2020",
            "30,agosto,2020,31 agosto 2020",
            "31,agosto,2020,1 septiembre 2020",
            "29,septiembre,2020,30 septiembre 2020",
            "30,septiembre,2020,1 octubre 2020",
            "30,octubre,2020,31 octubre 2020",
            "31,octubre,2020,1 noviembre 2020",
            "29,noviembre,2020,30 noviembre 2020",
            "30,noviembre,2020,1 diciembre 2020",
            "30,diciembre,2020,31 diciembre 2020",
            "31,diciembre,2024,1 enero 2025",
    })


    public void verifyNextDate(int dia,String mes, int gestion, String expectedResult){
        DateUtils dateUtils = new DateUtils();
        String actualResult = dateUtils.nextDate(dia, mes, gestion);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR, el mensaje retornado es incorrecto!!");

    }
}
