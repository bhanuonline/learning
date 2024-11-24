* Arrays.toString()
* Arrays.copyOfRange
* Arrays.copyOf()
* when you pass an array to a method, you're passing a copy of the reference to the array. This allows the method to directly modify the contents (elements) of the original array. However, if you try to reassign the reference inside the method (e.g., by creating a new array), it only changes the local copy of the reference and does not affect the original array outside the method
* Java always passes arguments by value, meaning that the method gets a copy of the value of the argument.
  For primitive types (e.g., int, char), this means passing the actual value.
  For reference types (e.g., arrays, objects), this means passing a copy of the reference (address) pointing to the object.
* Arrays are mutable objects, meaning you can modify their elements after creation.
  If you create a new object (e.g., a new array), that doesn't affect the original object unless its reference is changed outside the method.
* If you pass null as the array reference, it will not work as expected, as null does not point to any array object. Accessing elements or attempting to modify it will throw a NullPointerException