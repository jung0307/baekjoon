n = (int)(input())

s1 = input().split(" ")
s2 = input().split(" ")

a = 0

for i in range(0 , n) :
    if((int)(s1[i]) > (int)(s2[i])) :
        a = a + (int)(s1[i]) - (int)(s2[i])

print(a)
