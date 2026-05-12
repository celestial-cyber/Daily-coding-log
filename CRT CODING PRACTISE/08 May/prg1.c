
int main() {

    int n;
   // scanf("%d", &n);

    int arr[7];//n

    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int k;
    scanf("%d", &k);

    int maxLen = 0;

    for(int i = 0; i < n; i++) {

        int sum = 0;

        for(int j = i; j < n; j++) {

            sum += arr[j];

            if(sum == k) {

                int length = j - i + 1;

                if(length > maxLen) {
                    maxLen = length;
                }
            }
        }
    }

    printf("%d", maxLen);

    return 0;
}