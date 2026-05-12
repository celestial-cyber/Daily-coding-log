s = input()

count = 0

for i in range(len(s)):

    if s[i] == 'b':

        for j in range(i + 1, len(s) + 1):

            sub = s[i:j]

            if sub[-1] == '3':
                print(sub)
                count += 1

print("Count =", count)