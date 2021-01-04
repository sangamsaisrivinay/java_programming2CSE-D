import java.util.Random;
public class Experiment7_Rollingdice{
	public static void main(String args[]){
		int c=0,d1,d2;
		Random r=new Random();
		for(int i=0;i<10000;i++){
			d1=r.nextInt(6)+1;
			d2=r.nextInt(6)+1;
			if(d1==d2){
				c+=1;
			}
		}
		System.out.println(c);
	}
}
