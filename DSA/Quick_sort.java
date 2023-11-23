/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Arrays;

public class Quick_sort 
{

    public static void main(String args[]) 
    {
        int[] input = { 23, 31, 1, 21, 36, 72};
    
    System.out.println("Before sorting : " + Arrays.toString(input));
    quickSort(input);
    System.out.println("After sorting : " + Arrays.toString(input));
    }

public static void quickSort(int[] array)
{
recursiveQuickSort(array, 0, array.length - 1);
}
public static void recursiveQuickSort(int[] array, int start, int end)
{
int idx = partition(array, start, end);
if (start < idx - 1) 
{
recursiveQuickSort(array, start, idx - 1);
}
if (end > idx) 
{
recursiveQuickSort(array, idx, end); 
}
}
public static int partition(int[] array, int left, int right)
{
int pivot = array[left];

while (left <= right) 
{

while (array[left] < pivot) 
{
left++; 
}
while (array[right] > pivot)
{
right--;
}
if (left <= right)
{ 
int tmp = array[left];

array[left] = array[right];
array[right] = tmp;
left++; 
right--; 
}
} 
return left;
}
}

