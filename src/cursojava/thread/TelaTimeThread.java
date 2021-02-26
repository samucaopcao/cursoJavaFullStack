package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());/* Painel de Componentes */
	private JLabel descricaoHora = new JLabel("Time Thread1");
	private TextField mostraTempo = new TextField();

	private JLabel descricaoHora2 = new JLabel("Time Thread2");
	private TextField mostraTempo2 = new TextField();

	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	public TelaTimeThread() {

		setTitle("Minha Tela de Time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gridBagConstraints = new GridBagConstraints();/* Controlador de Posição de Componentes */
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;// Componentes ocuparam espaço de dois 
		gridBagConstraints.insets = new Insets(5,10,5,5);// Espaçamento de bordas entre componentes em px.
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;// Desloca uma posição na coluna
		jPanel.add(descricaoHora2, gridBagConstraints);// Adiciona o componente no JPANEL criado lá em cima

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);
		
//******************************************************************************************//
		
		gridBagConstraints.gridwidth = 1;// Componentes ocuparam espaço de um se encaixando na parte de cima que era 02
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);

		add(jPanel, BorderLayout.WEST);

		setVisible(true);/* Torna a tela visível para o usuário, sempre será o ultimo comando */

	}

}
