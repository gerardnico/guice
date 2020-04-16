# Guice Playground

## About

Some [Guice code](https://github.com/google/guice) in order to learn Dependency Injection graph

## Run

You can see how you can trick a process to use fake delivery and payment processor
in the [Main Demo](./src/main/java/Guice/Main.java)

The below example is the output where you can see:
  * a run with the fake class
  * then a run with the real class

```text
###################################################
Fake module is running a fake process 
###################################################
FAKE: The item shoe was delivered by our FAKE system
FAKE: A FAKE payment was processed
###################################################
Real module is running a real process 
###################################################
REAL: The item shoe was delivered by our REAL system
REAL: A REAL payment was processed

```