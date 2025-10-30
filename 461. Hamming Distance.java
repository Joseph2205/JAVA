class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        while(x!=0||y!=0){
            int fl = x&1;
            int sl =  y&1;
            if(fl!=sl){
                count++;
            }
            x>>=1;
            y>>=1;
        }
        return count;
    }
}
