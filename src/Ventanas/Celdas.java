
package Ventanas;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Celdas {
    Color[] Cell = new Color[25];
    int Memoria;
    int con;

    public Celdas() {
        this.Memoria = 24;
        this.con=1;
        for(int i = 1; i<=24; i++){
            Cell[i] = Color.BLUE;
        }
    }
    
    public Color ColorCell(int i){
        return Cell[i];
    }
    
    public void Agregar(int c){
        if(c<=Memoria){
            for(int i = 0; i<c; i++){
                Cell[con] = Color.GREEN;
                con++; 
            }
            Memoria -= c;
        }else{
            JOptionPane.showMessageDialog(null,"Mandado a Espera");
        }
    }
    
    public void Eliminar(int c){
        try{
            for(int i=0;i<=c;i++){
            Cell[con] = Color.BLUE;
            con--;
        }
        Memoria += c;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    
    
}
