package br.org.catolicasc.estruturaII.aula11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class App {
	private static String arquivo_leitura = "algoritmo.txt";

	public static void main(String[] args) throws IOException {

		List<String> leitor = IOUtils.readLines(new FileInputStream(arquivo_leitura));

		boolean matrix[][] = new boolean[leitor.size()][leitor.size()];
		boolean matrixResposta[][] = matrix.clone();
		for (int linha = 0; linha < leitor.size(); linha++) {
			char[] letra = leitor.get(linha).toCharArray();
			for (int coluna = 0; coluna < letra.length; coluna++) {
				if ((letra[coluna] == 'T') || (letra[coluna] == 't') || (letra[coluna] == 'V') || (letra[coluna] == 'v')) {
					matrix[linha][coluna] = true;
				} else {
					matrix[linha][coluna] = false;
				}
			}
		}
		for (boolean[] bs : matrix) {
			for (boolean b : bs) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		Warshall.fechamento(matrix, matrixResposta);
		
		System.out.println();
		System.out.println("Resposta");
		System.out.println();
		for (boolean[] bs : matrixResposta) {
			for (boolean b : bs) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
