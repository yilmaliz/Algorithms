import  random
def insertion_sort(_list):
    for i in range(1, len(_list)):
        key = _list[i]
        j = i - 1
        while j >= 0 and key < _list[j]:
            _list[j + 1] = _list[j]
            j -= 1
        _list[j + 1] = key
    return _list
unsortedList = []
for i in range(10):
    unsortedList.append(random.randint(0,100))
print(f'The unsorted list: {unsortedList}')
result = insertion_sort(unsortedList)
print(f'The sorted list: {result}')