import java.util.ArrayList;

public class Waterproblem {
    //Is a brute force approach it's contain time complexity of O(n^2)
    public static int WaterBrute(ArrayList<Integer> hight) {
        int max = 0;
        // brute force
        for (int i = 0; i < hight.size(); i++) {
            for (int j = i + 1; j < hight.size(); j++) {
                int ht = Math.min(hight.get(i), hight.get(j));
                int width = j - i;
                int currWater = ht * width;
                max = Math.max(currWater, max);
            }
        }
        return max;
    }
    // is  two pointer approach it's time complexity is O(n)
    public static int storewater(ArrayList<Integer> hight) {
        int maxwater = 0;
        int lp = 0;
        int rp = hight.size() - 1;
        while (lp < rp) {
            // calculate water area
            int ht = Math.min(hight.get(lp), hight.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxwater = Math.max(currWater,maxwater );

            // update water ptr
            if (hight.get(lp) < hight.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }
        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);

        System.out.print("Store water : " + storewater(hight));
    }
}
