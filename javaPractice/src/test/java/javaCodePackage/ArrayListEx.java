package javaCodePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<String>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("White");
        colorList.add("Black");
        System.out.println("List before reversing:\n " + colorList);
        //reversing the array list use below code
        Collections.reverse(colorList);
        System.out.println("List after reversing :\n" + colorList);
        // Remove the third element from the list. in this case use the index of list.
        colorList.remove(2);
        System.out.println("List after removing the element :\n" + colorList);
    }
}


//List before reversing:
// [Red, Green, Yellow, White, Black]
//List after reversing :
//[Black, White, Yellow, Green, Red]
//Write a Java program to remove the third element from an array list.
//List after removing the element :
//[Black, White, Green, Red]
