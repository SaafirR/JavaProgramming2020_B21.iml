package day21_WhileLoop;

public class SubStringMethodPractice {

    public static void main(String[] args) {

        String email = "John_Daniel@gmail.com";

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.lastIndexOf("@");

        String lastName = email.substring(0, email.indexOf("_"));

        String firstName = email.substring(indexOf_+1, indexOfAt);

        String domain = email.substring(indexOfAt + 1,  email.lastIndexOf("_"));

        String fullName = firstName + " " +lastName;

        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("domain = " + domain);
        System.out.println("fullName = " + fullName);


    }

}
