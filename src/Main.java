import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(4);

        System.out.println("Unsorted ArrayList: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted arrayList: " + numbers);

    }
}

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array)); //Question: take a number and rearrange it's individual elements in descending order
    }
}



public class Main {
    public static void main(String[] args) {

        String greetings = "Hello World";

        System.out.println(greetings.charAt(0));   /**charAt is used to return the character at a specified position from a string*/
        // H
    }
}

public class XO {
    public static boolean getXO(String str) {       // Count all X's and O's in a string and return true if the count is equal or false if count is not equal.
        int x = 0, o = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.toUpperCase().charAt(i) == 'O') o++;
            if(str.toUpperCase().charAt(i) == 'X') x++;
        }
        return x == o;
    }

    public static boolean validatePin(String pin) {   // ATM pin is either 4 digits or 6 digits. anything else returns false.
        return pin.matches("\\d{4}|\\d{6}");
    }

}

    public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i< array.length; i++){
            int value = Integer.parseInt(array[i]);  //parseInt is used to convert a string to integer
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        return String.format("%d %d", max, min);

        /** for each loop syntax  is == for(dataType item : array) {} == */
          where --- datatype of the array or collection == (string, int, double, etc)
          where --- item == each item of this data type or data collection
          where --- array == an array or collection of data

        example:

        public static void main(String[] args) {

         create an array
        int[] numbers = {3, 9, 5, -5};

         foreach loop
         for (int number(each item): numbers(array of numbers)) {
             System.out.println(number);
            }
        }

/** Spliting based on white space */

     public static void main(String args[]){
            String s1="java string split method by javatpoint";
            String[] words=s1.split("\\s");//splits the string based on whitespace

         using java foreach loop to print elements of string array

                for(String w:words){
                System.out.println(w);
    //        }
    //    }
}
}class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i=0; i<nums.length; i++) {

            for(int j = i + 1; j<nums.length; j++) {

                if (nums [j] == target - nums [i]) {
                    return new int [] {i,j};
                }
            }
        }return null;
    }

}


        reverse() - reverses the order of elements
        fill() - replace every element in a collection with the specified value
       copy() - creates a copy of elements from the specified source to destination
       swap() - swaps the position of two elements in a collection
      addAll() - adds all the elements of a collection to other collection


import java.util.Collections;
        import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
         Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("ArrayList1: " + numbers);

        // Using reverse()
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList1: " + numbers);

        // Using swap()
        Collections.swap(numbers, 0, 1);
        System.out.println("ArrayList1 using swap(): " + numbers);

        ArrayList<Integer> newNumbers = new ArrayList<>();

        // Using addAll
        newNumbers.addAll(numbers);
        System.out.println("ArrayList2 using addAll(): " + newNumbers);

        // Using fill()
        Collections.fill(numbers, 0);
        System.out.println("ArrayList1 using fill(): " + numbers);

        // Using copy()
        Collections.copy(newNumbers, numbers);
        System.out.println("ArrayList2 using copy(): " + newNumbers);
    }
}

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Emeka Iloka");
        myList.add("Ken Ofor");
        myList.add("Abdulsalam");
        myList.add("Winner");
        System.out.println("My current list: " + myList);
        Collections.swap(myList, 1,3);

        ArrayList<String> register = new ArrayList<>();
        register.add("Emeka Iloka");
        register.add("Ken Ofor");
        register.add("Abdulsalam");
        register.add("Winner");
        Collections.reverse(register);
        System.out.println("My current register: " + myList);


    }
}