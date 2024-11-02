package DAY_9;
//import java.util.*;
public class LC84 {
    static int[] NSR(int[] array){ //next smaller element Right
        int[] ans= new int[array.length];
        
        return ans;
    } 
    static int[] NSL(int[] array){ //next smaller element Left
        int[] ans= new int[array.length];
        return ans;
    } 
    static int largestRectangleArea(int[] heights) {
        int maxArea=-1;
        int[] nsl=NSL(heights);
        int[] nsr=NSR(heights);
        int[] breadth= new int[heights.length];
        int[] area=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            breadth[i]=nsr[i]-nsl[i]-1;
        }
        for(int i=0;i<heights.length;i++){
            area[i]=breadth[i]*heights[i];
            maxArea=Math.max(maxArea, area[i]);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
