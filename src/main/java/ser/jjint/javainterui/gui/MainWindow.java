/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser.jjint.javainterui.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ser.jint.facade.OrderFacadeSubject;
import ser.jint.javainterui.datamodels.OrderDataModel;
import ser.jint.wizardmodels.CreateOrder;

/**
 *
 * @author Razorback
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        centrarPantalla();
        initOrderTable();
    }

    private void centrarPantalla() {
        Dimension tamFrame = this.getSize();//para obtener las dimensiones del frame
        Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();//para obtener el tamaño de la pantalla
        setLocation((tamPantalla.width - tamFrame.width) / 2, (tamPantalla.height - tamFrame.height) / 2);//para posicionar
    }
    
    private void initOrderTable(){
        OrderDataModel dataModel = new OrderDataModel(OrderFacadeSubject.getInstance().getOrderList());
        this.tblOrders.setModel(dataModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupRadFind = new javax.swing.ButtonGroup();
        btnGroupRadOrder = new javax.swing.ButtonGroup();
        pnlTasks = new javax.swing.JPanel();
        btnCargarDatos = new javax.swing.JButton();
        btnGuardarDatos = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        pnlFooter = new javax.swing.JPanel();
        pnlFunctions = new javax.swing.JPanel();
        pnlOrderFind = new javax.swing.JPanel();
        lblCampoBusqueda = new javax.swing.JLabel();
        txtCampoBusqueda = new javax.swing.JTextField();
        radFindNroCliente = new javax.swing.JRadioButton();
        radFindNroOrden = new javax.swing.JRadioButton();
        pnlEstadoOrden = new javax.swing.JPanel();
        cmbStatusOrder = new javax.swing.JComboBox();
        btnFindOrder = new javax.swing.JButton();
        pnlOrderListCriteria = new javax.swing.JPanel();
        radCriteriaNroOrden = new javax.swing.JRadioButton();
        radCriteriaEstadoOrden = new javax.swing.JRadioButton();
        radCriteriaFechaCreacion = new javax.swing.JRadioButton();
        pnlHigherFunctions = new javax.swing.JPanel();
        btnNuevaOrden = new javax.swing.JButton();
        btnAbmItem = new javax.swing.JButton();
        btnCambioEstadoOrden = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Pedidos");
        setResizable(false);

        btnCargarDatos.setText("Cargar Datos");

        btnGuardarDatos.setText("Guardar Datos");

        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTasksLayout = new javax.swing.GroupLayout(pnlTasks);
        pnlTasks.setLayout(pnlTasksLayout);
        pnlTasksLayout.setHorizontalGroup(
            pnlTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCargarDatos)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarDatos)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(660, Short.MAX_VALUE))
        );
        pnlTasksLayout.setVerticalGroup(
            pnlTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarDatos)
                    .addComponent(btnGuardarDatos)
                    .addComponent(btnRefresh))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTasks, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout pnlFooterLayout = new javax.swing.GroupLayout(pnlFooter);
        pnlFooter.setLayout(pnlFooterLayout);
        pnlFooterLayout.setHorizontalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1009, Short.MAX_VALUE)
        );
        pnlFooterLayout.setVerticalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        getContentPane().add(pnlFooter, java.awt.BorderLayout.PAGE_END);

        pnlFunctions.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        pnlOrderFind.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Orden"));

        lblCampoBusqueda.setText("Campo Busqueda");

        btnGroupRadFind.add(radFindNroCliente);
        radFindNroCliente.setSelected(true);
        radFindNroCliente.setText("Nro Cliente");

        btnGroupRadFind.add(radFindNroOrden);
        radFindNroOrden.setText("Nro Orden");

        pnlEstadoOrden.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Orden"));

        cmbStatusOrder.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Centro Distribucion", "Creado", "Despachado", "Entregado", "Cancelado" }));

        javax.swing.GroupLayout pnlEstadoOrdenLayout = new javax.swing.GroupLayout(pnlEstadoOrden);
        pnlEstadoOrden.setLayout(pnlEstadoOrdenLayout);
        pnlEstadoOrdenLayout.setHorizontalGroup(
            pnlEstadoOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadoOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbStatusOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEstadoOrdenLayout.setVerticalGroup(
            pnlEstadoOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadoOrdenLayout.createSequentialGroup()
                .addComponent(cmbStatusOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        btnFindOrder.setText("Buscar");

        javax.swing.GroupLayout pnlOrderFindLayout = new javax.swing.GroupLayout(pnlOrderFind);
        pnlOrderFind.setLayout(pnlOrderFindLayout);
        pnlOrderFindLayout.setHorizontalGroup(
            pnlOrderFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderFindLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrderFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCampoBusqueda)
                    .addGroup(pnlOrderFindLayout.createSequentialGroup()
                        .addGroup(pnlOrderFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCampoBusqueda)
                            .addComponent(pnlEstadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(pnlOrderFindLayout.createSequentialGroup()
                        .addGroup(pnlOrderFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radFindNroCliente)
                            .addComponent(radFindNroOrden))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFindOrder)))
                .addContainerGap())
        );
        pnlOrderFindLayout.setVerticalGroup(
            pnlOrderFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderFindLayout.createSequentialGroup()
                .addComponent(lblCampoBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCampoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlOrderFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOrderFindLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radFindNroCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radFindNroOrden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrderFindLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFindOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(pnlEstadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlOrderListCriteria.setBorder(javax.swing.BorderFactory.createTitledBorder("Criterios de Ordenamiento"));

        btnGroupRadOrder.add(radCriteriaNroOrden);
        radCriteriaNroOrden.setSelected(true);
        radCriteriaNroOrden.setText("Nro Orden");

        btnGroupRadOrder.add(radCriteriaEstadoOrden);
        radCriteriaEstadoOrden.setText("Estado Orden");

        btnGroupRadOrder.add(radCriteriaFechaCreacion);
        radCriteriaFechaCreacion.setText("Fecha Creacion");

        javax.swing.GroupLayout pnlOrderListCriteriaLayout = new javax.swing.GroupLayout(pnlOrderListCriteria);
        pnlOrderListCriteria.setLayout(pnlOrderListCriteriaLayout);
        pnlOrderListCriteriaLayout.setHorizontalGroup(
            pnlOrderListCriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderListCriteriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrderListCriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radCriteriaNroOrden)
                    .addComponent(radCriteriaEstadoOrden)
                    .addComponent(radCriteriaFechaCreacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOrderListCriteriaLayout.setVerticalGroup(
            pnlOrderListCriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderListCriteriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radCriteriaNroOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radCriteriaEstadoOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radCriteriaFechaCreacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHigherFunctions.setBorder(javax.swing.BorderFactory.createTitledBorder("Otras Funciones"));

        btnNuevaOrden.setText("Crear Nueva Orden");
        btnNuevaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaOrdenActionPerformed(evt);
            }
        });

        btnAbmItem.setText("ABM Item");
        btnAbmItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbmItemActionPerformed(evt);
            }
        });

        btnCambioEstadoOrden.setText("Cambiar Estado Orden");

        javax.swing.GroupLayout pnlHigherFunctionsLayout = new javax.swing.GroupLayout(pnlHigherFunctions);
        pnlHigherFunctions.setLayout(pnlHigherFunctionsLayout);
        pnlHigherFunctionsLayout.setHorizontalGroup(
            pnlHigherFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHigherFunctionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHigherFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevaOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbmItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCambioEstadoOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHigherFunctionsLayout.setVerticalGroup(
            pnlHigherFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHigherFunctionsLayout.createSequentialGroup()
                .addComponent(btnNuevaOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCambioEstadoOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbmItem)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout pnlFunctionsLayout = new javax.swing.GroupLayout(pnlFunctions);
        pnlFunctions.setLayout(pnlFunctionsLayout);
        pnlFunctionsLayout.setHorizontalGroup(
            pnlFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFunctionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlOrderFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOrderListCriteria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlHigherFunctions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFunctionsLayout.setVerticalGroup(
            pnlFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFunctionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOrderFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlOrderListCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlHigherFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(pnlFunctions, java.awt.BorderLayout.LINE_START);

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblOrders);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaOrdenActionPerformed
        // TODO add your handling code here:
        CreateOrder wizard = new CreateOrder();
        wizard.main();
    }//GEN-LAST:event_btnNuevaOrdenActionPerformed

    private void btnAbmItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbmItemActionPerformed
        ABMItems items = new ABMItems();
        items.setVisible(true);
    }//GEN-LAST:event_btnAbmItemActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        initOrderTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException | IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Error cargando UI", JOptionPane.ERROR_MESSAGE);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbmItem;
    private javax.swing.JButton btnCambioEstadoOrden;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnFindOrder;
    private javax.swing.ButtonGroup btnGroupRadFind;
    private javax.swing.ButtonGroup btnGroupRadOrder;
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JButton btnNuevaOrden;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox cmbStatusOrder;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCampoBusqueda;
    private javax.swing.JPanel pnlEstadoOrden;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlFunctions;
    private javax.swing.JPanel pnlHigherFunctions;
    private javax.swing.JPanel pnlOrderFind;
    private javax.swing.JPanel pnlOrderListCriteria;
    private javax.swing.JPanel pnlTasks;
    private javax.swing.JRadioButton radCriteriaEstadoOrden;
    private javax.swing.JRadioButton radCriteriaFechaCreacion;
    private javax.swing.JRadioButton radCriteriaNroOrden;
    private javax.swing.JRadioButton radFindNroCliente;
    private javax.swing.JRadioButton radFindNroOrden;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTextField txtCampoBusqueda;
    // End of variables declaration//GEN-END:variables
}
