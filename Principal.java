/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameCenter;

import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        GameCenter jogos = new GameCenter();
        
        
        String menu = "\n\n\n1 - Jogar\n"
                + "2 - Imprimir ultimo jogo\n"
                + "3 - Imprimir vencedores\n"
                + "4 - Imprimir Ranking\n"
                + "5 - Imprimir Quantidade de empates\n\n"
                + "0 - Sair";
        int op = 0;
        do {            
            System.out.println(menu);
            op = leitor.nextInt();
            
            switch(op){
                case 0:{
                    break;
                }
                case 1:{
                    JogoDaVelha j = new JogoDaVelha();
                    char[][] jogo = new char[3][3];
                    int col = 0;
                    int lin = 0;
                    
                    int cont1 = 0;
                    int contEnd = 0;
                    
                    System.out.println("Digite quem comeca:   ");
                    String l = leitor.next();
                    char letra = l.charAt(0);
                        
                    do{
                        j.imprimirJogo();
                        
                        System.out.println(letra + " joga\n\nDigite a linha:");
                        lin = leitor.nextInt();
                        
                        System.out.println(" Agora a coluna:");
                        col = leitor.nextInt();
                        
                        jogo[lin][col] = letra;
                        
                        j.setJogo(jogo);
                        
                        if(letra == 'x'){
                            letra = 'o';
                        }else{
                            letra = 'x';
                        }
                        
                        cont1++;
                        contEnd++;
                        
                        if(contEnd == 9){
                            j.imprimirJogo();
                            System.out.println("Empate");
                            jogos.adicionarJogo(j);
                            break;
                        }else if(cont1 >= 5){
                            int v = j.verificaVencedor();
                            if(v == 1){
                                j.imprimirJogo();
                                System.out.println("X ganhou");
                                jogos.adicionarJogo(j);
                                break;
                            }else if(v == 2){
                                j.imprimirJogo();
                                System.out.println("O ganhou");
                                jogos.adicionarJogo(j);
                                break;
                            }
                        }
                        
                    }while(contEnd != 9);
                    
                    break;
                }
                case 2:{
                    int imp = (jogos.getJogos().size() - 1);
                    
                    jogos.getJogos().get(imp).imprimirJogo();
                    int v = jogos.getJogos().get(imp).verificaVencedor();
                    if(v == 1){
                        System.out.println("X ganhou");
                    }else if(v == 2){
                        System.out.println("O ganhou");
                    }else{
                        System.out.println("Empate");
                    }
                    break;
                }
                case 3:{
                    jogos.ImprimirVencedores();
                    break;
                }
                case 4:{
                    jogos.ImprimirRankin();
                    break;
                }
                case 5:{
                    jogos.imprimirEmpates();
                    break;
                            
                }
                default : {
                    System.out.println("Invalido");
                }
            }            
        } while (op != 0);
    }
}
