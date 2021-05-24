package ejercicios;

public class Fecha {
    private int dia;
    private int mes; 
    private int anio;
    
    public Fecha(int dia, int mes, int anio) {
    	this.setDia(dia); 
    	this.mes = mes; 
    	this.anio = anio;
    }
    
    private int diasMes() {
    	int diasMes = 0;
    	switch(mes) {
        case 1: 
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: diasMes = 31; break;
        case 4: 
        case 6:
        case 9:
        case 11: diasMes = 30; break;
        case 2: diasMes = bisiesto(); break;
    }
    	return diasMes;
    }
    
    // verificaci�n de a�o bisiesto
    public int bisiesto () {
    	int diasMes = 0;
    	if((anio% 400 == 0) || ((anio% 4 == 0) && (anio % 100 != 0)))
             diasMes = 29;
         else 
             diasMes = 28;
    	return diasMes;
    }
    
    public boolean valida (int i) {
        if(getDia() < 1 || getDia() > i) return false;
        if(mes < 1 || mes > 12) return false;
        if(anio < 0) return false;
        // determinamos la cantidad de d�as del mes:
        if(getDia() > diasMes())
        	return false;
        else
        	return true;
    }

	private int getDia() {
		return dia;
	}

	private void setDia(int dia) {
		this.dia = dia;
	}
}
