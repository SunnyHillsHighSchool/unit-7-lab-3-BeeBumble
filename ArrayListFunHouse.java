//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Quinn Cassady

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
  //make integer array list ray
  ArrayList<Integer> ray = new ArrayList<Integer>();
  //make a for loop with i = 2, i < number, and i++
  for(int i = 2; i < number; i++){
    //if the remainder of number/i is 0
    if(number % i == 0){
      //then add i to ray
      ray.add(i);
    //end the if
    }
  //end the for
  }
  //return ray
  return ray;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   //make integer array list arr
   ArrayList<Integer> arr = new ArrayList<Integer>();
  //make for loop with i = arr size-1, i>=0, and i--
  for(int i = nums.size() - 1; i >= 0; i--){
    //put the factor list into arr
    arr = ArrayListFunHouse.getListOfFactors(nums.get(i));
    //if size of arr is 0
    if(arr.size() == 0){
      //then remove the element at i from arr
      nums.remove(i);
    //end the if
    }
  //end the for
  }
 }
}