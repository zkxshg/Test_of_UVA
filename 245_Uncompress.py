out = ""
dict = {};
inp = input()
k = ""
for i in inp:
    if (i.isalpha()):
        k += i
    elif i.isdigit():
        k += i
    else:
        if k != "":
            if not dict:
                dict[1] = k

            if k.isdigit():
                ii = int(k)
                if(ii=="0"):
                    break
                k = dict[ii]
                out += k
                for key, val in dict.items():
                    if val == k:
                        kk = key
                        x = kk
                        while (x > 1):
                            y = x - 1
                            dict[x] = dict[y]
                            x -= 1
                        dict[1] = k
                        break
                k = ""

            else:
                for key, val in dict.items():
                    if val == k:
                        kk = key
                        x = kk
                        while (x > 1):
                            y = x - 1
                            dict[x] = dict[y]
                            x -= 1
                        dict[1] = k
                        break
                    else:
                        x2 = len(dict) + 1
                        while (x2 > 1):
                            y2 = x2 - 1
                            dict[x2] = dict[y2]
                            x2 -= 1
                        dict[1] = k
                        break
            out += k
        #if(i=="\n"):
            #out += "\n"
        #elif(i==' '):
            #out +=' '
        #elif (i == '    '):
            #out += '    '
        #else:
        out += i
        print(dict)
        k = ""
print(out)
