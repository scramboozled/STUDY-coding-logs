def func(): # () will contain parameters if any
    '''A simple function that prints a message. These are called docstrings. used to describe the function.'''
    
    print("Hello from func!")

print(func()) # calling the function
print(func) # prints the function object reference

# Function with parameters and return value
def add(a, b):
    return a + b

# Latest python versions support type hints
def multiply(x: int, y: int) -> int:
    return x * y

# pass keyword 
def placeholder_function():
    pass  # Placeholder for future code

# default parameter values
def greet(name="Guest"):
    return f"Hello, {name}!"

print(greet())
print(greet('Scrambled'))

# methods can be used alongside functions when function returns the suitable object
name = "Alice"
print(greet(name).upper())


