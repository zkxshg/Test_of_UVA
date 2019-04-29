import java.util.*;
public class T_299_train_wrapping{
    public static void main(String[] args) {
            int n,m;
            Scanner in=new Scanner(System.in);         
            n = in.nextInt();
            String ns=in.nextLine();
            //one case
            for(int i=0;i<n;i++){
            m = in.nextInt();
            String ms=in.nextLine();     
            String inp = in.nextLine();
            int[] train = new int[51];
            int count=0;
            //count
            for(String p : inp.split(" ")){
            	train[count]=Integer.parseInt(p);
            	count++;
            }
            //System.out.println(count);
            //inver
            int inver = 0;
            for(int k1=1;k1<count;k1++){
            	for(int k2=0;k2<k1;k2++){
            		if(train[k2]>train[k1]) inver++;
            	}
            }
            
            System.out.println("Optimal train swapping takes "+inver+" swaps.");
            }
            in.close();
    }
};
