arr = [10,2,8,5,1,4]
n = len(arr)

#iterate every index
for i in range(n):
    #assume current index as minimum
    mini =i
    for j in range(i,n):
        if arr[j]<arr[mini]:
            mini=j
    #Swap current element and minimum element
    arr[mini],arr[i] = arr[i],arr[mini]

print(arr)
