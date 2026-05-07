array = list(map(int, input().split()))

total = sum(array)
average = total // 7

count = 0

for num in array:
    if num > average:
        count += 1

print(total, average, count)