#!/bin/python3

s = list('abaa')
b = list('abaa')
r = int(input("Enter No. of Rotation : "))
for i in range(1,r+1):
	temp = s[r-1]
	for j in range(1):
		for k in range(4):
			b[k] = s[k+1]
	b[-1] = temp
	print(b)
