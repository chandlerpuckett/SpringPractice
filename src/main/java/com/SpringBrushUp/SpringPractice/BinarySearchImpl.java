package com.SpringBrushUp.SpringPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
//    sorting an array
//    search the array
//    return the result


//    this is a dependency of BinarySearchImpl
    @Autowired
    private SortAlgorithm bubbleSort;

    public int binarySearch(int[] numbers, int numToSearch){
//        implement sorting logic
//        bubble sort algo

        int[] sortedNums = bubbleSort.sort(numbers);
        System.out.println(bubbleSort);

//        Quick Sort algo


//        search array



//        return index
        return 3;
    }
}
