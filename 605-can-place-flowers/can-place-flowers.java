// class Solution {
//     public boolean canPlaceFlowers(int[] flowerbed, int n) {
//         int size = flowerbed.length;
//         if(size == 1 && n > 0 && flowerbed[0] == 0) {
//             n--;
//             flowerbed[0] = 1;
//         }
//         for(int i = 0; i < size; i++) {
//             if(n > 0) {
//                 if(flowerbed[i] == 0){
//                     if(i == 0) {
//                         if(flowerbed[i+1] == 0) {
//                             n--;
//                             flowerbed[i] = 1;fl
//                         }
//                     }
//                     else if(i==size -1) {
//                         if(flowerbed[size-2] == 0) {
//                             n--;
//                             flowerbed[i] = 1;
//                         }
//                     }
//                     else {
//                         if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
//                             n--;
//                             flowerbed[i] = 1;
//                         }
//                     }
//                 }
//             }
//         }
//         return n == 0;
//     }
// }

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}