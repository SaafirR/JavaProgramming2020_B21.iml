package day19_ForLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++ ){
            System.out.println(i + " ");
        }

        System.out.println();

        System.out.println("======================================");

        for(int i = 100; i <= 200; i++){
            System.out.println(i+" ");
        }

        System.out.println();

        System.out.println("===========================================");

        // 1 3 5  7 9 11 ...

        for(int i = 1; i <= 100; i += 2){
            System.out.println(i+" ");
        }

        System.out.println();

        System.out.println("=========================");

        for(int i = 0; i <100; i++){
            if(i % 2 == 0){
                System.out.println(i+" ");





            }
        }

    }
}
