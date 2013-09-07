package samples.sample032;

public class Main032 {

	public static void main(String[] args) {
		Integer[] array = {2,4,3};
		System.out.println(sortArrayCompare(array));
	}

	static boolean sortArrayCompare(Integer[] array){
		Integer[] array2 = array.clone();
		mergeSort(array2,0,array2.length-1);
		for(int i = 0; i<array.length;i++){
			if(array[i] != array2[i]){
				return false;
			}
		}
		return true;
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
