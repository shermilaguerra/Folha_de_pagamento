/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;
   public class FuncionarioComissionado extends Funcionario {
    private final double salarioBase;
    private final double vendas;
    private double taxaComissao; // Exemplo: 0.10 = 10%

    public FuncionarioComissionado(String nome, double salarioBase, double vendas, double taxaComissao) {
        super(nome);
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularPagamento() {
        return salarioBase + (vendas * taxaComissao);
    }
}
