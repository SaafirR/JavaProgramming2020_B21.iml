package day13_SwitchStatement;

public class SwitchStatement_Practice3 {

    public static void main(String[] args) {
        String browser = "chrome";

        String selectedBrowser = "";

        switch (browser){
            case "chrome":
                selectedBrowser = "CHROME BROWSER";
                break;

            case "firefox":
                selectedBrowser = "FIREFOX BROWSER";
                break;

            case "opera":
                selectedBrowser = "OPERA BROWSER";
                break;

            case "edge":
                selectedBrowser = "SAFARI BROWSER";
                break;

            case "ie":
                selectedBrowser = "INTERNET EXPLORE BROWSER";
                break;

            default:
                selectedBrowser = "INVALID BROWSER NAME";

        }

        System.out.println(selectedBrowser);


    }




}
