package javaInterviewQuestUSA;

public class BinToDecimal {

	public BinToDecimal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int bn=110;
		int deci=0, r, n;
		int pow=0;
		while(bn>0)
		{
			r=bn%10;
			deci+=r*Math.pow(2, pow);
			bn=bn/10;
			pow++;
		}
System.out.println(deci);
	}

}
