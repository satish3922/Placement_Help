a = [0, 0, 0, 0, 4, 6, 7, 8, 9]

b = [0 for i in range(6)]

# H
if 2 not in a:
    if 1 not in a:
        b[0] = 0
    else :
        b[0] = 1
else:
    b[0] = 2
a.remove(b[0])

# H
count_0 = a.count(0)
count_1 = a.count(1)
count_2 = a.count(2)
count_3 = a.count(3)
if(b[0]==1):
    b[1] = max(a)
elif (b[0]==2):
        if(count_3>0):
            b[1] = 3
        elif(count_2>0):
            b[1] = 2
        elif(count_1>0):
            b[1] = 1
        elif(count_0>0):
            b[1] = 0
else:
    b[1] = 'NaN'
a.remove(b[1])

# M
t = [i for i in a if i <= 5]
b[2] = max(t)
a.remove(b[2])

# M
b[3] = max(a)
a.remove(b[3])

# S
t = [i for i in a if i <= 5]
b[4] = max(t)
a.remove(b[4])

# S
b[5] = max(a)
a.remove(b[5])

for i in range(6):
    b[i] = str(b[i])

print(b[0]+b[1]+":"+b[2]+b[3]+":"+b[4]+b[5])
# print(a)
