public class J {
    public static int TrappedWater(int height[]) {
        //left max boundry
        int leftmax[] = new int[height.length];
        leftmax[0]= height[0];
        for(int i= 1; i<height.length; i++) {
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);

        }
        //Right max boundary
        int Rightmax[] = new int[height.length];
        Rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--) {
            Rightmax[i] = Math.max(height[i], Rightmax[i+1]);
        }
        int trappedWater = 0;
        //loop
        for(int i =0;i<height.length;i++) {
            //put max 
            int Waterlevel  = Math.min(Rightmax[i], leftmax[i]);
            //Apply formula
            trappedWater += Waterlevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("The trapped Water is "+TrappedWater(height));
    }
}
