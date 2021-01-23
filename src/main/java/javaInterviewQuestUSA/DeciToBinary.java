package javaInterviewQuestUSA;

public class DeciToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int binary[] = new int[40];
        int index = 0;
        int num=7;
while(num > 0){
          binary[index++] = num%2;
          num = num/2;
}

for(int i = index-1;i >= 0;i--){
          System.out.print(binary[i]);
}
	}

}
