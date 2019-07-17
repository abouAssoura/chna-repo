package conversionChifLet;

import java.awt.EventQueue;
import conversionChifLet.ClasseConvert;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Convchiflett {
    private JTextArea textArea;
	private JFrame frame;
	private JTextField textField;
    private ClasseConvert mClasse =new ClasseConvert();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Convchiflett window = new Convchiflett();
					window.frame.setSize(450, 300);
					  window.frame.setLocationRelativeTo(null);  //
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Convchiflett() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double nbr=0;
				textArea.setText(mClasse.return_Convert(textField.getText()));
				nbr= Integer.parseInt(textField.getText());
			 System.out.println(RepeatString.ChnFormat(12,(int) nbr));	
			}
		});
		btnNewButton.setBounds(159, 61, 186, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent k) { 
				char c = k.getKeyChar();
		          if (!((c >= '0') && (c <= '9')  ||
		             (c == KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_SPACE) ||
		             (c == KeyEvent.VK_DELETE) || (c=='.') || (c==','))) { 
		        	 		            k.consume();
		         				    }
			     
			        return;
			    }			
		});
		textField.setBounds(104, 23, 186, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setDocument(new MaxLimitLength(12));
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 95, 301, 142);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		JLabel lblMontant = new JLabel("Montant :");
		lblMontant.setBounds(10, 26, 84, 14);
		frame.getContentPane().add(lblMontant);
	}
}
