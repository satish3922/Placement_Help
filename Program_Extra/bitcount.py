n = input()
x = input()

b = []
for i in range(n):
	b.append((bin(x[i])[2:]).count('1'))

count = 0
for i in range(len(b)):
	for j in range(i+1,len(b)):
		if b[i]>b[j]:
			count+=1

print(count)
