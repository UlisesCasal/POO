package ClaseTarea;

public class Tareas {
    Tarea[] TareasAsignadas;
    int cantidadTareas = 0;

    public void asignarTarea(String tarea, Prioridad rango) {
        cantidadTareas ++;
        TareasAsignadas = new Tarea[cantidadTareas];
        Tarea nuevaTarea = new Tarea();
        nuevaTarea.asignarTarea(tarea, rango);
        this.TareasAsignadas[cantidadTareas-1] = nuevaTarea;
        System.out.println("Tarea asignada");
    }

    public void cambiarEstadoTarea(int numeroTarea, EstadosTareas cambiar) {
        this.TareasAsignadas[numeroTarea].estadoTarea = cambiar;
        System.out.println("Tarea cambiada");
    }

    public void cambiarPrioridad(Prioridad prioridad, int numeroTarea) {
        this.TareasAsignadas[numeroTarea-1].cambiarPrioridad(prioridad);
    }
}
