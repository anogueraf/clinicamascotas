
package ClinicaMascotas;



public class FormMascotas extends javax.swing.JFrame {
    private DataStorage data;
    private int selectedIndex = -1;
    
    public FormMascotas(DataStorage data) {
        initComponents();
        this.data=data;
    }
    public FormMascotas(DataStorage data,int idx) {
        initComponents();
        this.data=data;
        this.selectedIndex= idx;
        this.loadData();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        lblNombrePropietario = new javax.swing.JLabel();
        txtNombrePropietario = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        spEdad = new javax.swing.JSpinner();
        rbtnHembra = new javax.swing.JRadioButton();
        rbtnMacho = new javax.swing.JRadioButton();
        txtNombreMascota = new javax.swing.JTextField();
        lblEspecie = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNombreMascota = new javax.swing.JLabel();
        lblNumerpChip = new javax.swing.JLabel();
        txtNumeroChip = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        lblDolencia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaDolencia = new javax.swing.JTextArea();
        lblObservaciones = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaObservaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombrePropietario.setText("Nombre Propietario:");

        lblSexo.setText("Sexo:");

        lblEdad.setText("Edad:");

        lblRaza.setText("Raza:");

        btnGroupSexo.add(rbtnHembra);
        rbtnHembra.setText("Hembra");

        btnGroupSexo.add(rbtnMacho);
        rbtnMacho.setText("Macho");

        lblEspecie.setText("Especie:");

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        lblNombreMascota.setText("Nombre Mascota:");

        lblNumerpChip.setText("Numero Chip:");

        lblDolencia.setText("Dolencia:");

        txtareaDolencia.setColumns(20);
        txtareaDolencia.setRows(5);
        jScrollPane1.setViewportView(txtareaDolencia);

        lblObservaciones.setText("Observacines:");

        txtareaObservaciones.setColumns(20);
        txtareaObservaciones.setRows(5);
        jScrollPane2.setViewportView(txtareaObservaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexo)
                            .addComponent(lblNombrePropietario)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRaza)
                                    .addComponent(lblEspecie)
                                    .addComponent(lblDolencia))))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnMacho)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(btnGuardar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNombrePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEspecie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEdad)
                                    .addComponent(lblNombreMascota)
                                    .addComponent(btnCancelar)
                                    .addComponent(lblNumerpChip)))
                            .addComponent(rbtnHembra)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNumeroChip, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreMascota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblObservaciones)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombrePropietario)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreMascota))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMacho)
                    .addComponent(lblSexo)
                    .addComponent(lblNumerpChip)
                    .addComponent(txtNumeroChip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnHembra)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecie)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad)
                    .addComponent(spEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDolencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObservaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
         this.dispose();  
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        Mascotas mascota = new Mascotas();
       
        mascota.setNombrePropietario(txtNombrePropietario.getText());
        mascota.setNombreMascota(txtNombreMascota.getText());
        mascota.setNumeroChip(Integer.parseInt(txtNumeroChip.getText()));
        mascota.setSexo(rbtnMacho.isSelected()? Sexo.Macho : Sexo.Hembra);
        mascota.setEdad((Integer)spEdad.getValue());
        mascota.setEspecie(txtEspecie.getText());
        mascota.setRaza(txtRaza.getText());
        mascota.setDolencia(txtareaDolencia.getText());
        mascota.setObservaciones(txtareaObservaciones.getText());
        
        if(this.selectedIndex==-1){
        this.data.addMascotas(mascota);
        
    }   else {
        int id= this.data.getMascotas().get(this.selectedIndex).getId();
        mascota.setId(id);
        this.data.updateMascotas(mascota);
    }
        firePropertyChange("reloadData", false, true);
        this.dispose();
        
    }//GEN-LAST:event_btnGuardarMouseClicked
    private void loadData(){
        Mascotas p =this.data.getMascotas().get(this.selectedIndex);
        txtNombrePropietario.setText(p.getNombrePropietario());
        txtNombreMascota.setText(p.getNombreMascota());
        txtNumeroChip.setText(Integer.toString(p.getNumeroChip()));
        if (p.getSexo()==Sexo.Macho){
            rbtnMacho.setSelected(true);
        }else{
            rbtnHembra.setSelected(true);
        } 
        spEdad.setValue(p.getEdad());
        txtEspecie.setText(p.getEspecie());
        txtRaza.setText(p.getRaza());
        txtareaDolencia.setText(p.getDolencia());
        txtareaObservaciones.setText(p.getObservaciones());
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDolencia;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblNombrePropietario;
    private javax.swing.JLabel lblNumerpChip;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JRadioButton rbtnHembra;
    private javax.swing.JRadioButton rbtnMacho;
    private javax.swing.JSpinner spEdad;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtNombrePropietario;
    private javax.swing.JTextField txtNumeroChip;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextArea txtareaDolencia;
    private javax.swing.JTextArea txtareaObservaciones;
    // End of variables declaration//GEN-END:variables
}
