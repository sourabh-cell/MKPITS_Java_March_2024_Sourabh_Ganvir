package user_defined_exception_string_mismatch;

public class StringMismatch extends Exception{
    @Override
    public String getMessage() {
        return "String Is Not Matched";
    }
}
