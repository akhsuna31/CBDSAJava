package DAY_11;

public class BS_SearchSpace {
    static boolean check(int speed,int distance,int time){
        int dist_travelled=speed*time;
        return(dist_travelled>=distance);
    }
    static int center(int distance,int time,int low, int high){
        int ans=-1;
        int mid=0;
        while(low<=high){
            mid= (low+high)/2;
            if(check(mid,distance,time)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int low=0;
        int high=200;
        int time=2;
        int distance=100;
        System.out.println(center(distance, time, low, high));
    }
}

//leetcode
//magnetic balls: 1552 done
//koko eating bananas: 875  done
//repair cars: 2594

//aggresive cows
//painter's partition
//read books/books allocation
