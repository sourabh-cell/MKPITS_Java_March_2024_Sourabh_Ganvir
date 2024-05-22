public class Palindrome {

    public String chkpalindrome(String orignal){

        String reverse="";
        for (int i=orignal.length()-1;i>=0;i--) {
            char s = orignal.charAt(i);
            reverse += s;
        }
        System.out.println(reverse);
        System.out.println(orignal);
        System.out.println(reverse.equals(orignal)?"the number is palindrome":"the number is not palindrome");
       return "";
    }


    }


