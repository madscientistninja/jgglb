/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninja.madscientist.jgglb;

/**
 *
 * @author masterninja
 */

// Using this to expirement with list
// most of this came from https://www.javatpoint.com/java-list
// So far.

import java.util.*;

public class GopherItemParser {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        for(String fruit:list)
            System.out.println(fruit);
        
    }
}
