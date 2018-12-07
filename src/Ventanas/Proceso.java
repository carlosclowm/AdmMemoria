package Ventanas;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Proceso extends Thread{
    private String Nombre;
    private String Estado;
    private int Tamaño;
    private int Tiempo;
    private JButton btn;
    private Main mn;
    
    @Override
    public void run(){

            for(int i=0; i<Tiempo; i++){
            
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//JOptionPane.showMessageDialog(null, "Proceso: "+this.getNombre()+" Terminado!");
       
        mn.panelProcesos.remove(btn);
        this.btn.setBackground(new java.awt.Color(51, 153, 255));
        mn.panelProcesos.updateUI();
        this.setEstado("Listo");
        try{
            mn.DelMem(Tamaño);
        }catch(Exception ex){}
        
        System.out.println(this.getEstado());
        mn.ReiniciarH(this);
        btn.updateUI();
    }

    public void setMn(Main mn) {
        this.mn = mn;
    }
    

    public Proceso(String Nombre, String Estado, int Tamaño, int Tiempo, JButton btn, Main m) {
        super(Nombre);
        this.Nombre = Nombre;
        this.Estado = Estado;
        this.Tamaño = Tamaño;
        this.Tiempo = Tiempo;
        this.btn = btn;
        this.mn = m;
    }
    
    public Proceso() {
        super("");
        this.Nombre = "";
        this.Estado = "";
        this.Tamaño = 0;
        this.Tiempo = 0;
        this.btn = new JButton();
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public JButton getBtn() {
        return btn;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }
    
    
}
