package br.edu.principal;

import java.util.List;
import java.util.Scanner;

public class Agenda {
	
	public static void adicionar(
			Scanner sc, 
			List<Contato> contatos) {
    	System.out.println("=== ADICIONAR CONTATO ===");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o celular: ");
        String celular = sc.nextLine();
        System.out.print("Digite o email: ");
        String email = sc.nextLine();

        Contato contato = new Contato();
        contato.nome = nome;
        contato.celular = celular;
        contato.email = email;
        contatos.add(contato);

        System.out.println("Contato adicionado com sucesso!");
    }
	
	public static void listar(
            List<Contato> contatos) {
    	System.out.println("=== LISTAR CONTATOS ===");
        if (contatos.size() == 0) {
            System.out.println("Nenhum contato cadastrado!");

        } else {
            for (int i = 0; i < contatos.size(); i++) {

                System.out.println("--------------------------");
                System.out.println("Nome: " + contatos.get(i).nome);
                System.out.println("Celular: " + contatos.get(i).celular);
                System.out.println("Email: " + contatos.get(i).email);
            }
        }
    }

    public static void pesquisar(
            Scanner sc,
            List<Contato> contatos) {
    	System.out.println("=== PROCURAR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).nome.equalsIgnoreCase(nomeBusca)) {
                System.out.println("--------------------------");
                System.out.println("Nome: " + contatos.get(i).nome);
                System.out.println("Celular: " + contatos.get(i).celular);
                System.out.println("Email: " + contatos.get(i).email);

                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado!");
        }
    }

    public static void atualizar(
            Scanner sc,
            List<Contato> contatos) {
    	System.out.println("=== ALTERAR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeProcurado = sc.nextLine();

        int posicao = -1;
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).nome.equalsIgnoreCase(nomeProcurado)) {
                posicao = i;
            }
        }
        if (posicao != -1) {

            System.out.print("Digite o novo nome: ");
            String novoNome = sc.nextLine();

            System.out.print("Digite o novo celular: ");
            String novoCelular = sc.nextLine();

            System.out.print("Digite o novo email: ");
            String novoEmail = sc.nextLine();

            Contato contato = contatos.get(posicao);
            contato.nome = novoNome;
            contato.celular = novoCelular;
            contato.email = novoEmail;

            System.out.println("Contato alterado com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public static void excluir(
            Scanner sc,
            List<Contato> contatos) {
    	System.out.println("=== EXCLUIR CONTATO ===");
        System.out.print("Digite o nome do contato: ");
        String nomeExcluir = sc.nextLine();

        boolean excluido = false;

        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).nome.equalsIgnoreCase(nomeExcluir)) {
                contatos.remove(i);

                excluido = true;

                System.out.println("Contato excluído com sucesso!");
                break;
            }
        }
        if (!excluido) {
            System.out.println("Contato não encontrado!");
        }
    }
    
}
