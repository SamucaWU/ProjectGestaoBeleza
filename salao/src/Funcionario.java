
public class Funcionario extends Pessoa {
    
    private String endereco;

   public Funcionario(String nome, int idade, String endereco) {
    super(nome, idade);
    this.endereco = endereco;

   }
    
public String getEndereco () {
    return endereco;
}

   public void mostrarInformacoes() {
    System.out.println("| Funcionário |");
    System.out.format("nome: %s, idade: %d, endereço: %s", getNome() , getIdade() , getEndereco());
   }

}
