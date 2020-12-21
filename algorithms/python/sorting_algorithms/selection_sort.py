import  random
def selection_sort(_list):
    for i in range(len(_list)):
        minIndex = i
        for j in range(i+1, len(_list)):
            if (_list[minIndex] > _list[j]):
                minIndex = j
        _list[minIndex],_list[i]=_list[i],_list[minIndex]
    return _list

unsortedList = []
for i in range(10):
    unsortedList.append(random.randint(0,100))
print(f'The unsorted list: {unsortedList}')
result = selection_sort(unsortedList)
print(f'The sorted list: {result}')