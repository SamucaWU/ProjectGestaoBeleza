import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class App {

    List<Servicos> services = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        boolean change = true;

        while(change) {
        Servicos.ArrayServicos();
        
        System.out.println("\nMenu: ");
        System.out.println("1. Funcionário");
        System.out.println("2. Usuário");
        System.out.println("3. gerência");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                criarFuncionario();
                break;

            case 2:
                criarUsuario();
                break;
            
            case 3:
           // gerenciarTudo();
            break;

            case 4:
                change = false;
                System.out.println("Saindo do Sistema...");

            default:
                break;
        }
    }   
    }

    private static void criarUsuario() {

        Scanner sc = new Scanner(System.in);


        // Aqui será feito o cadastro de usuário
        System.out.println("Digite o seu nome: ");
        String nomeUsuario = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idadeUsuario = sc.nextInt();
        System.out.println("Digite seu cpf: ");
        int cpfUsuario = sc.nextInt();
        System.out.println("Digite seu telefone: ");
        int telefoneUsuario = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu endereço: ");
        String enderecoUsuario = sc.nextLine();
        System.out.println("Digite seu E-mail: ");
        String emailUsuario = sc.nextLine();
        System.out.println("\n\n");


        Boolean continuarComprando = true;

        // Aqui é adicionado a ArrayList da classe Servicos
        while(continuarComprando) { 
        System.out.println("__________[Lista de Serviços]__________\n");   
        Servicos.services();

        System.out.println("Digite o número do serviço que você quer: ");
        int numeroIndice = sc.nextInt();

        
            if(numeroIndice >= 1 && numeroIndice <= 37) {
               List<Servicos> carrinho = new  ArrayList<Servicos>();
               Servicos services = carrinho.get(numeroIndice - 1);
               carrinho.add(services);

               System.out.println(services.getProduto() + "foi adicionado ao carrinho!");
               
            } else {

                System.out.println("Error. Try again");
                return;
            }

            System.out.println("1. carrinho");



        System.out.println("adicionar algo a mais no carrinho? s/n");
         String simOuNao = sc.next();
         continuarComprando = simOuNao.equalsIgnoreCase("s");
        
         if(simOuNao.equals("s")) {

        }
        }


    }

    private static void criarFuncionario() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Você já tem cadasro de funcionário aqui?");
        System.out.println("1. sim | 2.não");
        int escolhaFuncionario = sc.nextInt();

        switch (escolhaFuncionario) {
            // No caso 1 o cadastro será o nome e a senha de funcionário
            case 1:
                System.out.println("Digite seu nome:");
                sc.nextLine();
                String nomeFuncionario = sc.nextLine();
                System.out.println("Digite sua senha: ");
                int senhaFuncionario = sc.nextInt();
                
                break;
                // No caso 2 será justamente o cadastro para poder ter acesso a funcionário
                case 2:
                System.out.println("Cadastro de funcionário\n");
                System.out.println("Digite seu nome: ");
                sc.nextLine();
                String cadastroNomeFuncionario = sc.nextLine();
                System.out.println("Digite sua idade: ");
                int cadastroIdadeFuncionario = sc.nextInt();
                System.out.println("Digite seu CPF: ");
                int cadastroCpfFuncionario = sc.nextInt();

                break;
        
            default:
                break;
        }

  /*       private static void gerenciarTudo() {
            System.out.println("Menu");
        } */
    }
}
