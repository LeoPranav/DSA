arr = [1,6,3,2,4]
n = len(arr)

for i in range(n):
    mi = i
    for j in range(i+1,n):
        if arr[j]<arr[mi]:
            mi=j
    arr[mi],arr[i] = arr[i],arr[mi]

print(arr)