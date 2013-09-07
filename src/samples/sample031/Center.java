package samples.sample031;

public class Center implements BasicValueIFace {

	@Override
	public int getValue(int[] array) {
		mergeSort(array,0,array.length-1);
		return array.length%2 != 0 ? array[array.length/2]:(array[array.length/2-1]+array[array.length/2])/2;
	}

	@Override
	public String getValueName() {
		return "Center";
	}

	private void mergeSort(int[] list,int p,int q){
		int s;
		if (p < q){
			s = (p+q)/2;
			mergeSort(list,p,s);
			mergeSort(list,s+1,q);
			merge(list,p,s,q);
		}
	}

	private void merge(int[] list,int p,int s,int q){
		int j,k;
		int[] list2 = new int[list.length];
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
