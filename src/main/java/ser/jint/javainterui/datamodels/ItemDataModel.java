/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser.jint.javainterui.datamodels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import ser.jint.bo.Items;

/**
 *
 * @author Razorback
 */
public class ItemDataModel extends AbstractTableModel{
    
    private List<Items> items;
    
    private static final String[] COLUMN_NAMES ={"Id", "Descripcion", "Tipo", "Precio s/Impuestos", "Precio c/Impuestos"};
    
    public ItemDataModel(List<Items> items){
        this.items = items;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }

    
    @Override
    public int getRowCount() {
        return this.items.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Items aux = this.items.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return aux.getItemId();
            case 1:
                return aux.getItemDescription();
            case 2:
                return aux.getItemType();
            case 3:
                return aux.getPrice();
            case 4:
                return aux.getPriceWithTax();
                
        }
        return null;
    }
    
}
