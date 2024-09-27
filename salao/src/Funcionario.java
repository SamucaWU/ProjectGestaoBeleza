
public class Funcionario extends Pessoa {
    
    private String endereco;
    private String rg;

   public Funcionario(String nome, int idade, String endereco,String rg) {
    super(nome, idade);
    this.endereco = endereco;
    this.rg = rg;

   }
    
public String getEndereco () {
    return endereco;
}

public String getRg() {
    return rg;
}

   public void mostrarInformacoes() {
    System.out.println("| Funcionário |");
    System.out.format("nome: %s, idade: %d, endereço: %s", getNome() , getIdade() , getEndereco(), getRg());
   }

}
