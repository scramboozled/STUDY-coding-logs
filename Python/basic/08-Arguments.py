# args and kwargs in Python are used to pass a variable number of arguments to a function.

# *args allows a function to accept any number of positional arguments.
def sum_all(*args):
    '''Returns the sum of all positional arguments passed to the function.'''
    total = 0
    for num in args:
        total += num
    return total

# **kwargs allows a function to accept any number of keyword arguments.
def print_info(**kwargs):
    '''Prints key-value pairs of all keyword arguments passed to the function.'''
    for key, value in kwargs.items():
        print(f"{key}: {value}")

# Example usage of *args
print("Sum of 1, 2, 3:", sum_all(1, 2, 3))
print("Sum of 10, 20, 30, 40, 50:", sum_all(10, 20, 30, 40, 50))

# Example usage of **kwargs
print_info(name="Alice", age=30, city="New York")
print_info(product="Laptop", price=999.99, stock=50)

# *args and **kwargs can be named differently, but the asterisk (*) and double asterisk (**) are what matter.
def custom_function(*values, **dictionary):
    print("Positional arguments:", values)
    print("Keyword arguments:", dictionary)

custom_function(1, 2, 3, name="Bob", country="USA") 
# args will be a tuple (1, 2, 3) and kwargs will be a dictionary {'name': 'Bob', 'country': 'USA'}

# usually args and kwargs are used in production level code to make functions flexible and adaptable to different input scenarios.
# They might backfire if not used carefully, and load the computer memory if too many arguments are passed or if the function logic is not optimized to handle variable inputs efficiently.
# They are particularly useful in scenarios like decorators, wrappers, or when interfacing with APIs where the number of parameters can vary.