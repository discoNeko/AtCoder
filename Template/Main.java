import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		//入力読み込み
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//一行一単語をint型として切り出す
		int n = Integer.parseInt(br.readLine());

		//一行複数単語をString型として切り出す
		//それぞれint型、long型として変数に代入
		String[] str = br.readLine().split(" ");
		int l = Integer.parseInt(str[0]);
		int r = Integer.parseInt(str[1]);
		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		long c = Long.parseLong(str[2]);

		//一行一単語をString型として切り出す
		//char型で一文字ずつ判定する
		String a = br.readLine();
		int l = a.length();
		for(int i = 0; i < l; i++){
			char c = a.charAt(i);
		}

		//数え上げ問題
		final long mod = 1000000007;

		//昇順にソートする
		//r[0]=0
		//r[1]=1
		//r[2]=2,...
		int[] r = new int [n];
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

		//map.put(key, value);
		//keyで自動的にソートされる
		//
		//System.out.println(o + " = " + map.get(o));
		//「 key = value 」が出力される
		TreeMap<String,String> map = new TreeMap<String,String>();
		map.put("Name", "Tanaka");
		map.put("Age", "25");
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o + " = " + map.get(o));
		}
		//逆順
		Map<Integer,Integer> dmap = map.descendingMap();
		Iterator it = dmap.keySet().iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o + " = " + dmap.get(o));
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
