
def partition(start,end,arr):
    p1,p2=start,start
    while p2<end:
        if arr[p2]<arr[end]:
            arr[p1],arr[p2] = arr[p2],arr[p1]
            p1+=1
        p2+=1
    arr[p1],arr[end] = arr[end],arr[p1]
    return p1

def quickSort(start,end,arr):
    #base case
    if start>=end:
        return
    
    pivot = partition(start,end,arr)
    quickSort(start,pivot-1,arr)
    quickSort(pivot+1,end,arr)


arr = [1,6,4,5,3,2]
n = len(arr)
quickSort(0,n-1,arr)

print(arr)

