import iterator
# Define a simple list
my_list = [10, 20, 30, 40, 50]
print(f"Original list: {my_list}")

# Get an iterator from the list
my_iterator = iter(my_list)
print(f"Iterator object: {my_iterator}")

# Use next() to get elements from the iterator
print(f"First element: {next(my_iterator)}")
print(f"Second element: {next(my_iterator)}")

# You can also iterate using a loop (which implicitly uses iter() and next())
print("\nIterating through the rest of the elements with a for loop:")
for item in my_iterator:
    print(item)

# Once the iterator is exhausted, calling next() again will raise StopIteration
# print(next(my_iterator)) # Uncommenting this line would raise StopIteration