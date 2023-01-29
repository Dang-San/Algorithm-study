num = int(input()) 
arrayList = list(map(int, input().split(' '))) 

result = 0 

for n in arrayList:
    count = 0 
    if(n == 1): 
        continue
    for i in range(2, n+1):
        if(n % i == 0):
            count += 1
    if(count == 1):
        result += 1
        
print(result)
