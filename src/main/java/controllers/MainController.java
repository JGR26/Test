package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controllers.layer.iMainController;
import helpers.PrintData;
import models.Cactus;
import models.Ornamental;
import models.Planta;
import views.Register;

public class MainController implements ActionListener,iMainController {
	
	
	
	Register register=new Register();
	PrintData data=new PrintData();
	List<Ornamental> listaOrna=new ArrayList<Ornamental>();
	List<Cactus> listaCact=new ArrayList<Cactus>();
	
	public MainController(Register register) {
		this.register=register;
		this.register.btnAddPlant.addActionListener(this);
		this.register.btnDelete.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==register.btnAddPlant) {
			
			if(register.codigo.getText().isEmpty() || register.nombre.getText().isEmpty() || register.description.getText().isEmpty() ) {
				
				JOptionPane.showMessageDialog(null, "One or more fields dont have information");
				
			}else {
				add();
				
			}
		}else if(e.getSource()==register.btnDelete)	{
			if(register.tablePaint.getSelectedRow()<0) {
				JOptionPane.showMessageDialog(null, "You don´t selected any row");
			}else {
				delete();
			}
		}


		
	}
	
	
	public void add() {
		String value=(String) register.comboBoxPlant.getSelectedItem();
		if(value.equals("Ornamental")) {
			Ornamental orna=new Ornamental();
			orna.setCodigo(register.codigo.getText());
			orna.setNombre(register.nombre.getText());
			orna.setDescripcion(register.description.getText());
			orna.colorDeFlor(register.color.getText());
			listaOrna.add(orna);
		}else if(value.equals("Cactus")) {
			
			Cactus cact=new Cactus();
			
			cact.setCodigo(register.codigo.getText());
			cact.setNombre(register.nombre.getText());
			cact.setDescripcion(register.description.getText());
			listaCact.add(cact);
		}else {
			
			JOptionPane.showMessageDialog(null,"The Type of plant is not defined please enter a type");
			
		}

		data.getAll(register.tablePaint, listaOrna, listaCact);
		
		clearFields();
		
		
	}
	
	public void delete() {
		
		int i = register.tablePaint.getSelectedRow();
		
		for(int n=0;n<listaCact.size();n++) {
			Cactus cactus=listaCact.get(n);
			if(cactus.metodoDeCrianza().equals(register.tablePaint.getValueAt(i, 5))) {
				if(cactus.getNombre().equals(register.tablePaint.getValueAt(i,2 ))) {
					listaCact.remove(n);
					break;
				}
			}

		}
		
		for(int n=0;n<listaOrna.size();n++) {
			Ornamental ornamental=listaOrna.get(n);
			if(ornamental.metodoDeCrianza().equals(register.tablePaint.getValueAt(i, 5))) {
				if(ornamental.getNombre().equals(register.tablePaint.getValueAt(i,2 ))) {
					listaOrna.remove(n);
					break;
				}
			}

		}
		
		
		data.getAll(register.tablePaint, listaOrna, listaCact);
		
	}
	
	
	public void clearFields() {
		register.nombre.setText("");
		register.description.setText("");
		register.codigo.setText("");
        register.color.setText("");
    }
	
}
