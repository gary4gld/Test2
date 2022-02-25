package com.company;

public class MultidimensionalArrays {
    public static void main(String[] args){

        //One Dimensional Array
        int[] oneDimensionalArray = {12,49,922};
        System.out.println(oneDimensionalArray[1]);

        //Multidimensional Arrays | An array of arrays | They don't have to be the same length
        int[][] multiDimensionalArray = {{12,49,922},{23,56,78,12},{12,34,56}};
        //To print: 1st "[]" refers to the array, the second one to the value in the array
        //To print the 4th number of the second array (counting from 0) we type 1 and 3 respectedly
        System.out.println(multiDimensionalArray[1][3]);

        //Alternate (better) way to create 2DArrays | You can leave the second "[]" empty but not the first one
        //Some space needs to be allocated for the multidimensional array
        double[][] doubleArray = new double[4][2];
        System.out.println(doubleArray[2][1]); //Not initiated- Default value: 0.0

        //Assigning a value to a single space in the array
        doubleArray[3][1] = 2.6;
        System.out.println(doubleArray[3][1]);

        //Assigning multiple values | It requires a nestled for-loop
        for (int array=0; array< multiDimensionalArray.length; array++){
            for (int item=0; item<multiDimensionalArray[array].length;item++){
                System.out.print(multiDimensionalArray[array][item] + "\t");
            }
            //Outer loop
            System.out.println();
        }
        //End of For-loop
    }
}
