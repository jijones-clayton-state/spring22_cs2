import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice{
    public static void main(String[] args){
        // Create an ArrayList to store vowels
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        System.out.println(vowels);
        
        // Add 2 vowels to end of list
        vowels.add('a');
        vowels.add('u');
        
        // Print list
        System.out.println(vowels);
        
        // Print # elements in list
        System.out.println("There are " + vowels.size() + " elements in the list");
        
        // Insert 2 vowels at front
        vowels.add(0, 'e');
        vowels.add(0, 'i');
        
        System.out.println(vowels);
        
        // Retrieve an element (and print it)
        System.out.println(vowels.get(1));
        
        // Remove an element
        vowels.remove(1);
        System.out.println(vowels);
        
        // Remove last element (regardless of how many elements are in the list)
        vowels.remove(vowels.size() - 1);
        System.out.println(vowels);
        
        int[] nums = {1, 2, 34, 5};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
    }
}