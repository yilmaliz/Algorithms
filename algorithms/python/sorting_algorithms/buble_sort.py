import  random
def buble_sort(_list):
    for i in range(len(_list)):
        for j in range(len(_list)-i-1):
            if(_list[j] > _list[j+1]):
                _list[j],_list[j+1] = _list[j+1],_list[j]
    return _list
unsortedList = []
for i in range(10):
    unsortedList.append(random.randint(0,100))
print(f'The unsorted list: {unsortedList}')
result = buble_sort(unsortedList)
print(f'The sorted list: {result}')