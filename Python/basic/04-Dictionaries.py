# Dictionary in Python is a mutable data type that stores key-value pairs.
# Each key is unique and is used to access its corresponding value.

# Creating a dictionary
student = {'Name': 'Alice', 'Age': 20, 'phone': ['123-456-7890', '987-654-3210'], 'Course': 'Computer Science'}
print(student)
print(student['Name'])  # Accessing value using key 'Name'
print(student['phone'][0])  # Accessing the first phone number
print(student.get('Hobbies','Not found'))  # Accessing value using get() method, avoids KeyError if key not found

# Adding or updating key-value pairs
student['Age'] = 21  # Updating existing key 'Age'
student['Address'] = '13 Baker St'  # Adding new key 'Address'
print(student)
student.update({'Course': 'Data Science', 'Hobbies': ['Reading', 'Traveling'], 'Age': 25})  # Updating multiple key-value pairs

# Removing key-value pairs
del student['phone']  # Removing key 'phone' using del
removed_course = student.pop('Course')  # Removing key 'Course' using pop() and storing its value
print("Removed Course:", removed_course)

print(len(student))  # Getting the number of key-value pairs in the dictionary
print(student.keys())  # Getting all keys in the dictionary
print(student.values())  # Getting all values in the dictionary 
print(student.items())  # Getting all key-value pairs as tuples in a list


