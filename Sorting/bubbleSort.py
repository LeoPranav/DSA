n=5
arr = [1,5,4,3,2]

#process the list for n-1 times
for i in range(1,n):
    #iterate the adjacent pair of elements
    for j in range(n-i):
        #update
        if arr[j]>arr[j+1]:
            arr[j],arr[j+1]=arr[j+1],arr[j]

print(arr)
