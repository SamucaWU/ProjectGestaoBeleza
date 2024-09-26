public class Usuario extends Pessoa {

    
    private int telefone;
    private String endereco;
    private String email;


public Usuario(String nome, int idade, int telefone, String endereco, String email)
{
    super(nome, idade);
    
    this.telefone = telefone;
    this.endereco = endereco;
    this.email = email;
   
}

public int getTelefone() {
    return telefone;
}


public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}


public String getEmail() {
    return email;
}


public void setEmail(String email) {
    this.email = email;
}

@Override
public void mostrarInformacoes() {

   System.out.format("Nome: %s, idade: %d, telefone: %d, Endereço: %s, E-mail: %s", getNome(),getIdade(),getTelefone(), getEndereco(),getEmail());

}
}
