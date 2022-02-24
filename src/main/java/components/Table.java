package components;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Table {

public JScrollPane createTable(JTable table) {
		table.setModel(new DefaultTableModel(new Object[][] {},
			new String[] { "ID", "CODIGO", "NOMBRE", "DESCRIPCION", "COLOR","METODO DE CRIANZA"}));
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setBounds(10, 202, 509, 153);
		table.setPreferredScrollableViewportSize(new Dimension(450, 63));
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setVisible(true);
		scroll.setBounds(10, 202, 509, 153);
		return scroll;

	}
}
