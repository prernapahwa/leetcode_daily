class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        if(size == 1 && n > 0 && flowerbed[0] == 0) {
            n--;
            flowerbed[0] = 1;
        }
        for(int i = 0; i < size; i++) {
            if(n > 0) {
                if(flowerbed[i] == 0){
                    if(i == 0) {
                        if(flowerbed[i+1] == 0) {
                            n--;
                            flowerbed[i] = 1;
                            System.out.println(i);
                            System.out.println(n);
                        }
                    }
                    else if(i==size -1) {
                        if(flowerbed[size-2] == 0) {
                            n--;
                            flowerbed[i] = 1;
                            System.out.println(i);
                            System.out.println(n);
                        }
                    }
                    else {
                        if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                            n--;
                            flowerbed[i] = 1;
                            System.out.println(i);
                            System.out.println(n);
                        }
                    }
                }
            }
        }
        return n == 0;
    }
}