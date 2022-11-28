package alg;

public class Mergesort {
    private final int[] A;
    private int tempo = 0;

    public Mergesort(int[] A){
        this.A = A;
    }

    private void mergesort(int[] A, int n){
        if(n<2){
            tempo++;
            return;
        }
        int meio = n/2;
        tempo++;
        int[] l = new int[meio];
        tempo++;
        int[] r = new int[n-meio];
        tempo++;
        for(int i=0;i<meio;i++){
            l[i] = A[i];
            tempo++;
        }
        for(int i=meio;i<n;i++){
            r[i - meio] = A[i];
            tempo++;
        }
        mergesort(l, meio);
        mergesort(r, n-meio);
        merge(A, l, r, meio, n-meio);
    }

    private void merge(int[] A, int[] l, int[] r, int left, int right){
        int i=0,j=0,k=0; tempo++;
        while(i<left && j<right){
            if(l[i] <= r[j]){
                A[k++] = l[i++];
                tempo++;
            }else{
                A[k++] = r[j++];
                tempo++;
            }
        }
        while(i < left){
            A[k++]=l[i++];
            tempo++;
        }
        while(j < right){
            A[k++] = r[j++];
            tempo++;
        }
    }

    public void sort(){
        mergesort(A,A.length);
    }

    @Override
    public String toString(){
        String s = "{";
        for(int j : A){
            s += j + ",";
        }
        s = s.substring(0,s.length()-1);
        s+="}";
        return s;
    }

    public void exibirTempo(){
        System.out.println("\nTempo de execução: "+tempo+"ms");
    }
}
