def selectionSort(start,end,arr):

    #base case
    if start==end:
        return
    
    #update the min element
    mini = start
    for i in range(start,end+1):
        if arr[i]<arr[mini]:
            mini =i
    arr[mini],arr[start] = arr[start],arr[mini]

    #recursive call
    selectionSort(start+1,end,arr)





arr = [5,3,6,2,4,1]
n = len(arr)
selectionSort(0,n-1,arr)

print(arr)