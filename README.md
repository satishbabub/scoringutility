# scoringutility
scoring utility
Assumptions
1. Scoring is calculated ignoring the case meaning both 'A' and 'a' is considered as value 1
2. File will contain single line of input only(not multiple lines)
3. When we need to enhance the utility to sort names on full name(first and last name) it is assumed that
the first name and last name are seperated by a white space and full name
is in quotes and all names are comma seperated in a single line within a file
4. It is assumed that the size of the file will is small enough to compute this in memory
(in case if its a big file something of 10GB or more we need little more complex
algorithm which follows a divide and conquer processing similar to map/reduce. Split the file into 
smaller chunks(so that multiple threads can run in parallel to sort these smaller chunks)
sort them individually 
write intermediate sorted content to temp file
apply merge sort to temp files in to single sorted file)
5. It is assumed that the computed score will fit in datatype long(since its only one line of input) otherwise should use BigInteger
6. Names are always seperated by , for all systems who uses scoring utility
7. White spaces excluded from score calculation, for example if name john smith the white space between john and smith is not considered for calculation


manifest
Class-Path: lib/slf4j-api-1.7.5.jar lib/slf4j-simple-1.7.5.jar lib/jun
 it-jupiter-engine-5.5.2.jar lib/apiguardian-api-1.1.0.jar lib/junit-p
 latform-engine-1.5.2.jar lib/opentest4j-1.2.0.jar lib/junit-platform-
 commons-1.5.2.jar lib/junit-jupiter-api-5.5.2.jar
