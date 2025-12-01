# Dunder functions are special methods in Python that have double underscores (__) at the beginning and end of their names.
# They are also known as "magic methods" and are used to define the behavior of objects for built-in operations.

# Most commonly used dunder methods include:
# __init__: This method is called when an object is created from a class and allows the class to initialize the attributes of the object.
# __str__: This method is called by the str() built-in function and by the print function to compute the "informal" string representation of an object.
# __repr__: This method is called by the repr() built-in function and is used to compute the "official" string representation of an object.
# __add__: This method is called to implement the addition operation for objects of a class.
# __len__: This method is called by the len() built-in function to return the length of an object.
# __eq__: This method is called to implement the equality operator (==) for objects of a class.
# __iter__: This method is called to return an iterator object for the container.
# __next__: This method is called to get the next item from an iterator.
# __getitem__: This method is called to retrieve an item from a container using the indexing syntax.
# __setitem__: This method is called to set an item in a container using the indexing syntax.

# Example class demonstrating some dunder methods
class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"Point({self.x}, {self.y})"

    def __repr__(self):
        return f"Point(x={self.x}, y={self.y})"

    def __add__(self, other):
        if isinstance(other, Point):
            return Point(self.x + other.x, self.y + other.y)
        return NotImplemented

    def __eq__(self, other):
        if isinstance(other, Point):
            return self.x == other.x and self.y == other.y
        return NotImplemented
    
    def __iter__(self):
        self._index = 0
        return self
    
    def __next__(self):
        if self._index < 2:
            value = (self.x, self.y)[self._index]
            self._index += 1
            return value
        else:
            raise StopIteration
        
    def __len__(self):
        return 2  
    
# __repr__ vs __str__:
# __str__ is meant to be readable and user-friendly, while __repr__ is meant to be unambiguous and developer-friendly.
# When you print an object, Python uses __str__ if it's defined; otherwise, it falls back to __repr__.
# __repr__ is often used for debugging, as it can provide more detailed information about the object. 
# and called by the interactive interpreter to display objects.
p1 = Point(2, 3)
p2 = Point(4, 5)
print(str(p1))        # Uses __str__: Point(2, 3)
print(repr(p1))       # Uses __repr__: Point(x=2, y=