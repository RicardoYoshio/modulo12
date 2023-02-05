package modulo12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Modulo12 {

public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Lista de Pessoa");
		
		String pessoas = s.next();
		System.out.println(pessoas);
		
		String[] pessoas1 = pessoas.split(",");
		Arrays.sort(pessoas1);
		
		for (String p : pessoas1) {
			System.out.println(p);
		}
		
		System.out.println("Lista de Clientes 2");
		
		String clientes = s.next();
		System.out.println(clientes);
		String[] clientes1 = clientes.split(",");

	for (String cliente : clientes1) {
		System.out.println(cliente);	
		}

		List<String> homens = new ArrayList<>();
		List<String> mulheres = new ArrayList<>();

	for (String cliente : clientes1) {
		String[] dadosPessoa = cliente.split("-");

		String nome = dadosPessoa[0];
		String sexo = dadosPessoa[1];

		System.out.println(nome);
		System.out.println(sexo);

		if("M".equals(sexo)) {
			homens.add(nome);
		} else {
			mulheres.add(nome);
		}
	}	
	
		System.out.println("Homens: " + homens);
		System.out.println("Mulheres: " + mulheres);
	
	/** Bruna,Ricardo,Aline,Caio
	 * Bruna-F,Ricardo-M,Aline-F,Caio-M,Willian-M
	 */
}
		
}

