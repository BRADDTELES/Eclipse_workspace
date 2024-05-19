package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.CursoDao;
import model.Curso;
import javax.swing.JSeparator;

public class FormCurso extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtCurso;
	private JTextField txtIdPesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCurso frame = new FormCurso();
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
	public FormCurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("TECTREINAMENTOS INFORMÁTICA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 329, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Desenvolvimento de Software com o Java e MySQL");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 30, 276, 20);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Desenvolvido por: Danillo Teles, Contato (62) 999184007");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(120, 457, 276, 20);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 148, 27, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Curso");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(10, 193, 53, 14);
		contentPane.add(lblNewLabel_2_1);

		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setBounds(10, 163, 96, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		txtCurso = new JTextField();
		txtCurso.setBounds(10, 207, 303, 20);
		contentPane.add(txtCurso);
		txtCurso.setColumns(10);

		JLabel lblNewLabel_2_1_1 = new JLabel("Nível");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(10, 238, 53, 14);
		contentPane.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Duração");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(10, 287, 79, 14);
		contentPane.add(lblNewLabel_2_1_1_1);

		JComboBox cmbNivel = new JComboBox();
		cmbNivel.setModel(new DefaultComboBoxModel(new String[] { "Iniciante", "Intermediário", "Avançado" }));
		cmbNivel.setBounds(10, 254, 303, 22);
		contentPane.add(cmbNivel);

		JSpinner jsDuracao = new JSpinner();
		jsDuracao.setBounds(10, 304, 96, 21);
		contentPane.add(jsDuracao);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String curso = txtCurso.getText();
				String nivel = cmbNivel.getSelectedItem().toString();
				int duracao = Integer.parseInt(jsDuracao.getValue().toString());

				Curso cursos = new Curso();

				cursos.setCurso(curso);
				cursos.setNivel(nivel);
				cursos.setDuracao(duracao);

				CursoDao cursoDao = new CursoDao();

				cursoDao.inserir(cursos);

			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.setBounds(10, 355, 104, 23);
		contentPane.add(btnSalvar);

		JLabel lblNewLabel_2_2 = new JLabel("Pesquise um ID do Curso");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(10, 80, 187, 14);
		contentPane.add(lblNewLabel_2_2);

		txtIdPesquisa = new JTextField();
		txtIdPesquisa.setBounds(10, 102, 96, 22);
		contentPane.add(txtIdPesquisa);
		txtIdPesquisa.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int idPesquisa = Integer.parseInt(txtIdPesquisa.getText());

				CursoDao cursoDao = new CursoDao();
				Curso curso = cursoDao.getCurso(idPesquisa);

				if (curso == null) {
					// Mensagem de Erro caso não encontre a informação no Bando de Dados
					JOptionPane.showMessageDialog(null, "Este item não existe na base de dados!");
				} else {
					// preenchimento do formulário
					txtId.setText(String.valueOf(curso.getId()));
					txtCurso.setText(curso.getCurso());
					cmbNivel.setSelectedItem(curso.getNivel());
					jsDuracao.setValue(curso.getDuracao());
				}
			}
		});
		btnPesquisar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPesquisar.setBounds(116, 101, 104, 23);
		contentPane.add(btnPesquisar);

		JSeparator separator = new JSeparator();
		separator.setBounds(37, 122, 1, 2);
		contentPane.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 135, 446, 2);
		contentPane.add(separator_1);

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int id = Integer.parseInt(txtId.getText());
				String curso = txtCurso.getText();
				String nivel = cmbNivel.getSelectedItem().toString();
				int duracao = Integer.parseInt(jsDuracao.getValue().toString());

				//acesso para camada model
				Curso cursos = new Curso();

				cursos.setId(id);
				cursos.setCurso(curso);
				cursos.setNivel(nivel);
				cursos.setDuracao(duracao);

				CursoDao cursoDao = new CursoDao();
				cursoDao.editar(cursos);
				
				//zerando as caixinhas
				txtId.setText("");
				txtCurso.setText("");
				jsDuracao.setValue(0);
				
				JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
			}
		});
		btnEditar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEditar.setBounds(116, 355, 104, 23);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(txtId.getText());
				
				CursoDao cursoDao = new CursoDao();
				cursoDao.excluir(id);
				
				//zerando as caixinhas
				txtId.setText("");
				txtCurso.setText("");
				jsDuracao.setValue(0);
				
				JOptionPane.showMessageDialog(null, "Dados removidos com sucesso");
			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExcluir.setBounds(221, 355, 104, 23);
		contentPane.add(btnExcluir);
	}
}
