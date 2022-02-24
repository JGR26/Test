package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import components.Table;
import helpers.PrintData;
import models.Cactus;

public class Register extends JPanel {

	public JTextField codigo;
	public JTextField nombre;
	public  JLabel lblAction;
	public  JTextField color;
	public final JTextArea description = new JTextArea();
	private Table tableCustom=new Table();
	private Cactus cactus=new Cactus();
	public JTable tablePaint=new JTable();
	private PrintData data=new PrintData();
	public final JComboBox comboBoxPlant = new JComboBox();
	public JButton btnAddPlant = new JButton("Add Plant");
	public JButton btnDelete = new JButton("Delete Plant");
	/**
	 * Create the panel.
	 */
	public Register() {
		tablePaint.setBounds(11, 228, 509, 126);
		setLayout(null);
		setBounds(0, 0, 542, 434);
		
		final JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 29, 510, 153);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setFont(new Font("Swis721 Blk BT", Font.BOLD, 14));
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setBounds(10, 31, 81, 18);
		panel.add(lblCodigo);
		
		codigo = new JTextField();
		codigo.setBounds(121, 31, 86, 20);
		panel.add(codigo);
		codigo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Swis721 Blk BT", Font.BOLD, 14));
		lblNombre.setBounds(10, 72, 81, 18);
		panel.add(lblNombre);
		
		nombre = new JTextField();
		nombre.setText("");
		nombre.setBounds(121, 72, 86, 20);
		panel.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setFont(new Font("Swis721 Blk BT", Font.BOLD, 14));
		lblDescripcion.setBounds(10, 103, 112, 18);
		panel.add(lblDescripcion);
		
		JLabel lblTipoDePlanta = new JLabel("Tipo de planta:");
		lblTipoDePlanta.setForeground(Color.WHITE);
		lblTipoDePlanta.setFont(new Font("Swis721 Blk BT", Font.BOLD, 14));
		lblTipoDePlanta.setBounds(255, 31, 132, 18);
		panel.add(lblTipoDePlanta);
		
		lblAction = new JLabel(cactus.colorDeFlor(""));
		lblAction.setForeground(Color.WHITE);
		lblAction.setFont(new Font("Swis721 Blk BT", Font.BOLD, 14));
		lblAction.setBounds(362, 71, 165, 20);
		panel.add(lblAction);
		lblAction.setVisible(false);
		
		color = new JTextField();
		color.setText("");
		color.setBounds(397, 72, 103, 20);
		panel.add(color);
		color.setColumns(10);
		color.setVisible(false);
		
		
		comboBoxPlant.setModel(new DefaultComboBoxModel(new String[] {"Select Plant", "Cactus", "Ornamental"}));
		comboBoxPlant.setBounds(397, 30, 103, 22);
		comboBoxPlant.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String value=(String) comboBoxPlant.getSelectedItem();
				
				
				if(value.equals("Cactus")) {
					lblAction.setVisible(true);
					color.setVisible(false);
				}else if(value.equals("Ornamental")){
					lblAction.setVisible(false);
					color.setVisible(true);
					
				}else {
					lblAction.setVisible(false);
					color.setVisible(false);
				}
				
			}
		});
		panel.add(comboBoxPlant);
		
		description.setBounds(121, 103, 161, 39);
		panel.add(description);
		
		
		btnAddPlant.setBounds(397, 119, 89, 23);
		panel.add(btnAddPlant);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setForeground(Color.WHITE);
		lblColor.setFont(new Font("Swis721 Blk BT", Font.BOLD, 14));
		lblColor.setBounds(255, 75, 132, 18);
		panel.add(lblColor);
		
		JScrollPane scroll=tableCustom.createTable(tablePaint);
		add(scroll);
		btnDelete.setBounds(188, 371, 105, 23);
		add(btnDelete);
	}
}
