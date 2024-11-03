package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm40 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtCurso, txt1, txt2, txt3, txt4, txt5, txtCondicion;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm40 frame = new frm40();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm40() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblCurso = new JLabel("Curso : ");
		lblCurso.setBounds(130, 30, 80, 30);
		getContentPane().add(lblCurso);
		
		JLabel lbl1 = new JLabel("PC 1 : ");
		lbl1.setBounds(30, 70, 80, 30);
		getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("PC 2 : ");
		lbl2.setBounds(155, 70, 80, 30);
		getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("PC 3 : ");
		lbl3.setBounds(280, 70, 80, 30);
		getContentPane().add(lbl3);

		JLabel lbl4 = new JLabel("Parcial : ");
		lbl4.setBounds(100, 110, 80, 30);
		getContentPane().add(lbl4);

		JLabel lbl5 = new JLabel("Final : ");
		lbl5.setBounds(225, 110, 80, 30);
		getContentPane().add(lbl5);
		
		JLabel lblCondicion = new JLabel("Condición: ");
		lblCondicion.setBounds(140, 161, 80, 30);
		getContentPane().add(lblCondicion);

		txtCurso = new JTextField();
		txtCurso.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCurso.setBounds(180, 30, 90, 30);
		txtCurso.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCurso);
		
		txt1 = new JTextField();
		txt1.setHorizontalAlignment(SwingConstants.RIGHT);
		txt1.setBounds(75, 70, 60, 30);
		txt1.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt1);
		
		txt2 = new JTextField();
		txt2.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2.setBounds(200, 70, 60, 30);
		txt2.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt2);
		
		txt3 = new JTextField();
		txt3.setHorizontalAlignment(SwingConstants.RIGHT);
		txt3.setBounds(325, 70, 60, 30);
		txt3.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt3);
		
		txt4 = new JTextField();
		txt4.setHorizontalAlignment(SwingConstants.RIGHT);
		txt4.setBounds(150, 110, 60, 30);
		txt4.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt4);
		
		txt5 = new JTextField();
		txt5.setHorizontalAlignment(SwingConstants.RIGHT);
		txt5.setBounds(275, 110, 60, 30);
		txt5.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt5);
		
		txtCondicion = new JTextField();
		txtCondicion.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCondicion.setBounds(210, 160, 100, 30);
		txtCondicion.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCondicion);
	
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(160, 220, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
		
	}

	protected void btnCalcular_actionPerformed() {
		String curso = txtCurso.getText();
		double pc1 = Integer.parseInt(txt1.getText());
		double pc2 = Integer.parseInt(txt2.getText());
		double pc3 = Integer.parseInt(txt3.getText());
		double ep = Integer.parseInt(txt4.getText());
		double ef = Integer.parseInt(txt5.getText());
		
		double notaFinal;

        if (curso.equalsIgnoreCase("Matemática")) {
            notaFinal = pc1 * 0.10 + pc2 * 0.20 + pc3 * 0.10 + ep * 0.30 + ef * 0.30;
        } 
        else if (curso.equalsIgnoreCase("Física")) {
            notaFinal = pc1 * 0.20 + pc2 * 0.20 + pc3 * 0.20 + ep * 0.20 + ef * 0.20;
        } 
        else if (curso.equalsIgnoreCase("Química")) {
            notaFinal = pc1 * 0.10 + pc2 * 0.30 + pc3 * 0.10 + ep * 0.25 + ef * 0.25;
        } 
        else {
            JOptionPane.showMessageDialog(null, "No válido");
            return;
        }
        
        String condicion = (notaFinal >= 13) ? "Aprobado" : "Desaprobado";
        
        txtCondicion.setText(condicion);
	
	}
	
}