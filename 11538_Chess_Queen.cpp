#include<iostream>
#include<cstdio>
#include<cmath>
#include<cstring>
#include<queue>
using namespace std;
int main()
{
    long long n,m;
    while(cin>>n>>m && n && m)
    {
        if(n>m)  swap(n,m);
        cout<<n*m*(m+n-2)+2*n*(n-1)*(3*m-n-1)/3<<endl;
    }
    return 0;
}
