A = input()
B = input()
S = input()

subString_S = []
counter = 0
for i in range(len(S)):
	for j in range(i+1,len(S)+1):
		if A in S[i:j] and B in S[i:j] and len(S[i:j]) >= max(len(A),len(B)):
			counter += 1
print(counter)
