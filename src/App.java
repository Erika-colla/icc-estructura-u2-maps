import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDaoHashMap;
import controllers.EmpleadoDaoTreeMap;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    // Ejemplo de gestión de empleados usando HashMap y TreeMap
    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash = new EmpleadoDaoHashMap();
        EmpleadoController empleadoContoller = new EmpleadoController(empleadoDAOHash);
        EmpleadoDaoTreeMap empleadoDAOTreeMap = new EmpleadoDaoTreeMap();
        EmpleadoController empleadoContoller2 = new EmpleadoController(empleadoDAOTreeMap);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");


        
        empleadoContoller.agregarEmpleados(emp1);
        empleadoContoller.agregarEmpleados(emp2);
        empleadoContoller.agregarEmpleados(emp3);
        empleadoContoller.agregarEmpleados(emp4);
        empleadoContoller.agregarEmpleados(emp5);

        
        empleadoContoller2.agregarEmpleados(emp1);
        empleadoContoller2.agregarEmpleados(emp2);
        empleadoContoller2.agregarEmpleados(emp3);
        empleadoContoller2.agregarEmpleados(emp4);
        empleadoContoller2.agregarEmpleados(emp5);
        
        System.out.println("HashMap");
        empleadoContoller.listarEmpleados();
        System.out.println("\nTreeMap");
        empleadoContoller2.listarEmpleados();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemplosConTreeMap();
    }

    private static void runEjerccios() {
    Ejercicios ej = new Ejercicios();

    System.out.println("\n--- Anagramas ---");
    System.out.println("listen vs silent: " + Ejercicios.areAnagrams("listen", "silent"));
    System.out.println("hello vs bello: " + Ejercicios.areAnagrams("hello", "bello"));
    System.out.println("triangle vs integral: " + Ejercicios.areAnagrams("triangle", "integral"));

    System.out.println("\n--- Sumatoria ---");
    int[] resultado = ej.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
    if (resultado != null) {
        System.out.println("Índices: [" + resultado[0] + ", " + resultado[1] + "]");
    } else {
        System.out.println("No se encontró combinación.");
    }

    int[] resultado2 = ej.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);
    if (resultado2 != null) {
        System.out.println("Índices: [" + resultado2[0] + ", " + resultado2[1] + "]");
    } else {
        System.out.println("null");
    }

    System.out.println("\n--- Contar caracteres ---");
    ej.contarCaracteres("hola");

    System.out.println("\n--- Son anagramas ---");
    System.out.println("roma vs amor: " + ej.sonAnagramas("roma", "amor"));
}

}