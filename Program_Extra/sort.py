no_of_zone = int(input())
no_of_student = int(input())

score = [[0 for x in range(no_of_student)] for y in range(no_of_zone)]
name = [[0 for x in range(no_of_student)] for y in range(no_of_zone)]

for i in range(no_of_zone):
    for j in range(no_of_student):
        name[i][j], marks[i][j] = input().split()
        marks[i][j] = float(marks[i][j])

student_left = [no_of_student for x in range(no_of_zone)]
counter = 0
while(counter <= no_of_zone*no_of_student):
    for i in range(no_of_zone):
        if student_left[i] != 0:
            high_score = marks[i][0]
            zone_no = i
    for i in range(no_of_zone):
        if student_left[i] > 0:
            if high_score < marks[i][0]:
                high_score = marks[i][0]
                zone_no = i

    print(name[zone_no][0],marks[zone_no][0])
    
    student_left[zone_no] -= 1
    for x in range(student_left[zone_no]):
        marks[zone_no][x] = marks[zone_no][x+1]
        name[zone_no][x] = name[zone_no][x+1]
    counter += 1
