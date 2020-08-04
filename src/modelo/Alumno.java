
package modelo;

public class Alumno {
    private int idalumno;
    private String codigo;
    private String nombre;
    
    // Constructor Vacío
    public Alumno() {
        
    }
    // Constructor que recibe valores para inicializar.
    public Alumno(int idalumno, String codigo, String nombre) {
        this.idalumno = idalumno;
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
