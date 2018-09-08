package projetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JogoDaVelha {

	private JFrame janela;
	private JPanel painelPrincipal;
	protected int quantidade;
	protected int jogador;
	private List<AcaoJogada> lista = new ArrayList<AcaoJogada>();
	private String ganhador;
	
	ImageIcon imagemX = new ImageIcon(getClass().getResource("X.png"));
	ImageIcon imagemO = new ImageIcon(getClass().getResource("O.png"));

	public static void main(String[] args) {
		new JogoDaVelha().montaTela();
	}

	private void montaTela() {
		quantidade = 1;
		preparaJanela();
		preparaPainelPrincipal();
		mostraJanela();
		preparaBotaoUm();
		preparaBotaoDois();
		/*preparaBotaoTres();
		preparaBotaoQuatro();
		preparaBotaoCinco();
		preparaBotaoSeis();
		preparaBotaoSete();
		preparaBotaoOito();
		preparaBotaoNove();*/
		preparaBotaoSair();
	}
	
	public void processaJogada(int jogador, JButton button) {
		if(jogador==0) {
			button.setIcon(imagemX);
			 jogador++;
		} else {
			button.setIcon(imagemO);
			jogador--;
		}
	}

	private void preparaJanela() {
		janela = new JFrame("Jogo da Velha");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void preparaPainelPrincipal() {
		painelPrincipal = new JPanel();
		janela.add(painelPrincipal);
		if(jogador==0) {
			jogador++;
		} else {
			jogador--;
		}
	}

	private void preparaBotaoUm() {
		JButton botaoUm = new JButton();
		painelPrincipal.add(botaoUm);
		botaoUm.setBounds(0, 0, 140, 140);
		botaoUm.addActionListener(lista);
		
	}

	private void preparaBotaoDois() {
		JButton botaoDois = new JButton();
		botaoDois.setBounds(150, 0, 140, 140);
		AcaoJogada aj = new AcaoJogada();
		botaoDois.addActionListener(aj);
		painelPrincipal.add(botaoDois);
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
		JButton botaoSair = new JButton("Sair");
		botaoSair.setBounds(550, 550, 20, 20);
		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		painelPrincipal.add(botaoSair);
		

	}

	private void mostraJanela() {
		janela.pack();
		janela.setSize(600, 600);
		janela.setVisible(true);
	}

}

