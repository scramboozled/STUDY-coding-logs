name = "Scramble"

if name == "Scramble":
    print("This block executes because the condition is True.")
elif name == "AnotherName":
    print("This block does not execute.")
else:
    print("This block does not execute.")   


# Comparisons:
# Equal:            ==
# Not Equal:        !=
# Greater Than:     >
# Less Than:        <
# Greater or Equal: >=
# Less or Equal:    <=
# Object Identity:  is


# False Values:
    # False
    # None
    # Zero of any numeric type
    # Any empty sequence. For example, '', (), [].
    # Any empty mapping. For example, {}.

# True Values:
    # Any value that is not false is considered true.

# Object Identity: 
# Object sharing same memory location  
a = 10
b = 20
c = b
print(id(a))  # Output: memory address of a
print(id(b))  # Output: memory address of b
print(id(c))  # Output: memory address of c (same as b)
print(a is b)  # Output: False, because a and b refer to different objects
print(b is c)  # Output: True, because b and c refer to the same object

# Logical Operators:
# and, or, not
x = 5
print(x > 0 and x < 10)  # Output: True, both conditions are True
print(x < 0 or x < 10)   # Output: True, one condition is True
print(not(x > 0))        # Output: False, negates the condition


# Nested Conditionals/ Nested If-Else
age = 25
if age < 18:
    print("Minor")
else:
    if age < 65:
        print("Adult")
    else:
        print("Senior Citizen")

