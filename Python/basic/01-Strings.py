 # Strings

message = "Hello, World!"
print(message)

# single and double quotes can be used interchangeably
# when a string contains one type of quote, use the other type to enclose it \
# or escape it with a backslash (\)
single_quote = 'Hello'
double_quote = "World"
escaped_quote = 'It\'s a beautiful day!'
string_with_single_quote = "It's a beautiful day!"
string_with_double_quote = 'He said, "Hello!"'

# print(single_quote, double_quote, escaped_quote, string_with_single_quote, string_with_double_quote,sep='\n')

#length of string
length = len(message)
print("Length of message:", length)

# Individual characters can be accessed using indexing
# Indexing starts at 0 and ranges to length-1
# Negative indexing starts at -1 from the end of the string
# if the index is out of range, it raises an IndexError
print(message[0])  # Output: H
print(message[9]) # Output: W
print(message[-1]) # Output: !

# Similar to indexing, slicing allows you to extract a substring from a string
# Slicing syntax: string[start:end] (end index is exclusive)
print(message[0:5])  # Output: Hello
print(message[7:])   # Output: World!


# strings are immutable, meaning they cannot be changed after creation
# any operation that modifies a string will create a new string

# built-in string methods
upper_message = message.upper() # output: HELLO, WORLD!
lower_message = message.lower() # output: hello, world!
print(message.count('l')) # output: 3 --> counts occurrences of 'l'
print(message.find('World')) # output: 7 --> index where 'World' starts returns -1 if not found
print(message.replace('World', 'Velkoz')) # output: Hello, Velkoz!

# concatenation
greeting = "Hello"
name = "Alice"
full_greeting = greeting + ", " + name + "!" # Output: Hello, Alice!
formated_greeting = "{}, {}!. Welcome".format(greeting, name)
f_string_greeting = f"{greeting}, {name.upper()}!. Welcome"

#dir() function shows all attributes and methods of an object
print(dir(message))

# help() function provides detailed documentation about a class or method
print(help(str))
print(help(str.lower))