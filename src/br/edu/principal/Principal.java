package br.edu.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {


        // V.3.0.0: criação de um objeto e acesso aos seus atributos.
        Contato contato = new Contato();
        contato.nome = "Ana";
        contato.celular = "8599999-0000";
        contato.email = "ana@example.com";
        System.out.println("=== EXEMPLO DE OBJETO CONTATO ===");
        System.out.println("Nome: " + contato.nome);
        System.out.println("Celular: " + contato.celular);
        System.out.println("Email: " + contato.email);

        List<String> nomes = new ArrayList<>();
        List<String> celulares = new ArrayList<>();
        List<String> emails = new ArrayList<>();
        Persistencia.carregarContatos(nomes, celulares, emails);
        
        int opcao;
        boolean continuar = true;
        
        Scanner sc = new Scanner(System.in);
        
        Uteis.mostraInicializacao(); 

        while (continuar) {
        	Uteis.mostraMenu();
            opcao = Uteis.selecionaOpcao(sc);

            switch (opcao) {
                case 1-> Agenda.adicionar(sc, nomes, celulares, emails);           	
                case 2-> Agenda.listar(nomes, celulares, emails);
                case 3-> Agenda.pesquisar(sc, nomes, celulares, emails);
                case 4-> Agenda.atualizar(sc, nomes, celulares, emails);           	
                case 5-> Agenda.excluir(sc, nomes, celulares, emails);          	
                case 6-> {
                	Persistencia.salvarContatos(nomes, celulares, emails);
                	continuar = Uteis.sair();
                }
                case 7-> Uteis.sobre();
                default -> System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }	
}
