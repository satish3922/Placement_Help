




# Modified Fibonacci
# Value of 10^9 + 7 mod

def shift(list1,k):
	for i in range(k):
		list1[i] = list1[i+1]

m = 10**9 + 7 	# Calculate modulas value
testCase = int(input()) 	# No of testCase 
for t in range(testCase):

	n,k = [int(x) for x in input().split()]
	list1 = [1 for x in range(k+1)]  # taking k+1 size of list 
	arr = [int(x) for x in input().split()]  # putting all the input data in list
	
	for i in range(k):	
		list1[i] = arr[i]

	for i in range(k,n): 
		product = 1
		for j in range(k):
			product *= list1[j]
		list1[k] = product%m
		shift(list1,k)
print(list1)
print(list1[k])
