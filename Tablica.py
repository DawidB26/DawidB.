n = int(input("podaj n (większe od zera) "))
c = 0

if n == 1 or n == 2:
    c = 1
else:
    a , b = 1 , 1
    for i in range ( 3 , n + 1):
        temp = a + b
        a , b = b , temp
    c = b
    
print(c)