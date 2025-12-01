nums = [1, 2, 3, 4, 5]

# Using a for loop to iterate through the list. For loop is preferred for its simplicity and readability.
for num in nums:
    print(f"Number: {num}")


# Using a while loop to iterate through the list - less common for this purpose. but useful in certain scenarios. 
# like when the number of iterations is not predetermined.
index = 0
while index < len(nums):
    print(f"Number (while loop): {nums[index]}")
    index += 1

# Using a for loop with range to iterate through indices. it uses indexing to access elements.
# range is built-in function that generates a sequence of numbers. inclusive of start, exclusive of end.
for i in range(len(nums)):
    print(f"Index {i} has value {nums[i]}")


# Using a for loop with enumerate to get index and value
# enumerate is useful when both index and value are needed.
for index, value in enumerate(nums):
    print(f"Index {index} has value {value}")

# Conditional canbe used within loops to filter or modify behavior.
# Using a for loop with a condition
for num in nums:
    if num % 2 == 0:
        print(f"Even Number: {num}")
    else:
        print(f"Odd Number: {num}")

# Using a nested loop
for i in range(1, 4):
    for j in range(1, 4):
        print(f"i: {i}, j: {j}")

# Using a break statement to exit a loop early
# This ends the loop when condition is met.
for num in nums:
    if num == 3:
        print("Breaking the loop at number 3")
        break
    print(f"Number before break: {num}")


# Using a continue statement to skip an iteration
# This skips the current iteration when condition is met.
for num in nums:
    if num == 3:
        print("Skipping number 3")
        continue
    print(f"Number after continue: {num}")

# Using a list comprehension to create a new list with squared values
squared_nums = [num ** 2 for num in nums]

# issues with loops
# Infinite loops can occur with while loops if the condition never becomes false.
# edge conditions:
# out-of-range errors can occur when accessing list indices that do not exist.
# off-by-one errors can happen when the loop iterates one time too many or too few

out_of_range_list = [10, 20, 30]
for i in range(len(out_of_range_list) + 1):  
    print(out_of_range_list[i])  # IndexError when i == 3

off_by_one_list = [100, 200, 300]
for i in range(len(off_by_one_list) - 1):  
    print(off_by_one_list[i])  # Misses the last element (300) might be an issue in runtime if not handled properly.

infinite_loop_counter = 0
while infinite_loop_counter < 5:
    print(f"Counter: {infinite_loop_counter}")
    # Missing increment leads to infinite loop
    # infinite_loop_counter += 1
# This code demonstrates various loop constructs in Python, including for loops, while loops,
# and the use of break and continue statements. It also highlights common issues that can arise with loops.

