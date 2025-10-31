def mergeSort(start,end,arr):

    #base case
    if start==end:
        return
    
    mid = (start+end)//2

    # sorting the left half
    mergeSort(start,mid,arr)
    #sorting the right half
    mergeSort(mid+1,end,arr)

    #merge
    tmp1 = arr[start:(mid+1)]
    tmp2 = arr[(mid+1):(end+1)]

    l1,l2,ptr1,ptr2,ptr3 = len(tmp1),len(tmp2),0,0,start

    while ptr1<l1 and ptr2<l2:

        if tmp1[ptr1]<tmp2[ptr2]:
            arr[ptr3] = tmp1[ptr1]
            ptr3+=1
            ptr1+=1
        else:
            arr[ptr3] = tmp2[ptr2]
            ptr3+=1
            ptr2+=1
    
    while ptr1<l1:
        arr[ptr3] = tmp1[ptr1]
        ptr3+=1
        ptr1+=1
    
    while ptr2<l2:
        arr[ptr3] = tmp2[ptr2]
        ptr3+=1
        ptr2+=1





arr = [6,3,1,4,7,5]
n = len(arr)
mergeSort(0,n-1,arr)

print(arr)
