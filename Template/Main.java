import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
 
//グリッド問題用のテンプレート
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BitSet b = new BitSet(n);
		for(int i = 0; i<n; i++){
			String[] str = br.readLine().split(" ");
			int s = Integer.parseInt(str[0]);
			int r = Integer.parseInt(str[1]);
			//s番目をtrueにセット
			b.set(s);
			//s番目を反転
			b.flip(s);
			//sからr番目までを反転
			b.flip(s,r+1);
		}
		for(int i=bits.nextSetBit(0); i>=0; i=bits.nextSetBit(i+1)){
			//trueのbitのみを辿るループ処理
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<n; i++){
			if(b.get(i)){
				sb.append(1);
			}else{
				sb.append(0);
			}
		}
		System.out.println(sb);
	}
}