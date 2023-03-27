/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author dw
 */
public class SubSet extends HashSet<Integer> {    
    public SubSet(ArrayList<Integer> a)
    {
        super();  
        this.addAll(a);
    }
    
    public int Cardinality()
    {     
        return size();
    }
    
    public HashSet Union(HashSet set) {
        ArrayList<Integer> UnionArray = new ArrayList<>();
        HashSet<Integer> Union = new HashSet();
        Union.addAll(this);
        Union.addAll(set);
        return Union;
    }
    
    public HashSet Intersection(HashSet set)
    {
        HashSet<Integer> Intersection = new HashSet<>();
        for(Integer in: this){
            if(set.contains(in)){
                Intersection.add(in);
            }
        }
        return Intersection;
    }
    
    public HashSet Difference(HashSet set)
    {
        HashSet<Integer> Difference = new HashSet<>();
        for(Integer in: this){
            if(!set.contains(in)){
                Difference.add(in);
            }
        }
        return Difference;
    }
    
    public boolean isSubset(HashSet set){
        for(Integer in:this){
            if(!set.contains(in)){
                return false;
            }
        }
        return true;
    }   
}
