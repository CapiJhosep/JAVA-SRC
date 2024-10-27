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

public class frm10 extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField txt1, txt2, txt3, txt4, txt5;
	JTextArea txaRpta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lbl1 = new JLabel("Nota 1 :");
		lbl1.setBounds(10, 20, 80, 30);
		getContentPane().add(lbl1); 
	
		JLabel lbl2 = new JLabel("Nota 2 :");
		lbl2.setBounds(10, 60, 80, 30);
		getContentPane().add(lbl2); 
		
		JLabel lbl3 = new JLabel("Nota 3 :");
		lbl3.setBounds(10, 100, 80, 30);
		getContentPane().add(lbl3); 
		
		JLabel lbl4 = new JLabel("Nota 4 :");
		lbl4.setBounds(10, 140, 80, 30);
		getContentPane().add(lbl4); 
		
		JLabel lbl5 = new JLabel("Nota 5 :");
		lbl5.setBounds(10, 180, 80, 30);
		getContentPane().add(lbl5); 
		
		txt1 = new JTextField();
		txt1.setBounds(60, 20, 70, 30);
		txt1.setHorizontalAlignment( SwingConstants.RIGHT);
		txt1.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txt1);
		
		txt2 = new JTextField();
		txt2.setBounds(60, 60, 70, 30);
		txt2.setHorizontalAlignment( SwingConstants.RIGHT);
		txt2.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txt2);
		
		txt3 = new JTextField();
		txt3.setBounds(60, 100, 70, 30);
		txt3.setHorizontalAlignment( SwingConstants.RIGHT);
		txt3.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txt3);
		
		txt4 = new JTextField();
		txt4.setBounds(60, 140, 70, 30);
		txt4.setHorizontalAlignment( SwingConstants.RIGHT);
		txt4.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txt4);
		
		txt5 = new JTextField();
		txt5.setBounds(60, 180, 70, 30);
		txt5.setHorizontalAlignment( SwingConstants.RIGHT);
		txt5.setMargin( new Insets(5, 5, 5, 5));
		getContentPane().add(txt5);
		
		txaRpta = new JTextArea();
		txaRpta.setFocusable(false);
		txaRpta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane(txaRpta);
		scrollPane.setBounds(160, 20, 200, 150);
		getContentPane().add(scrollPane);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(200, 180, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());

	}

	protected void btnCalcular_actionPerformed() {
		double nota1 = Integer.parseInt(txt1.getText());
		double nota2 = Integer.parseInt(txt2.getText());
		double nota3 = Integer.parseInt(txt3.getText());
		double nota4 = Integer.parseInt(txt4.getText());
		double nota5 = Integer.parseInt(txt5.getText());
		
	    double menor = nota1;
	    if (nota2 < menor) menor = nota2;
	    if (nota3 < menor) menor = nota3;
	    if (nota4 < menor) menor = nota4;
	    if (nota5 < menor) menor = nota5;

	    double mayor = nota1;
	    if (nota2 > mayor) mayor = nota2;
	    if (nota3 > mayor) mayor = nota3;
	    if (nota4 > mayor) mayor = nota4;
	    if (nota5 > mayor) mayor = nota5;
		
		double promedio = (nota1 + nota2 + nota3 + nota4 + nota5 - mayor - menor) / 3;
		
		txaRpta.setText("");
		txaRpta.append(String.format("Nota Mayor: \tS/%.2f\n", mayor));
		txaRpta.append(String.format("Nota Menor: \tS/%.2f\n", menor));
		txaRpta.append(String.format("Promedio: \tS/%.2f \n", promedio));

	}

}