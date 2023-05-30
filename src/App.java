import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int op=0;
        int opcao=0;
        int op1=0;
        List<Aluno>lista=new ArrayList<>();
        lista.add(new Aluno("Gabriel Pontes Bruzzi Portella Santos","10"));
        lista.add(new Aluno("Guilherme Esteves da Silva Mota   ", "11"));
        lista.add(new Aluno("João Fellipe da Costa Amorim", "12"));
        lista.add(new Aluno("Andrey Albuquerque Leite", "1"));
        lista.add(new Aluno("Camille Vitória Dos Reis Silva", "02"));
        lista.add(new Aluno("Nathan Esteves Vieira", "17"));
        lista.add(new Aluno("Pedro Henrique da Silva Nascimento", "18"));
        lista.add(new Aluno("Sérgio de Souza Lima Sobrinho", "19"));
        lista.add(new Aluno("Carlos Leonardo Carvalho Otoline", "03"));
        lista.add(new Aluno("Cássia Vitória Vieira Palagi", "04"));
        lista.add(new Aluno("Christian Clemente da Silva", "05"));
        lista.add(new Aluno("Emanuel Leocadio Ramalho", "09"));
        lista.add(new Aluno("Davi de Almeida Silva", "06"));
        lista.add(new Aluno("Davi Maia Martins Bittencourt de Souza", "07"));
        lista.add(new Aluno("Thomás da Cruz Pinhero", "20"));
        lista.add(new Aluno("Vinícius Chagas Magro", "21"));
        lista.add(new Aluno("Eduardo da Silva Lima", "08"));
        lista.add(new Aluno("Jose Wanderson da Silva Pimentel", "13"));
        lista.add(new Aluno("Kesia do Amaral Mendes", "14"));
        lista.add(new Aluno("Leonardo de Oliveira Bianco de Figueiredo", "15"));
        lista.add(new Aluno("Luiz Felipe Vieira de Oliveira Ribeiro", "16"));
        lista.add(new Aluno("Vinícius Gabriel Neves Dutra", "22"));

        System.out.println("Bem vindo ao seu sistema administrador");
        do{
        System.out.println("\nO que você deseja fazer hoje?");
        System.out.println("Para Listar Alunos Digite 1 ou Remover Alunos digite 2 para encerrar digite 3");
        opcao = sc.nextInt();
        if(opcao==1){
            
            System.out.println("Entendi. Como Você deseja listar os alunos?");
            do{
            System.out.println("Para listar por nome digite 1 ou listar por matricula 2");
            op=sc.nextInt();
            if((op!=1)&&(op!=2)&&(op!=3)){
                System.out.println("Opa!! Opção Errada!");
            }
            }while((op!=1)&&(op!=2));
            if(op==1){
                lista.sort(null);
                for (Aluno aluno : lista) {
                    System.out.println("\nNome: "+aluno.getNome()+ "Matricula: "+aluno.getMatricula());
                }
            }
                else if(op==2){
                    lista.sort(new AlunoPorMatricula());
                    for (Aluno aluno : lista) {
                        System.out.println("\nNome: "+aluno.getNome()+ "Matricula: "+aluno.getMatricula());
                    }    
                    }   
                }
                else if(opcao==2){
                    System.out.println("Você está prestes a excluir um cadastro isso será irreversível. Tem certeza que deseja continuar?");
                    System.out.println("Para sim 1 ou sair 2");
                    op1=sc.nextInt();
                    do{
                    if(op1!=1&&op1!=2){
                        System.out.println("Opa!! opção errada. Para sair digite 2");
                    }
                }while((op1!=1)&&(op1!=2));
                if(op1==2){
                    System.out.println("Ufa!! Quase!!");
                }
                else{
                    System.out.println("ok! Vamos lá. Por favor digite o nome do aluno que você deseja excluir");
                    String nm= sc.next();
                    lista.removeIf(re->re.getNome().contains(nm));
                    System.out.println("Pronto. Item excluído!");
                }
                }
    
    
        else if(opcao!=1 && opcao!= 2 && opcao!=3){
            System.out.println("Caro usuário você digitou uma opção inválida!");

        }
        if(opcao==3){
            System.out.println("Obrigado por utilizar nosso sistema!");
        }
        }while(opcao!=3);


        
    }
}

