/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameCenter;

import java.util.ArrayList;

/**
 *
 * @author Cintia
 */
public class GameCenter {
    ArrayList<JogoDaVelha> jogos;    

    public GameCenter() {
        jogos = new ArrayList<>();
    }

    
    public void adicionarJogo(JogoDaVelha j){
        jogos.add(j);
    }
    
    public void ImprimirVencedores(){
        for (int i = 0; i < jogos.size(); i++) {
            if(jogos.get(i).verificaVencedor() == 1){
                System.out.println("Jogo " + i + " -> X venceu");
            }else if(jogos.get(i).verificaVencedor() == 2){
                System.out.println("Jogo " + i + " -> O venceu");
            }
        }
    }
    
    public void ImprimirRankin(){
        int xVitorias = 0;
        int oVitorias = 0;
        int empates   = 0;
        
        for (int i = 0; i < jogos.size(); i++) {
            if(jogos.get(i).verificaVencedor() == 1){
                xVitorias ++;
            }else if(jogos.get(i).verificaVencedor() == 2){
                oVitorias++;
            }else{
                empates++;
            }
        }
        if((xVitorias == oVitorias)){
             System.out.println("O - " + oVitorias + " vitorias\n"
                             + "X - " + xVitorias + " vitorias\n"
                             + "Empates - "+ empates );
        }
        else if((xVitorias > oVitorias) && (oVitorias > empates)){
            System.out.println("X - " + xVitorias + " vitorias\n"
                             + "O - " + oVitorias + " vitorias\n"
                             + "Empates - "+ empates);
        } else if((xVitorias > empates) && (oVitorias < empates)){
            System.out.println("X - " + xVitorias + " vitorias\n"
                             + "Empates - "+ empates
                             + "O - " + oVitorias + " vitorias\n");
        }else if((oVitorias > xVitorias) && (xVitorias > empates)){
            System.out.println("O - " + oVitorias + " vitorias\n"
                             + "X - " + xVitorias + " vitorias\n"
                             + "Empates - "+ empates );
        }else if((oVitorias > empates) && (xVitorias < empates)){
            System.out.println("O - " + oVitorias + " vitorias\n"
                             + "Empates - "+ empates 
                             + "X - " + xVitorias + " vitorias\n");
        }else if((empates > oVitorias) && (oVitorias > xVitorias)){
            System.out.println("Empates - "+ empates +
                               "O - " + oVitorias + " vitorias\n"
                             + "X - " + xVitorias + " vitorias\n");
        }else if((empates > xVitorias) && (oVitorias < xVitorias)){
            System.out.println("Empates - "+ empates 
                             + "X - " + xVitorias + " vitorias\n"
                             + "O - " + oVitorias + " vitorias\n");
        }
    }
    
    public void imprimirEmpates(){
        
        int empates = 0; 
        
        for (int i = 0; i < jogos.size(); i++) {
            if(jogos.get(i).verificaVencedor() == 0){
                empates++;
            }
        }
        
        System.out.println("Total de "+ empates +" empates");
    }
    
    
    public ArrayList<JogoDaVelha> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<JogoDaVelha> jogos) {
        this.jogos = jogos;
    }
    
}
