package principal;

import java.awt.EventQueue;
import modelo.produto; 
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal {

	private JFrame frame;
	private JTextField tf_nome;
	private JTextField tf_quantidade;
	private JTextField tf_preco_compra;
	private JTextField tf_preco_venda;
	private JTextField tf_lucro;
	private JTextField tf_estoque_minimo;
	private JTextField tf_id;
	private JTextField tf_id_editar;
	private JTextField tf_nome_editar;
	private JTextField tf_quantidade_editar;
	private JTextField tf_preco_compra_editar;
	private JTextField tf_preco_venda_editar;
	private JTextField tf_estoque_minimo_editar;
	private JTextField tf_lucro_editar;
	private JTextField tf_id_buscar;
	private JTextField tf_mostrar_buscar;
	private JTextField tf_id_exluir;
	private JTextField tf_mostra_exluir;
	private List<produto> listaProdutos = new ArrayList<>();

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
		panelCadastrar.setLayout(null);
		
		JLabel lbl_nome = new JLabel("Nome:");
		lbl_nome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_nome.setBounds(10, 90, 48, 32);
		panelCadastrar.add(lbl_nome);
		
		tf_nome = new JTextField();
		tf_nome.setColumns(10);
		tf_nome.setBounds(68, 92, 156, 32);
		panelCadastrar.add(tf_nome);
		
		JLabel lbl_quantidade = new JLabel("Quantidade:");
		lbl_quantidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_quantidade.setBounds(246, 92, 88, 32);
		panelCadastrar.add(lbl_quantidade);
		
		tf_quantidade = new JTextField();
		tf_quantidade.setColumns(10);
		tf_quantidade.setBounds(344, 92, 104, 32);
		panelCadastrar.add(tf_quantidade);
		
		JLabel lbl_preco_venda = new JLabel("Preço de venda:");
		lbl_preco_venda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_preco_venda.setBounds(246, 153, 116, 32);
		panelCadastrar.add(lbl_preco_venda);
		
		JLabel lbl_preco_compra = new JLabel("Preço de compra:");
		lbl_preco_compra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_preco_compra.setBounds(10, 153, 136, 32);
		panelCadastrar.add(lbl_preco_compra);
		
		JLabel lbl_lucro = new JLabel("Lucro:");
		lbl_lucro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_lucro.setBounds(246, 209, 56, 32);
		panelCadastrar.add(lbl_lucro);
		
		JLabel lbl_estoque_minimo = new JLabel("Estoque minimo:");
		lbl_estoque_minimo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_estoque_minimo.setBounds(10, 209, 136, 32);
		panelCadastrar.add(lbl_estoque_minimo);
		
		tf_preco_compra = new JTextField();
		tf_preco_compra.setColumns(10);
		tf_preco_compra.setBounds(144, 155, 80, 32);
		panelCadastrar.add(tf_preco_compra);
		
		tf_preco_venda = new JTextField();
		tf_preco_venda.setColumns(10);
		tf_preco_venda.setBounds(368, 155, 80, 32);
		panelCadastrar.add(tf_preco_venda);
		
		tf_preco_compra.addFocusListener(new java.awt.event.FocusAdapter() {
			 public void focusLost(java.awt.event.FocusEvent evt) {
			 atualizarLucro();
			 }
			});
			tf_preco_venda.addFocusListener(new java.awt.event.FocusAdapter() {
			 public void focusLost(java.awt.event.FocusEvent evt) {
			 atualizarLucro();
			 }
			});

		
		tf_lucro = new JTextField();
		tf_lucro.setEditable(false);
		tf_lucro.setColumns(10);
		tf_lucro.setBounds(304, 211, 144, 32);
		panelCadastrar.add(tf_lucro);
		
		tf_estoque_minimo = new JTextField();
		tf_estoque_minimo.setColumns(10);
		tf_estoque_minimo.setBounds(144, 211, 80, 32);
		panelCadastrar.add(tf_estoque_minimo);
		
		JLabel lbl_id = new JLabel("ID:");
		lbl_id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_id.setBounds(10, 24, 56, 32);
		panelCadastrar.add(lbl_id);
		
		tf_id = new JTextField();
		tf_id.setColumns(10);
		tf_id.setBounds(41, 26, 80, 32);
		panelCadastrar.add(tf_id);
		
		JButton btn_cadastrar = new JButton("Cadastrar");
		btn_cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 String id = tf_id.getText();
					 String nome = tf_nome.getText();
					 int quantidade = Integer.parseInt(tf_quantidade.getText());
					 double precoCompra = Double.parseDouble(tf_preco_compra.getText());
					 double precoVenda = Double.parseDouble(tf_preco_venda.getText());
					 int estoqueMinimo = Integer.parseInt(tf_estoque_minimo.getText());
					 produto novo = new produto(id, nome, quantidade, estoqueMinimo, precoCompra, precoVenda);
					 listaProdutos.add(novo);
					 javax.swing.JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
					 limparCamposCadastro();
					 } catch (Exception ex) {
					 javax.swing.JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto: " + ex.getMessage());
					 }
			}
		});
		btn_cadastrar.setBounds(176, 292, 136, 32);
		panelCadastrar.add(btn_cadastrar);
		
		JPanel panelEditar = new JPanel();
		tabbedPane.addTab("Editar ", null, panelEditar, null);
		panelEditar.setLayout(null);
		
		JLabel lbl_id_editar = new JLabel("ID:");
		lbl_id_editar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_id_editar.setBounds(10, 22, 30, 32);
		panelEditar.add(lbl_id_editar);
		
		tf_id_editar = new JTextField();
		tf_id_editar.setColumns(10);
		tf_id_editar.setBounds(41, 24, 80, 32);
		panelEditar.add(tf_id_editar);
		
		JLabel lbl_nome_editar = new JLabel("Nome:");
		lbl_nome_editar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_nome_editar.setBounds(10, 88, 48, 32);
		panelEditar.add(lbl_nome_editar);
		
		tf_nome_editar = new JTextField();
		tf_nome_editar.setColumns(10);
		tf_nome_editar.setBounds(68, 90, 156, 32);
		panelEditar.add(tf_nome_editar);
		
		JLabel lbl_quantidade_editar = new JLabel("Quantidade:");
		lbl_quantidade_editar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_quantidade_editar.setBounds(246, 90, 88, 32);
		panelEditar.add(lbl_quantidade_editar);
		
		tf_quantidade_editar = new JTextField();
		tf_quantidade_editar.setColumns(10);
		tf_quantidade_editar.setBounds(344, 90, 104, 32);
		panelEditar.add(tf_quantidade_editar);
		
		JLabel lbl_preco_compra_editar = new JLabel("Preço de compra:");
		lbl_preco_compra_editar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_preco_compra_editar.setBounds(10, 151, 136, 32);
		panelEditar.add(lbl_preco_compra_editar);
		
		tf_preco_compra_editar = new JTextField();
		tf_preco_compra_editar.setColumns(10);
		tf_preco_compra_editar.setBounds(144, 153, 80, 32);
		panelEditar.add(tf_preco_compra_editar);
		
		JLabel lbl_preco_venda_editar = new JLabel("Preço de venda:");
		lbl_preco_venda_editar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_preco_venda_editar.setBounds(246, 151, 116, 32);
		panelEditar.add(lbl_preco_venda_editar);
		
		tf_preco_venda_editar = new JTextField();
		tf_preco_venda_editar.setColumns(10);
		tf_preco_venda_editar.setBounds(368, 153, 80, 32);
		panelEditar.add(tf_preco_venda_editar);
		
		JLabel lbl_estoque_minimo_editar = new JLabel("Estoque minimo:");
		lbl_estoque_minimo_editar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_estoque_minimo_editar.setBounds(10, 207, 136, 32);
		panelEditar.add(lbl_estoque_minimo_editar);
		
		tf_estoque_minimo_editar = new JTextField();
		tf_estoque_minimo_editar.setColumns(10);
		tf_estoque_minimo_editar.setBounds(144, 209, 80, 32);
		panelEditar.add(tf_estoque_minimo_editar);
		
		JLabel lbl_lucro_editar = new JLabel("Lucro:");
		lbl_lucro_editar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_lucro_editar.setBounds(246, 207, 56, 32);
		panelEditar.add(lbl_lucro_editar);
		
		tf_lucro_editar = new JTextField();
		tf_lucro_editar.setEditable(false);
		tf_lucro_editar.setColumns(10);
		tf_lucro_editar.setBounds(304, 209, 144, 32);
		panelEditar.add(tf_lucro_editar);
		
		JButton btn_editar = new JButton("Editar");
		btn_editar.setBounds(176, 290, 136, 32);
		panelEditar.add(btn_editar);
		
		JButton btn_consultar = new JButton("Consultar");
		btn_consultar.setBounds(131, 29, 88, 23);
		panelEditar.add(btn_consultar);
		
		JPanel panelBuscar = new JPanel();
		tabbedPane.addTab("Buscar", null, panelBuscar, null);
		panelBuscar.setLayout(null);
		
		tf_id_buscar = new JTextField();
		tf_id_buscar.setColumns(10);
		tf_id_buscar.setBounds(41, 13, 80, 32);
		panelBuscar.add(tf_id_buscar);
		
		JLabel lbl_id_buscar = new JLabel("ID:");
		lbl_id_buscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_id_buscar.setBounds(10, 11, 30, 32);
		panelBuscar.add(lbl_id_buscar);
		
		JButton btn_consultar_1 = new JButton("Consultar");
		btn_consultar_1.setBounds(131, 18, 88, 23);
		panelBuscar.add(btn_consultar_1);
		
		tf_mostrar_buscar = new JTextField();
		tf_mostrar_buscar.setEditable(false);
		tf_mostrar_buscar.setBounds(83, 129, 538, 209);
		panelBuscar.add(tf_mostrar_buscar);
		tf_mostrar_buscar.setColumns(10);
		
		JLabel lbl_titulo_produto_buscar = new JLabel("Produto");
		lbl_titulo_produto_buscar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_titulo_produto_buscar.setBounds(317, 95, 80, 23);
		panelBuscar.add(lbl_titulo_produto_buscar);
		
		JPanel panelExcluir = new JPanel();
		tabbedPane.addTab("Excluir", null, panelExcluir, null);
		panelExcluir.setLayout(null);
		
		JLabel lbl_id_exluir = new JLabel("ID:");
		lbl_id_exluir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_id_exluir.setBounds(10, 11, 30, 32);
		panelExcluir.add(lbl_id_exluir);
		
		tf_id_exluir = new JTextField();
		tf_id_exluir.setColumns(10);
		tf_id_exluir.setBounds(41, 13, 80, 32);
		panelExcluir.add(tf_id_exluir);
		
		JButton btn_excluir = new JButton("Excluir");
		btn_excluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_excluir.setBounds(131, 18, 88, 23);
		panelExcluir.add(btn_excluir);
		
		JLabel lbl_titulo_produto_exluir = new JLabel("Produto");
		lbl_titulo_produto_exluir.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_titulo_produto_exluir.setBounds(317, 95, 80, 23);
		panelExcluir.add(lbl_titulo_produto_exluir);
		
		tf_mostra_exluir = new JTextField();
		tf_mostra_exluir.setEditable(false);
		tf_mostra_exluir.setColumns(10);
		tf_mostra_exluir.setBounds(83, 129, 538, 209);
		panelExcluir.add(tf_mostra_exluir);
	}
	
	private void atualizarLucro() {
		 try {
		 double compra = Double.parseDouble(tf_preco_compra.getText());
		 double venda = Double.parseDouble(tf_preco_venda.getText());
		 if (compra > 0) {
		 double lucro = ((venda - compra) / compra) * 100;
		 tf_lucro.setText(String.format("%.2f", lucro));
		 } else {
		 tf_lucro.setText("0");
		 }
		 } catch (NumberFormatException e) {
		 tf_lucro.setText("0");
		 }
		}
	
	private void limparCamposCadastro() {
		 tf_id.setText("");
		 tf_nome.setText("");
		 tf_quantidade.setText("");
		 tf_preco_compra.setText("");
		 tf_preco_venda.setText("");
		 tf_lucro.setText("");
		 tf_estoque_minimo.setText("");
		}

}
