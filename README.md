# Stopwatch tasks by Sirasath Piyapootinun (5910546465)
I ran the tasks on a Asus Gaming Laptop, and got
these results:

Task | Time
 --------------------------------------|-------:
Append 50,000 chars to String | 1.340294 sec
Append 100,000 chars to String | 3.310943 sec
Append 100,000 chars to StringBuilder | 0.002081 sec
Add 1 billion double using array | 1.190634 sec
Add 1 billion Double using array | 5.968124 sec
Add 1 billion BigDecimal using array | 10.054218 sec


##Explanation of Results

###1. Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?

The reason is that everytime we add a char to a String, a new String is created and replaces the old one.
*For Example:* We have a ```String a = exam;``` and then we add "ple" by ```a = a + "ple";```. There will 
there Stings: ```"exam"```, ```"ple``` and ```"example"```. But the variable ```a``` will point at ```"example"``` 
instead of ```"exam"```. So because everytime we a String is created, it takes time and also consumes the 
memory so appending 100,000 chars to a String take more than 2X the time to append 50,000 chars.

###2. Why is appending to StringBuilder so much different than appending to String? What is happening to the String?

