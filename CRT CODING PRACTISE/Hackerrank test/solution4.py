size = int(input())
array = list(map(int,input().split()))
k = int(input())
count  = 0
for i in range ( size):
    sum = 0
    for j in range(i,size):
        sum += array[j]
        if(sum > k):
            count = count + 1
            
print(count)