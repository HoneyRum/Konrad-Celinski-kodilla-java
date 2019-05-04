package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
   public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
       ArrayList<Integer> oddNumbers = new ArrayList<>();
       for(Integer checkNumber : numbers){
           if(checkNumber % 2 == 0){
               oddNumbers.add(checkNumber);
           }
       }
       return oddNumbers;

   }
}
