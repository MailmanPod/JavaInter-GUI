/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser.jint.javainterui.datamodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import ser.jint.bo.Order;

/**
 *
 * @author Razorback
 */
public class OrderDataModel extends AbstractTableModel {
    
    private List<Order> orders;
    
    private static final String[] COLUMNS = {"ID", "Cliente", "Estado de la orden", "Cantidad Items"};
    
    public OrderDataModel(List<Order> orders){
        this.orders = orders;
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
        return this.orders.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Order aux = this.orders.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return aux.getOrderNumber();
            case 1:
                return aux.getClientName();
            case 2:
                return aux.getContextState();
            case 3:
                return aux.getOrderDetails().size();
        }
        
        return null;
    }
    
}
