
def force(n1, n2, l1, l2):
    f = 10*n1*n2/((l2 - l1)**2)
    return f

def acc(f, n):
    a = f/n
    return a

def vel(v, a, t):
    v = v + a * t
    return v

def distance(v, a, t):
    s = (v * t) + ((a / 2) * (t ** 2))
    return s

def dist(l1, l2):
    d = l2 - l1
    return d

n1, n2 = input("Enter 2 natural numbers separated by space: ").split()

n1 = int(n1)
n2 = int(n2)
v1 = 0
v2 = 0
l1 = n1
l2 = n2
t = 0

while dist(l1, l2) > 0:
    f = force(n1, n2, l1, l2)
    a1 = acc(f, n1)
    a2 = acc(f, n2)
    v1 = vel(v1, a1, t)
    v2 = vel(v2, a2, t)
    s1 = round(distance(v1, a1, t))
    s2 = round(distance(v2, a2, t))
    l1 = l1 + s1
    l2 = l2 - s2
    #print(f + " " + a1 + " " + a2 + " " + v1 + " " + v2 + " " + s1 + " " + s2 + " " + l1 + " " + l2)

print("the meeting point is:" ,l1)


