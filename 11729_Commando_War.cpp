#include <iostream>
 #include <cstdio>
 #include <algorithm>
 using namespace std;
 int n;
 typedef struct man
 {
     int give;
     int work;
 };
 bool cmp(man t1,man t2)
 {
     return t1.work>t2.work;
 }
 struct man s[10005];
 int main ()
 {
     int kase=1;
     while(scanf("%d",&n)!=EOF&&n)
     {
 
         for(int i=0;i<n;i++)
         {
             scanf("%d%d",&s[i].give,&s[i].work);
         }
         int  sum=0;
         sort(s,s+n,cmp);
         sum=(s[0].give+s[0].work);
         int give=s[0].give;
         for(int i=1;i<n;i++)
         {
             give=s[i].give+give;
             sum=max(sum,give+s[i].work);
         }
         printf("Case %d: %d\n",kase++,sum);
     }
     return 0;
 }
