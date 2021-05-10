package lab1.array.ch1;

public class main {
    public void printFizzBuzz(){
        for (int i=1;i<=100;i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            if (i%15 ==0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%11 ==0) {
                System.out.println("Jazz");
                continue;
            }
            if (i%7 ==0) {
                System.out.println("Rizz");
                continue;
            }
                System.out.println(i);
        }
    }

    public static void main(String[] args){
    main mainobject=new main();
    mainobject.printFizzBuzz();
    }
}
