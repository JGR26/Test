package helpers;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.Cactus;
import models.Ornamental;

public class PrintData {

	private int id;

	
	public void getAll(JTable table, List<Ornamental> listaOrna,List<Cactus> listaCact) {
		
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "CODIGO", "NOMBRE", "DESCRIPCION", "COLOR","METODO DE CRIANZA"}));
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		Object rows[] = new Object[6];
		
		for( Ornamental orna : listaOrna){
			
			rows[0]=id;
			rows[1]=orna.getCodigo();
			rows[2]=orna.getNombre();
			rows[3]=orna.getDescripcion();
			rows[4]=orna.getColor();
			rows[5]=orna.metodoDeCrianza();
			id++;
			model.addRow(rows);
			
		}
		table.setModel(model);
		for(Cactus cactus : listaCact) {
			
			rows[0]=id;
			rows[1]=cactus.getCodigo();
			rows[2]=cactus.getNombre();
			rows[3]=cactus.getDescripcion();
			rows[4]=cactus.colorDeFlor("");
			rows[5]=cactus.metodoDeCrianza();
			id++;
			model.addRow(rows);
			
		}
		
		table.setModel(model);
		
		id=0;
	}

}
