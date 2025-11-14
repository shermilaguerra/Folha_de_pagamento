/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem_polimorfismo;

public class FolhaPagamentoNaoPolimorfica {
    public static void main(String[] args) {
        FuncionarioNaoPolimorfico[] funcionarios = {
            new FuncionarioNaoPolimorfico("João Castro cpf:123 456 213", "assalariado"),
            new FuncionarioNaoPolimorfico("Maria Cardenas cpf:123 456 213", "horista"),
            new FuncionarioNaoPolimorfico("Carlos Carvalho cpf:123 456 213", "comissionado")
        };
        
        funcionarios[0].setSalarioMensal(2500);
        funcionarios[1].setHorasTrabalhadas(45, 40);
        funcionarios[2].setComissao(1500, 10000, 5);
        
        for (FuncionarioNaoPolimorfico f : funcionarios) {
            System.out.printf("%s: R$ %.2f\n", f.getNome(), f.calcularSalario());
        }
    }
}
