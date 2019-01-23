/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc31b;

import java.util.*;

class CC31B {
//This method stores the sum of all the elements of array in variable sum and returns the average by dividing the sum with the length of array.
public static double findMean(int array[]){
double sum = 0;
double average=0;
double length=array.length;
for(int j = 0; j < length; j++){
sum += array[j];
average = sum / length;
}
System.out.println("Sum is: " + sum);
return average;
}

//This method counts the occurrence of each element of array and return the lement which has the maximum count.
public static int findMode(int array[]) {
int max=0, maxCount=0;
int length=array.length;
for (int i = 0; i <length; ++i) {
int count = 0;
for (int j = 0; j <length; ++j) {
if (array[j] == array[i]) ++count;
}
if (count > maxCount)
{
maxCount = count;
max = array[i];
}
}
return max;
}

public static void main(String[] args)
{
Scanner nums = new Scanner(System.in);
//int min = 0;
//int max = 0;
System.out.println("Enter size of array:");
  int n = nums.nextInt();
  int[] num = new int[n];

  System.out.println("Enter elements of array:");

    for (int i = 0; i < n; i++){
      num[i] = nums.nextInt();
}

double mean=CC31B.findMean(num);
System.out.println("Mean= "+mean);
int mode=CC31B.findMode(num);
System.out.println("Mode= "+mode);
}
}
