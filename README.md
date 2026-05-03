# Java Secure Login System

A console-based secure login system built in Java. The program allows users to register, validate password strength, log in, and track login attempts.

## Overview

This project demonstrates intermediate Java concepts such as generics, nested classes, inner classes, custom exceptions, collections, and user input handling.

Users can register with a username and password. The password must meet basic strength requirements before the account is accepted. Users can then attempt to log in, and the program records whether each login attempt succeeded or failed.

## Features

- User registration
- Login verification
- Password strength validation
- Security question check
- Login attempt logging
- Custom invalid password exception
- Use of a generic `Pair<T>` class
- Use of nested and inner classes

## Technologies Used

- Java
- Object-Oriented Programming
- Generics
- ArrayList
- Custom Exceptions
- Nested Classes
- Scanner Input

## Project Structure

```text
java-secure-login-system/
├── src/
│   ├── SecureLoginSystem.java
│   ├── Pair.java
│   └── InvalidPasswordException.java
├── README.md
└── .gitignore
