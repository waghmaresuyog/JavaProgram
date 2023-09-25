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

        // Print the list
        System.out.println("Print the list");
        for(String element:colorList){
            System.out.println(element);
        }

        System.out.println("Original array list: " + colorList);
        String new_color = "White";
        colorList.set(0,new_color);
        System.out.println("After replacing array list: " + colorList);

        //using for loop print the element of an array list
        int no_of_elements = colorList.size();
        for (int index = 0; index < no_of_elements; index++)
            System.out.println(colorList.get(index));
    }
}


//List before reversing:
// [Red, Green, Yellow, White, Black]
//List after reversing :
//[Black, White, Yellow, Green, Red]

//Write a Java program to remove the third element from an array list.
//List after removing the element :
//[Black, White, Green, Red]

//Write a Java program to iterate through all elements in an array list.
//Print the list
//Black
//White
//Green
//Red

//Original array list: [Black, White, Green, Red]
//After replacing array list: [White, White, Green, Red]
//White
//White
//Green
//Red