package telaLogin;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("unused")
public class Sistema {
	
	public static JPanel tela;
	public static JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		criarComponentes();

	}

	private static void criarComponentes() {
		// TODO Auto-generated method stub
		
		frame = new JFrame("Sistema");
		frame.setSize(700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

}
