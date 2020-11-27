import javax.swing.JOptionPane;

public class Forca {
	
	private static final int CONS_05 = 5;
	
	private static final int CONS_07 = 7;
	
	private static final int CONS_04 = 4;
	
	String msg;
	String letrasCorretas[] = new String[CONS_05];
	String letrasDigitadas[] = new String[CONS_07];

	void adicionaLetras() {
		int i = 0;
		int letra = 0;
		while (i < CONS_05) {
			msg = JOptionPane.showInputDialog("Digite a letra " + ++letra);
			if (letrasCorretas.length <= CONS_05) {
				letrasCorretas[i] = msg;
				i++;
			} else {
				System.out.println("A palavra é de cinco letras.");
			}
		}
	}

	void letrasDigitadas() {
		int tentativa = 0;
		int i = 0;
		int acertos = 0;
		int erros = 0;
		while (i < CONS_07) {
			msg = JOptionPane.showInputDialog("Digite uma letra. Essa é sua "
					+ ++tentativa + " tentativa de 7.");
			letrasDigitadas[i] = msg;
			for (int x = 0; x < letrasCorretas.length; x++) {
				if (letrasCorretas[x].equals(letrasDigitadas[i])) {
					JOptionPane.showMessageDialog(null, "Letra Correta");
					++acertos;
					break;
				} else {
					if (x == CONS_04) {
						JOptionPane.showMessageDialog(null, "Letra Incorreta");
						++erros;
					}
				}
			}
			i++;
		}
		JOptionPane.showMessageDialog(null, "Você teve " + acertos + " acertos e " + erros + " erros.");
	}
}