package lab1.array.ch4;

public class Pairof3 {
    public int Pair(int[] a)
    {
        int nr=0;
        int [] frecv=new int[a.length];
        System.out.println(a.length);
        for (int i=0;i<a.length-2;i++) {
            outer:
            if (frecv[i] == 0)
                for (int j = i + 1; j < a.length - 1; j++)
                    if (frecv[j] == 0)
                        for (int k = j + 1; k < a.length; k++) {

                          //  System.out.println(i + " " + j + " " + k);
                            if (frecv[k] == 0)
                                if (a[i] + a[j] + a[k] == 0) {
                                //    System.out.println(" " + a[i] + " " + a[j] + " " + a[k]);
                                    // System.out.println(i + " " + j + " " + k);
                                    nr++;
                                    frecv[i] = 1;
                                    frecv[j] = 1;
                                    frecv[k] = 1;
                                    break outer;
                                }
                        }
        }
        return nr;
    }
}
