#Lynda Course - Foundations of Programming: Object-Oriented Design

##Core Concepts
- Object-Oriented
  - Analysis - understand problem
  - Design - plan our solution, Object-Oriented
  - Build it - Programming

- Methodologies
  - Scrum
  - Agile
  - Unified Process
- Software development lifecycle - pm, people mgm, budgeting, etc.
- Iterative / Agile approach

- Why use object-orientation:   programming paradigm .  Split apart smaller parts/objects.
- Object:  
  - identity - unique, separate
  - attributes - color, weight, etc. Current state.
  - behavior - what does it do

  - Noun - can you put "the" in front of it

- Class: describes what object will be. blueprint.  Use class to create object.
  - Name / Type - what is it
  - attributes / properties
  - behaviors / operations / method

  - create instance of a class - each individual object in the class.
  - pre-provided classes - strings, dates, collections, etc.

APIE
- Abstraction: abstract the idea of the meaning.  Focus on essential qualities, ignore the irrelevant/unimportant. Concept separate from specifications
- Encapsulation: surrounding something - bundle attributes/behaviors in same class and restrict access, don't revel anything except what is absolutely necessary.  Can safely change the way the object works. Reduce dependancies
- Inheritance: base new class (child) on existing class (parent).  inherit all attributes, behaviors from another class.
- Polymorphism - many forms.  "+" for example.  Will add if values are integers and will concatenate if strings.  Can override behaviors from parent class.

##Object-Oriented Analysis and Design
1. Gather Requirements - write down overall requirements
2. Describe the approach - describe/simple narrative how user will use it.  Mockup/prototype.
3. Identify the main objects - start of id classes
4. Describe the Interactions - responsibilites and behaviors of objects.  Sequence diagram.
5. Create a Class Diagram - methods in them

- GATHER REQUIREMENTS (Analysis)
  - Functional Requirements - features/ capabilities of application
  - Non-Functional Requirements - Help, legal, performances (response time), support, security
Example: Application MUST do this....
FURPS+
    Functional
    Usability
    Reliability
    Performance
    Supportability
    + Design, Implementation, Interface, Physical

- Unified Modeling Language - draw diagrams of object-oriented system

## Utilizing Use Cases / User Story
- Title - what is goal (register new member, transfer funds)
- Actor - who desires it (user, customer, administrator, system). external to application but need to interact with it.
- Scenario - how is accomplished, goal from user perspective (Informal/casual: paragraph or list of steps, with extensions - steps for alternate scenarios).  Emphasize goal of one encounter. Sunny day. Focus on intention. Use active voice.

- Should take a day or so.  No diagrams at this point.

USE CASE diagram
- diagram of several use cases and multiple actors at same time

- USER STORY
  - One or two sentences. Focus on intent.  one need.
  As a (type of user/role)
  I want (goal)
  so that (reason)
  - example:  "as a user I want to sort entries by date so that I can find the most recent content"
