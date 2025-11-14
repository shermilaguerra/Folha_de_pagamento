
package Polimorfismo;

// Classe base abstrata
public abstract class Funcionario {
    private String nome;
    // Construtor
    public Funcionario(String nome) {
        this.nome = nome;        
    }    
    //o get()  para obter o valor de um atributo
    public String getNome() {
        return nome;
    }
    //o set() para modificar ou definir um valor para esse atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato que cada tipo de funcionário vai implementar
    public abstract double calcularPagamento();

    // Método comum para exibir informações
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + calcularPagamento());
        System.out.println("--------------------------------------");
    }
}
