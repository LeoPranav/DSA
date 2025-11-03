def bubbleSort(start,end,arr):
    # base case : single element is sorted
    if start==end:
        return
    
    #push the max element to last
    for i in range(start,end):
        if arr[i]>arr[i+1]:
            arr[i],arr[i+1]=arr[i+1],arr[i]
    
    #recursive call
    bubbleSort(start,end-1,arr)


arr = [4,5,3,2,1,6]
n = len(arr)
bubbleSort(0,n-1,arr)

print(arr)