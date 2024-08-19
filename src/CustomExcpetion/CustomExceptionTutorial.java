package CustomExcpetion;

public class CustomExceptionTutorial {
    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(5);
    }
    private static void validateAge(int age) throws AgeLessThanZeroException {
        if(age < 0){
            throw new AgeLessThanZeroException("Age can't be negative or less than zero",new RuntimeException());
        }
    }
}
