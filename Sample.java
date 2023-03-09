package samplecCodes;
import java.util.*;

public class Sample {

    public static void main(String[] args) {
        
        int[] ballPrices = {1, 5, 6, 9, 12};
        String[]ballnames = {"Baseball","Soccer","VolleyBall","FootBall","BasketBall"};
        int n = ballPrices.length;
        Scanner c=new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT:");
        int amount =c.nextInt();
        int[] ballCounts = new int[n];
        int balance=0,flag=0;
         
        while (amount > 0&&flag==0) {
        	for(int i=0;i<n;i++) {
	            if (amount >= ballPrices[i]) {
	                ballCounts[i]++;
	                amount -= ballPrices[i];
	            }else if(amount<ballPrices[i]){
	            	balance=amount;
	            	flag=1;
	            }
        	}
        }
        for(int j = 0; j < n; j++) {
        	if(ballCounts[j]!=0)
        		System.out.println(ballnames[j] +"  "+ ballCounts[j]+" * "+ ballPrices[j]+" = "+ballCounts[j]*ballPrices[j]);
        	else
        		continue;
        }
        System.out.println();
        System.out.println("Balance: "+balance);
    }

}












