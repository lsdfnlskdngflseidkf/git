public class Selectionsort {
    
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
        int index=i;
        for(int j=i;j<arr.length;j++){
            if(arr[j]<arr[index]){
                index=j;
            }
        }
        int smallernumber=arr[index];
        arr[index]=arr[i];
        arr[i]=smallernumber;
    }
}
    public static void main(String[] args) {
        int[] arr={9,14,3,10,2,43,11,22};
        System.out.println("Before selection sort");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        selectionsort(arr);
                System.out.println("After selection sort");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
