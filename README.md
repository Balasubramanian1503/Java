# Java
import java.util.*;
class Main{
public static void main(String[] args){
int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum = maxsubarray(arr);
        System.out.println(maxsum);
    }
    static int maxsubarray(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int currsum =0;
        for(int num:arr){
            currsum += num;
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum =0;
            }
        }
        return maxsum;
    }
}
