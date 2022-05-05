import java.util.Arrays;
class insertion{
	public static void main(String[] args){
	
	
	int []a={12,5,3,6,11,10,20,9,23};
	int n= a.length;
	System.out.print("before"+Arrays.toString(a));
	for(int i=1;i<n;i++){
	int key=a[i];
	int j= i-1;
	while(j>=0 && a[j]>key){
	a[j+1]=a[j];
	j--;
	}
	a[j+1]=key;
	
	System.out.print(Arrays.toString(a));
	}
	System.out.print("after"+Arrays.toString(a));
	}
}