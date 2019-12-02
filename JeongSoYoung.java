import java.util.*;
public class JeongSoYoung{
	public static void main(String [] args){
	int a;
	
	Scanner s = new Scanner(System.in);
	System.out.print("숫자를 입력하세요: ");
	a = s.nextInt();
	
	for(int i=1 ; i <=a ; i++)
	{
		for(int j=0 ; j<i-1 ; j++)
			System.out.print(" ");
		for(int k=0 ; k<a-i ; k++)
				System.out.print("+#");
		System.out.println("+");	
		
	}	
	}
}