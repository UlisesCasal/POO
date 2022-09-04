package ClaseTarea;

public class Tarea {
    String cuerpoTarea;
    EstadosTareas estadoTarea;
    Prioridad prioridad;


    public void asignarTarea(String deQueTrata, Prioridad rango) {
        this.cuerpoTarea = deQueTrata;
        this.estadoTarea = EstadosTareas.PENDIENTE;
        this.prioridad = rango;

    }

    public void cambiarPrioridad(Prioridad prioridadEntrante) {
        this.prioridad = prioridadEntrante;
    }
}
