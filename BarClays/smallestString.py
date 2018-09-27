s = input()

a = 0
for i in s:
	c = s.count(i)
	if c > a:
		x = i
		a = s.count(i)
newString = ''
for i in s:
	if i not in x:
		newString = newString+i

print(newString)
