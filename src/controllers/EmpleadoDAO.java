package controllers;

import models.Empleado;

public interface EmpleadoDAO {
    void add(Empleado emp);
    void remove(int id);
    void list();
}
