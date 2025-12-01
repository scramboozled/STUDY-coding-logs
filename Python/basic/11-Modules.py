# Modules and Packages in Python are essential for organizing code into manageable and reusable components.
# A module is a single Python file that contains definitions and statements.
# A package is a collection of modules organized in directories that include a special __init__.py file.

# The PATH variable is an environment variable that tells the Python interpreter where to locate the modules 
# and packages you import.
# PYTHONPATH is an environment variable that you can set to add additional directories 
# where Python will look for modules and packages.

# Importing standard library module
import math
print("Square root of 16 is:", math.sqrt(16))

# Importing specific function from a module
from math import factorial
print("Factorial of 5 is:", factorial(5))

# Importing a module with an alias
import random as rnd
print("Random number between 1 and 10:", rnd.randint(1, 10))

# Creating and importing a custom module
# Assume we have a file named my_module.py with the following content:
# def greet(name):
#     return f"Hello, {name}!"

import demo
print(demo.__file__)
print(demo.greet("Scrambled"))

# Scope of module search:
# 1. Current directory
# 2. Directories listed in PYTHONPATH environment variable
# 3. Standard library directories
# 4. Site-packages directory for third-party packages

