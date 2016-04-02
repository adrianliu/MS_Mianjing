package MS.MS_Mianjing;

/**
 * Created by xiaopengliu on 3/04/16.
 */
public class RemoveSpace {
    public static void main(String[] args) {
        String str = "  This   is  good to  know. ";
        System.out.println(str);
        System.out.println(removeSpace(str));
    }

    public static String removeSpace(String str) {

        //Java String trim method returns a new copy of string with leading and rear space omitted.
        str = str.trim();

        char[] arr = str.toCharArray();
        int n= arr.length;
        int k = 0;
        for(int i = 0;i < n;i++) {
            if(i > 0 && arr[i-1] == ' ' && arr[i] == ' ') {
                //do nothing.
            } else {
                arr[k++] = arr[i];
            }
        }
        return new String(arr,0,k);
    }
}
