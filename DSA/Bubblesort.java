import java.util.Scanner;
public class Bubblesort{
    static void bubbleSort(int[] arr){
        int n=arr.length;
        int temp=0;for(int i=0;i<n;i++){
            for(int j=1;j<(n-i); j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ärray before bubble sort");
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println(" Array after bubble sort");
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        }
    }