import random
import time


def how_long(func, x):
    start = time.time()
    func(x)
    print(f"На это ушло времени {time.time() - start}")


# Задание 1 (тайминг 10 минут)
# 1.Необходимо написать один из простых алгоритмов сортировки, имеющий сложность O(n2).
def sorting(array: list):
    for i in range(len(array) - 1):
        for j in range(len(array) - 1 - i):
            if array[j] > array[j + 1]:
                array[j], array[j + 1] = array[j + 1], array[j]


# 2.Можно выбрать из пузырьковой сортировки, сортировки вставками и
# сортировки выбором.

def quick_sort(array: list):
    if len(array) <= 1:
        return array
    q = random.choice(array)
    left_array = []
    middle_array = []
    right_array = []
    for el in array:
        if el == q:
            middle_array.append(el)
        elif el < q:
            left_array.append(el)
        else:
            right_array.append(el)
    return quick_sort(left_array) + middle_array + quick_sort(right_array)


# 3.Следует обратить внимание на сложность данных алгоритмов и
# указать признаки квадратичной сложности для каждого из них


new_list = [random.randint(-100, 100) for _ in range(10_000)]
# print(new_list)

list_2 = new_list[::]
start = time.time()
list_2.sort()
print(f"На это ушло времени {time.time() - start}")

start = time.time()
quick_sort(new_list)
print(f"На это ушло времени {time.time() - start}")

how_long(sorting, new_list)
# print(new_list)
