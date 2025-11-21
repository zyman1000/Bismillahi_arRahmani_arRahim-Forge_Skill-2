package backend;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class TableLoader {
    public static <T extends AbstractDisplay> void load(DefaultTableModel model, List<T> list) {
        model.setRowCount(0);
         if (list == null) return; 
        for (T item : list) {
            Object[] row = { item.getId(), item.getTitle() };
            model.addRow(row);
        }
    }
}