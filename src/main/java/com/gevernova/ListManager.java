package com.gevernova;

import java.util.List;

public class ListManager {

    // Adds an element to the list
    public void addElement(List<Integer> list, int element){
        list.add(element);
    }

    // Removes the first occurrence of the element from the list
    public void removeElement(List<Integer> list, int element){
        list.remove(Integer.valueOf(element));
    }

    // Returns the size of the list
    public int getSize(List<Integer> list){
        return list.size();
    }
}
