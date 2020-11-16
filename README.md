## Author
* Beatrice Shabani


# Caesar Cipher
A Caesar cipher is a type of substitution in which each letter is shifted a certain number of places also known as a key, down the alphabet. 
 For example, with a shift of 1, A would be replaced by B, B would become C, and so on. For more information on it, 
you can check this out


## requirements

As always, follow the "Red, Green, Refactor" workflow. You should always write a test before implementing a new behavior. Keep this lesson open as you code, and follow along with the workflow as you develop the program.
First of all before everything, you'll want to create a test file to test the functionality of the ceaser cipher.
In the test file, you will need to test out if the entered input is appropriate: Only strings. And throws appropriate exceptions. Also the output is right given the input
The same case applies to decoding of the cipher;
You'll want to create an encoding class that takes an input and encrypts it using the desired key of your choice. You will need to create an attribute that holds the key and the input as well as the output.
You’ll also want to create a decoding class that converts the output that was produced by the encoding class and returns the original value or input that was fed earlier .
Note that all the classes should be encapsulated containing private properties. Use getter methods for all properties you must access outside of the class
Eventually, when your logic for encrypting and decrypting a String input (and well-tested), work on displaying the encrypted and decrypted data, like this:
Input String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
Encrypted String: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
Decrypted String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
## Project Setup Instructions
Follow the following setup instructions to run the program.
* Install the java software development kit (sdk)
* Install java
* Install gradle
* To run the program in the terminal you can use 'gradle run' command


## Technologies Used
* Intelli J IDEA
* java
* Git



## Known Bugs
none


Copyright (c) 2020 [MIT LICENSE](./LICENSE)

