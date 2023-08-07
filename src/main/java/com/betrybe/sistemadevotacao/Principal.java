package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe Principal.
 */
public class Principal {

  /**
   * Método main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    while (true) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      int opcao = Integer.parseInt(scanner.nextLine());

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nomeCandidata = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroCandidata = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.cadastrarPessoaCandidata(nomeCandidata, numeroCandidata);
      } else {
        break;
      }
    }

    while (true) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      int opcao = Integer.parseInt(scanner.nextLine());

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nomeEleitora = scanner.nextLine();
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpfEleitora = scanner.nextLine();
        gerenciamentoVotacao.cadastrarPessoaEleitora(nomeEleitora, cpfEleitora);
      } else {
        break;
      }
    }

    while (true) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      int opcao = Integer.parseInt(scanner.nextLine());

      if (opcao == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfEleitora = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroCandidata = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.votar(cpfEleitora, numeroCandidata);
      } else if (opcao == 2) {
        gerenciamentoVotacao.mostrarResultado();
      } else if (opcao == 3) {
        gerenciamentoVotacao.mostrarResultado();
        break;
      }
    }
  }
}