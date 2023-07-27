public class Merge_sort {
    void merge(int []a,int beg, int mid,int end){
        int i,j,k;
        int n1=mid-beg+1;
        int n2=end-mid;
        //temporary arrays
        int leftarray[]=new int[n1];
        int rightarray[]=new int[n2];

        for(i=0;i<n1;i++){
            leftarray[i]=a[beg+i];
        }
        for(j=0;j<n2;j++){
            rightarray[j]=a[mid+1+j];

        }
        i=0;
        j=0;
        k=beg;

        while(i<n1 && j<n2){
            if(leftarray[i]<=rightarray[j]){
                a[k]=leftarray[i];
                i++;
            }
        else{
            a[k]=rightarray[j];
            j++;
        }
        k++;
        }
        while(i<n1){
            a[k]=leftarray[i];
            j++;
            k++;
        }
        while(j<n2){
            a[k]=rightarray[j];
            j++;
            k++;
        }
    }
void mergeSort(int a[],int beg,int end){
    if(beg<end){
        int mid=(beg+end)/2;
        mergeSort(a,mid,beg);
        mergeSort(a,mid+1,end);
        merge(a,beg,mid,end);
    }
}
void printArray(int a[],int n){
    int i;
    for(i=0;i<n;i++){
        System.out.println(a[i]+" ");
    }
}
public static void main(String[] args) {
    int a[]={11,22,33,44,55,66,77,88,99,00,44,22,43,9,00,44,22,43};
    int n=a.length;
    Merge_sort m1= new Merge_sort();
    System.out.println("Before Sorting  the array");
    m1.printArray(a,n);
    m1.mergeSort(a,0,n-1);
    System.out.println("Äfter aSorting the array");
    m1.printArray(a,n);
    System.out.println(" ");
}
}
