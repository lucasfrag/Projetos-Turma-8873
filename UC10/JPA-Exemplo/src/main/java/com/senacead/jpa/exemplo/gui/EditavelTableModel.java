package com.senacead.jpa.exemplo.gui;

import javax.swing.table.DefaultTableModel;

public class EditavelTableModel extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
        // Permita a edição de todas as células
        return true;
    }
}
