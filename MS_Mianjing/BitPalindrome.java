package MS.MS_Mianjing;

/**
 * Created by xiaopengliu on 3/04/16.
 */
public class BitPalindrome {

   public static void main(String[] args) {
       int a = (int)Math.pow(2, 31) - 1;
       System.out.println(isPalindrom(a));
       System.out.println(isPalindrom2(a));
   }

    public static boolean isPalindrom(int a) {
        //My own implementation of toBinaryString.
        String bitStr = toBinary(a);
        //System.out.println(bitStr);
        System.out.println(Integer.toBinaryString(a));
        if(bitStr.length() < 2) {
            return true;
        }
        int i = 0;
        int j = bitStr.length() - 1;
        while(i < j) {
            if(bitStr.charAt(i) != bitStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static boolean isPalindrom2(int a) {
        int n = getNumberOfBits(a);
        for(int i = 0;i < n/2;i++) {
            if(isKthBitSet(a, i) != isKthBitSet(a, n-i-1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isKthBitSet(int a, int k) {
        int x = (1 << k);
        return (x & a) != 0;
    }

    private static int getNumberOfBits(int a) {
        int count = 0;
        while(a != 0) {
            a = a >> 1;
            count++;
        }
        return count;
    }

    private static String toBinary(int a) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < 32;i++) {
            int x = 1 << i;
            if((x & a) != 0) {
                sb.insert(0, "1");
            } else {
                sb.insert(0, "0");
            }
        }
        //remove leading zeroes
        return removeLeadingZeroes(sb);
    }

    private static String removeLeadingZeroes(StringBuilder sb) {
        StringBuilder res = new StringBuilder();
        boolean flag = false;
        for(int i = 0;i < sb.length();i++) {
            if(sb.charAt(i) == '1') {
                res.append(sb.charAt(i));
                flag = true;
            } else {
                if(flag) {
                    res.append(sb.charAt(i));
                }
            }
        }
        return res.toString();
    }
}


