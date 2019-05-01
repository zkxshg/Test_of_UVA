import java.util.*;
public class T_10591{
    public static void main(String[] args){      
            int n,s,sum;
            Scanner in=new Scanner(System.in);
            n=in.nextInt();
            for(int i=1;i<n+1;i++){
            int a=in.nextInt();
            boolean flag=true;
            int b=a;
            
            String bs ="";
            bs=b+"";
            sum=0;
            for(int j=0;j<bs.length();j++){
            char ch=bs.charAt(j);
           	s=(int)ch-(int)'0';
            sum+=s*s;}
            b=sum;
            
            int[] bef =new int[1000];
            bef[0]=a;
            int count =1; 
            while(flag){
            //System.out.println(b);
            	if(b==1){
            		flag=false;
            		System.out.println("Case #"+i+": "+a+" is a Happy number.");
            	}
            	else{
            	for(int k=0;k<count;k++){
            		if(b==bef[k]){
            		//System.out.println(b);
            		flag=false;
            		System.out.println("Case #"+i+": "+a+" is an Unhappy number.");
            		}
            	}
            	bs ="";
            	bs=b+"";
            	sum=0;
            	for(int j=0;j<bs.length();j++){
            	char ch=bs.charAt(j);
            	s=(int)ch-(int)'0';
            	//System.out.println(s);
            	sum+=s*s;
            	}
            	b=sum;
            	count++;
            	bef[count]=b;
            	}
            
            }
            }
            in.close();     
    }
};
