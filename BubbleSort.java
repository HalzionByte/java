
package zayem44java.java;


public class BubbleSort {
    public static void main(String[] args) {
         int [] num = {1,6,9,2,8,3,7,4,5};
    for(int i =0;i<num.length - 1;i++){
        System.out.print("  "+num[i]);
}
        System.out.println("****************************************");
    Bubble(num);
    
    for(int i =0;i<num.length - 1;i++){
        System.out.print("  "+num[i]);
}
    }
   public static void Bubble(int[] arr){
       int n = arr.length;
       boolean swapped;
       for(int i =0 ; i<n-1;i++){
           swapped = false;
           for(int j =0 ; j< n-1;j++){
               if(arr[j]<arr[j+1]){
                   int temp = arr [j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swapped = true;
               }
           }
           if(!swapped){
               break;
           }
       }
   }
}
