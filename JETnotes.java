/* JET notes

=================================================
1.1 - The History of Java

Java created in 1991
new numbering system started in 2004
    generics were added in 2004 for Java J2SE 5.0 (1.5)

Java was purchased by Oracle in 2010

Java SE 8 was released in 2014

Android development only supports Java SE 6 and SE 7

------------------------
1.2 - Principles and components of Java

Principles of Java
    -Simple, object-oriented, and familiar
    -Robust and secure
    -Architecture-neutral and portable
    -High-performance
    -Interpreted, threaded, and dynamic

Java is a consistent language

Understand three OO concepts to understand Java project design:
    encapsulation,
    inheritance, and
    polymorphism

Java is compiled to bytecode, not machinecode.
    This means that any system with a JVM can read a compiled Java program

Java Development Kit (JDK) contains four tools for compiling and packaging Java:
    java: runtime
    javac: compiler
    javadoc: docs builder
    jar: archive builder

    These tools are important to know if you run and compile java code from the
    command line
------------------------
1.3 Java syntax and compiling

Classes methods, fields, and other names are called identifiets

Identifiers must start with an alphabet character or underscore.

All Java code is written in classes
.java is the file extension for Java code

Java is case sensitive, so variables named in different cases be different things.

White space does not affect interpretation of code
All statements must end with a semicolon (;)

Keywords cannot be used as classes or other identifiers:
  List of keywords - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html

Class identifiers should start with an uppercase character
Methods and variables should start with lowercase characters
Constants are all uppercase


A simple java class:

in file Main.java

//package declaration
package com.example;

//class declaration
public class Main {

//main method
public static void main(String[] args) {

//Executable code
System.out.println("Hello, World");
  }
}

------------------------
1.4 - Memory management and garbage collection

variables referencing Objects are stored in the fastest available memory
complex objects are stored in heap memory
as long as a variable is able to be called in code, it is retained in memory

you can manually derefernce variables using the 'null' operator.








*/
