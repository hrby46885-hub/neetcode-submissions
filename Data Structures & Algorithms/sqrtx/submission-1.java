// class Solution {
//     public int mySqrt(int x) {
//         if (x ==0){
//             return 0;
//         }
//         int r = x;
//         int l = 0;
//         int ans = 0;
//         while (l <= r){
//             int mid = l+ (r-l) / 2;
//             if (mid*mid==x){
//                 return mid;
//             }
//             else if (mid*mid < x){
//                 ans = mid;
//                 l = mid+1;
//             }
//             else{
//                 r = mid-1;
//             }
//         }
//      return ans;   
//     }
// }



class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        long left = 1;
        long right = x;
        long answer = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                answer = mid;     
                left = mid + 1;     
            } else {
                right = mid - 1;   
            }
        }
        
        return (int) answer;
    }
}