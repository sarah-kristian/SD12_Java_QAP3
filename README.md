# Java Deliverables for Keyin College
Due: March 16, 2025

## Overview
This repository contains the third Java QAP for Keyin College. Below are the details of each project along with their specific components and test results.

## Project 1: School Management System

This Java project expands a basic High School management system by incorporating classes that represent different roles within a school environment. The project builds on existing classes with inheritance, introducing `Teacher` and `CollegeStudent` classes to the hierarchy.

### Class Descriptions

#### Person
- **Purpose**: Serves as the base class for all individuals in the school system.
- **Properties**: `name` (String), `age` (int).

#### Student
- **Inheritance**: Extends `Person`.
- **Additional Properties**: `gradeLevel` (int), `courses` (List of String).

#### Teacher
- **Inheritance**: Extends `Person`.
- **New Properties**:
  - `salary` (double): The annual salary of the teacher.
  - `subject` (String): The academic subject taught by the teacher, such as "Mathematics" or "History".

#### CollegeStudent
- **Inheritance**: Extends `Student`.
- **New Properties**:
  - `year` (String): The current academic year of the student, such as "Freshman" or "Senior".
  - `major` (String): The major field of study, like "Computer Science" or "Art History".

### Features
- Each class is equipped with constructors, getters, and setters to facilitate easy manipulation of object properties.
- Utilizes overriding techniques to tailor method behavior in subclasses to reflect their specific roles and attributes.

### Usage
The classes can be used to simulate school-related activities and management tasks, allowing for detailed tracking and organization of both staff and student information.

### Implementation Example




## Project 2: Points Inheritence
Java Class Implementation: Point and MovablePoint
### Class Descriptions

#### Point Class

- Represents a point in 2D space with x and y coordinates.
- Methods for setting and getting point coordinates, and converting point data to a string format.

#### MovablePoint Class

- Extends Point to add movement capabilities with xSpeed and ySpeed.
- Allows setting speed, moving the point based on its speed, and generating a string representation including speed.

#### Usage Example


## Project 3: Shapes Inheritance Project

This Java project models various geometric shapes using object-oriented principles to demonstrate inheritance and polymorphism. It extends basic shape classes to include more specific types like `Ellipse`, `Circle`, `Triangle`, and `EquilateralTriangle`.

### Class Descriptions

#### Shape
- **Purpose**: Serves as an abstract base class for all shapes.
- **Methods**:
  - `getArea()`: Calculate the area of the shape.
  - `getPerimeter()`: Calculate the perimeter of the shape.
  - `toString()`: Override to provide string representation of shape properties.

#### Ellipse
- **Inheritance**: Extends `Shape`.
- **Properties**: `a` (major axis), `b` (minor axis).
- **Specific Methods**:
  - Calculate area and perimeter specific to ellipses.

#### Circle
- **Inheritance**: Extends `Ellipse`, specialized where both axes are equal.
- **Simplified Methods**:
  - Overrides to use formulas specific to circles, leveraging the properties of an ellipse.

#### Triangle
- **Inheritance**: Extends `Shape`.
- **Properties**: `side1`, `side2`, `side3`.
- **Specific Methods**:
  - Check triangle inequality during instantiation.
  - Calculate area using Heron's formula.
  - Directly calculate perimeter as the sum of its sides.

#### EquilateralTriangle
- **Inheritance**: Extends `Triangle`, with all sides equal.
- **Simplified Methods**:
  - Overrides to use formulas specific to equilateral triangles.

### Features
- Demonstrates the use of abstract classes and method overriding.
- Shows how inheritance can be used to extend classes with more specific functionalities.

### Example Usage


## Project 4: Implementation of Scalable Interface in Shapes Project

### Overview
To introduce the concept of multiple inheritance in Java, which is natively unsupported due to its complexity, this project utilizes interfaces. The `Scalable` interface provides a way to scale shapes without introducing the complexities of multiple inheritance.

### Scalable Interface
- **Purpose**: Allows objects to scale dynamically by a scaling factor.
- **Key Method**:
  - `scale(double factor)`: Scales the object's dimensions by the provided factor. This method is abstract and must be implemented by any class that implements the interface.

### Integration with Shape Classes
- **Abstract Shape Class**: Now implements the `Scalable` interface, allowing all derived shape classes to inherit the scaling capability.
- **Specific Implementations**:
  - Each concrete shape class (e.g., `Ellipse`, `Circle`, `Triangle`, `EquilateralTriangle`) overrides the `scale` method to adjust their specific dimensions according to the scaling factor.

### Example Usage in Test Class


## Installation
Clone the repository to your local machine using:
```bash git clone https://github.com/sarah-kristian/SD12_Java_QAP3```

## Running Demos
To run the demos, navigate to the directory containing the project files and run the appropriate commands for your Java environment.
