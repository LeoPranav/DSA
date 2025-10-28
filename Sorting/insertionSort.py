arr = [12,11,13,5,10,4,1,2,6]
n = len(arr)

#iterate from 2nd element to last element
for i in range(1,n):

    #store the copy of current element
    tmp = arr[i]
    idx = i

    #find the correct position to insert
    while idx!=0 and arr[idx-1]>tmp:
        arr[idx] = arr[idx-1]
        idx-=1
    #insert the current element
    arr[idx] = tmp

print(arr) 