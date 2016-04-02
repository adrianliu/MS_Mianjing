package MS.MS_Mianjing;

/**
 * Created by xiaopengliu on 2/04/16.
 */
public class StringReplace {

    public static void main(String[] args) {
        String str = "This is good. \nPlease.";
        System.out.print(str);

        System.out.println();
        str = replace2(str);
        System.out.print(str);
    }

    public static String replace1(String str) {
        return str.replace("\n", "\t\n");
    }

    public static String replace2(String str) {
        if(str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == '\n') {
                sb.append("\t\n");
            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }
}
