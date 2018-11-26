
package Ventanas;

import javax.swing.JButton;


public class Procesos {
    private String nombre;
    private int tamaño;
    private String estado;
    public JButton btn;
    
    public Procesos() {
        this.nombre = "";
        this.tamaño = 0;
        this.estado = "";
        btn = new JButton();
    }

    public JButton getBtn() {
        return btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
