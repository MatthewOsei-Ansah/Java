/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;
/**
 *
 * @author water
 */
public class Element {
    private String value;
    private Element previous;
    private Element next;
        
    public Element(String value, Element previous, Element next)
    {
        this.value = value;
        this.previous = previous;
        this.next = next;           
    }      
    
    @Override
    public String toString()
    {       
        return value;
    }

    public String Value()
    {
        return value;              
    }
   
    public Element Previous()
    {
        return previous;                
    }
    
    public void Previous(Element value)
    {
        previous = value;                
    }
    
    public Element Next()
    {
        return next;            
    }    
    
    public void Next(Element value)
    {
        next = value;                
    }   
}

