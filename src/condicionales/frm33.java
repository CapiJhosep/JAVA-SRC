package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm33 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtTardanza, txtObs;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm33 frame = new frm33();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm33() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblTardanza = new JLabel("Tardanzas :");
		lblTardanza.setBounds(30, 20, 100, 30);
		getContentPane().add(lblTardanza); 
		
		JLabel lblObs = new JLabel("Observación :");
		lblObs.setBounds(190, 20, 100, 30);
		getContentPane().add(lblObs); 
		
		txtTardanza = new JTextField();
		txtTardanza.setBounds(110, 20, 70, 30);
		txtTardanza.setHorizontalAlignment( SwingConstants.RIGHT);
		txtTardanza.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtTardanza);
		
		txtObs = new JTextField();
		txtObs.setBounds(280, 20, 70, 30);
		txtObs.setHorizontalAlignment( SwingConstants.RIGHT);
		txtObs.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txtObs);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(90, 60, 200, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(140, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		int tardanza = Integer.parseInt(txtTardanza.getText());
		int obs = Integer.parseInt(txtObs.getText());
		int punT;
		int punO;
		double bonificacion;
	    
		if (tardanza == 0) punT = 10;
        else if (tardanza >= 1 && tardanza <= 2) punT = 8;
        else if (tardanza >= 3 && tardanza <= 5) punT = 6;        
        else if (tardanza >= 6 && tardanza <= 9) punT = 4;
        else punT = 0;

        if (obs == 0) punO = 10;
        else if (obs == 1) punO = 8; 
		else if (obs == 2) punO = 5;
		else if (obs == 3) punO = 1;
		else punO = 0;
        

        int puntaje = punT + punO;

        if (puntaje < 11) bonificacion = puntaje * 2.5;
        else if (puntaje >= 11 && puntaje <= 13) bonificacion = puntaje * 5.0;
        else if (puntaje >= 14 && puntaje <= 16) bonificacion = puntaje * 7.5;
        else if (puntaje >= 17 && puntaje <= 19)  bonificacion = puntaje * 10.0;
        else bonificacion = puntaje * 12.5;
        
	    
	    txaRpta.setText("");
	    txaRpta.append(String.format("Puntaje: \t%d\n", puntaje));
	    txaRpta.append(String.format("Bonificación: \tS/%.2f\n", bonificacion));
	    
	}
}