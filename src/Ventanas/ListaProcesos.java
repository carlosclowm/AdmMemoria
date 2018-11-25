
package Ventanas;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ListaProcesos {
    private int Memoria = 24;
    private int Ocupada = 0;
    private Procesos[] Listo = new Procesos[20];
    private Procesos[] Espera = new Procesos[20];
    private int cl = 0;
    private int ce = 0;
    private JButton UB;
    Scanner in = new Scanner(System.in);
    
    
    public void Agregar(String nom, int tam){
        Procesos tmp = new Procesos();
        JButton tm = new JButton(nom);
        tmp.setNombre(nom);
        tmp.setTamaño(tam);
        if(tam <= (Memoria-Ocupada)){
            Ocupada += tam;
            tmp.setEstado("Listo");
            tm.setBackground(Color.blue);
            tm.setSize(30, 150);
            Listo[cl] = tmp;
            cl++;
        }else{
            JOptionPane.showMessageDialog(null, "Enviado a Espera");
            tmp.setEstado("Espera");
            tm.setBackground(Color.magenta);
            Espera[ce] = tmp;
            ce++;
        }
        tmp.setBtn(tm);
        UB = tm;
    }
    
    public JButton UB(){
        return UB;
    }
}
