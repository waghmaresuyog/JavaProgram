package javaCodePackage;

import java.util.ArrayList;
import java.util.List;

public class FindAndUpdateElement {
    public static void main(String[] args) {
        List<String> colourItem = new ArrayList<String>();
        colourItem.add("Red");
        colourItem.add("Green");
        colourItem.add("Yellow");
        colourItem.add("White");
        colourItem.add("Black");

        System.out.println("Print the list");
        for (String element : colourItem) {
            System.out.println(element);
        }

        //Search the value white
        if (colourItem.contains("White")) {
            System.out.println("Found the element white");
        } else {
            System.out.println("There is no such element");
        }

        // Update the fourth element with "Pink"
        System.out.println("Update the fourth element with Pink");
        colourItem.set(3, "Pink");
        // Print the list again
        System.out.println(colourItem);
    }
}

/*Write a Java program to search for an element in an array list.
Write a Java program to update an array element by the given element.
Print the list
Red
Green
Yellow
White
Black
Found the element white
Update the fourth element with Pink
[Red, Green, Yellow, Pink, Black] */

