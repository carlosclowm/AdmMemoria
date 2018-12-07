package Ventanas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosSerrano BackEnd & CrisPacheco FrontEnd
 */
public class Main extends javax.swing.JFrame {

    Color[] Estado = new Color[24];
    int c = 0;
    int Memoria = 24;
    int Ocupada = 0;
    Proceso[] Esp = new Proceso[24];
    int CE=0;
    Proceso add;
    Proceso nuevo;
    
    public Main() {
        initComponents();
        for(int i = 0; i<24;i++){
            Estado[i] = Color.CYAN;
        }Pintar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnCrear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbMemoria = new javax.swing.JComboBox<>();
        cmbTiempo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        panelProcesos = new javax.swing.JPanel();
        btnR2 = new javax.swing.JButton();
        btnR4 = new javax.swing.JButton();
        btnR1 = new javax.swing.JButton();
        btnR5 = new javax.swing.JButton();
        btnR3 = new javax.swing.JButton();
        btnR11 = new javax.swing.JButton();
        btnR9 = new javax.swing.JButton();
        btnR8 = new javax.swing.JButton();
        btnR7 = new javax.swing.JButton();
        btnR6 = new javax.swing.JButton();
        btnR12 = new javax.swing.JButton();
        btnR10 = new javax.swing.JButton();
        btnR24 = new javax.swing.JButton();
        btnR23 = new javax.swing.JButton();
        btnR22 = new javax.swing.JButton();
        btnR21 = new javax.swing.JButton();
        btnR20 = new javax.swing.JButton();
        btnR19 = new javax.swing.JButton();
        btnR18 = new javax.swing.JButton();
        btnR17 = new javax.swing.JButton();
        btnR16 = new javax.swing.JButton();
        btnR15 = new javax.swing.JButton();
        btnR14 = new javax.swing.JButton();
        btnR13 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Memoria");
        setIconImage(new ImageIcon(getClass().getResource("/Img/icon.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 768, 12));

        jPanel1.setBackground(new java.awt.Color(0,0,0,129));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Creador de Procesos");

        btnCrear.setBackground(new java.awt.Color(0,0,0,129));
        btnCrear.setForeground(java.awt.Color.white);
        btnCrear.setLabel("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Nombre");

        txtNombre.setBackground(java.awt.Color.darkGray);
        txtNombre.setForeground(java.awt.Color.white);
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setName(""); // NOI18N

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Tamaño de Memoria");

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Tiempo Ejecucion");

        cmbMemoria.setBackground(java.awt.Color.darkGray);
        cmbMemoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        cmbTiempo.setBackground(java.awt.Color.darkGray);
        cmbTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Min");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnCrear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(cmbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnCrear)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 320));

        jPanel2.setBackground(new java.awt.Color(0,0,0,129));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Lista de Procesos");

        panelProcesos.setBackground(new java.awt.Color(0,0,0,140));
        panelProcesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelProcesos.setForeground(new java.awt.Color(0,0,0,140));
        panelProcesos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelProcesos.setOpaque(false);
        panelProcesos.setLayout(new java.awt.GridLayout(10, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jSeparator3)
            .addComponent(panelProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProcesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelProcesos.getAccessibleContext().setAccessibleParent(this);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, 312));

        btnR2.setBackground(java.awt.Color.lightGray);
        btnR2.setFocusPainted(false);
        btnR2.setFocusable(false);
        btnR2.setRolloverEnabled(false);
        getContentPane().add(btnR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 30, 80));

        btnR4.setBackground(java.awt.Color.lightGray);
        btnR4.setFocusPainted(false);
        btnR4.setFocusable(false);
        btnR4.setRolloverEnabled(false);
        getContentPane().add(btnR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 30, 80));

        btnR1.setBackground(java.awt.Color.lightGray);
        btnR1.setFocusPainted(false);
        btnR1.setFocusable(false);
        btnR1.setRolloverEnabled(false);
        getContentPane().add(btnR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 80));

        btnR5.setBackground(java.awt.Color.lightGray);
        btnR5.setFocusPainted(false);
        btnR5.setFocusable(false);
        btnR5.setRolloverEnabled(false);
        getContentPane().add(btnR5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 30, 80));

        btnR3.setBackground(java.awt.Color.lightGray);
        btnR3.setFocusPainted(false);
        btnR3.setFocusable(false);
        btnR3.setRolloverEnabled(false);
        getContentPane().add(btnR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 30, 80));

        btnR11.setBackground(java.awt.Color.lightGray);
        btnR11.setFocusPainted(false);
        btnR11.setFocusable(false);
        btnR11.setRolloverEnabled(false);
        getContentPane().add(btnR11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 30, 80));

        btnR9.setBackground(java.awt.Color.lightGray);
        btnR9.setFocusPainted(false);
        btnR9.setFocusable(false);
        btnR9.setRolloverEnabled(false);
        getContentPane().add(btnR9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 30, 80));

        btnR8.setBackground(java.awt.Color.lightGray);
        btnR8.setFocusPainted(false);
        btnR8.setFocusable(false);
        btnR8.setRolloverEnabled(false);
        getContentPane().add(btnR8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 30, 80));

        btnR7.setBackground(java.awt.Color.lightGray);
        btnR7.setFocusPainted(false);
        btnR7.setFocusable(false);
        btnR7.setRolloverEnabled(false);
        getContentPane().add(btnR7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 30, 80));

        btnR6.setBackground(java.awt.Color.lightGray);
        btnR6.setFocusPainted(false);
        btnR6.setFocusable(false);
        btnR6.setRolloverEnabled(false);
        getContentPane().add(btnR6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, 80));

        btnR12.setBackground(java.awt.Color.lightGray);
        btnR12.setFocusPainted(false);
        btnR12.setFocusable(false);
        btnR12.setRolloverEnabled(false);
        getContentPane().add(btnR12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 30, 80));

        btnR10.setBackground(java.awt.Color.lightGray);
        btnR10.setFocusPainted(false);
        btnR10.setFocusable(false);
        btnR10.setRolloverEnabled(false);
        getContentPane().add(btnR10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 30, 80));

        btnR24.setBackground(java.awt.Color.lightGray);
        btnR24.setFocusPainted(false);
        btnR24.setFocusable(false);
        btnR24.setRolloverEnabled(false);
        getContentPane().add(btnR24, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 30, 80));

        btnR23.setBackground(java.awt.Color.lightGray);
        btnR23.setFocusPainted(false);
        btnR23.setFocusable(false);
        btnR23.setRolloverEnabled(false);
        getContentPane().add(btnR23, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 30, 80));

        btnR22.setBackground(java.awt.Color.lightGray);
        btnR22.setFocusPainted(false);
        btnR22.setFocusable(false);
        btnR22.setRolloverEnabled(false);
        getContentPane().add(btnR22, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 30, 80));

        btnR21.setBackground(java.awt.Color.lightGray);
        btnR21.setFocusPainted(false);
        btnR21.setFocusable(false);
        btnR21.setRolloverEnabled(false);
        getContentPane().add(btnR21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 30, 80));

        btnR20.setBackground(java.awt.Color.lightGray);
        btnR20.setFocusPainted(false);
        btnR20.setFocusable(false);
        btnR20.setRolloverEnabled(false);
        getContentPane().add(btnR20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 30, 80));

        btnR19.setBackground(java.awt.Color.lightGray);
        btnR19.setFocusPainted(false);
        btnR19.setFocusable(false);
        btnR19.setRolloverEnabled(false);
        getContentPane().add(btnR19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 30, 80));

        btnR18.setBackground(java.awt.Color.lightGray);
        btnR18.setFocusPainted(false);
        btnR18.setFocusable(false);
        btnR18.setRolloverEnabled(false);
        getContentPane().add(btnR18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 30, 80));

        btnR17.setBackground(java.awt.Color.lightGray);
        btnR17.setFocusPainted(false);
        btnR17.setFocusable(false);
        btnR17.setRolloverEnabled(false);
        getContentPane().add(btnR17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 30, 80));

        btnR16.setBackground(java.awt.Color.lightGray);
        btnR16.setFocusPainted(false);
        btnR16.setFocusable(false);
        btnR16.setRolloverEnabled(false);
        getContentPane().add(btnR16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 30, 80));

        btnR15.setBackground(java.awt.Color.lightGray);
        btnR15.setFocusPainted(false);
        btnR15.setFocusable(false);
        btnR15.setRolloverEnabled(false);
        getContentPane().add(btnR15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 30, 80));

        btnR14.setBackground(java.awt.Color.lightGray);
        btnR14.setFocusPainted(false);
        btnR14.setFocusable(false);
        btnR14.setRolloverEnabled(false);
        getContentPane().add(btnR14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 30, 80));

        btnR13.setBackground(java.awt.Color.lightGray);
        btnR13.setFocusPainted(false);
        btnR13.setFocusable(false);
        btnR13.setRolloverEnabled(false);
        getContentPane().add(btnR13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 80));

        jButton1.setBackground(java.awt.Color.red);
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("Espera");
        jButton1.setFocusable(false);
        jButton1.setRolloverEnabled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 80, 30));

        jButton3.setBackground(java.awt.Color.green);
        jButton3.setForeground(java.awt.Color.white);
        jButton3.setText("Ejecución");
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setRolloverEnabled(false);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 90, 30));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText("Listo");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverEnabled(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 80, 30));

        jLabel3.setBackground(new java.awt.Color(0,0,0,129));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/backfont.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 470));
        jLabel3.getAccessibleContext().setAccessibleParent(panelProcesos);

        setBounds(0, 0, 784, 498);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if(txtNombre.getText().length() != 0){
            add = new Proceso(txtNombre.getText(), "Listo", Integer.parseInt(cmbMemoria.getSelectedItem().toString()), Integer.parseInt(cmbTiempo.getSelectedItem().toString()) , new JButton(), this);
            JButton btmp = new JButton(txtNombre.getText());
            btmp.setBackground(new java.awt.Color(51, 153, 255));
            btmp.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                MyIcon icon = new MyIcon();
                String LsEj;
                if(add.getEstado()=="Listo"){
                    LsEj="Ejecutar";
                }else{
                    LsEj="Listo";
                }
                String LsBq;
                if(add.getEstado()=="Bloqueado"){
                    LsBq="Listo";
                    
                    LsEj="Ejecutar";
                }else{
                    LsBq="Bloquear";
                }
                String[] options = {LsEj, LsBq, "Borrar", "Canelar"};
                int seleccion = JOptionPane.showOptionDialog(null, "Proceso: "+
                add.getNombre()+"\nTamaño: "+add.getTamaño()+"\nEstado: "+
                add.getEstado()+"\nCPU: "+add.isAlive(), "Proceso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, 
                options, options[3]);
                if(seleccion==0){
                    if(add.getEstado()=="Ejecutado"){
                        panelProcesos.remove(btmp);
                        btmp.setBackground(new java.awt.Color(51, 153, 255));
                        panelProcesos.add(btmp);
                        panelProcesos.updateUI();
                        add.setEstado("Listo");
                        try{
                            DelMem(add.getTamaño());
                        }catch(Exception ex){}
                        
                        
                    }
                    else{
                        if(add.getEstado()=="Bloqueado"){
                        add.resume();
//                        try{
//                            add.start();
//                        }catch(Exception ex){}
                        }
                        if(add.getTamaño() <= (Memoria-Ocupada)){
                        for(int i = 0; i<add.getTamaño();i++){
                            if(c<0){
                                c=0;
                            }
                        Estado[c] = Color.green;
                        c++;
                        }Pintar();
                        panelProcesos.remove(btmp);
                        btmp.setBackground(Color.GREEN);
                        panelProcesos.add(btmp);
                        
                        Ocupada += add.getTamaño();
                        add.setEstado("Ejecutado");
                        try{
                            add.start();
                        }catch(Exception ex){};
                        if(add.getEstado()=="Listo"){
                            
                            add.start();
                        
                        }
                        }else{
                        JOptionPane.showMessageDialog(null, "Memoria llena!");
                        }
                    }
                    
                    
                }if(seleccion==1){
                    if(add.getEstado()=="Ejecutado"){
                        DelMem(add.getTamaño());
                        add.suspend();
                    }if(add.getEstado()=="Bloqueado"){
                        
                        panelProcesos.remove(btmp);
                        btmp.setBackground(new java.awt.Color(51, 153, 255));
                        panelProcesos.add(btmp);
                        panelProcesos.updateUI();
                        add.setEstado("Listo");
                        add.resume();
                    }else{
                        panelProcesos.remove(btmp);
                    btmp.setBackground(Color.RED);
                    panelProcesos.add(btmp);
                    panelProcesos.updateUI();
                    add.setEstado("Bloqueado");
                    Esp[CE]=add;
                    CE++;
                    }
                    
                }if(seleccion==2){
                    if(add.getEstado()=="Bloqueado"){
                        panelProcesos.remove(btmp);
                        panelProcesos.updateUI();
                    }else{
                        Eliminar(btmp, add);
                    }
                    
                }
                    
                }
            });
            add.setBtn(btmp);
            panelProcesos.add(btmp);
            panelProcesos.updateUI();
            add.start();
//            Asig(Integer.parseInt(cmbMemoria.getSelectedItem().toString()), btmp, add);
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el Nombre Correctamente");
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    public void ReiniciarH(Proceso res){
        nuevo = new Proceso(res.getNombre(),"Listo",res.getTamaño(),res.getTiempo(),res.getBtn(),this);
        panelProcesos.add(nuevo.getBtn());
        panelProcesos.updateUI();
        add = nuevo;
    }
    
    private void Asig(int n, JButton btmp, Proceso add){
        if(n <= (Memoria-Ocupada)){
            for(int i = 0; i<n;i++){
                Estado[c] = Color.green;
                c++;
            }Pintar();
                panelProcesos.remove(btmp);
                btmp.setBackground(Color.GREEN);
                panelProcesos.add(btmp);
                panelProcesos.updateUI();
                Ocupada += n;
            }else{
                
            }
    }

    public void Eliminar(JButton del, Proceso delP){
        delP.stop();
        panelProcesos.remove(del);
        panelProcesos.updateUI();
        DelMem(delP.getTamaño());
    }
    
    public void DelMem(int d){
        for(int i=0; i<d;i++){
            c--;
            Estado[c] = Color.CYAN;
            
            if(c==0){
                Estado[c] = Color.CYAN;
            }
        }Pintar();
        Ocupada -= d;
//        for(int i = 0; i<CE;i++){
//            if(Esp[i].getTamaño()<=(Memoria-Ocupada) && Ocupada>0){
//                Asig(Esp[i].getTamaño(), Esp[i].getBtn(),Esp[i]);
//                for(int j =0;i<i;i++){
//                    Esp[j]=Esp[j+1];
//                }CE--;
//            }
//        }
    }
  
    private void Pintar(){
        btnR1.setBackground(Estado[0]);
        btnR2.setBackground(Estado[1]);
        btnR3.setBackground(Estado[2]);
        btnR4.setBackground(Estado[3]);
        btnR5.setBackground(Estado[4]);
        btnR6.setBackground(Estado[5]);
        btnR7.setBackground(Estado[6]);
        btnR8.setBackground(Estado[7]);
        btnR9.setBackground(Estado[8]);
        btnR10.setBackground(Estado[9]);
        btnR11.setBackground(Estado[10]);
        btnR12.setBackground(Estado[11]);
        btnR13.setBackground(Estado[12]);
        btnR14.setBackground(Estado[13]);
        btnR15.setBackground(Estado[14]);
        btnR16.setBackground(Estado[15]);
        btnR17.setBackground(Estado[16]);
        btnR18.setBackground(Estado[17]);
        btnR19.setBackground(Estado[18]);
        btnR20.setBackground(Estado[19]);
        btnR21.setBackground(Estado[20]);
        btnR22.setBackground(Estado[21]);
        btnR23.setBackground(Estado[22]);
        btnR24.setBackground(Estado[23]);
    }

    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    public javax.swing.JButton btnR1;
    public javax.swing.JButton btnR10;
    public javax.swing.JButton btnR11;
    public javax.swing.JButton btnR12;
    public javax.swing.JButton btnR13;
    public javax.swing.JButton btnR14;
    public javax.swing.JButton btnR15;
    public javax.swing.JButton btnR16;
    public javax.swing.JButton btnR17;
    public javax.swing.JButton btnR18;
    public javax.swing.JButton btnR19;
    public javax.swing.JButton btnR2;
    public javax.swing.JButton btnR20;
    public javax.swing.JButton btnR21;
    public javax.swing.JButton btnR22;
    public javax.swing.JButton btnR23;
    public javax.swing.JButton btnR24;
    public javax.swing.JButton btnR3;
    public javax.swing.JButton btnR4;
    public javax.swing.JButton btnR5;
    public javax.swing.JButton btnR6;
    public javax.swing.JButton btnR7;
    public javax.swing.JButton btnR8;
    public javax.swing.JButton btnR9;
    private javax.swing.JComboBox<String> cmbMemoria;
    private javax.swing.JComboBox<String> cmbTiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JPanel panelProcesos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
