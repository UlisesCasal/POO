
import java.time.*;
import java.time.chrono.ChronoPeriod;

public class Fecha {
    private Integer anio;
    private Integer mes;
    private Integer dia;

    public Fecha( Integer a, Integer m, Integer d) {
        try {
            LocalDate.of(a,m,d);
            this.anio = a;
            this.mes = m;
            this.dia = d;
        } catch (Exception e) {
            throw new IllegalArgumentException("La fecha ingresada es inválida");
        }
    }

    public String getFechaString() {
        return this.dia + "-" + this.mes + "-" + this.anio;
    }

    public boolean esMayor(Fecha comparacion) {
        if (this.anio > comparacion.anio)
            return true;
        else if ((this.anio.equals(comparacion.anio)) && (this.mes > comparacion.mes)) {
            return true;
        } else if (this.anio.equals(comparacion.anio) && (this.mes.equals(comparacion.mes) && (this.dia > comparacion.dia))) {
            return true;
        }
        else return false;
    }

    public boolean esMenor(Fecha comparacion) {
        if (this.anio > comparacion.anio)
            return false;
        else if ((this.anio.equals(comparacion.anio)) && (this.mes > comparacion.mes)) {
            return false;
        } else if (this.anio.equals(comparacion.anio) && (this.mes.equals(comparacion.mes) && (this.dia > comparacion.dia))) {
            return false;
        }
        else return true;
    }
}
