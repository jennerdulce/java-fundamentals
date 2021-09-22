# Lab: 01 - Java primitives and control flow

## How to import pre-build Java Packages

### Import Class Package

- `import java.util.NameOfClass`
- `import java.time.TimeClass`

### Instantiate Class

- `Classname name = new Classname()`

### Look at the docs

- After instantiating a class, you are then able to use all the methods the class has to offer
- [Java Docs](https://docs.oracle.com/javase/8/docs/api/)

## Classes and Methods used

### Classes Used

- DateTimeFormatter
  - `.ofPattern()`
  - Takes the time of your computer of a certain pattern

- LocalDateTime
  - `.format(DateTimeFormatter.ofPattern("HH:mm:ss"))`
  - Sets the time format to Hours, Minutes, Seconds

- Random
  - `.nextDouble()`
    - Finds the a random double from 0.0 - 1

- Timer
  - `.schedule(new TimerTask, timelong, timeshort)`
  - Creates a time interval to perfrom the timertask

- TimerTask
  - Creates a task to perfrom within the timer

### Created Methods

- `pluralize(String, int)`
  - Returns a string with the given arguments

- `flipNHeads(int)`
  - Returns a string that describes how many flips it took in total to achieve n consecutive flips

- `clock()`
  - Prints out the time in second intervals
