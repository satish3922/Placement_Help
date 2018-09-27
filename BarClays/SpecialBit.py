n,q = [int(x) for x in input().split()]
arr = [bin(int(x))[2:] for x in input().split()]
query = [[int(x) for x in input().split()] for i in range(q)]

for i in query:
	c=0
	for j in range(i[0]-1,i[-1]):
		if '11' in arr[j]:
			c += 1
	print(c)

