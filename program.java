class Myclass {
    public static void displayArray() {
        int a[] = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void main(String args[]) {
        System.out.println("It works");
        displayArray();
    }
}
