
package practice;

public class Hairestu {
	public static void main(String[]args){
	int[] moneyList = {121902, 8302, 55100};
	for(int i=0; i< moneyList.length ; i++){
		System.out.println(moneyList[i]);
	}
	for(int m:moneyList){
		System.out.println(m);
	}
	int[] numbers = {3, 4, 9};
	System.out.println("1桁の数字を入力してください");
	int input = new java.util.Scanner(System.in).nextInt();
	for(int j : numbers){
		if(j == input){
			System.out.println("あたり");
		}
	}
	}
}

