
#This is The Coding Area
N = int(input())
seq = input().split(',')

seq = [int(i) for i in seq]

base = []
for i in seq:
  ans = ""
  while(i>0):
    ans = str(int(i)%6) + ans
    i //= 6
base.append(int(ans))
sum = []
for i in b:
  d = 0
  while(i>0):
    d = d + i%10
    i //= 10
  sum.append(d)

c = 0
for i in range(0,N-1):
	for j in range(1+i,N):
		if sum[i]>sum[j]:
			c = c + 1
print(c)
