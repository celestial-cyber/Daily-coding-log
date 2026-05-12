n = int(input())

arr = list(map(int, input().split()))

T = int(input())

min_diff = float('inf')

for i in range(n):

    total = 0

    for j in range(i, n):

        total += arr[j]

        diff = abs(T - total)

        min_diff = min(min_diff, diff)

print(min_diff)