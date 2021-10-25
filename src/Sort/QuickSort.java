package Sort;

/**
 * 快速排序
 * @author Mr.G
 */
public class QuickSort {
    public void QuickSort(int[] q,int l,int r){
        //确保 l < r
        if(l >= r){
            return ;
        }

        int x = q[ l+r >> 1];

        int i = l - 1;
        int j = r + 1;

        while (i < j){
            do {
                i++;
            }while (q[i]< x);
            do {
                j--;
            }while (q[j]> x);
            if(i < j ){
                int temp = q[i];
                q[i] = q [j];
                q[j] = temp;
            }
        }

        QuickSort(q,l,j);
        QuickSort(q,j+1,r);
    }
}
