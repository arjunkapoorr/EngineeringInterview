package com.arjunkapoor.engineeringinterview;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class cse extends ActionBarActivity {



    String[] listArraycse = {

            "1. What do you mean by a File?",
            "2. Why we use File Handling?",
            "3. What are the ways of storing data in Files?",
            "4. What are the operations that can be performed on Files?",
            "5. What are the measures that can be adopted to avoid errors in File Processing?",
            "6. List some of the most used File Processing functions in C?",
            "7. In what way is a file more flexible than a String?",
            "8. Write the general formats for file opening and file closing commands?",
            "9. What do you mean by File Positioning? ",
            "10. What is the difference between a sequential file and a random file?",
            "11. What is data structure?",
            "12. Differentiate file structure from storage structure.",
            "13. When is a binary search best applied?",
            "14. What is a linked list?",
            "15. How do you reference all the elements in a one-dimension array?",
            "16. In what areas do data structures applied?",
            "17. What is LIFO?",
            "18. What is a queue?",
            "19. What are binary trees?",
            "20. Which data structures is applied when dealing with a recursive function?",
            "21. What is a stack?",
            "22. Explain Binary Search Tree",
            "23. What are multidimensional arrays?",
            "24. Are linked lists considered linear or non-linear data structures?",
            "25. How does dynamic memory allocation help in managing data?",
            "26. What is FIFO?",
            "27. What is an ordered list?",
            "28. What is merge sort?",
            "29. Differentiate NULL and VOID.",
            "30. What is the primary advantage of a linked list?",
            "31. What is the difference between a PUSH and a POP?",
            "32. What is a linear search?",
            "33. How does variable declaration affect memory allocation?",
            "34. What is the advantage of the heap over a stack?",
            "35. What is a postfix expression?",
            "36. What is Data abstraction?",
            "37. How do you insert a new item in a binary search tree?",
            "38. How does a selection sort work for an array?",
            "39. How do signed and unsigned numbers affect memory?",
            "40. What is the minimum number of nodes that a binary tree can have?",
            "41. What are dynamic data structures?",
            "42. In what data structures are pointers applied?",
            "43. Do all declaration statements result in a fixed reservation in memory?",
            "44. What are ARRAYs?",
            "45. What is the minimum number of queues needed when implementing a priority queue?",
            "46. Which sorting algorithm is considered the fastest?",
            "47. Differentiate STACK from ARRAY.",
            "48. Give a basic algorithm for searching a binary search tree.",
            "49. What is a dequeue?",
            "50. What is a bubble sort and how do you perform it?",
            "51. What are the parts of a linked list?",
            "52. How does selection sort work?",
            "53. What is a graph?",
            "54. Differentiate linear from non linear data structure.",
            "55. What is an AVL tree?",
            "56. What are doubly linked lists?",
            "57. What is Huffman’s algorithm?",
            "58. What is Fibonacci search?",
            "59. Briefly explain recursive algorithm.",
            "60. How do you search for a target key in a linked list?",
            "61. How do you construct an increment statement or decrement statement in C?",
            "62. What is the difference between Call by Value and Call by Reference?",
            "63. Some coders debug their programs by placing comment symbols on some codes instead of deleting it. How does this aid in debugging?",
            "64. What is a sequential access file?",
            "65. What is variable initialization and why is it important?",
            "66. What is spaghetti programming?",
            "67. Differentiate Source Codes from Object Codes",
            "68. In C programming, how do you insert quote characters (‘ and “) into the output screen?",
            "69. What is the use of a ‘’ character?",
            "70. What is the difference between the = symbol and == symbol?",
            "71. What is the modulus operator?",
            "72. What is a nested loop?",
            "73. Which of the following operators is incorrect and why? ( >=, <=, <>, ==)",
            "74. Compare and contrast compilers from interpreters",
            "75. How do you declare a variable that will hold string values?",
            "76. Can the curly brackets { } be used to enclose a single line of code?",
            "77. What are header files and what are its uses in C programming?",
            "78. What is syntax error?",
            "79. What are variables and it what way is it different from constants?",
            "80. How do you access the values within an array?",
            "81. Can I use  “int” data type to store the value 32768? Why?",
            "82. Can two or more operators such as n and t be combined in a single line of program code?",
            "83. Why is it that not all header files are declared in every C program?",
            "84. When is the “void” keyword used in a function?",
            "85. What are compound statements?",
            "86. What is the significance of an algorithm to C programming?",
            "87. What is the advantage of an array over individual variables?",
            "88. What is wrong in this statement?  scanf(“%d”,whatnumber);",
            "89. How do you generate random numbers in C?",
            "90. What could possibly be the problem if a valid function name such as tolower() is being reported by the C compiler as undefined?",
            "91. What are comments and how do you insert it in a C program?",
            "92. What is debugging?",
            "93. What does the && operator do in a program code?",
            "94. In C programming, what command or code can be used to determine if a number of odd or even?",
            "95. What does the format %10.2 mean when included in a printf statement?",
            "96. What are logical errors and how does it differ from syntax errors?",
            "97. What are the different types of control structures in programming?",
            "98. What is || operator and how does it function in a program?",
            "99. Can the “if” function be used in comparing strings?",
            "100.What are preprocessor directives?",
            "101.What will be the outcome of the following conditional statement if the value of variable s is 10?\n" +
                    "s >=10 && s < 25 && s!=12\n",
            "102. Describe the order of precedence with regards to operators in C.",
            "103. What is wrong with this statement? myName = “Robin”;",
            "104. How do you determine the length of a string value that was stored in a variable?",
            "105. Is it possible to initialize a variable at the time it was declared?",
            "106. Why is C language being considered a middle level language?",
            "107. What are the different file extensions involved when programming in C?",
            "108. What are reserved words?",
            "109. What would happen to X in this expression: X += 15;  (assuming the value of X is 5)",
            "110. What is an endless loop?",
            "111. What is a program flowchart and how does it help in writing a program?",
            "112. What is wrong with this program statement? void = 10;",
            "113. Is this program statement valid? INT = 10.50;",
            "114. What are actual arguments?",
            "115.  What is a newline escape sequence?",
            "116. What is output redirection?",
            "117. What are run-time errors?",
            "118. What is the difference between functions abs() and fabs()?",
            "119. What are formal parameters?"
    };

    String[] datacse = {
            "A File contains contains data/information which are stored permanently in a storage device.Floppy disk and hard disk are commonly used to store file information.When large quantity data is required to be stored and processed, the concept of file is used.\n" +
                    "A file stored in a storage device is always identified using a file name(e.g. STUDENT.DAT).\n",
            "The input and output operation that we have performed so far were done through screen and  keyboard only.After the termination of program all the entered data is lost because primary memory is volatile . if the data has to be used later ,then it becomes necessary to keep it in permanent storage device. so the c language provide the concept of file through which data can be stored on the disk or secondary storage device.The stored data can be read whenever required.",
            "There are two ways of storing data in files-\n" +
                    "1. Text Format- In text format data is stored as a line of character with each line  terminated by a new line character (‘\\n’). Text files are in human readable form and they can be created and read using any text editor.\n" +
                    "2. Binary Format– In binary format, data is stored on the disk same way as it is represented in the computer memory.Binary files are not in human readable form they and can be created and read by a specific program  written for them .The binary data stored in the file can’t be read by any editor.\n" +
                    "The input and output operation in binary files take less time as compared to that of the text files because in binary files no conversion have to take place .However the data written using binary format is not very portable since the size of data types and byte order may be different on different  machine. In text format , these problem do not arise,and hence it is more portable.\n",
            "Following operations can be performed on files-\n" +
                    "1.\tCreation of a file of a specific type.\n" +
                    "2.\tReading/processing a file.\n" +
                    "3.\tAppend/add information to a file.\n" +
                    "4.\tModify/edit data in a file.\n" +
                    "5.\tDelete items in a file.\n" +
                    "6.\tUpdate the file.\n",
            ": Following are the measures that can be adopted to avoid errors in file processing-\n" +
                    "•\tferror() function can be used to detect any error during file accessing.This function will return a zero when there is no error or vice-versa.\n" +
                    "FILE *fptr\n" +
                    "if(ferror(fptr)==0)\n" +
                    "printf(“\\n The file is available for processing”);\n" +
                    "else\n" +
                    "printf(“\\n Error in accessing file”);\n" +
                    "•\tTo verify whether a file exists in the disks,the following definitions will help.\n" +
                    "if(fptr==NULL)\n" +
                    "printf(“\\n No content or file does not exist”);\n",
            "Most used file processing functions in C are-\n" +
                    "•\tfopen()-used to open a file and set the file pointer to the beginning or end of a File.\n" +
                    "•\tfclose()-used to close an active File.\n" +
                    "•\tgetc()-used to read a character in a File.\n" +
                    "•\tputc()-used to write a character to a File.\n" +
                    "•\tputw()-used to write an integer data to a File.\n" +
                    "•\tfscanf()-used to read data from a File.\n" +
                    "•\tfprintf()-used to write data to a File.\n" +
                    "•\trewind()-used to move the file pointer to the beginning of a File.\n",
            "A file is stored permanently in a storage device.It is easy to access a file whenever required. On the other hand, a string is stored temporarily in RAM, and the contents of a string will be erased automatically when the power is switched off or when the program execution is terminated.",
            "For Opening:-\n" +
                    "fp=fopen(“filename” , “mode”);\n" +
                    "where ‘fp’ refers to the file pointer.\n" +
                    "‘filename’ refers to the name of the file to be opened.\n" +
                    "‘mode’ refers to the mode of accessing data.\n" +
                    "For Closing:-\n" +
                    "fclose(fp); where fp denotes the file pointer.\n",
            "The file positioning of a stream describes where in the file the stream is currently reading or writing. I/O on the stream advances the file position through the file. On GNU systems, the file position is represented as an integer, which counts the number of bytes from the beginning of the file.",
            "Sequential file access is the method employed in tape drives where the files are access in a sequential manner. So if you have to get a file in the end of the tape you have to start from the beginning till it reaches the beginning of the files…\n" +
                    "Random access files are similar to the one in Hard Disks and Optical drives, wherever the files is placed it will go to that particular place and retrieve it.\n",
            "Data structures refers to the way data is organized and manipulated. It seeks to find ways to make data access more efficient. When dealing with data structure, we not only focus on one piece of data, but rather different set of data and how they can relate to one another in an organized manner.",
            "Basically, the key difference is the memory area that is being accessed. When dealing with the structure that resides the main memory of the computer system, this is referred to as storage structure. When dealing with an auxiliary structure, we refer to it as file structures.",
            "A binary search is an algorithm that is best applied to search a list when the elements are already in order or sorted. The list is search starting in the middle, such that if that middle value is not the target search key, it will check to see if it will continue the search on the lower half of the list or the higher half. The split and search will then continue in the same manner.",
            "A linked list is a sequence of nodes in which each node is connected to the node following it. This forms a chain-like link of data storage.",
            "To do this, an indexed loop is used, such that the counter runs from 0 to the array size minus one. In this manner, we are able to reference all the elements in sequence by using the loop counter as the array subscript.",
            "Data structures is important in almost every aspect where data is involved. In general, algorithms that involve efficient data structure is applied in the following areas: numerical analysis, operating system, A.I., compiler design, databasemanagement, graphics, and statistical analysis, to name a few.",
            "LIFO is short for Last In First Out, and refers to how data is accessed, stored and retrieved. Using this scheme, data that was stored last , should be the one to be extracted first. This also means that in order to gain access to the first data, all the other data that was stored before this first data must first be retrieved and extracted.",
            "A queue is a data structures that can simulates a list or stream of data. In this structure, new elements are inserted at one end and existing elements are removed from the other end.",
            "A binary tree is one type of data structure that has two nodes, a left node and a right node. In programming, binary trees are actually an extension of the linked list structures.",
            "Recursion, which is basically a function that calls itself based on a terminating condition, makes use of the stack. Using LIFO, a call to a recursive function saves the return address so that it knows how to return to the calling function after the call terminates.",
            "A stack is a data structure in which only the top element can be accessed. As data is stored in the stack, each data is pushed downward, leaving the most recently added data on top.",
            "A binary search tree stores data in such a way that they can be retrieved very efficiently. The left subtree contains nodes whose keys are less than the node’s key value, while the right subtree contains nodes whose keys are greater than or equal to the node’s key value. Moreover, both subtrees are also binary search trees.",
            "Multidimensional arrays make use of multiple indexes to store data. It is useful when storing data that cannot be represented using a single dimensional indexing, such as data representation in a board game, tables with data stored in more than one column.",
            "It actually depends on where you intend to apply linked lists. If you based it on storage, a linked list is considered non-linear. On the other hand, if you based it on access strategies, then a linked list is considered linear.",
            "Aside from being able to store simple structured data types, dynamic memory allocation can combine separately allocated structured blocks to form composite structures that expand and contract as needed.",
            "FIFO is short for First-in, First-out, and is used to represent how data is accessed in a queue. Data has been inserted into the queue list the longest is the one that is removed first.",
            "An ordered list is a list in which each node’s position in the list is determined by the value of its key component, so that the key values form an increasing sequence, as the list is traversed.",
            "Merge sort takes a divide-and-conquer approach to sorting data. In a sequence of data, adjacent ones are merged and sorted to create bigger sorted lists. These sorted lists are then merged again to form an even bigger sorted list, which continuous until you have one single sorted list.",
            "Null is actually a value, whereas Void is a data type identifier. A variable that is given a Null value simply indicates an empty value. Void is used to identify pointers as having no initial size.",
            "A linked list is a very ideal data structure because it can be modified easily. This means that modifying a linked list works regardless of how many elements are in the list.",
            "Pushing and popping applies to the way data is stored and retrieved in a stack. A push denotes data being added to it, meaning data is being “pushed” into the stack. On the other hand, a pop denotes data retrieval, and in particular refers to the topmost data being accessed.",
            "A linear search refers to the way a target key is being searched in a sequential data structure. Using this method, each element in the list is checked and compared against the target key, and is repeated until found or if the end of the list has been reached.",
            "The amount of memory to be allocated or reserved would depend on the data type of the variable being declared. For example, if a variable is declared to be of integer type, then 32 bits of memory storage will be reserved for that variable.",
            "Basically, the heap is more flexible than the stack. That’s because memory space for the heap can be dynamically allocated and de-allocated as needed. However, memory of the heap can at times be slower when compared to that stack.",
            "A postfix expression is an expression in which each operator follows its operands. The advantage of this form is that there is no need to group sub-expressions in parentheses or to consider operator precedence.",
            "Data abstraction is a powerful tool for breaking down complex data problems into manageable chunks. This is applied by initially specifying the data objects involved and the operations to be performed on these data objects without being overly concerned with how the data objects will be represented and stored in memory.",
            "Assuming that the data to be inserted is a unique value (that is, not an existing entry in the tree), check first if the tree is empty. If it’s empty, just insert the new item in the root node. If it’s not empty, refer to the new item’s key. If it’s smaller than the root’s key, insert it into the root’s left subtree, otherwise, insert it into the root’s right subtree.",
            "The selection sort is a fairly intuitive sorting algorithm,, though not necessarily efficient. To perform this, the smallest element is first located and switched with the element at subscript zero, thereby placing the smallest element in the first position. The smallest element remaining in the subarray is then located next with subscripts 1 through n-1 and switched with the element at subscript 1, thereby placing the second smallest element in the second position. The steps are repeated in the same manner till the last element.",
            "In the case of signed numbers, the first bit is used to indicate whether positive or negative, which leaves you with one bit short. With unsigned numbers, you have all bits available for that number. The effect is best seen in the number range (unsigned 8 bit number has a range 0-255, while 8-bit signed number has a range -128 to +127.",
            "A binary tree can have a minimum of zero nodes, which occurs when the nodes have NULL values. Furthermore, a binary tree can also have 1 or 2 nodes.",
            "Dynamic data structures are structures that expand and contract as a program runs. It provides a flexible means of manipulating data because it can adjust according to the size of the data.",
            "Pointers that are used in linked list have various applications in data structure. Data structures that make use of this concept include the Stack, Queue, Linked List and Binary Tree.",
            "Most declarations do, with the exemption of pointers. Pointer declaration does not allocate memory for data, but for the address of the pointer variable. Actual memory allocation for the data comes during run-time.",
            "When dealing with arrays, data is stored and retrieved using an index that actually refers to the element number in the data sequence. This means that data can be accessed in any order. In programming, an array is declared as a variable having a number of indexed elements.",
            "The minimum number of queues needed in this case is two. One queue is intended for sorting priorities while the other queue is intended for actual storage of data.",
            "There are many types of sorting algorithms: quick sort, bubble sort, balloon sort, radix sort, merge sort, etc. Not one can be considered the fastest because each algorithm is designed for a particular data structure and data set. It would depend on the data set that you would want to sort.",
            "Data that is stored in a stack follows a LIFO pattern. This means that data access follows a sequence wherein the last data to be stored will the first one to be extracted. Arrays, on the other hand, does not follow a particular order and instead can be accessed by referring to the indexed element within the array.",
            "1.\t1.if the tree is empty, then the target is not in the tree, end search\n" +
                    "2. if the tree is not empty, the target is in the tree\n" +
                    "3. check if the target is in the root item\n" +
                    "4. if target is not in the root item, check if target is smaller than the root’s value\n" +
                    "5. if target is smaller than the root’s value, search the left subtree\n" +
                    "6. else, search the right subtree\n",
            "A dequeue is a double-ended queue. This is a structure wherein elements can be inserted or removed from either end.",
            "A bubble sort is one sorting technique that can be applied to data structures such as an array. It works by comparing adjacent elements and exchanges their values if they are out of order. This method lets the smaller values “bubble” to the top of the list, while the larger value sinks to the bottom.",
            "A linked list typically has two parts: the head and the tail. Between the head and tail lie the actual nodes, with each node being linked in a sequential manner.",
            "Selection sort works by picking the smallest number from the list and placing it at the front. This process is repeated for the second position towards the end of the list. It is the simplest sort algorithm.",
            "A graph is one type of data structure that contains a set of ordered pairs. These ordered pairs are also referred to as edges or arcs, and are used to connect nodes where data can be stored and retrieved.",
            "Linear data structure is a structure wherein data elements are adjacent to each other. Examples of linear data structure include arrays, linked lists, stacks and queues. On the other hand, non-linear data structure is a structure wherein each data element can connect to more than two adjacent data elements. Examples of non linear data structure include trees and graphs.",
            "An AVL tree is a type of binary search tree that is always in a state of partially balanced. The balance is measured as a difference between the heights of the subtrees from the root. This self-balancing tree was known to be the first data structure to be designed as such.",
            "Doubly linked lists are a special type of linked list wherein traversal across the data elements can be done in both directions. This is made possible by having two links in every node, one that links to the next node and other one that links to the previous node.",
            "Huffman’s algorithm is associated in creating extended binary trees that has minimum weighted path lengths from the given weights. It makes use of a table that contains frequency of occurrence for each data element.",
            "Fibonacci search is a search algorithm that applies to a sorted array. It makes use of a divide-and-conquer approach that can greatly reduce the time needed in order to reach the target element.",
            "Recursive algorithm targets a problem by dividing it into smaller, manageable sub-problems. The output of one recursion after processing one sub-problem becomes the input to the next recursive process.",
            "To find the target key in a linked list, you have to apply sequential search. Each node is traversed and compared with the target key, and if it is different, then it follows the link to the next node. This traversal continues until either the target key is found or if the last node is reached.",
            "There are actually two ways you can do this. One is to use the increment operator ++ and decrement operator –. For example, the statement “x++” means to increment the value of x by 1. Likewise, the statement “x –” means to decrement the value of x by 1. Another way of writing increment statements is to use the conventional + plus sign or – minus sign. In the case of “x++”, another way to write it is “x = x +1”.",
            "When using Call by Value, you are sending the value of a variable as parameter to a function, whereas Call by Reference sends the address of the variable. Also, under Call by Value, the value in the parameter is not affected by whatever operation that takes place, while in the case of Call by Reference, values can be affected by the process within the function.",
            "Placing comment symbols /* */ around a code, also referred to as “commenting out”, is a way of isolating some codes that you think maybe causing errors in the program, without deleting the code. The idea is that if the code is in fact correct, you simply remove the comment symbols and continue on. It also saves you time and effort on having to retype the codes if you have deleted it in the first place.",
            "When writing programs that will store and retrieve data in a file, it is possible to designate that file into different forms. A sequential access file is such that data are saved in sequential order: one data is placed into the file after another. To access a particular data within the sequential access file, data has to be read one data at a time, until the right one is reached.",
            "This refers to the process wherein a variable is assigned an initial value before it is used in the program. Without initialization, a variable would have an unknown value, which can lead to unpredictable outputs when used in computations or other operations.",
            "Spaghetti programming refers to codes that tend to get tangled and overlapped throughout the program. This unstructured approach to coding is usually attributed to lack of experience on the part of the programmer. Spaghetti programing makes a program complex and analyzing the codes difficult, and so must be avoided as much as possible.",
            "Source codes are codes that were written by the programmer. It is made up of the commands and other English-like keywords that are supposed to instruct the computer what to do. However, computers would not be able to understand source codes. Therefore, source codes are compiled using a compiler. The resulting outputs are object codes, which are in a format that can be understood by the computer processor. In C programming, source codes are saved with the file extension .C, while object codes are saved with the file extension .OBJ",
            "This is a common problem for beginners because quotes are normally part of a printf statement. To insert the quote character as part of the output, use the format specifiers ’ (for single quote), and ” (for double quote).",
            "It is referred to as a terminating null character, and is used primarily to show the end of a string value.",
            "The = symbol is often used in mathematical operations. It is used to assign a value to a given variable. On the other hand, the == symbol, also known as “equal to” or “equivalent to”, is a relational operator that is used to compare two values.",
            "The modulus operator outputs the remainder of a division. It makes use of the percentage (%) symbol. For example: 10 % 3 = 1, meaning when you divide 10 by 3, the remainder is 1.",
            "A nested loop is a loop that runs within another loop. Put it in another sense, you have an inner loop that is inside an outer loop. In this scenario, the inner loop is performed a number of times as specified by the outer loop. For each turn on the outer loop, the inner loop is first performed.",
            "<> is incorrect. While this operator is correctly interpreted as “not  equal to” in writing conditional statements, it is not the proper operator to be used in C programming. Instead, the operator  !=  must be used to indicate “not equal to” condition.",
            "Compilers and interpreters often deal with how program codes are executed. Interpreters execute program codes one line at a time, while compilers take the program as a whole and convert it into object code, before executing it. The key difference here is that in the case of interpreters, a program may encounter syntax errors in the middle of execution, and will stop from there. On the other hand, compilers check the syntax of the entire program and will only proceed to execution when no syntax errors are found.",
            "The char keyword can only hold 1 character value at a time. By creating an array of characters, you can store string values in it. Example: “char MyName[50]; ” declares a string variable named MyName that can hold a maximum of 50 characters.",
            "While curly brackets are mainly used to group several lines of codes, it will still work without error if you used it for a single line. Some programmers prefer this method as a way of organizing codes to make it look clearer, especially in conditional statements. ",
            "Header files are also known as library files. They contain two essential things: the definitions and prototypes of functions being used in a program. Simply put, commands that you use in C programming are actually functions that are defined from within each header files. Each header file contains a set of functions. For example: stdio.h is a header file that contains definition and prototypes of commands like printf and scanf. ",
            "Syntax errors are associated with mistakes in the use of a programming language. It maybe a command that was misspelled or a command that must was entered in lowercase mode but was instead entered with an upper case character. A misplaced symbol, or lack of symbol, somewhere within a line of code can also lead to syntax error.",
            "Variables and constants may at first look similar in a sense that both are identifiers made up of one character or more characters (letters, numbers and a few allowable symbols). Both will also hold a particular value.  Values held by a variable can be altered throughout the program, and can be used in most operations and computations. Constants are given values at one time only, placed at the beginning of a program. This value is not altered in the program. For example, you can assigned a constant named PI and give it a value 3.1415  .  You can then use it as PI in the program, instead of having to write 3.1415 each time you need it. ",
            "Arrays contain a number of elements, depending on the size you gave it during variable declaration. Each element is assigned a number from 0 to number of elements-1. To assign or retrieve the value of a particular element, refer to the element number. For example: if you have a declaration that says “intscores[5];”, then you have 5 accessible elements, namely: scores[0], scores[1], scores[2], scores[3] and scores[4].",
            "No. “int” data type is capable of storing values from -32768 to 32767. To store 32768, you can use “long int” instead. You can also use “unsigned int”, assuming you don’t intend to store negative values.",
            "Yes, it’s perfectly valid to combine operators, especially if the need arises. For example: you can have a code like ” printf (“Hellonn’World'”) ” to output the text “Hello” on the first line and “World” enclosed in single quotes to appear on the next two lines. ",
            "The choice of declaring a header file at the top of each C program would depend on what commands/functions you will be using in that program. Since each header file contains different function definitions and prototype, you would be using only those header files that would contain the functions you will need. Declaring all header files in every program would only increase the overall file size and load of the program, and is not considered a good programming style.",
            "When declaring functions, you will decide whether that function would be returning a value or not. If that function will not return a value, such as when the purpose of a function is to display some outputs on the screen, then “void” is to be placed at the leftmost part of the function header. When a return value is expected after the function execution, the data type of the return value is placed instead of “void”.",
            "Compound statements are made up of two or more program statements that are executed together. This usually occurs while handling conditions wherein a series of statements are executed when a TRUE or FALSE is evaluated. Compound statements can also be executed within a loop. Curly brackets { } are placed before and after compound statements.",
            "Before a program can be written, an algorithm has to be created first. An algorithm provides a step by step procedure on how a solution can be derived. It also acts as a blueprint on how a program will start and end, including what process and computations are involved.",
            "When storing multiple related data, it is a good idea to use arrays. This is because arrays are named using only 1 word followed by an element number. For example: to store the 10 test results of 1 student, one can use 10 different variable names (grade1, grade2, grade3… grade10). With arrays, only 1 name is used, the rest are accessible through the index name (grade[0], grade[1], grade[2]… grade[9]).",
            "An ampersand & symbol must be placed before the variable name whatnumber. Placing & means whatever integer value is entered by the user is stored at the “address” of the variable name. This is a common mistake for programmers, often leading to logical errors.",
            "Random numbers are generated in C using the rand() command. For example: anyNum = rand() will generate any integer number beginning from 0, assuming that anyNum is a variable of type integer.",
            "The most probable reason behind this error is that the header file for that function was not indicated at the top of the program. Header files contain the definition and prototype for functions and commands used in a C program. In the case of “tolower()”, the code “#include <ctype.h>” must be present at the beginning of the program.",
            "Comments are a great way to put some remarks or description in a program. It can serves as a reminder on what the program is all about, or a description on why a certain code or function was placed there in the first place. Comments begin with /* and ended by */ characters. Comments can be a single line, or can even span several lines. It can be placed anywhere in the program.",
            "Debugging is the process of identifying errors within a program. During program compilation, errors that are found will stop the program from executing completely. At this state, the programmer would look into the possible portions where the error occurred. Debugging ensures the removal of errors, and plays an important role in ensuring that the expected program output is met.",
            "The && is also referred to as AND operator. When using this operator, all conditions specified must be TRUE before the next action can be performed. If you have 10 conditions and all but 1 fails to evaluate as TRUE, the entire condition statement is already evaluated as FALSE.",
            "There is no single command or function in C that can check if a number is odd or even. However, this can be accomplished by dividing that number by 2, then checking the remainder. If the remainder is 0, then that number is even, otherwise, it is odd. You can write it in code as:" +
                    "if (num % 2 == 0)\n" +
                    " \n" +
                    "printf(&quot;EVEN&quot;);\n" +
                    " \n" +
                    "else\n" +
                    " \n" +
                    "printf(&quot;ODD&quot;);\n",
            "This format is used for two things: to set the number of spaces allotted for the output number and to set the number of decimal places. The number before the decimal point is for the allotted space, in this case it would allot 10 spaces for the output number. If the number of space occupied by the output number is less than 10, addition space characters will be inserted before the actual output number. The number after the decimal point sets the number of decimal places, in this case, it’s 2 decimal spaces. ",
            "Program that contains logical errors tend to pass the compilation process, but the resulting output may not be the expected one. This happens when a wrong formula was inserted into the code, or a wrong sequence of commands was performed. Syntax errors, on the other hand, deal with incorrect commands that are misspelled or not recognized by the compiler.",
            "There are 3 main control structures in programming: Sequence, Selection and Repetition. Sequential control follows a top to bottom flow in executing a program, such that step 1 is first perform, followed by step 2, all the way until the last step is performed. Selection deals with conditional statements, which mean codes are executed depending on the evaluation of conditions as being TRUE or FALSE. This also means that not all codes may be executed, and there are alternative flows within. Repetitions are also known as loop structures, and will repeat one or two program statements set by a counter.",
            "The || is also known as the OR operator in C programming. When using || to evaluate logical conditions, any condition that evaluates to TRUE will render the entire condition statement as TRUE.",
            "No. “if” command can only be used to compare numerical values and single character values. For comparing string values, there is another function called strcmp that deals specifically with strings.",
            "Preprocessor directives are placed at the beginning of every C program. This is where library files are specified, which would depend on what functions are to be used in the program. Another use of preprocessor directives is the declaration of constants.Preprocessor directives begin with the # symbol.",
            "The outcome will be TRUE. Since the value of s is 10, s >= 10 evaluates to TRUE because s is not greater than 10 but is still equal to 10. s< 25 is also TRUE since 10 is less then 25. Just the same, s!=12, which means s is not equal to 12, evaluates to TRUE. The && is the AND operator, and follows the rule that if all individual conditions are TRUE, the entire statement is TRUE.",
            "Order of precedence determines which operation must first take place in an operation statement or conditional statement. On the top most level of precedence are the unary operators !, +, – and &. It is followed by the regular mathematical operators (*, / and modulus % first, followed by + and -). Next in line are the relational operators <, <=, >= and >. This is then followed by the two equality operators == and !=. The logical operators && and || are next evaluated. On the last level is the assignment operator =.",
            "You cannot use the = sign to assign values to a string variable. Instead, use the strcpy function. The correct statement would be: strcpy(myName, “Robin”);",
            "To get the length of a string value, use the function strlen(). For example, if you have a variable named FullName, you can get the length of the stored string value by using this statement: I = strlen(FullName); the variable I will now have the character length of the string value.",
            "Yes, you don’t have to write a separate assignment statement after the variable declaration, unless you plan to change it later on.  For example: char planet[15] = “Earth”; does two things: it declares a string variable named planet, then initializes it with the value “Earth”.",
            "This is because C language is rich in features that make it behave like a high level language while at the same time can interact with hardware using low level methods. The use of a well structured approach to programming, coupled with English-like words used in functions, makes it act as a high level language. On the other hand, C can directly access memory structures similar to assembly language routines. ",
            "Source codes in C are saved with .C file extension. Header files or library files have the .H file extension. Every time a program source code is successfully compiled, it creates an .OBJ object file, and an executable .EXE file. ",
            "Reserved words are words that are part of the standard C language library. This means that reserved words have special meaning and therefore cannot be used for purposes other than what it is originally intended for. Examples of reserved words are int, void, and return.\n" +
                    "In the first expression, the increment would happen first on variable a, and the resulting value will be the one to be used. This is also known as a prefix increment. In the second expression, the current value of variable a would the one to be used in an operation, before the value of a itself is incremented. This is also known as postfix increment.\n",
            "X +=15 is a short method of writing X = X + 15, so if the initial value of X is 5, then 5 + 15 = 20.",

            "An endless loop can mean two things. One is that it was designed to loop continuously until the condition within the loop is met, after which a break function would cause the program to step out of the loop. Another idea of an endless loop is when an incorrect loop condition was written, causing the loop to run erroneously forever. Endless loops are oftentimes referred to as infinite loops.",
            "A flowchart provides a visual representation of the step by step procedure towards solving a given problem. Flowcharts are made of symbols, with each symbol in the form of different shapes. Each shape may represent a particular entity within the entire program structure, such as a process, a condition, or even an input/output phase.",
            "The word void is a reserved word in C language. You cannot use reserved words as a user-defined variable.",
            "Assuming that INT is a variable of type float, this statement is valid. One may think that INT is a reserved word and must not be used for other purposes. However, recall that reserved words are express in lowercase, so the C compiler will not interpret this as a reserved word.",
            "When you create and use functions that need to perform an action on some given values, you need to pass these given values to that function. The values that are being passed into the called function are referred to as actual arguments. ",
            "A newline escape sequence is represented by the n character. This is used to insert a new line when displaying data in the output screen. More spaces can be added by inserting more n characters. For example, nn would insert two spaces. A newline escape sequence can be placed before the actual output expression or after. ",
            "It is the process of transferring data to an alternative output source other than the display screen. Output redirection allows a program to have its output saved to a file. For example, if you have a program named COMPUTE, typing this on the command line as COMPUTE >DATA can accept input from the user, perform certain computations, then have the output redirected to a file named DATA, instead of showing it on the screen.",
            "These are errors that occur while the program is being executed. One common instance wherein run-time errors can happen is when you are trying to divide a number by zero. When run-time errors occur, program execution will pause, showing which program line caused the error. ",
            "These 2 functions basically perform the same action, which is to get the absolute value of the given value. Abs() is used for integer values, while fabs() is used for floating type numbers. Also, the prototype for abs() is under <stdlib.h>, while fabs() is under <math.h>.",
            "In using functions in a C program, formal parameters contain the values that were passed by the calling function. The values are substituted in these formal parameters and used in whatever operations as indicated within the main body of the called function."
           };

    List<String> csearrayquestionlist = Arrays.asList(listArraycse);
    ArrayList<String> cseupdatequestionlist = new ArrayList<String>();
    ArrayAdapter adaptercse;
    List<String> csearrayanswerlist = Arrays.asList(datacse);
    ArrayList<String> cseupdateanswerlist = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
        ListView listViewcse = (ListView) findViewById(R.id.listcse);



            AdView mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        cseupdatequestionlist.addAll(csearrayquestionlist);
        cseupdateanswerlist.addAll(csearrayanswerlist);


        adaptercse = new ArrayAdapter<String>(this, R.layout.textfieldlist, cseupdatequestionlist);



        listViewcse.setAdapter(adaptercse);


        listViewcse.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String questioncse = cseupdatequestionlist.get(position);
                String datacse = cseupdateanswerlist.get(position);
                Intent startcse = new Intent(getApplicationContext(), csedata.class);
                startcse.putExtra("senddatacse", datacse);
                startcse.putExtra("senddata1cse", questioncse);

                startActivity(startcse);


            }
        });


    }
    private boolean haveNetworkConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_branch, menu);

        return true;
    }

    String userquestioncse;
    String useranswercse;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_addquestions) {
            Toast.makeText(this, "Questions once added,will not delete", Toast.LENGTH_SHORT);
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Add question of CSE");

            // Set an EditText view to get user input
            final EditText csequestion = new EditText(this);
            csequestion.setHint("Question");
            final EditText cseanswer = new EditText(this);
            cseanswer.setHint("Answer");
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);
            layout.addView(csequestion);
            layout.addView(cseanswer);
            alert.setView(layout);

            alert.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                    userquestioncse = csequestion.getEditableText().toString();
                    useranswercse = cseanswer.getEditableText().toString();


                    if (userquestioncse.length() > 0) {
                        cseupdatequestionlist.add(userquestioncse);

                        adaptercse.notifyDataSetChanged();
                        Toast.makeText(cse.this,
                                "Added to list", Toast.LENGTH_LONG).show();

                        saveStringToPreferencescse(userquestioncse);


                    }
                    if (useranswercse.length() <= 0 && userquestioncse.length() != 0) {

                        useranswercse = " ";


                    }
                    if (useranswercse.length() > 0) {
                        cseupdateanswerlist.add(useranswercse);
                        adaptercse.notifyDataSetChanged();
                        saveStringToPreferences1cse(useranswercse);


                    }


                }
            });

            alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                }
            });

            alert.show();


        }
        if (id == R.id.action_rateus) {


            final String GooglePlayStorePackageNameOld = "com.google.market";
            final String GooglePlayStorePackageNameNew = "com.android.vending";
            boolean googlePlayStoreInstalled = false;
            Intent intent = new Intent();
            PackageManager packageManager = getApplication().getPackageManager();
            List<PackageInfo> packages = packageManager.getInstalledPackages(PackageManager.GET_UNINSTALLED_PACKAGES);
            for (PackageInfo packageInfo : packages) {
                if (packageInfo.packageName.equals(GooglePlayStorePackageNameOld) ||
                        packageInfo.packageName.equals(GooglePlayStorePackageNameNew)) {
                    googlePlayStoreInstalled = true;
                    break;
                }
            }
            if (googlePlayStoreInstalled == true) {
                intent = new Intent(Intent.ACTION_VIEW);
                //Try Google play
                intent.setData(Uri.parse("market://details?id=com.arjunkapoor.engineeringinterview"));
                startActivity(intent);

            } else {

                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.arjunkapoor.engineeringinterview"));
            }




        }
        if (id == R.id.action_ask) {
            AlertDialog mDialog;
            Button PositiveButton;
            String positiveButtonText = "OK";
            String negativeButtonText = "CANCEL";
            mDialog = new AlertDialog.Builder(this)
                    .setTitle(getResources().getString(R.string.app_name))
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .setMessage("Oops,We will add this feature soon")

                    .setPositiveButton(positiveButtonText, null)
                    .setNegativeButton(negativeButtonText, null)
                    .show();

            WindowManager.LayoutParams layoutParams = mDialog.getWindow().getAttributes();
            layoutParams.dimAmount = 0.9f;
            mDialog.getWindow().setAttributes(layoutParams);
            mDialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        }


        return super.onOptionsItemSelected(item);

    }

    private SharedPreferences prefscse;
    private String prefNamecse = "myPhrasesStoragecse";
    private static final String PHRASEcse = "Phrase_cse";


    private void saveStringToPreferencescse(String strcse) {
        prefscse = getSharedPreferences(prefNamecse, MODE_PRIVATE);
        SharedPreferences.Editor editorcse = prefscse.edit();
        //increments index by 1
        editorcse.putInt("phrase_countcse", prefscse.getInt("phrase_countcse", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editorcse.putString(PHRASEcse + (prefscse.getInt("phrase_countcse", 0) + 1), userquestioncse);

        editorcse.commit();
    }

    private SharedPreferences prefs1cse;
    private String prefName1cse = "myPhrasesStorage1cse";
    private static final String PHRASE1cse = "Phrase_1cse";

    private void saveStringToPreferences1cse(String str1cse) {
        prefs1cse = getSharedPreferences(prefName1cse, MODE_PRIVATE);
        SharedPreferences.Editor editor1cse = prefs1cse.edit();
        //increments index by 1
        editor1cse.putInt("phrase_count1cse", prefs1cse.getInt("phrase_count1cse", 0) + 1);
        //save new phrase in myPhrasesStorage with key "name[index]"
        editor1cse.putString(PHRASE1cse + (prefs1cse.getInt("phrase_count1cse", 0) + 1), useranswercse);

        editor1cse.commit();
    }

    public void onResume() {
        super.onResume();

        prefscse = getSharedPreferences(prefNamecse, MODE_PRIVATE);
        LinkedList<String> phrasesCollectioncse = new LinkedList<String>();
        int phraseCountcse = prefscse.getInt("phrase_countcse", 0);

        for (int i = 1; i <= phraseCountcse; i++) {
            phrasesCollectioncse.add(prefscse.getString(PHRASEcse + i, "<< Enter a phrase >>"));
        }

        cseupdatequestionlist.addAll(phrasesCollectioncse);
        adaptercse.notifyDataSetChanged();



        prefs1cse = getSharedPreferences(prefName1cse, MODE_PRIVATE);
        LinkedList<String> phrasesCollection1cse = new LinkedList<String>();
        int phraseCount1cse = prefs1cse.getInt("phrase_count1cse", 0);

        for (int j = 1; j <= phraseCount1cse; j++) {
            phrasesCollection1cse.add(prefs1cse.getString(PHRASE1cse + j, "<< Enter a phrase >>"));
        }

        cseupdateanswerlist.addAll(phrasesCollection1cse);


    }
    public void onBackPressed()
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);


        return;
    }


}







