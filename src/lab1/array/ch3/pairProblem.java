package lab1.array.ch3;

public class pairProblem {
    public int Pair(int[] a){
        int nr=0;
        int[] frecv=new int[a.length];
       // for(int i=0;i<a.length;i=i+2)

        for(int i=0;i<a.length-1;i++) {
            frecv[i] = 1;
            for (int j = i + 1; j < a.length; j++)
                if ((a[i] + a[j] == 0) && frecv[j]==0) {
                    frecv[j] = 1;
                    nr++;
                    System.out.println(a[i]+" "+a[j]);
                    break;
                }
        }
        return nr;
    }
}
