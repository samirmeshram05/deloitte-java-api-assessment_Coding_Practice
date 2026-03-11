import java.util.*;
public class mergesort{

public static void merge(int arr[],int l, int mid , int r){
    int n1=mid+1;
    int n2=r-mid;
    int a=new int[n1];
    int b[n2];

    for(int i=0;i<n1;i++){
        a[i]=arr[l+1];

    }
    for(int i=0;i<n2;i++){
        b[i]=arr[mid+1+i];
    }
    int i=0, j=0,k=l;

    while(i<n1 && j<n2){
        if(a[i]<b[i]){
            arr[k]=a[i];
            k++; i++;
        }
        else{
            arr[k]=b[j];
            k++;  j++;
        }
    }

    while(i<n1){
        arr[k]=a[i];
        k++; i++;
    }

    while(j<n2){
        arr[k]=b[j];
        k++; j++;
    }

    void mergesort(int arr[],int l, int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(arr, mid+1,r);
            mergesort(arr,l,mid,r);
        }
    }


    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergesort(arr,0,4);
        for(int i=0;i<5;i++){
            
            System.out.println(arr[i]+ " ");

        }
        System.out.println();

    }

}
}
