public class forFun {

    public static void main(String[] args) {


        // A method is a code that does a specific task

        // String method is a code that does a specific task to your string

        // if statement, scanner , for loop, switch

        String name = "wow that's is crazy";

        System.out.println("Name : " + name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(4));
        System.out.println(name.substring(3,8));
        System.out.println(name.length());
        System.out.println(name.replace("wow that is crazy", "is it really though?"));
        System.out.println(name.replace("is", "not"));

        System.out.println("What do you think? " + " Ummm..." + name.replace("is", "not"));


        String str = "love";
        if(str.length() >= 3 ){
            System.out.print(str.substring(0,3));
            System.out.print(str.substring(0,3));
            System.out.print(str.substring(0,3));
        }else{
            System.out.println(str);
        }

    }

}
