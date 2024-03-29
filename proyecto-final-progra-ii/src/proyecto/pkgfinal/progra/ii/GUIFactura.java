package proyecto.pkgfinal.progra.ii;

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUIFactura extends javax.swing.JFrame {

    private LinkedList<FacturasBuses> facturas;
    //int CuentaDeOro = 0; //Esta es la cuenta de todos los ciudadanos de oro en el dia y que sera financiada por la empresa
    //int CantidadNinos = 0; //Conteo para ver cuantos Ninos ingresaron en el dia
    //int CantidadAdultos = 0; //Conteo para ver cuantos Adultos ingresaron en el dia

    //String[] choferes = {"Andres Vargas", "Mariana Diaz", "Alvaro Matarrita", "Maria Gonzalez", "Michael Conejo"};
    //String[] rutas = {"RT-789 / SJO - Tres Rios", "RT-456 / SJO - San Diego", "RT-231 / SJO - Concepcion"};
    

    final File choferesFolder = new File(System.getProperty("user.dir") + "\\RegistroChofer");
    final File rutasFolder = new File(System.getProperty("user.dir") + "\\RegistroRuta");
    final File busesFolder = new File(System.getProperty("user.dir") + "\\RegistroBus");

    public void iniciarComboboxBuses (final File folder) {
            //for (int i = 0; i <= rutas.length - 1; i++) { uiComboID.addItem(rutas[i]); }
        try {
            for (final File fileEntry : folder.listFiles()) { // For que busca todos los archivos de la carpeta
                if (fileEntry.isDirectory()) { //Si hay una carpeta, entra a revisarla
                    iniciarComboboxChoferes(fileEntry); //lo inicia 
                } else {//sino sigue normal
                    //System.out.println(fileEntry.getName()); //nombre del archivo
                    //crea el fichero con la dirección del bus y el nombre del archivo
                    File fichero_entrada = new File(folder + "\\" + fileEntry.getName());
                    Scanner scan1 = new Scanner(fichero_entrada); //lo abre
                    ArrayList<String> datosDeEntrada = new ArrayList<String>();
                    String lineaExtraida = scan1.nextLine();//escanea la primera linea, donde esta el nombre
                    //System.out.println(lineaExtraida); //imprime el nombre
                    UIBus.addItem(lineaExtraida); //los agrega como items
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUIFactura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    

    public void iniciarComboboxRutas(final File folder) {
        //for (int i = 0; i <= rutas.length - 1; i++) { uiComboID.addItem(rutas[i]); }
        try {
            for (final File fileEntry : folder.listFiles()) { // For que busca todos los archivos de la carpeta
                if (fileEntry.isDirectory()) { //Si hay una carpeta, entra a revisarla
                    iniciarComboboxChoferes(fileEntry); //lo inicia
                } else {//sino sigue normal
                    //System.out.println(fileEntry.getName()); //nombre del archivo
                    //crea el fichero con la dirección de ruta y el nombre del archivo
                    File fichero_entrada = new File(folder + "\\" + fileEntry.getName());
                    Scanner scan1 = new Scanner(fichero_entrada); //lo abre
                    ArrayList<String> datosDeEntrada = new ArrayList<String>();
                    String lineaExtraida = scan1.nextLine();//escanea la primera linea, donde esta el nombre
                    //System.out.println(lineaExtraida); //imprime el nombre
                    uiComboID.addItem(lineaExtraida); //los agrega como items
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUIFactura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void iniciarComboboxChoferes(final File folder) {
        try {
            for (final File fileEntry : folder.listFiles()) { // For que busca todos los archivos de la carpeta
                if (fileEntry.isDirectory()) { //Si hay una carpeta, entra a revisarla
                    iniciarComboboxChoferes(fileEntry); //lo inicia
                } else {//sino sigue normal
                    //System.out.println(fileEntry.getName()); //nombre del archivo
                    //crea el fichero con la dirección de chofer y el nombre del archivo
                    File fichero_entrada = new File(folder + "\\" + fileEntry.getName());
                    Scanner scan1 = new Scanner(fichero_entrada); //lo abre
                    ArrayList<String> datosDeEntrada = new ArrayList<String>();
                    String lineaExtraida = scan1.nextLine();//escanea la primera linea, donde esta el nombre
                    //System.out.println(lineaExtraida); //imprime el nombre
                    uiComboNombre.addItem(lineaExtraida); //los agrega como items
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUIFactura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public GUIFactura() {
        initComponents();
        setTitle("Factura");
        setLocationRelativeTo(null);
        iniciarComboboxChoferes(choferesFolder);
        iniciarComboboxRutas(rutasFolder);
        iniciarComboboxBuses(busesFolder);
        facturas = new LinkedList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uiButtonAgregarRegistro = new javax.swing.JButton();
        uiButtonVerFacActual = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uiButtonCargarFactura = new javax.swing.JButton();
        uiButtonGuardarFactura = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        uiLista = new javax.swing.JTextArea();
        uiComboEdad = new javax.swing.JComboBox<>();
        uiComboNombre = new javax.swing.JComboBox<>();
        uiComboID = new javax.swing.JComboBox<>();
        uiTXTfecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UIBus = new javax.swing.JComboBox<>();
        uiButtonCargarFactura1 = new javax.swing.JButton();
        uiNoPago = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Nombre del Chofer");

        uiButtonAgregarRegistro.setText("Agregar Registro");
        uiButtonAgregarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiButtonAgregarRegistroActionPerformed(evt);
            }
        });

        uiButtonVerFacActual.setText("Ver Factura Actual");
        uiButtonVerFacActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiButtonVerFacActualActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("ID de la Ruta");
        jLabel2.setToolTipText("");

        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Edad Pasajero");
        jLabel5.setToolTipText("");

        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Fecha");
        jLabel6.setToolTipText("");

        uiButtonCargarFactura.setText("Cargar Factura");
        uiButtonCargarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiButtonCargarFacturaActionPerformed(evt);
            }
        });

        uiButtonGuardarFactura.setText("Guardar Factura");
        uiButtonGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiButtonGuardarFacturaActionPerformed(evt);
            }
        });

        uiLista.setColumns(20);
        uiLista.setRows(5);
        jScrollPane1.setViewportView(uiLista);

        uiComboEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menor a 18", "Mayor a 18", "Ciudadano de Oro", " " }));
        uiComboEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiComboEdadActionPerformed(evt);
            }
        });

        uiComboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiComboNombreActionPerformed(evt);
            }
        });

        uiComboID.setAutoscrolls(true);
        uiComboID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiComboIDActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("ID del bus");
        jLabel3.setToolTipText("");

        UIBus.setAutoscrolls(true);
        UIBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIBusActionPerformed(evt);
            }
        });

        uiButtonCargarFactura1.setText("Volver al Menu Principal");
        uiButtonCargarFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiButtonCargarFactura1ActionPerformed(evt);
            }
        });

        uiNoPago.setText("No Pago");
        uiNoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiNoPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uiButtonCargarFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uiButtonGuardarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uiComboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uiComboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(uiComboID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uiTXTfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uiNoPago, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(UIBus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uiButtonVerFacActual, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(uiButtonAgregarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 9, Short.MAX_VALUE))))
                    .addComponent(uiButtonCargarFactura1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uiComboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiComboID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UIBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uiButtonAgregarRegistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uiComboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uiTXTfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(uiNoPago)
                        .addComponent(uiButtonVerFacActual)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(uiButtonGuardarFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uiButtonCargarFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uiButtonCargarFactura1)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uiButtonAgregarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiButtonAgregarRegistroActionPerformed
        String nombreChofer = String.valueOf(uiComboNombre.getSelectedItem());
        String IDruta = String.valueOf(uiComboID.getSelectedItem());
        String bus = String.valueOf(UIBus.getSelectedItem());

        String edadPasajero = null;
        int montoPasaje = 0;
        
        try{
            if (uiComboEdad.getSelectedIndex() == 0) {
                montoPasaje = 300; //se aplica un descuento por ser menor
                edadPasajero = "Menor de Edad";
                throw new NinoPequenoException(montoPasaje);
            }
            if (uiComboEdad.getSelectedIndex() == 1) {
                montoPasaje = 600;   //se cobra normal porque es mayor de edad
                edadPasajero = "Mayor de Edad";
            }
            if (uiComboEdad.getSelectedIndex() == 2) {
                montoPasaje = 0; //se aplica un descuento total y se asigna a la cuenta de oro
                edadPasajero = "Ciudadano de Oro";
                throw new adultoException(montoPasaje);
            }
        }catch (adultoException e) { JOptionPane.showMessageDialog(null, e);
        }catch (NinoPequenoException e) { JOptionPane.showMessageDialog(null, e); }
        String fecha = uiTXTfecha.getText();

        try { //valida fecha
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
            facturas.add(new FacturasBuses(nombreChofer, IDruta, edadPasajero, montoPasaje, fecha, bus));
            JOptionPane.showMessageDialog(null, "Factura agregada");
        } catch (ParseException e) {
            System.out.println(e); //salta si la fecha esta mal
            JOptionPane.showMessageDialog(null, "Utilice el formato fecha dd/MM/yyyy");
        } catch (Exception e) {
            System.out.println(e); //salta los demás errores
            JOptionPane.showMessageDialog(null, "Porfavor rellene el espacio de 'fecha' para continuar");
        }
        /*
            if (fecha.isEmpty() == false ){
                facturas.add (new FacturasBuses(nombreChofer, IDruta, edadPasajero, montoPasaje, fecha));
                System.out.println(nombreChofer + IDruta + edadPasajero + montoPasaje + fecha);
            }else{
                JOptionPane.showMessageDialog(null, "Porfavor rellene el espacio de 'fecha' para continuar");
            }
        */
        
        
        uiTXTfecha.setText("");

        //String fecha = uiTXTfecha.getText();
        //facturas.add (new FacturasBuses(nombreChofer, IDruta, edadPasajero, montoPasaje, fecha,bus));
        //uiTXTfecha.setText(""); 
    }//GEN-LAST:event_uiButtonAgregarRegistroActionPerformed
    
    private void uiButtonVerFacActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiButtonVerFacActualActionPerformed
        for (FacturasBuses actual : facturas) {

            uiLista.append("Chofer: " + actual.getNombreChofer() + "       ||       " + "Ruta: " + actual.getIDRuta()
                    + "      ||      " + "Edad: " + actual.getEdadPasajero() + "       ||       "
                    + "Pasaje: " + actual.getMontoPasaje() + "                  ||       " + "Fecha:  " + actual.getFecha() + "\n");

        }

        /*  uiLista.append("El total a financiar de la cuenta de adultos mayores es de: " + CuentaDeOro +" colones\n" +
                           "La cantidad de Niños que ingreso fue: " + CantidadNinos + "Niños\n"+ 
                           "La cantidad de Adultos que ingreso fue: " + CantidadAdultos + "Adultos\n");  
         */

    }//GEN-LAST:event_uiButtonVerFacActualActionPerformed

    private void uiButtonGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiButtonGuardarFacturaActionPerformed
        JFileChooser fileDeFactura = new JFileChooser();
        int decision = fileDeFactura.showSaveDialog(null);

        if (decision == JFileChooser.APPROVE_OPTION) {
            File destino = fileDeFactura.getSelectedFile();
            try {
                FileOutputStream fos = new FileOutputStream(destino);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(facturas);
                oos.flush();
                oos.close();
            } catch (IOException ex) {
                uiLista.append("ERROR: " + ex);
            }
        }
    }//GEN-LAST:event_uiButtonGuardarFacturaActionPerformed

    private void uiButtonCargarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiButtonCargarFacturaActionPerformed
        JFileChooser cargarFactura = new JFileChooser();
        int decision = cargarFactura.showOpenDialog(null);
        if (decision == JFileChooser.APPROVE_OPTION) {
            File destino = cargarFactura.getSelectedFile();
            try {
                FileInputStream fis = new FileInputStream(destino);
                ObjectInputStream ois = new ObjectInputStream(fis);
                facturas = (LinkedList<FacturasBuses>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("ERROR: " + e);
            }
        }
    }//GEN-LAST:event_uiButtonCargarFacturaActionPerformed

    private void uiComboEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiComboEdadActionPerformed

    }//GEN-LAST:event_uiComboEdadActionPerformed

    private void uiComboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiComboNombreActionPerformed

    }//GEN-LAST:event_uiComboNombreActionPerformed

    private void uiComboIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiComboIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiComboIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            MenuPrincipal jMenuP = new MenuPrincipal();
            jMenuP.setVisible(true);
            GUIFactura.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UIBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIBusActionPerformed

    private void uiButtonCargarFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiButtonCargarFactura1ActionPerformed
            MenuPrincipal jMenuP = new MenuPrincipal();
            jMenuP.setVisible(true);
            GUIFactura.this.dispose();
    }//GEN-LAST:event_uiButtonCargarFactura1ActionPerformed

    private void uiNoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiNoPagoActionPerformed
        try{ 
            String edadPasajero = null;
            int montoPasaje = 0;
            if (uiComboEdad.getSelectedIndex() == 0) {
                montoPasaje = 300; //se aplica un descuento por ser menor
                edadPasajero = "Menor de Edad";
            }
            if (uiComboEdad.getSelectedIndex() == 1) {
                montoPasaje = 600;   //se cobra normal porque es mayor de edad
                edadPasajero = "Mayor de Edad";
            }
            if (uiComboEdad.getSelectedIndex() == 2) {
                montoPasaje = 0; //se aplica un descuento total y se asigna a la cuenta de oro
                edadPasajero = "Ciudadano de Oro";
            }
            throw new NoPagoException(montoPasaje);
        } catch(NoPagoException e){JOptionPane.showMessageDialog(null, e); }
    }//GEN-LAST:event_uiNoPagoActionPerformed

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
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> UIBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton uiButtonAgregarRegistro;
    private javax.swing.JButton uiButtonCargarFactura;
    private javax.swing.JButton uiButtonCargarFactura1;
    private javax.swing.JButton uiButtonGuardarFactura;
    private javax.swing.JButton uiButtonVerFacActual;
    private javax.swing.JComboBox<String> uiComboEdad;
    private javax.swing.JComboBox<String> uiComboID;
    private javax.swing.JComboBox<String> uiComboNombre;
    private javax.swing.JTextArea uiLista;
    private javax.swing.JButton uiNoPago;
    private javax.swing.JTextField uiTXTfecha;
    // End of variables declaration//GEN-END:variables
}
