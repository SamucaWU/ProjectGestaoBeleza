import java.util.*;

public class Carrinho{


    private static Servicos carrinhoTemplate;
    private static List<Servicos> carrinhoServicos = new ArrayList<Servicos>();



    public Carrinho(Servicos carrinhoTemplate){
        this.carrinhoTemplate = carrinhoTemplate; 
        
    }


    public static void adicionarAoCarrinho(Servicos carrinhoTemplate) {
        carrinhoServicos.add(carrinhoTemplate);
        System.out.println(carrinhoTemplate.getProduto() + " foi adicionado ao carrinho.");
    }


    public static void exibirCarrinho() {
        if(carrinhoServicos.isEmpty() ) {
        System.out.println("O carrinho está vazio.");

        } else {
            System.out.println("Produtos do carrinho: ");
            for (Servicos carrinhoExibe : carrinhoServicos) {
                System.out.println(carrinhoExibe);
                
            }
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for(Servicos servicos : carrinhoServicos) {
            total += servicos.getPreco();
        }
        return total;
    }


}
