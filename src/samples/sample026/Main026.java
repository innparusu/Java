package samples.sample026;

public class Main026 {
	public static void main(String[] args) {
		Integer[] list = {1,2,3,4,5,4,3,2,1};
		mergeSort(list,0,(list.length-1));
		for (int n : list){
			System.out.println(n);
		}
	}

	static void mergeSort(Integer[] list,int p,int q){
		int s;
		if (p < q){
			s = (p+q)/2;
			mergeSort(list,p,s);
			mergeSort(list,s+1,q);
			merge(list,p,s,q);
		}
	}

	static void merge(Integer[] list,int p,int s,int q){
		int j,k;
		Integer[] list2 = new Integer[list.length];
		j = p;
		k = s+1;
		for(int i = p;i <= q;i++){
			if (q < k || (list[j]<=list[k] && j<=s)){
				list2[i] = list[j];
				j++;
			}
			else {
				list2[i] = list[k];
				k++;
			}
		}
		for(int i = p; i <= q;i++){
			list[i] = list2[i];
		}
	}
}
