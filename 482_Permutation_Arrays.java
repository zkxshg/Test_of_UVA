import java.util.*;
public class T_482{
    public static void main(String[] args) {
            String a,b;
            int n,i;
            Scanner in=new Scanner(System.in);
            String n1=in.nextLine();
            n=Integer.parseInt(n1);
            for(i=0;i<n;i++){
            	String nu=in.nextLine();
            	a=in.nextLine();
            	b=in.nextLine();
            	int[] an=new int[20];
            	float[] bn=new float[20];
            	boolean[] cn=new boolean[20];
            	int j=0;
            	for(String ai : a.split(" ")){
            		an[j]=Integer.parseInt(ai);          		
            		j++;
            	}

            	int k=0;
            	for(String bi : b.split(" ")){
            		bn[k]=Float.parseFloat(bi);
            		if(bi.matches("-?[0-9]*")) cn[k]=true;
            		else cn[k]=false;
            		k++;
            	}
            	int l;
            	int l2;
            	for(l=1;l<k+1;l++){
            		for(l2=0;l2<k;l2++){
            			if(an[l2]==l){
            				if(cn[l2]) System.out.println((int)bn[l2]);
            				else System.out.println(bn[l2]);
            			}
            		}
            	}
            	if(i!=n-1) System.out.println();
            }
            in.close();
    }
};
