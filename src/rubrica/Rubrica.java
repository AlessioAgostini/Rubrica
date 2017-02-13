/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

import java.util.ArrayList;

/**
 *
 * @author Alessio Agostini
 */
public class Rubrica implements Dictionary {
    private ArrayList <Voce> a;
    private boolean state=false;
    
    public Rubrica (Voce v){
        a=new ArrayList <Voce>();
        a.add(v);
    }
    @Override
    public boolean isEmpty(){
        if(a.size()==0)return true;
        return false;
    }
    @Override
    public void makeEmpty(){
        a.clear();
    }
    @Override
    public void insert(Comparable key, Object value){
            if(key==null)throw new IllegalArgumentException("inserisci un nome");
            for(int i=0;i<=a.size()-1;i++){
                if(a.get(i).getName().equals(key)){
                    a.get(i).setValue((String)value);
                    state=true;
                }
            }
            if(!state){
                Voce v=new Voce((String)key,(String)value);
                a.add(v);
            }
    } 
    @Override
    public void remove(Comparable key){
            for(int i=0;i<=a.size()-1;i++){
                if(a.get(i).getName().equals(key)){
                    a.remove(i);
                    state=true;
                }//if
            }//for
            if (!state)throw new DictionaryItemNotFoundException("nome non trovato"); 
    }
    @Override
    public String find(Comparable key){
        int tmp=0;
        int i;
        for(i=0;i<=a.size()-1;i++){
            if(a.get(i).getName().equals(key)){
                tmp=i;
                i=a.size()-1;
            }        
          }
        if(tmp==0)throw new DictionaryItemNotFoundException("nome non trovato");
        else  return "il numero della persona cercata e`:"+a.get(tmp).getValue()+'\n';
    }
    @Override
    public String toString(){
        String s="";
        for(int i=0;i<=a.size()-1;i++){
           s+=a.get(i).toString()+'\n';
        }
        return s;
    }
    
}