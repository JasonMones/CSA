package Unit7.Lesson27;

import apcslib.*;
public class Item implements Comparable<Item>

{
    private int myId;
    private int myInv;

    public Item(int id, int inv)
    {
        myId = id;
        myInv = inv;
    }

    public int getId(){return myId;}   

    public int getInv(){return myInv;}
    
    @Override
    public int compareTo(Item otherObject){
        int otherId = otherObject.getId();
        if (myId < otherId) {
            return 1;
        }
        else if (myId == otherId) {
            return 0;
        }
        else {
            return -1;
        }
    }
    @Override
    public boolean equals(Object otherObject){
        if (!(otherObject instanceof Item)) {
            return false;
        }
        Item current = (Item) otherObject;
        if (myId == current.getId()) {
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return Format.right(myId, 11) + Format.right(myInv, 10);
    }
}

