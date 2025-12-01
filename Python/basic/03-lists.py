
# List is a mutable data type in Python that can store multiple items in a single variable. 
# mutable means that the contents of a list can be changed after its creation.
subject_list = ['History', 'Math', 'Physics', 'CompSci']

# Accessing elements in a list using indexin and slicing
print(subject_list[0])  # Output: History
print(subject_list[2])  # Output: Physics
print(subject_list[-1]) # Output: CompSci
print(subject_list[1:3]) # Output: ['Math', 'Physics']

# built-in list methods
# Adding elements to a list
subject_list.append('Biology') # adds 'Biology' to the end of the list
subject_list.append(['English','Drawing']) # adds ['English','Drawing'] to the end of the list as a single item
subject_list.extend(['Geography', 'Chemistry']) # extends the list by adding multiple items. items will individually added
subject_list.insert(1, 'Art') # inserts 'Art' at index 1

# removing elements from a list
subject_list = ['History', 'Math', 'Physics', 'CompSci']
subject_list.remove('Math') # removes 'Math' from the list
popped_subject = subject_list.pop() # removes and returns the last item in the list
print("Popped Subject:", popped_subject) # Output: Popped Subject: Biology

# Sorting and reversing a list
print(subject_list)
subject_list.sort() # sorts the list in ascending order
subject_list.sort(reverse=True) # sorts the list in descending order
subject_list.reverse() # reverses the order of the list
new_list = sorted(subject_list) # returns a new sorted list without modifying the original list

# Aggregate functions on lists
nums = [3, 1, 4, 1, 5, 9, 2]
min(nums)# returns the smallest number in the list
max(nums) # returns the largest number in the list
sum(nums) # returns the sum of all numbers in the list

# finding value and its index
index_of_physics = subject_list.index('Physics') # returns the index of 'Physics' in the list
print('Chess' in subject_list) # checks if 'Chess' is in the list, returns False
print('Art' in subject_list)   # checks if 'Art' is in the list, returns True

# list to string conversion
subjects_string = ', '.join(subject_list) # joins list elements into a single string separated by ', '
subjects_string.split(', ') # splits the string back into a list using ', ' as the delimiter

# tuples are similar to lists but are immutable (cannot be changed after creation)
subject_tuple = ('History', 'Math', 'Physics', 'CompSci')
print(subject_tuple[0])  # Output: History
print(subject_tuple[1:3]) # Output: ('Math', 'Physics')
# subject_tuple[0] = 'Art' # This will raise a TypeError since tuples are immutable

# set is an unordered collection of unique items
subject_set = {'History', 'Math', 'Physics', 'CompSci'} 
subject_set.add('Biology') # adds 'Biology' to the set
subject_set.add('Math')    # 'Math' is already in the set, so it won't be added again
print(subject_set)

exam_set = {'Geography', 'Chemistry', 'Math'}
# set operations
union_set = subject_set.union(exam_set) # returns a new set with all unique items from both sets
intersection_set = subject_set.intersection(exam_set) # returns a new set with items common
difference_set = subject_set.difference(exam_set) # returns a new set with items in subject_set but not in exam_set
print("Union:", union_set)
print("Intersection:", intersection_set)    
print("Difference:", difference_set)

# frozenset is an immutable version of a set
frozen_subjects = frozenset(subject_set)   
# frozen_subjects.add('Art') # This will raise an AttributeError since frozensets are immutable 


#empty list, tuple, set, frozenset, and dictionary
empty_list = []
empty_tuple = ()
empty_set = set()
empty_frozenset = frozenset()
empty_dictionary = {}

