s = input()

if len(s) == 0:
    print("String is Empty")
else:
    count = 0

    for i in range(len(s)):
        for j in range(i + 3, len(s) + 1):
            print(s[i:j])
            count += 1

    if count == 0:
        print("No substring length > 2")

    print("Count =", count)