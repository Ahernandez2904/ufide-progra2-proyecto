/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Leonardo Vargas
 */
public class IniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public IniciarSesion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uiUsuario = new javax.swing.JTextField();
        uiPassword = new javax.swing.JPasswordField();
        uiInicio = new javax.swing.JButton();
        uiAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiUsuarioActionPerformed(evt);
            }
        });
        uiUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uiUsuarioKeyTyped(evt);
            }
        });

        uiInicio.setText("Iniciar");
        uiInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uiInicioMouseClicked(evt);
            }
        });

        uiAgregar.setText("Agregar");
        uiAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uiAgregarMouseClicked(evt);
            }
        });
        uiAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Inicio de Sesion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel3)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setText("Usuario");

        jLabel2.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uiAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uiInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uiUsuario)
                    .addComponent(uiPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addComponent(uiInicio)
                .addGap(18, 18, 18)
                .addComponent(uiAgregar)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiUsuarioActionPerformed

    private void uiAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiAgregarActionPerformed

    private void uiUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uiUsuarioKeyTyped
               char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese su cedula");
        }
    }//GEN-LAST:event_uiUsuarioKeyTyped

    private void uiAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uiAgregarMouseClicked
        RegistroChofer RegistroC = new RegistroChofer();
        RegistroC.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_uiAgregarMouseClicked

    private void uiInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uiInicioMouseClicked
          String nombre = null;
        String apellido = null;
        int id;
        int edad;
        String genero = null;
        String departamento= null;
        String horario= null;
        String usuario = null;
        String contrasenna = null;
        int cont = 0;
         try{
            File fichero_entrada;
            File fichero_salida = null;
           
            fichero_entrada = new File ("RegistroChofer\\"+uiUsuario.getText()+".txt");
            fichero_entrada = new File (System.getProperty("user.dir")+"\\RegistroChofer\\"+uiUsuario.getText()+".txt");

            //Si no hay fichero de entrada no hacemos proceso de cálculo
            if (!fichero_entrada.exists()) {
                System.out.println ("No existe el fichero de entrada especificado"); 
            }

            else { 
                
                Scanner scan1 = new Scanner (fichero_entrada);
                ArrayList<String> datosDeEntrada = new ArrayList<String>();
                int contador = 0;
                
                while (contador<3){
                    String lineaExtraida = scan1.nextLine();
                    datosDeEntrada.add(lineaExtraida);
                    contador++;
                }



                String [] datosDeEntradaArray = new String[contador];

                for (int i=0; i<datosDeEntradaArray.length; i++){
                    datosDeEntradaArray[i] = datosDeEntrada.get(i);
                    if(i==0){
                         nombre = datosDeEntradaArray[i];
                    }
                    if(i==1){
                         usuario = datosDeEntradaArray[i];
                    }
                    if(i==2){
                         contrasenna = datosDeEntradaArray[i];
                    }
                   
                }

            }
        }catch (FileNotFoundException e) {System.out.println ("Se ha producido un error " +e + ". Revise argumentos y datos");}
        
                
        if(uiPassword.getText().equals(contrasenna)==true && uiUsuario.getText().equals(usuario)==true){
            JOptionPane.showMessageDialog(null, "Bienvenido(a) "+ nombre);
         
            MenuPrincipal jmenu = new MenuPrincipal();
            jmenu.setVisible(true);
            IniciarSesion.this.dispose();
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Error de credenciales");
            uiPassword.setText(null);
            uiUsuario.setText(null);
                cont++;                             
        }
    }//GEN-LAST:event_uiInicioMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton uiAgregar;
    private javax.swing.JButton uiInicio;
    private javax.swing.JPasswordField uiPassword;
    private javax.swing.JTextField uiUsuario;
    // End of variables declaration//GEN-END:variables
}
