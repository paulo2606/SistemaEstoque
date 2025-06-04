package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class principal {

	private JFrame frame;
	private JTextField tf_nome;
	private JTextField tf_quantidade;
	private JTextField tf_preco_compra;
	private JTextField tf_preco_venda;
	private JTextField tf_lucro;
	private JTextField tf_estoque_minimo;
	private JTextField tf_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
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
	public principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1005, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 720, 377);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panelCadastrar = new JPanel();
		tabbedPane.addTab("Cadastrar", null, panelCadastrar, null);
		
		JPanel panelEditar = new JPanel();
		tabbedPane.addTab("Editar ", null, panelEditar, null);
		
		JPanel panelBuscar = new JPanel();
		tabbedPane.addTab("Buscar", null, panelBuscar, null);
		
		JPanel panelExcluir = new JPanel();
		tabbedPane.addTab("Excluir", null, panelExcluir, null);
		panelExcluir.setLayout(null);
		
		JLabel lbl_nome = new JLabel("Nome:");
		lbl_nome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_nome.setBounds(10, 90, 48, 32);
		panelExcluir.add(lbl_nome);
		
		tf_nome = new JTextField();
		tf_nome.setColumns(10);
		tf_nome.setBounds(68, 92, 156, 32);
		panelExcluir.add(tf_nome);
		
		JLabel lbl_quantidade = new JLabel("Quantidade:");
		lbl_quantidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_quantidade.setBounds(246, 92, 88, 32);
		panelExcluir.add(lbl_quantidade);
		
		tf_quantidade = new JTextField();
		tf_quantidade.setColumns(10);
		tf_quantidade.setBounds(344, 92, 104, 32);
		panelExcluir.add(tf_quantidade);
		
		JLabel lbl_preco_venda = new JLabel("Preço de venda:");
		lbl_preco_venda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_preco_venda.setBounds(246, 153, 116, 32);
		panelExcluir.add(lbl_preco_venda);
		
		JLabel lbl_preco_compra = new JLabel("Preço de compra:");
		lbl_preco_compra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_preco_compra.setBounds(10, 153, 136, 32);
		panelExcluir.add(lbl_preco_compra);
		
		JLabel lbl_lucro = new JLabel("Lucro:");
		lbl_lucro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_lucro.setBounds(246, 209, 56, 32);
		panelExcluir.add(lbl_lucro);
		
		JLabel lbl_estoque_minimo = new JLabel("Estoque minimo:");
		lbl_estoque_minimo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_estoque_minimo.setBounds(10, 209, 136, 32);
		panelExcluir.add(lbl_estoque_minimo);
		
		tf_preco_compra = new JTextField();
		tf_preco_compra.setColumns(10);
		tf_preco_compra.setBounds(144, 155, 80, 32);
		panelExcluir.add(tf_preco_compra);
		
		tf_preco_venda = new JTextField();
		tf_preco_venda.setColumns(10);
		tf_preco_venda.setBounds(368, 155, 80, 32);
		panelExcluir.add(tf_preco_venda);
		
		tf_lucro = new JTextField();
		tf_lucro.setColumns(10);
		tf_lucro.setBounds(304, 211, 80, 32);
		panelExcluir.add(tf_lucro);
		
		tf_estoque_minimo = new JTextField();
		tf_estoque_minimo.setColumns(10);
		tf_estoque_minimo.setBounds(144, 211, 80, 32);
		panelExcluir.add(tf_estoque_minimo);
		
		JLabel lbl_id = new JLabel("ID:");
		lbl_id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_id.setBounds(10, 24, 56, 32);
		panelExcluir.add(lbl_id);
		
		tf_id = new JTextField();
		tf_id.setColumns(10);
		tf_id.setBounds(41, 26, 80, 32);
		panelExcluir.add(tf_id);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(176, 292, 136, 32);
		panelExcluir.add(btnNewButton);
	}
}
