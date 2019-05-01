import java.util.*;
public class T_11233delideli{
    public static void main(String[] args) {
    	//delideli
            int a,b;
            Scanner in=new Scanner(System.in);
            a=in.nextInt();
            b=in.nextInt();
            String nu=in.nextLine();
            String[] irr1=new String[a+2];
            String[] irr2=new String[a+2];
             
            for(int i=0;i<a;i++){
            String[] tem=in.nextLine().split(" ");
            irr1[i]=tem[0];
            //System.out.println(tem[0]);
            irr2[i]=tem[1];
           	//System.out.println(tem[1]);
            }
            
            for(int j=0;j<b;j++){
            boolean countirr=false;
            String temp=in.nextLine();

            for(int i=0;i<a;i++){
            	if(0==temp.compareTo(irr1[i])) {
            	System.out.println(irr2[i]);
            	countirr=true;
            	break;
            	}
            }
            if(countirr) continue;

            if(temp.endsWith("y")){
            	char two = temp.charAt(temp.length()-2);
            	if((two=='a')||(two=='e')||(two=='i')||(two=='o')||(two=='u')) System.out.println(temp+"s");
            	else System.out.println(temp.substring(0,temp.length()-1)+"ies");
            }
            else if(temp.endsWith("o")||temp.endsWith("s")||temp.endsWith("ch")||temp.endsWith("sh")||temp.endsWith("x"))
            	System.out.println(temp+"es");            
            else System.out.println(temp+"s");
            }
            in.close();
    }
};
