n =int(input())
odd_sum = 0
even_sum =0 
position =1

while n>0:
    digit = n%10
    
    if position % 2==0:
        even_sum += digit
        
    else:
        odd_sum += digit
        
    n = n//10
    position += 1
print(abs(even_sum - odd_sum))