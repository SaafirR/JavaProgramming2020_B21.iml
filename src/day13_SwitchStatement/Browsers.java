package day13_SwitchStatement;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "chrome";

        boolean valid = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge" || browserName == "internet explorer";

        String selectedBrowser = "";

        if(valid){

            if(browserName == "chrome"){
                System.out.println("CHROME BROWSER IS SELECTED");
            }else if(browserName == "firefox"){
                System.out.println("FIREFOX BROWSER IS SELECTED");
            }else if(browserName == "opera"){
                System.out.println("OPERA BROWSER IS SELECTED");
            }else if(browserName == "safari") {
                System.out.println("SAFARI BROWSER IS SELECTED");
            }else if(browserName == "edge") {
                System.out.println("EDGE BROWSER IS SELECTED");
            }else if(browserName == "internet explorer") {
                System.out.println("INTERNET EXPLORER BROWSER IS SELECTED");
            }


        }else{
            System.out.println("No such browser");
        }







    }


}

/*

 2. write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge, ie
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name


 */