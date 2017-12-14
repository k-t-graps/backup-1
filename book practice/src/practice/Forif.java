package practice;

public class Forif {

	public static void main(String[] args) {
		int seibetu = 1;
		int age = 26;

		System.out.println("こんにちは");
		if(seibetu == 0){
			System.out.println("私は男です");
			System.out.println(age+"歳です。");
		}else{
			System.out.println("私は女です");
		}
		System.out.println("よろしくお願いします。");





		System.out.println("[メニュー]1:検索2:登録3:削除4:変更");
		int selected = new java.util.Scanner (System.in).nextInt();
		if(selected == 1){
			System.out.println("検索します");
		}else if(selected ==2){
			System.out.println("登録します");
		}else if(selected == 3){
			System.out.println("削除します");
		}else if(selected == 4){
			System.out.println("変更します");
		}



		System.out.println("数あてゲーム");
		int ans = new java.util.Random().nextInt(10);
		for(int i =0; i<5; i++){
			System.out.println("0～9の数字を入力して下さい");
			int num = new java.util.Scanner (System.in).nextInt();
			if(num == ans){
				System.out.println("あたり");
				break;
			}else{
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");

	}

}
