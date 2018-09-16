package projetos;

import javax.swing.JButton;

public class Botoes extends JogoDaVelha {
	
	AcaoBotao ab = new AcaoBotao();
	
	public void preparaBotaoUm() {
		JButton botaoUm = new JButton();
		lista.add(botaoUm);
		int x = 0, y = 0;
		ab.matriz(x, y);
		botaoUm.setBounds(10, 10, 120, 120);
		try {
		janela.add(lista.get(0));
		} catch(NullPointerException ex){
			System.out.println(ex.getMessage());
		}
		lista.get(0).addActionListener(ab);
	}

	public void preparaBotaoDois() {
		JButton botaoDois = new JButton();
		lista.add(botaoDois);
		janela.add(lista.get(1));
		int x = 1, y= 0;
		ab.matriz(x, y);
		botaoDois.setBounds(140, 10, 120, 120);
		lista.get(1).addActionListener(ab);
	}

	public void preparaBotaoTres() {
		JButton botaoTres = new JButton();
		lista.add(botaoTres);
		janela.add(lista.get(2));
		int x = 2, y= 0;
		ab.matriz(x, y);
		botaoTres.setBounds(270, 10, 120, 120);
		lista.get(2).addActionListener(ab);
	}

	public void preparaBotaoQuatro() {
		JButton botaoQuatro = new JButton();
		lista.add(botaoQuatro);
		janela.add(lista.get(3));
		int x = 0, y= 1;
		ab.matriz(x, y);
		botaoQuatro.setBounds(10, 140, 120, 120);
		lista.get(3).addActionListener(ab);
	}

	public void preparaBotaoCinco() {
		JButton botaoCinco = new JButton();
		lista.add(botaoCinco);
		janela.add(lista.get(4));
		int x = 1, y= 1;
		ab.matriz(x, y);
		botaoCinco.setBounds(140, 140, 120, 120);
		lista.get(4).addActionListener(ab);
	}

	public void preparaBotaoSeis() {
		JButton botaoSeis = new JButton();
		lista.add(botaoSeis);
		janela.add(lista.get(5));
		int x = 2, y= 1;
		ab.matriz(x, y);
		botaoSeis.setBounds(270, 140, 120, 120);
		lista.get(5).addActionListener(ab);
	}

	public void preparaBotaoSete() {
		JButton botaoSete = new JButton();
		lista.add(botaoSete);
		janela.add(lista.get(6));
		int x = 0, y= 2;
		ab.matriz(x, y);
		botaoSete.setBounds(10, 270, 120, 120);
		lista.get(6).addActionListener(ab);
	}

	public void preparaBotaoOito() {
		JButton botaoOito = new JButton();
		lista.add(botaoOito);
		janela.add(lista.get(7));
		int x = 1, y= 2;
		ab.matriz(x, y);
		botaoOito.setBounds(140, 270, 120, 120);
		lista.get(7).addActionListener(ab);
	}

	public void preparaBotaoNove() {
		JButton botaoNove = new JButton();
		lista.add(botaoNove);
		janela.add(lista.get(8));
		int x = 2, y= 2;
		ab.matriz(x, y);
		botaoNove.setBounds(270, 270, 120, 120);
		lista.get(8).addActionListener(ab);
	}
}
