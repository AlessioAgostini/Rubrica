
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

/**
 *
 * @author Alessio Agostini
 */
public class Voce implements Comparable <Voce>{
    private String name;
    private String value;

    public Voce (String name, String value){
        this.name=name;
        this.value=value;
    }

    public String toString(){
        return "Il nome e`:"+name+", il numero e`:"+value;
    }

    public int compareTo(Voce o){
        if(name.equals(o.name))return 0;
        return -1;
    }

    public String getName(){
        return name;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value=value;
    }
    
}