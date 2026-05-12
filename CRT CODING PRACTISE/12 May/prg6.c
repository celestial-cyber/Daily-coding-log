//#include <stdio.h>

long long sum(long long n) {
    return n * (n + 1) / 2;
}

int main() {
    long long L, R, K;

    scanf("%lld %lld %lld", &L, &R, &K);

    // Total sum
    long long totalSum = sum(R) - sum(L - 1);

    // Multiples of K
    long long start = (L + K - 1) / K;
    long long end = R / K;

    long long count = end - start + 1;
    long long multipleSum = 0;

    if (count > 0) {
        multipleSum = K * (count * (start + end)) / 2;
    }

    printf("%lld\n", totalSum - multipleSum);

    return 0;
}