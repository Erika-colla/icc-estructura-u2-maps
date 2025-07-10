package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoDaoHashMap implements EmpleadoDAO {
    private Map<Integer, Empleado> empleados;

    public EmpleadoDaoHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp.getId(), emp);
    }

    @Override
    public void remove(int id) {
        empleados.remove(id);
    }

    @Override
    public void list() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
    }
}

}
