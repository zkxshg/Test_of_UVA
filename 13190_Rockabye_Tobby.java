import java.util.*;
public class T_10142{
    public static void main(String[] args) {
            int n,m,countv,countc;
            Scanner in=new Scanner(System.in);
            n=in.nextInt();
            
            //one case        
            for(int i=0;i<n;i++){
            String nu=in.nextLine();
            String[] cand = new String[20];   
            int[][] votes = new int[1000][20];
            //list of candi
            m=in.nextInt();
            for(int j=0;j<m;j++) cand[j]=in.nextLine();
            String o2 = in.nextLine();
            System.out.println("================="+o2);
            //list of voters
            countv=0;
            countc=0;
            while(in.hasNextInt()){
            String o = in.nextLine();
            for(String p : o.split(" ")){
            	votes[countv][countc]=Integer.parseInt(p);            	
            	countc++;
            }
            countv++;
            }
            
            //ji piao
            int[] vnum = new int[m];
            for(int j=0;j<m;j++){
            	vnum[j]=0;//huo de piao shu
            	for(int k=0;k<countv;k++){
            	if(votes[k][0]==j+1) vnum[j]++;
            	}
            	
            }
            
            boolean flag=true;
            while(flag){
            //find max vote
            int max =0;
            int min =10000;
            int maxnum=0;
            int whomax=-1;
            for(int j=0;j<m;j++){
            if(vnum[j]!=-1){
            	if(vnum[j]>max){
            		max=vnum[j];
            		maxnum=1;
            		whomax=j;
            	} 
            	else if(vnum[j]==max) maxnum++;
            	if(vnum[j]<min)	min=vnum[j];
            }}
            //someone win
            if(maxnum==1){
            System.out.println(cand[whomax]);
            flag = false;
            } 
            //left tied
            else if(max==min){
            	flag = false;
            	
            	for(int w=0;w<m;w++){
            	if(vnum[w]!=-1) System.out.println(cand[w]);
            	}
            }
            //tied
            else{
            for(int j=0;j<m;j++){
            	if(vnum[j]==min){
            	for(int k=0;k<countv;k++){
            		if(votes[k][0]==j+1) {//shan chu bai xuan tou piao
            		for(int j2=0;j2<m-1;j2++){
            			votes[k][j2]=votes[k][j2+1];
            			}
            		}
            	}
            	vnum[j]=-1;//luo xuan
            	}
            }
            }
            for(int j=0;j<m;j++){
            if(vnum[j]!=-1){
            	vnum[j]=0;//huo de piao shu
            	for(int k=0;k<countv;k++){
            	if(votes[k][0]==j+1) vnum[j]++;
            	}
            }}
            }            
            }//case end
            in.close();
    }
};
