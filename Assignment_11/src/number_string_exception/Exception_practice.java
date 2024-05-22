package number_string_exception;

public class Exception_practice {

    public static void main(String[] args) {

        String s = " 123 ";
        String str="sourabh";


        try

    {
        int a = Integer.parseInt(s);
        for (int i = 0; i <= str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
        catch (NumberFormatException e){
            System.out.println("Cant convert this String into Integer");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Trying to access non existing charecter of string");

        }

    }
}