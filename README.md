# java-fundamentals

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

- DateTimeFormatter
  - `.ofPattern()`

- LocalDateTime
  - `.format(DateTimeFormatter.ofPattern("HH:mm:ss"))`

- Random
  - `.nextDouble()`

- Timer
  - `.schedule()`

- TimerTask
