package TareaNextDate;

public class DateUtils {
	public String nextDate(int dia, String mes, int gestion) {
		
		boolean diaValid = true;
		boolean mesValid = true;
		boolean gestionValid = true;
		int invalidos = 0;
		

		int d = dia;
		String m = mes;
		int g = gestion;

		int diasTotalesMes = cantidadDias(mes);

		if (gestion % 4 == 0 && mes.equals("febrero")) {
			diasTotalesMes++;
		}

		if (diasTotalesMes > d) {
			d++;
		} else if (!m.equals("diciembre")) {
			d = 1;
			m = nextMonth(m);
		} else {
			d = 1;
			m = nextMonth(m);
			g++;
		}
		
		if(dia < 1 || dia > diasTotalesMes) {
			diaValid = false;
			invalidos ++;
		}
		
		if(nextMonth(mes).equals("mes incorrecto")) {
			mesValid = false;
			invalidos ++;
		}
		
		if(gestion<0) {
			gestionValid = false;
			invalidos ++;
		}
		
		if(invalidos>1) {
			return "ingresar nuevos datos";
		}
		
		if(!diaValid) {
			return "dia incorrecto";
		}
		
		if(!mesValid) {
			return "mes incorrecto";
		}
		
		if(!gestionValid) {
			return "gestion incorrecto";
		}

		return d + " " + m + " " + g;
	}

	public String nextMonth(String month) {

		switch (month) {
		case "enero":
			return "febrero";

		case "febrero":
			return "marzo";

		case "marzo":
			return "abril";

		case "abril":
			return "mayo";

		case "mayo":
			return "junio";

		case "junio":
			return "julio";

		case "julio":
			return "agosto";

		case "agosto":
			return "septiembre";

		case "septiembre":
			return "octubre";

		case "octubre":
			return "noviembre";

		case "noviembre":
			return "diciembre";

		case "diciembre":
			return "enero";

		default:
			return "mes incorrecto";
		}

	}

	public int cantidadDias(String mes) {
		switch (mes) {
		case "enero":
			return 31;

		case "febrero":
			return 28;

		case "marzo":
			return 31;

		case "abril":
			return 30;

		case "mayo":
			return 31;

		case "junio":
			return 30;

		case "julio":
			return 31;

		case "agosto":
			return 31;

		case "septiembre":
			return 30;

		case "octubre":
			return 31;

		case "noviembre":
			return 30;

		case "diciembre":
			return 31;

		default:
			return 31;
		}
	}

}
