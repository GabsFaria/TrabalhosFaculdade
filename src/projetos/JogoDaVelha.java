package projetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JogoDaVelha {

	private JFrame janela;
	private JPanel painelPrincipal;
	private int quantidade;
	private int jogador = 0;
	private int matriz[][] = new int[3][3];
	private String ganhador;
	private String jogador1;
	private String jogador2;

	public static void main(String[] args) {
		new JogoDaVelha().montaTela();
	}

	private void montaTela() {
		quantidade = 1;
		jogador = 1;
		preparaJanela();
		preparaPainelPrincipal();
		preparaBotaoUm();
		/*preparaBotaoDois();
		preparaBotaoTres();
		preparaBotaoQuatro();
		preparaBotaoCinco();
		preparaBotaoSeis();
		preparaBotaoSete();
		preparaBotaoOito();
		preparaBotaoNove();*/
		preparaBotaoSair();
		mostraJanela();
	}
	
	public void acao() {
		
	}

	private void preparaJanela() {
		janela = new JFrame("Jogo da Velha");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void preparaPainelPrincipal() {
		painelPrincipal = new JPanel();
		janela.add(painelPrincipal);
	}

	private void preparaBotaoUm() {
		JButton botaoUm = new JButton();
		ImageIcon imagem = new ImageIcon();
		botaoUm.setSize(50, 50);
		botaoUm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jogador==0) {
					botaoUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("faculdade/imagens/X.png")));
				} else {
					botaoUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("faculdade/imagens/O.png")));
				}
			}
		});
		painelPrincipal.add(botaoUm);
	}

	private void preparaBotaoDois() {
		// TODO Auto-generated method stub

	}

	private void preparaBotaoTres() {
		// TODO Auto-generated method stub

	}

	private void preparaBotaoQuatro() {
		// TODO Auto-generated method stub

	}

	private void preparaBotaoCinco() {
		// TODO Auto-generated method stub

	}

	private void preparaBotaoSeis() {
		// TODO Auto-generated method stub

	}

	private void preparaBotaoSete() {

	}

	private void preparaBotaoOito() {

	}

	private void preparaBotaoNove() {

	}

	private void preparaBotaoSair() {
		// TODO Auto-generated method stub

	}

	private void mostraJanela() {
		janela.pack();
		janela.setSize(600, 600);
		janela.setVisible(true);
	}

}
