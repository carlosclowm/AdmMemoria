
package Ventanas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ListaProcesos {
    public  int Memoria = 24;
    public  int Ocupada = 0;
    private Procesos[] Listo = new Procesos[24];
    private Procesos[] Espera = new Procesos[24];
    private int cl = 0;
    private int ce = 0;
    private JButton UB;
    public int Mt;
    Scanner in = new Scanner(System.in);
    
    
    public void Agregar(Procesos add){
        if(add.getTamaño() <= (Memoria-Ocupada)){
            Ocupada += add.getTamaño();
            add.setEstado("Listo");
            add.btn.setBackground(new java.awt.Color(51, 153, 255));
            add.btn.setSize(30, 150);
            Listo[cl] = add;
            cl++;
        }else{
            add.setEstado("Espera");
            add.btn.setBackground(Color.magenta);
            Espera[ce] = add;
            ce++;
        }
        UB = add.btn;
    }
    
    public JButton UB(){
        return UB;
    }
    
    public void EliminarProceso(Procesos del){
        
        if(del.getEstado() == "Listo"){
            Ocupada -= del.getTamaño();
            for(int i = 0; i<cl;i++){
                if(Listo[i] == del){
                    for(int l = i; l<cl; l++){
                        Listo[l]= Listo[l+1];
                    }
                    cl--;
                }
            }
        }else{
            for(int j = 0; j<ce; j++){
                if(Espera[j] == del){
                    for(int l = j; l<cl; l++){
                        Espera[l]= Espera[l+1];
                    }
                    ce--;
                }
            }
        }
    }
    
    public boolean ActualizarEstado(){
        for(int i = 0; i<ce; i++){
            if(Espera[i].getTamaño() <= (Memoria-Ocupada)){
                Agregar(Espera[i]);
                Mt=Espera[i].getTamaño();
                for(int j=i;j<ce;j++){
                    Espera[j] = Espera[j+1];
                }
                ce--;
                return true;
            }
        }
        return false;
    }
}
