import java.util.Scanner;

public class uzd04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int kiek = 0;
		int liko = 0;
		int sum = 0;
		int i = 0;

		System.out.println("Įveskite uždavinių skaičių:");
		int sk = reader.nextInt();
		while (kiek < sk) {
			i++;
			sum = sum + i;
			liko = sk - sum;
			kiek++;
			if (liko <= 0)
				break;
		}
		{
			System.out.println("Lukas visus uždavinius išspręs per " + kiek + " dienas (/ų). ");

		}
		reader.close();
	}
}



//int dienos 1
//int isprende 0
//while true
//ispende + = dienos;