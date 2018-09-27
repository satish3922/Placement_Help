A = raw_input()
B = raw_input()
C = raw_input()

vowels = ['a','A','e','E','i','I','o','O','u','U']
Result = ''

for i in range(len(A)):
	if A[i] in vowels:
		Result = Result + '$'
	else:
		Result = Result + A[i]
for i in range(len(B)):
	if A[i] not in vowels:
		Result = Result + '#'
	else:
		Result = Result + A[i]
Result = Result + C.upper()
print Result
