class Solution {
    public int maxArea(int[] arr) {
        int left =0;
        int right =arr.length-1;
        int max =0;
        int area =0;
        while(left<right){
            area = (right-left)*Math.min(arr[left],arr[right]);
            max = Math.max(max,area);
            if(arr[left]>arr[right]) {
                right--;
            }
            else {
                left++;
            }
        }
        return max;
    }
}