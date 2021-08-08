
package vista;

import conexion.Conexion;
import controlador.Controlador;


public class Vista extends javax.swing.JFrame { // inicio clase Vista
        
    Conexion con = new Conexion();
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }
public static void main(String args[]) {
        Vista v = new Vista();
        Controlador con = new Controlador(v);
        v.setVisible(true);
        v.setLocationRelativeTo(null);
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
        label = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtCOM_ID = new javax.swing.JTextField();
        txtCOM_NOMBRE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bntListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Comuna ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("CÓDIGO COMUNA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 200, 70));

        label.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(51, 51, 51));
        label.setText("NOMBRE COMUNA");
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 200, 70));

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 180, 80));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 180, 80));

        txtCOM_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCOM_IDActionPerformed(evt);
            }
        });
        jPanel1.add(txtCOM_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 240, 50));
        jPanel1.add(txtCOM_NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 200, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código Comuna", "Nombre Comuna", "Estado Comuna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 940, 280));

        bntListar.setText("LISTAR COMUNA");
        jPanel1.add(bntListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCOM_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCOM_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCOM_IDActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntListar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label;
    private javax.swing.JTextField txtCOM_ID;
    private javax.swing.JTextField txtCOM_NOMBRE;
    // End of variables declaration//GEN-END:variables

    
}// fin clase Vista
