package firstjavaproj;

public class MultiplicationTable {
	void Mtab() {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d",i,5,i*5).println();
			}
	}
	
	void Mtab(int num,int from,int to) {
	for(int i=from;i<=to;i++) {
		System.out.printf("%d * %d = %d",i,num,i*num).println();
		}
	
	}
}
