# Lab: 02 - Arrays, for loops, testing

## Classes and Methods used

### Classes Used

- ArrayList
  - `.add(data)`
    - Adds data to the array
  - `.size()`
    - Similar to length, returns the size of an ArrayList
  - `.get(data)`
    - Checks the ArrayList to see if there contains the argument

- Arrays
  - `Arrays.toString(arr)`
    - Used to display an array in proper format; However, changes the array into a string

- Random
  - `.nextInt(bound)`
    - Sets a range with the bound exclusive

- Integer
  - `.MIN_VALUE`
    - Sets the lowest possible value for the Interger datatype.
  - `.MAX_VALUE`
    - Sets the highest possible value for the Interger datatype.

- HashSet<Integer>
  - `.contains(data)`
    - Checks to see if a key with data is created in the hashmap and returns a boolean
  - `.add(data)`
    - Adds an entry to the HashSet

- HashMap<dataType, dataType>
  - `.containsKey(data)`
    - Checks to see if a key with data is created in the hashmap and returns a boolean
  - `.put(k, v)`
    - Creates a new entry utilizing key and value pairs
  - `.get(k)`
    - Retrieves the value the given key

### Created Methods

- `roll(int)`
  - Rolls a dice n many times and returns an array containing all of the results

- `containDuplicates(ArrayList<> arr)`
  - Checks to see if there are duplicates in the given ArrayList

- `calculateAverage(int[])`
  - Finds and calculates the average of an array of integers

- `averageArray(int[][] arr)`
  - Accepts an array of arrays containing integers and returns the array with the lowest average

- `weatherData(int[][] arr)`
  - Displays lowest temperature , highest temperature, and temperatures that were not reached during a given month

- `tally(List<String> arr)`
  - Given an array, tallys votes and displays the candidate the received the most votes