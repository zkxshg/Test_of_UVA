m =int(input())
for i in range(1,m+1):
    c={};
    space = input()
    n = int(input())
    a0 = float(input())
    an1 = float(input())
    for j in range(1,n+1):
        c[j] = float(input())
    sum = tmp =0
    for k in range(1,n+1):
        sum = sum + tmp + c[k]
        tmp += c[k]
    a1 = (an1+n*a0-2*sum)/(n+1)
    print("%.2f"%a1)
    if(i<m):
        print("")
