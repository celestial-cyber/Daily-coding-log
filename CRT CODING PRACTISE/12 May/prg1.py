s = input()

count = 0

for i in range(len(s)):
    for j in range(i + 1, len(s) + 1):
        print(s[i:j])
        count += 1

print("Total Substrings =", count)