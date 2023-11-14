li=list(map(int, input("Enter a list of nos.: ").split()))
l=len(li)
while True:
    s=""
    for i in range(l):
        if li[i]!=0:
            s+="*"
            li[i]-=1
        else:
            s+="-"
    if s!="-"*l:
        print(s)
    else:
        break