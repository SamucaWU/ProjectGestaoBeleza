import java.util.ArrayList;
import java.util.List;


public class Servicos {
    // static List<Servicos> lista = new ArrayList<Servicos>();
    private  int item;
    private  String produto;
    private  double preco;
    public int numeroIndice;

    public Servicos(int item, String produto, double preco) {
        this.item = item;
        this.produto = produto ;
        this.preco = preco;

    }



    public Servicos() {
       
    }








    public String toString() {

        return getItem() + "" + getProduto() + "" + getPreco();


    }
       
    
    public int getItem() {
        return item;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    // public  List<Servicos> getlista() {
    //     return lista;
    // }
    






    // public  void setLista(List<Servicos> lista) {
    //     lista = lista;
    // }

    public void setItem(int item) {
        this.item = item;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }




    public static void ArrayServicos() {
        Carrinho.adicionarAoCarrinho(new Servicos(0, "nothing",0.0));
        Carrinho.adicionarAoCarrinho(new Servicos( 1, ". Corte Feminino ", 55.0));
        Carrinho.adicionarAoCarrinho(new Servicos(2, ". Corte Masculino ", 42.0));
        Carrinho.adicionarAoCarrinho(new Servicos(3, ". Corte Infantil ", 38.0));
        Carrinho.adicionarAoCarrinho(new Servicos(4, ". Franja ", 26.0));
        Carrinho.adicionarAoCarrinho(new Servicos(5, ". Secar ", 18.50));
        Carrinho.adicionarAoCarrinho(new Servicos(6, ". Brushing ", 37.0));
        Carrinho.adicionarAoCarrinho(new Servicos(7, ". Shampoo Especial L'oréal ", 7.0));
        Carrinho.adicionarAoCarrinho(new Servicos(8, ". Condicionador Especial L'oréal ", 7.0));
        Carrinho.adicionarAoCarrinho(new Servicos(9, ". Aplicação de Ampola L'oréal ", 28.0));
        Carrinho.adicionarAoCarrinho(new Servicos(10, ". Aplicação de Ampola Alfaparf ", 24.0));
        Carrinho.adicionarAoCarrinho(new Servicos(11, ". Hidratação L'oréal Serie Expert (máscara) ", 45.0));
        Carrinho.adicionarAoCarrinho(new Servicos(12, ". Hidratação L'oréal Serie Expert (ampola) ", 55.0));
        Carrinho.adicionarAoCarrinho(new Servicos(13, ". Cauterização Thermo Cellular ", 95.0));
        Carrinho.adicionarAoCarrinho(new Servicos(14, ". Progressiva ", 190.0));
        Carrinho.adicionarAoCarrinho(new Servicos(15, ". Coloração ", 85.0));
        Carrinho.adicionarAoCarrinho(new Servicos(16, ". Tonalizante ", 75.0));
        Carrinho.adicionarAoCarrinho(new Servicos(17, ". Luzes + Tonalizante ", 195.0));
        Carrinho.adicionarAoCarrinho(new Servicos(18, ". Ombré Hair + Tonalizante ", 340.0));
        Carrinho.adicionarAoCarrinho(new Servicos(19, ". Reconstrução Havaiana ", 155.0));
        Carrinho.adicionarAoCarrinho(new Servicos(20, ". Relaxamento Yellow ", 150.0));
        Carrinho.adicionarAoCarrinho(new Servicos(21, ". Relaxamento Wella ", 185.0));
        Carrinho.adicionarAoCarrinho(new Servicos(22, ". Penteado ", 145.0));
        Carrinho.adicionarAoCarrinho(new Servicos(23, ". Maquiagem ", 80.0));
        Carrinho.adicionarAoCarrinho(new Servicos(24, ". Maquiagem Infantil ", 25.0));
        Carrinho.adicionarAoCarrinho(new Servicos(25, ". Cílios + Aplicação ", 30.0));
        Carrinho.adicionarAoCarrinho(new Servicos(26, ". Aplicação de Cílios ", 18.0));
        Carrinho.adicionarAoCarrinho(new Servicos(27, ". Sobrancelha ", 18.0));
        Carrinho.adicionarAoCarrinho(new Servicos(28, ". Henna de Sobrancelha - R$", 26.0));
        Carrinho.adicionarAoCarrinho(new Servicos(29, ". Buço ", 9.0));
        Carrinho.adicionarAoCarrinho(new Servicos(30, ". Axilas ", 18.0));
        Carrinho.adicionarAoCarrinho(new Servicos(31, ". Meia perna ", 20.0));
        Carrinho.adicionarAoCarrinho(new Servicos(32, ". Perna Inteira ", 37.0));
        Carrinho.adicionarAoCarrinho(new Servicos(33, ". Virilha ", 28.0));
        Carrinho.adicionarAoCarrinho(new Servicos(34, ". Mão ", 19.0));
        Carrinho.adicionarAoCarrinho(new Servicos(35, ". Mão + francesinha ", 21.0));
        Carrinho.adicionarAoCarrinho(new Servicos(36, ". Pé ", 23.0));
        Carrinho.adicionarAoCarrinho(new Servicos(37, ". Pé + francesinha ", 23.0));
       
        }




    // public static void services() {
    //     for(Servicos sv : lista) {

    //        System.out.println(sv.getItem() + sv.getProduto()+ " R$"+sv.getPreco()  + "\n");
           
           
    //     }
    // }

    // public Servicos selecionarServico(int numeroIndice) {
    //     if(numeroIndice >= 1 && numeroIndice < lista.size() ) {
    //         return lista.get(numeroIndice);

    //     } else {
    //         System.out.println("Valor inválido");
    //         return null;
    //     }
    // }
    
    }



  
   
    

