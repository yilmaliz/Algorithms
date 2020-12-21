import  random
def quick_sort(_list,low,high):
    if(high>low):
        keyDigit = low
        key = _list[keyDigit]
        first = keyDigit + 1
        last = high
        otherKey = last
        okl = True
        for i in range(low,high ):
            if (okl == True):
                if (key > _list[otherKey]):
                    _list[keyDigit], _list[otherKey] = _list[otherKey], _list[keyDigit]
                    last -= 1
                    keyDigit = otherKey
                    otherKey = first
                    okl = False
                else:
                    last -= 1
                    otherKey = last
            else:
                if (key < _list[otherKey]):
                    _list[keyDigit], _list[otherKey] = _list[otherKey], _list[keyDigit]
                    first += 1
                    keyDigit = otherKey
                    otherKey = last
                    okl = True
                else:
                    first += 1
                    otherKey = first
        quick_sort(_list,low,keyDigit-1)
        quick_sort(_list,keyDigit+1,high)
unsortedList = []
for i in range(10):
    unsortedList.append(random.randint(0,100))
print(f'The unsorted list: {unsortedList}')
quick_sort(unsortedList,0,len(unsortedList)-1)
print(f'The sorted list: {unsortedList}')