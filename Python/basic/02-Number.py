# Integers and Floats

x = 10          # This is an integer
y = 3.14        # This is a float\

print(type(x))  # Output: <class 'int'>
print(type(y))  # Output: <class 'float'>   

# Basic arithmetic operations
# Addition:       3 + 2
# Subtraction:    3 - 2
# Multiplication: 3 * 2
# Division:       3 / 2
# Floor Division: 3 // 2
# Exponent:       3 ** 2
# Modulus:        3 % 2

print(3+2)        # Output: 5
print(3-2)        # Output: 1
print(3*2)        # Output: 6 
print(3/2)        # Output: 1.5
print(3//2)       # Output: 1
print(3**2)       # Output: 9
print(3%2)        # Output: 1

# built-in functions for numbers
print(abs(-5))        # Output: 5
print(round(3.6))     # Output: 4  
print(round(3.4123,1))# Output: 3.4
print(pow(2, 3))      # Output: 8

# comparison operators
# Equal:              ==
# Not Equal:          !=        
# Greater Than:       >
# Less Than:          <
# Greater Than Equal: >=
# Less Than Equal:    <=

print(3 == 2)   # Output: False
print(3 != 2)   # Output: True  
print(3 > 2)    # Output: True
print(3 < 2)    # Output: False
print(3 >= 2)   # Output: True
print(3 <= 2)   # Output: False

# type conversion
a = '100'
b = '500'
print(a + b)             # Output: 100500 (string concatenation)
print(int(a) + int(b))   # Output: 600 (integer addition)
print(float(a) + float(b)) # Output: 600.0 (float addition)

# casting a string that cannot be converted to a number will raise a ValueError
