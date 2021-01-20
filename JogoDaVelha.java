/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameCenter;

/**
 *
 * @author Cintia
 */
public class JogoDaVelha {
    private char[][] jogo;

    public JogoDaVelha() {
        jogo = new char[3][3];
         
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogo[i][j] = ' ';
            }
        }
    }
    
    public void imprimirJogo(){
         System.out.println(jogo[0][0] + " | " + jogo[0][1] + " | " + jogo[0][2] + "\n" + "_________\n" +
                            jogo[1][0] + " | " + jogo[1][1] + " | " + jogo[1][2] + "\n" + "_________\n" +
                            jogo[2][0] + " | " + jogo[2][1] + " | " + jogo[2][2]);
    }
   
    public int verificaVencedor(){
        int m = 0;
        
        /*Linhas*/
        if(((jogo[0][0] == 'x')||jogo[0][0] == 'o') && ((jogo[0][0] == jogo[0][1]) && (jogo[0][0] == jogo[0][2]))){
            if(jogo[0][0] == 'x'){
                m = 1;
            }else {
                m = 2;
            }
        }else if(((jogo[1][0] == 'x')||jogo[1][0] == 'o') && ((jogo[1][0] == jogo[1][1]) && (jogo[1][0] == jogo[1][2]))){
            if(jogo[1][0] == 'x'){
                m = 1;
            }else {
                m = 2;
            }
        }else if(((jogo[2][0] == 'x')||jogo[2][0] == 'o') && ((jogo[2][0] == jogo[2][1]) && (jogo[2][0] == jogo[2][2]))){
            if(jogo[2][0] == 'x'){
                m = 1;
            }else {
                m = 2;
            }
        }/*Colunas*/
         else if(((jogo[0][0] == 'x')||jogo[0][0] == 'o') && ((jogo[0][0] == jogo[1][0]) && (jogo[0][0] == jogo[2][0]))){
            if(jogo[0][0] == 'x'){
                m = 1;
            }else {
                m = 2;
            }
        }else if(((jogo[0][1] == 'x')||jogo[0][1] == 'o') && ((jogo[0][1] == jogo[1][1]) && (jogo[0][1] == jogo[2][1]))){
            if(jogo[0][1] == 'x'){
                m = 1;
            }else {
                m = 2;
            }
        }else if(((jogo[0][2] == 'x')||jogo[0][2] == 'o') && ((jogo[0][2] == jogo[1][2]) && (jogo[0][2] == jogo[2][2]))){
            if(jogo[0][2] == 'x'){
                m = 1;
            }else {
                m = 2;
            }
        }/*Diagonais*/
         else if(((jogo[0][0] == 'x')||jogo[0][0] == 'o') && ((jogo[0][0] == jogo[1][1]) && (jogo[0][0] == jogo[2][2]))){
            if(jogo[0][0] == 'x'){
                m = 1;
            }else {
                m = 2;
            }
        }else if(((jogo[2][0] == 'x')||jogo[2][0] == 'o') && ((jogo[2][0] == jogo[1][1]) && (jogo[2][0] == jogo[0][2]))){
            if(jogo[2][0] == 'x'){
                m = 1;
            }else {
                m = 2;
            }
        }
        return m;
    }

    public char[][] getJogo() {
        return jogo;
    }

    public void setJogo(char[][] jogo) {
        this.jogo = jogo;
    }
}
