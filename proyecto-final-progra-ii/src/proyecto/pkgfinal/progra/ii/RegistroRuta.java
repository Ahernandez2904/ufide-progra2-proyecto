package proyecto.pkgfinal.progra.ii;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class RegistroRuta extends javax.swing.JFrame {

    public RegistroRuta() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro de Ruta");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        guiNombre = new javax.swing.JTextField();
        ComboHorario = new javax.swing.JComboBox<>();
        JToggle = new javax.swing.JToggleButton();
        JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese nueva Ruta");

        jLabel2.setText("Nombre de la Ruta:");

        jLabel3.setText("Horario de la Ruta:");

        ComboHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana: 5am - 2pm", "Mañana: 7am - 4pm", "Mañana: 11 am - 8pm", "Tarde: 1pm - 10pm", "Tarde: 2pm - 11pm", "Tarde: 3pm - 12mn" }));

        JToggle.setText("Agregar Ruta");
        JToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JToggleActionPerformed(evt);
            }
        });

        JButton.setText("Cancelar");
        JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(guiNombre)
                                    .addComponent(ComboHorario, 0, 198, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(JButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(JToggle)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(guiNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(JToggle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JButton)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JToggleActionPerformed

        File archivo = new File(System.getProperty("user.dir") + "\\RegistroRuta\\" + guiNombre.getText() + ".txt");
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        String btn;

        if (guiNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Asegurese de que todos los campos esten completos");
        } else {

            try {
                w = new FileWriter(archivo);
                bw = new BufferedWriter(w);
                wr = new PrintWriter(bw);
                wr.write(guiNombre.getText() + " ");
                wr.append(ComboHorario.getSelectedItem() + "\r\n");
                wr.close();
                bw.close();

            } catch (IOException e) {
                System.out.println("Ha ocurrido un error" + e);
            }
            JOptionPane.showMessageDialog(null, "Nueva Ruta creada");
            MenuPrincipal pp = new MenuPrincipal();
            pp.setVisible(true);
            RegistroRuta.this.dispose();
        }
    }//GEN-LAST:event_JToggleActionPerformed

    private void JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonActionPerformed
            MenuPrincipal jMenuP = new MenuPrincipal();
            jMenuP.setVisible(true);
            RegistroRuta.this.dispose();
    }//GEN-LAST:event_JButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroRuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroRuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboHorario;
    private javax.swing.JButton JButton;
    private javax.swing.JToggleButton JToggle;
    private javax.swing.JTextField guiNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
