package Daily;

import chn.util.*;
import apcslib.*;
public class Tree {
    public static void main(String[] args) {
        ConsoleIO kb = new ConsoleIO();
    
        System.out.print("Enter size of the tree: ");
        int size = kb.readInt();
        
        System.out.println(Format.right("*",size+1));
        for (int cnt=size; cnt>1;cnt--) {
            System.out.println(Format.right("*",cnt)+Format.right("*",((size+1)-cnt)*2));
        }
        for(int cnt=(size*2)+1;cnt>0;cnt--) {
            System.out.print("*");
        }
    }
}