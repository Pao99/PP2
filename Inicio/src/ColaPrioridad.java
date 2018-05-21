/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nenis
 */
public class ColaPrioridad<T>{
   
    private Queue [] CP;
            
    public ColaPrioridad(int n){
       CP = new Queue[n];
        
        for (int i = 0;i<n; i++){
            CP[i] = new Queue();
        }
    }
        
    public void enqueue(T element,int prioridad){
        CP[prioridad].enqueue(element);
        
    }
    
    public T dequeue(){
        for (int i=0;this.CP.length>i; i++){
            if (CP[i].size()!=0){
                return (T) CP[i].dequeue();
            }            
        }
        
        return null;
    }
        
    public T first(){
        for (int i=0;this.CP.length>i; i++){
            if (CP[i].size()!=0){
                return (T) CP[i].first();
            }            
        }
        
        return null;
    }
        
        
    
        
    
    
}