# Create a List N
first_line = input()
n = first_line[0]
P = first_line[1]
second_line = input()

combinations = []
for i in range(0,n-2):
  for j in range(i+1,4):
    for k in range(j+1,n):
		combinations.append([ second_line[i], second_line[j], second_line[k] ])

count = 0
for i in combinations:
  if sum(i)%P==0:
    count += 1
print(count)

