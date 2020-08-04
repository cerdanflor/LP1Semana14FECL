package vistacontrol;

import modelo.Alumno;

public class Principal {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        Alumno alumno1 = new Alumno(2, "20151012", "Luis Letona");

        // Asignamos Valores al objeto alumno
        alumno.setIdalumno(1);
        alumno.setCodigo("201910025");
        alumno.setNombre("Angelo Arotinco");
        
        // Obtenemos y mostramos los valores del objeto alumno
        System.out.println("objeto: alumno");
        System.out.println("ID: " + alumno.getIdalumno());
        System.out.println("Código: " + alumno.getCodigo());
        System.out.println("Nombre: " + alumno.getNombre());
        
        // Obtenemos y mostramos los valores del objeto alumno1
        System.out.println("objeto: alumno1");
        System.out.println("ID: " + alumno1.getIdalumno());
        System.out.println("Código: " + alumno1.getCodigo());
        System.out.println("Nombre: " + alumno1.getNombre());
    }
}
