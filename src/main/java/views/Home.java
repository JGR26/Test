package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controllers.MainController;
import views.Home;
import views.Register;
import helpers.Repaint;

public class Home extends JFrame {

	private JPanel contentPane;
	private final Register register=new Register();
	private final Repaint paint=new Repaint();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 434);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Los Laureles S.A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 18));
		lblNewLabel.setBounds(163, 27, 232, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Register Plants");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paint.nuevoPanel(register,contentPane);
				MainController controller =new MainController(register);
			}
		});
		btnNewButton.setBounds(200, 136, 131, 36);
		contentPane.add(btnNewButton);
	}
	
	
}
