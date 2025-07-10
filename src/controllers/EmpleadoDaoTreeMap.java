package controllers;

import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class EmpleadoDaoTreeMap implements EmpleadoDAO {
    private Map<Integer, Empleado> empleados;

    public EmpleadoDaoTreeMap() {
        this.empleados = new TreeMap<>();
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
