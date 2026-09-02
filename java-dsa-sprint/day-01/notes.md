today's date is 02/09/2026
so today i'll be practising java syntax basics


datatypes - **two types** 
1. primitive datatypes
2. non-primitive datatypes

PRIMITIVE DATATYPES []
1. integer - int(4bytes),long(8bytes),short(2bytes),byte(1byte,range -> -2^7(-128) to 2^7(128)-1),long(after every value in long,add 'L')
2. float - float(4bytes,used basically with less values after dot,after every value in float,add 'f'),double(8bytes,used for maximum precision with more values after dot)
3. character - char(2bytes)
4. boolean - True or False(keyword - boolean)

NON PRIMITIVE DATATYPES []
1. Strings: Built-in classes representing immutable sequences of characters.
2. Arrays: Fixed-size collections of elements of the same data type.
3. Classes: User-defined blueprints used to instantiate unique objects.
4. Interfaces: Templates specifying abstract behaviors that classes must implement.
5. Enums: Distinct groups of predefined constants, treated as special classes.
6. Annotations: Metadata tags providing data about the program code itself.


difference between ".equals" and "==" :
.equals(method in object class) compares the content inside two variables whereas "=="(binary_operator) compares the memory address they stored in.

switch-case:
sytax:
switch(input-value)
{
    case(if-value1):
        <code>
        break
    case(if-value2):
        <code>
        break
    case(if-value3):
        <code>
        break
    case(if-value4):
        <code>
        break
    default(only gets used if input value not matches any 'if-values'):
        <code>
        break
}
break statement is used to quit from the running program.