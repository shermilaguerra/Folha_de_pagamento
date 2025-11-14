/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arquivo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// classe principal para trabalhar com arquivos CSV
public class ArquivoCsv {
    

    public static void main(String[] args) {
        // Caminho completo do arquivo CSV que será lido
        String arquivo = "/home/usuario/Documentos/a/Dados.csv";
        // Variável para armazenar cada linha lida do arquivo
        String linha;        
        String separador = " | "; // Define o caractere que separa os campos no CSV (vírgula)
            
        // BufferedReader é usado para leitura eficiente do arquivo
        // FileReader é a classe que faz a leitura do arquivo físico
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            // Lê e descarta a primeira linha do arquivo (cabeçalho) (pular os nomes das colunas)
            br.readLine();
            
            // Loop while: lê o arquivo linha por linha até chegar ao final
            // readLine() retorna null quando não há mais linhas para ler
            while ((linha = br.readLine()) != null) {
                // Divide cada linha em um array de strings usando o separador definido
                // Exemplo: "João,30,São Paulo" vira ["João", "30", "São Paulo"]
                System.out.println((linha));
                //String[] dados = linha.split(separador);         
                // for (int i = 0; i < dados.length; i++) {
                // Imprime cada campo seguido de um separador visual " | "
               //     System.out.print(dados[i] + " , ");
                //}
                // No final de cada linha, imprime uma quebra de linha
                // para separar visualmente os registros no console
                System.out.println();
            }
        } catch (IOException e) {
            // Tratamento de exceções: captura erros de leitura do arquivo
            // printStackTrace() exibe detalhes do erro no console
            e.printStackTrace();
        }
    }
}