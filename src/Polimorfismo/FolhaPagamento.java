package Polimorfismo;

public class FolhaPagamento {

    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioMensalista("Jõe Carvalho, cpf: 12121 121",  3000.00);
        Funcionario f2 = new FuncionarioHorista("Camila merino, cpf: 321 321 321 ",  44.00, 25);
        Funcionario f3 = new FuncionarioComissionado("Maria Dias , cpf: 432 432 432", 1500.00, 20000.00, 0.03);
        //f1.nome=""

        // Vetor polimórfico
        Funcionario[] funcionarios = {f1, f2, f3};

        System.out.println("=== Folha de Pagamento ===");
        for (Funcionario f : funcionarios) {
            f.exibirInfo();
        }
    }
    
}
