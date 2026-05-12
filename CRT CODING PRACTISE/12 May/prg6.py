def sum_n(n):
    return n * (n + 1) // 2

L, R, K = map(int, input().split())

# Total sum
total_sum = sum_n(R) - sum_n(L - 1)

# Multiples of K
start = (L + K - 1) // K
end = R // K

count = end - start + 1
multiple_sum = 0

if count > 0:
    multiple_sum = K * (count * (start + end)) // 2

print(total_sum - multiple_sum)