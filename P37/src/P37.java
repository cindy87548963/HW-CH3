import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P37 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入英文字母");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String stru = str.toUpperCase();
		String stri = str.toLowerCase();
		System.out.println("轉換成大寫實為"+stru);
		System.out.println("轉換成小寫實為"+stri);
	}
}
