/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser.jint.javainterui.datamodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import ser.jint.bo.OrderDetail;

/**
 *
 * @author Razor15
 */
public class OrderDetailDataModel extends AbstractTableModel{

    private List<OrderDetail> detailOrder;
    
    private static final String[] COLUMNS = {"ItemId", "Descripcion", "Cantidad", "Subtotal"};
    
    public OrderDetailDataModel(List<OrderDetail> detail){
        this.detailOrder = detail;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNS[column];
    }
    
    
    @Override
    public int getRowCount() {
        return detailOrder.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        OrderDetail od = this.detailOrder.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return od.getItem().getItemId();
            case 1:
                return od.getItem().getItemDescription();
            case 2:
                return od.getQuantity();
            case 3:
                return od.getDetailTotal();
        }
        
        return null;
    }
}
