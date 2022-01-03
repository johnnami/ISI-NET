package visao;

import dao.EntradaItem;
import dao.EntradaUsuario;
import modelo.Item;
import modelo.Usuario;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        EntradaUsuario daoUsuario = new EntradaUsuario();
        EntradaItem daoItem = new EntradaItem();

        String login = "";
        String senha = "";

        Usuario usuario = new Usuario("Joao", "joao@gmail.com", "123");

        Scanner leitura = new Scanner(System.in);
        int res = 0;
        boolean a = false;
        boolean b = false;

        do{
            System.out.println("|_______ISI-NET_    _____|");
            System.out.println("|  1 -    Login      |");
            System.out.println("|  2 -   Registrar   |");
            System.out.println("|  3 -    Sair       |");
            System.out.println("|____________________|");
            res = leitura.nextInt();
            if (res == 1){
                do{
                    System.out.println("1 - Acessar como usuario");
                    System.out.println("2 - Acessar como empresa");
                    System.out.println("0 - Voltar");
                    res = leitura.nextInt();

                    if (res == 1){
                        System.out.println("id: ");
                        leitura = new Scanner(System.in);
                        login = leitura.nextLine();
                        a = daoUsuario.acharNome(daoUsuario.ObterTodos(), login);
                        System.out.println("Senha: ");
                        senha = leitura.nextLine();
                        b = daoUsuario.acharSenha(daoUsuario.ObterTodos(), senha);

                        if (a == true && b == true){
                            int menuUsuario = 0;
                            leitura = new Scanner(System.in);
                            do{
                                System.out.println("|___________INFP____________|");
                                System.out.println("|_______Menu Usuario________|");
                                System.out.println("|  1 - Inserir Produto      |");
                                System.out.println("|  2 - Inserir Item         |");
                                System.out.println("|  6 -     Sair             |");
                                System.out.println("|___________________________|");
                                menuUsuario = leitura.nextInt();
                                if(menuUsuario == 1){
                                    leitura = new Scanner(System.in);
                                    System.out.println("0 - Sair");
                                    leitura = new Scanner(System.in);
                                    menuUsuario = leitura.nextInt();
                                    do{
                                        if(menuUsuario == 1){
                                            break;
                                        }
                                    }while(menuUsuario !=0);
                                }
                                if(menuUsuario == 2){
                                    daoItem.inserir();
                                }
                                if(menuUsuario == 3){
                                }
                            }while(menuUsuario != 6 && menuUsuario != 7);

                        }else {
                            System.out.println("Login ou senha errados");
                        }
                    }
                }while(res != 0);
            }
                          if (res == 2){
                              leitura = new Scanner(System.in);
                                daoUsuario.inserir(usuario);
            }

        }while(res != 3);
    }
}
