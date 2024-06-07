package service;

import model.Funcionario;
import model.Gerente;
import model.Programador;

public class Main {
    public static void main(String[] args) {
        GestaoFuncionarios gestao = new GestaoFuncionarios();

        Funcionario f1 = new Funcionario("Alice", "Assistente", 3000);
        Funcionario f2 = new Gerente("Bob", 8000, 1500);
        Funcionario f3 = new Programador("Charlie", 5000, "Java");

        gestao.adicionarFuncionario(f1);
        gestao.adicionarFuncionario(f2);
        gestao.adicionarFuncionario(f3);

        System.out.println("Lista de Funcionários:");
        gestao.listarFuncionarios();

        System.out.println("\nAtualizando salário de Alice...");
        f1.setSalario(3500);
        gestao.atualizarFuncionario(0, f1);

        System.out.println("\nLista de Funcionários Atualizada:");
        gestao.listarFuncionarios();

        System.out.println("\nExcluindo Bob...");
        gestao.excluirFuncionario(1);

        System.out.println("\nLista de Funcionários Final:");
        gestao.listarFuncionarios();
    }
}