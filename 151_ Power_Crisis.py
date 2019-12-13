flag=1
while(flag):
    N = int(input())
    if(N==0):
        break
    else:
        for m in range(1,N+1):
            k = 0
            for j in range(2,N):
                k = (k+m)%j
            if(k==11):
                print(m)
                break
