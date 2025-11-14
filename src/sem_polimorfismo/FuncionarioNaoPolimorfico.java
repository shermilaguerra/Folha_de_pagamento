/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem_polimorfismo;


class FuncionarioNaoPolimorfico {
    private String nome;
    private String tipo;
    private double salarioMensal;
    private double horasTrabalhadas;
    private double salarioPorHora;
    private double salarioBase;
    private double vendas;
    private double porcentagemComissao;
    
    public FuncionarioNaoPolimorfico(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    
    // Setters para os atributos específicos
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    public void setHorasTrabalhadas(double horasTrabalhadas, double salarioPorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }
    
    public void setComissao(double salarioBase, double vendas, double porcentagemComissao) {
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.porcentagemComissao = porcentagemComissao;
    }
    
    public double calcularSalario() {
        switch (tipo) {
            case "assalariado":
                return salarioMensal;
                
            case "horista":
                double horasExtras = horasTrabalhadas - 40;
                double horasNormais = horasTrabalhadas - horasExtras;
                return (horasNormais * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);
                
            case "comissionado":
                return salarioBase + (vendas * porcentagemComissao / 100);
                
            default:
                throw new RuntimeException("Tipo de funcionário inválido");
        }
    }
    
    public String getNome() {
        return nome;
    }
}