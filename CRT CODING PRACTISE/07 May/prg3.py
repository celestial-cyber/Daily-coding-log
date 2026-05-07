n = int(input())
array = list(map(int, input().split()))

i = 0
# increasing part
while i < n-1 and array[i] <array[i+1]:
    i+=1
  
# no increasing or only increasing
if i==0 or i==n-1:
    print("NO")
    
else:
    # decreasing part
    while i<n-1 and array[i]>array[i+1]:
        i+=1
        
    if i == n-1:
        print("YES")
    else:
        print("NO")