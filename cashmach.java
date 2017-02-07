public class cashmach{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int k = 0,k1=0,k2=0,k3=0,k4=0,k5=0,k6=0;
		
		if(n%10!=0){
			System.out.println("-1");
		}
		else{
			while(n!=0){
				k1 = n/500;
				n = n%500;
				k2 = n/200;
				n = n%200;
				k3 = n/100;
				n = n%100;
				k4 = n/50;
				n = n%50;
				k5 = n/20;
				n = n%20;
				k6 = n/10;
				n = n%10;
				k = k1+k2+k3+k4+k5+k6;
			}
			
			System.out.println(k);
		}
	}
}		
	

