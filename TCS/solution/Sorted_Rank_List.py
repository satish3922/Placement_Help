
first_line = int(input())
second_line = int(input())
marks = [[0 for x in range(second_line)] for y in range(first_line)]
name = [[0 for x in range(second_line)] for y in range(first_line)]

for i in range(first_line):
    for j in range(second_line):
        name[i][j], marks[i][j] = input().split()
        marks[i][j] = float(marks[i][j])

list1 = [second_line for x in range(first_line)]
counter = 0
while(True):
    if counter >= first_line*second_line:
        break
    for i in range(first_line):
        if list1[i] != 0:
            high_score = marks[i][0]
            index = i
            break
    for i in range(first_line):
        if list1[i] > 0:
            if high_score < marks[i][0]:
                high_score = marks[i][0]
                index = i

    print(name[index][0],marks[index][0])
    list1[index] -= 1
    for x in range(list1[index]):
        marks[index][x] = marks[index][x+1]
        name[index][x] = name[index][x+1]
    counter = counter + 1
