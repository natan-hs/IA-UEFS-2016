/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystrokelogin;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Senha {
    private String nome;
    private ArrayList<Long> tempos;
    private boolean result;
    
    public Senha (String nome, ArrayList<Long> tempos, boolean result){
        this.nome = nome;
        this.tempos = tempos;
        this.result = result;
    }
    
    public long getTime(int index){
        return tempos.get(index);
    }

    public boolean isCorrect(){
        return result;
    }
}
