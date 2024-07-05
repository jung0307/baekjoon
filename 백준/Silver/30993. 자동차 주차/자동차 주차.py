s = input().split(" ");
ansA = 1;
ansB = 1;

N = (int)(s[0]);
A = (int)(s[1]);
B = (int)(s[2]);
C = (int)(s[3]);

for i in range(1 , N + 1) :
    ansA = ansA * i;
for i in range(1 , A + 1) :
    ansB = ansB * i;
for i in range(1 , B + 1) :
    ansB = ansB * i;
for i in range(1 , C + 1) :
    ansB = ansB * i;

print("%d" % (ansA / ansB));