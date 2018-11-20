
package Ventanas;

public class Proceso {
    int id;
    String Estado;
    String Nombre;
    int Memoria;

    public Proceso(int id, String Estado, String Nombre, int Memoria) {
        this.id = id;
        this.Estado = Estado;
        this.Nombre = Nombre;
        this.Memoria = Memoria;
    }
    
    public Proceso() {
        this.id = 0;
        this.Estado = "";
        this.Nombre = "";
        this.Memoria = 0;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return Estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getMemoria() {
        return Memoria;
    }

}
