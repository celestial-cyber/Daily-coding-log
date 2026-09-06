#rotate array right by k steps (in place)
#[1 2 3 4 5 6 7] -> k = 3 -> [5 6 7 1 2 3 4]
def rotate(array, k):
    n= len(array)
    def rev(i,j):
        while i < j:
            array[i],array[j]=array[j],array[i]
            i+=1; j-=1
    rev(0,n-1)
    rev(0,k-1)
    rev(k,n-1)

arr=[1,2,3,4,5,6,7,8]
rotate(arr,3)
print(arr)