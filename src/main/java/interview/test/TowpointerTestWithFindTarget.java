package interview.test;

import java.util.Arrays;

public class TowpointerTestWithFindTarget {
    public static void main(String[] args) {
        int target = 11;
        int[] arr={10,1,5,6,7,34,22,56,87,21,5,3,2,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // define two pointer
        int left=0;
        int right=arr.length-1;
        boolean flag=false;
        while (left<=right){
            int sum =arr[left]+arr[right];
            if(sum==target){
                flag=true;
                System.out.println("target meet with number :- " +arr[left]+":"+arr[right] +" at index :"+left+","+right);
            }
            if(sum>target){
                right--;
            }
            else {
            left++;
            }
        }
        if(!flag){
            System.out.println("Target not found");
        }
    }
}
