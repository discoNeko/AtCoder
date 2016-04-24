import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.BitSet;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int l = Integer.parseInt(str[0]);
		int r = Integer.parseInt(str[1]);
		String a = br.readLine();
		int l = a.length();
		for(int i = 0; i < l; i++){
			char c = a.charAt(i);
		}

		int[] r = new int [n];
		//r[0]=0,r[1]=1,r[2]=2,...にソートする
		Arrays.sort(r);

		//l番目からr番目までの文字列切り出し
		sb.substring(l,r+1);
		//文字列反転
		temp.reverse();
		//l番目からr番目までを置換する
		sb.replace(l,r+1,temp.toString());
		//文字列を初期化する
		temp.setLength(0);

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(a);
		//上から1番目を取得
		int t = set.last();
		//上から２番目を取得
		int c = set.lower(set.last());

		BitSet b = new BitSet(n);
		for(int i = 0; i<n; i++){
			b.set(s);
			b.flip(s);
			b.flip(s,r+1);
		}
		for(int i=bits.nextSetBit(0); i>=0; i=bits.nextSetBit(i+1)){
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
