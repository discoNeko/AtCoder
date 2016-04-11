## メモ
### 実行速度を改善するテクニック  
入力の読み込み
```Java
//改善前
String[] str = br.readLine().split(" ");
int a = Integer.parseInt(str[0]);
int b = Integer.parseInt(str[1]);
int c = Integer.parseInt(str[2]);
int d = Integer.parseInt(str[3]);
str = br.readLine().split(" ");
int e = Integer.parseInt(str[0]);
int f = Integer.parseInt(str[1]);
```

```Java
//改善後
String[] str = br.readLine().split(" ");
int a = Integer.parseInt(str[0]);
int b = Integer.parseInt(str[1]);
int c = Integer.parseInt(str[2]);
int d = Integer.parseInt(str[3]);
String[] str2 = br.readLine().split(" ");
int e = Integer.parseInt(str2[0]);
int f = Integer.parseInt(str2[1]);
```

入力の読み込み
```Java
//改善前
int n = 1000;
int w = 0;
for(int i = 0; i<n; i++){
	w += Integer.parseInt(br.readLine());
}
```

```Java
//改善後
int n = 1000;
int w = 0;
for(int i = 0; i<n; i++){
	int a = Integer.parseInt(br.readLine());
	w += a;
}
```

