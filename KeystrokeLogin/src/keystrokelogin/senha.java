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
public class senha {
    private String nome;
    private ArrayList<Long> tempos;
    private boolean result;
    
    public senha (String nome, ArrayList<Long> tempos, boolean result){
        this.nome = nome;
        this.tempos = tempos;
        this.result = result;
    }
    
}
