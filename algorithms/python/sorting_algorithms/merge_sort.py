import  random
def merge_sort(_list):
    if len(_list) > 1:

        x = len(_list) // 2
        left_list = _list[:x]
        right_list = _list[x:]
        merge_sort(left_list)
        merge_sort(right_list)

        indexLeft=0
        indexRight=0
        indexMain = 0

        while indexLeft < len(left_list) and indexRight < len(right_list):
            if left_list[indexLeft] < right_list[indexRight]:
                _list[indexMain] = left_list[indexLeft]
                indexLeft += 1
            else:
                _list[indexMain] = right_list[indexRight]
                indexRight += 1
            indexMain += 1

        while indexLeft < len(left_list):
            _list[indexMain] = left_list[indexLeft]
            indexLeft += 1
            indexMain += 1

        while indexRight < len(right_list):
            _list[indexMain] = right_list[indexRight]
            indexRight += 1
            indexMain += 1

unsortedList = []
for i in range(10):
    unsortedList.append(random.randint(0,100))
print(f'The unsorted list: {unsortedList}')
merge_sort(unsortedList)
print(f'The sorted list: {unsortedList}')