/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser.jjint.javainterui.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import ser.jint.bo.Books;
import ser.jint.bo.Electronic;
import ser.jint.bo.Music;
import ser.jint.builder.ItemAutoSequence;
import ser.jint.facade.OrderFacadeSubject;
import ser.jint.factory.ItemFactory;
import ser.jint.javainterui.datamodels.ItemDataModel;

/**
 *
 * @author Razorback
 */
public class ABMItems extends javax.swing.JFrame {

    /**
     * Creates new form ABMItems
     */
    public ABMItems() {
        initComponents();
        centrarPantalla();
        initFields();
        initTable();
    }

    private void centrarPantalla() {
        Dimension tamFrame = this.getSize();//para obtener las dimensiones del frame
        Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();//para obtener el tamaño de la pantalla
        setLocation((tamPantalla.width - tamFrame.width) / 2, (tamPantalla.height - tamFrame.height) / 2);//para posicionar
    }

    private void initFields() {
        String combo = (String) this.cmbItemTypes.getSelectedItem();

        if (combo.equalsIgnoreCase("Libro")) {
            enableMusic(false);
            enableElectronic(false);
        }
    }

    private void initTable() {
        ItemDataModel dataModel = new ItemDataModel(OrderFacadeSubject.getInstance().getItemList());
        this.tblAllItems.setModel(dataModel);
    }

    private void enableMusic(boolean state) {
        this.txtMusicArtist.setEnabled(state);
        this.txtMusicLabel.setEnabled(state);
        this.txtMusicSongs.setEnabled(state);
    }

    private void enableElectronic(boolean state) {
        this.txtElectronicMark.setEnabled(state);
        this.cmbElectronicTypes.setEnabled(state);
    }

    private void enableBooks(boolean state) {
        this.txtBookDate.setEnabled(state);
        this.txtBookEditor.setEnabled(state);
        this.txtBookPages.setEnabled(state);
    }
    
    private void clearFields(){
        this.txtBookDate.setText(null);
        this.txtBookEditor.setText(null);
        this.txtBookPages.setText(null);
        this.txtElectronicMark.setText(null);
        this.txtItemDescription.setText(null);
        this.txtItemPrice.setText(null);
        this.txtItemStock.setText(null);
        this.txtItemTax.setText(null);
        this.txtMusicArtist.setText(null);
        this.txtMusicLabel.setText(null);
        this.txtMusicSongs.setText(null);
        this.cmbItemTypes.setSelectedIndex(0);
        this.cmbElectronicTypes.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblItemDescription = new javax.swing.JLabel();
        txtItemDescription = new javax.swing.JTextField();
        lblItemPrice = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JTextField();
        lblItemStock = new javax.swing.JLabel();
        txtItemStock = new javax.swing.JTextField();
        lblItemTax = new javax.swing.JLabel();
        txtItemTax = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmbItemTypes = new javax.swing.JComboBox();
        lblBookPages = new javax.swing.JLabel();
        txtBookPages = new javax.swing.JTextField();
        lblBookEditor = new javax.swing.JLabel();
        txtBookEditor = new javax.swing.JTextField();
        lblBookDate = new javax.swing.JLabel();
        txtBookDate = new javax.swing.JFormattedTextField();
        lblElectronicMark = new javax.swing.JLabel();
        txtElectronicMark = new javax.swing.JTextField();
        lblElectronicType = new javax.swing.JLabel();
        lblMusicLabel = new javax.swing.JLabel();
        txtMusicLabel = new javax.swing.JTextField();
        lblMusicSongs = new javax.swing.JLabel();
        txtMusicSongs = new javax.swing.JTextField();
        lblElectronicType3 = new javax.swing.JLabel();
        txtMusicArtist = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        cmbElectronicTypes = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllItems = new javax.swing.JTable();
        cmbShowItems = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ABM Items");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Generales"));

        lblItemDescription.setText("Descripcion Item");

        lblItemPrice.setText("Precio Lista");

        lblItemStock.setText("Stock");

        lblItemTax.setText("Impuesto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtItemDescription))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblItemStock, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtItemStock, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblItemTax, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtItemTax, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemDescription)
                    .addComponent(txtItemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemPrice)
                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemTax)
                    .addComponent(txtItemTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemStock)
                    .addComponent(txtItemStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especificos"));

        cmbItemTypes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Libro", "Electronica", "Musica" }));
        cmbItemTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbItemTypesActionPerformed(evt);
            }
        });

        lblBookPages.setText("Cantidad Paginas");

        lblBookEditor.setText("Editor");

        lblBookDate.setText("Fecha Edicion");

        txtBookDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        lblElectronicMark.setText("Marca");

        lblElectronicType.setText("Tipo");

        lblMusicLabel.setText("Discografica");

        lblMusicSongs.setText("Cant. Canciones");

        lblElectronicType3.setText("Artista");

        btnAddItem.setText("Agregar Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        cmbElectronicTypes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celular", "TV", "Consola VideoJuego", "Lavarropa" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblBookEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBookEditor))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblElectronicMark, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtElectronicMark))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(cmbItemTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddItem))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblBookPages, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBookPages, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblBookDate, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBookDate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblMusicSongs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMusicSongs, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(lblElectronicType, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(cmbElectronicTypes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lblElectronicType3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMusicArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblMusicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMusicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMusicSongs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMusicSongs))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbItemTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBookPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBookPages)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblElectronicType)
                                .addComponent(cmbElectronicTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBookEditor)
                                .addComponent(txtBookEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblElectronicType3)
                                .addComponent(txtMusicArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBookDate)
                                .addComponent(txtBookDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMusicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMusicLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblElectronicMark)
                            .addComponent(txtElectronicMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tblAllItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAllItems);

        cmbShowItems.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Libro", "Electronica", "Musica" }));
        cmbShowItems.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbShowItemsItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbShowItems, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbShowItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbItemTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemTypesActionPerformed
        String combo = (String) this.cmbItemTypes.getSelectedItem();

        switch (combo) {
            case "Libro":
                enableBooks(true);
                enableElectronic(false);
                enableMusic(false);
                break;
            case "Electronica":
                enableBooks(false);
                enableElectronic(true);
                enableMusic(false);
                break;
            case "Musica":
                enableBooks(false);
                enableElectronic(false);
                enableMusic(true);
                break;
        }
    }//GEN-LAST:event_cmbItemTypesActionPerformed

    private void createBook() throws ParseException {
        Books b = ItemFactory.getItemFactory(ItemFactory.BOOKS).getBooks();

        b.setItemDescription(this.txtItemDescription.getText());
        b.setPrice(new Double(this.txtItemPrice.getText()));
        b.setTax(new Double(this.txtItemTax.getText()));
        b.setStock((int) (Math.random() * 100));

        b.setPublishDate(new SimpleDateFormat("dd/MM/yyyy").parse(this.txtBookDate.getText()));
        b.setEditor(this.txtBookEditor.getText());
        b.setPages(new Integer(this.txtBookPages.getText()));

        b.setItemId(ItemAutoSequence.getInstance().getNextSequence());

        OrderFacadeSubject.getInstance().addItem(b);
    }

    private void createElectronic() {
        Electronic e = ItemFactory.getItemFactory(ItemFactory.ELECTRONIC).getElectronic();

        e.setItemDescription(this.txtItemDescription.getText());
        e.setPrice(new Double(this.txtItemPrice.getText()));
        e.setTax(new Double(this.txtItemTax.getText()));
        e.setStock((int) (Math.random() * 100));

        e.setMark(this.txtElectronicMark.getText());
        e.setType((String) this.cmbElectronicTypes.getSelectedItem());

        e.setItemId(ItemAutoSequence.getInstance().getNextSequence());

        OrderFacadeSubject.getInstance().addItem(e);
    }

    private void createMusic() {
        Music m = ItemFactory.getItemFactory(ItemFactory.MUSIC).getMusic();

        m.setItemDescription(this.txtItemDescription.getText());
        m.setPrice(new Double(this.txtItemPrice.getText()));
        m.setTax(new Double(this.txtItemTax.getText()));
        m.setStock((int) (Math.random() * 100));

        m.setArtist(txtMusicArtist.getText());
        m.setLabel(this.txtMusicLabel.getText());
        m.setSongs(new Integer(this.txtMusicSongs.getText()));

        m.setItemId(ItemAutoSequence.getInstance().getNextSequence());

        OrderFacadeSubject.getInstance().addItem(m);
    }

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        String combo = (String) this.cmbItemTypes.getSelectedItem();

        switch (combo) {
            case "Libro": {
                try {
                    createBook();
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error en conversion de datos", JOptionPane.ERROR_MESSAGE);
                }
            }
            break;
            case "Electronica":
                createElectronic();
                break;
            case "Musica":
                createMusic();
                break;
        }

        initTable();
        clearFields();
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void cmbShowItemsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbShowItemsItemStateChanged
        String combo = (String) this.cmbShowItems.getSelectedItem();
        ItemDataModel dataModel = null;
        
        switch (combo) {
            case "Todos":
                initTable();
                break;
            case "Libro":
                dataModel = new ItemDataModel(OrderFacadeSubject.getInstance().itemTypeSearch("Books"));
                this.tblAllItems.setModel(dataModel);
                break;
            case "Electronica":
                dataModel = new ItemDataModel(OrderFacadeSubject.getInstance().itemTypeSearch("Electronic"));
                this.tblAllItems.setModel(dataModel);
                break;
            case "Musica":
                dataModel = new ItemDataModel(OrderFacadeSubject.getInstance().itemTypeSearch("Music"));
                this.tblAllItems.setModel(dataModel);
                break;
        }
    }//GEN-LAST:event_cmbShowItemsItemStateChanged

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
                new ABMItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JComboBox cmbElectronicTypes;
    private javax.swing.JComboBox cmbItemTypes;
    private javax.swing.JComboBox cmbShowItems;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBookDate;
    private javax.swing.JLabel lblBookEditor;
    private javax.swing.JLabel lblBookPages;
    private javax.swing.JLabel lblElectronicMark;
    private javax.swing.JLabel lblElectronicType;
    private javax.swing.JLabel lblElectronicType3;
    private javax.swing.JLabel lblItemDescription;
    private javax.swing.JLabel lblItemPrice;
    private javax.swing.JLabel lblItemStock;
    private javax.swing.JLabel lblItemTax;
    private javax.swing.JLabel lblMusicLabel;
    private javax.swing.JLabel lblMusicSongs;
    private javax.swing.JTable tblAllItems;
    private javax.swing.JFormattedTextField txtBookDate;
    private javax.swing.JTextField txtBookEditor;
    private javax.swing.JTextField txtBookPages;
    private javax.swing.JTextField txtElectronicMark;
    private javax.swing.JTextField txtItemDescription;
    private javax.swing.JTextField txtItemPrice;
    private javax.swing.JTextField txtItemStock;
    private javax.swing.JTextField txtItemTax;
    private javax.swing.JTextField txtMusicArtist;
    private javax.swing.JTextField txtMusicLabel;
    private javax.swing.JTextField txtMusicSongs;
    // End of variables declaration//GEN-END:variables
}
