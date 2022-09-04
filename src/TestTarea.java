import ClaseTarea.EstadosTareas;
import ClaseTarea.Prioridad;
import ClaseTarea.Tareas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestTarea {
    Tareas miTarea = new Tareas();
    @BeforeEach
    void setUp() {

    }

    @Test
    public void verificarCreacionTareaYAsignacion() {
        miTarea.asignarTarea("Creartarea", Prioridad.ALTA);
    }
    @Test
    public void CambiarEstadoTarea() {
        miTarea.asignarTarea("Creartarea", Prioridad.ALTA);
        miTarea.cambiarEstadoTarea(0,EstadosTareas.RESUELTA);
    }

    @Test
    public void verificarCambiarPrioridadDeUnaTarea() {
        miTarea.asignarTarea("Creartarea", Prioridad.ALTA);
        miTarea.cambiarPrioridad(Prioridad.MEDIA, 1);
    }


}
