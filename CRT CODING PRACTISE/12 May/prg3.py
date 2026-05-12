s = input()

count = 0

for i in range(len(s)):

    # Check if substring starts with 'b'
    if s[i] == 'b':

        for j in range(i + 1, len(s) + 1):
            print(s[i:j])
            count += 1

print("Count =", count)