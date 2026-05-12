n = int(input())

arr = list(map(int, input().split()))

k = int(input())

max_len = 0

for i in range(n):

    total = 0

    for j in range(i, n):

        total += arr[j]

        if total == k:
            max_len = max(max_len, j - i + 1)

print(max_len)