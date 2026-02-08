# local-vault

Sources
------------------------------------------------------------------------------------------------------------------------
1. https://www.linkedin.com/learning-login/share?forceAccount=false&redirect=https%3A%2F%2Fwww.linkedin.com%2Flearning%2Flearning-java-11%3Ftrk%3Dshare_ent_url%26shareId%3DlOCbXh0NTE6DQoyQ1efaEQ%253D%253D,
While I've learned java before and I was proficient in it, I watched this LinkedIn learning course to review Java before
beginning this project. It was very helpful with Java syntax, logic, and styles, and I recommend for others to watch it.
2. https://www.linkedin.com/learning-login/share?forceAccount=false&redirect=https%3A%2F%2Fwww.linkedin.com%2Flearning%2Fjson-essential-training%3Ftrk%3Dshare_ent_url%26shareId%3DuU5R4T7ZRAKF86ih7BO6uQ%253D%253D,
I had a rudimentary understanding of JSON before watching this course and beginning this project. This course
significantly improved my knowledge of JSON and I also recommend it. 
3. https://www.w3schools.com/java/ref_string_equals.asp, used to find operations on strings, more specifically, the 
equals() and equalsIgnorecase() for Strings.
4. https://rootstack.com/en/blog/java-clear-screen, found using the ensi escape code from this webpage.
5. https://www.w3schools.com/java/java_classes.asp, used to revisit objects in java. specifically, methods with an object
and object constructors.
6. https://www.w3schools.com/JAVA/java_encapsulation.asp, used to read about getters and setters. haven't used them in java
in a while.
7. https://www.w3schools.com/java/java_list.asp, details about the java list interface and implementing it using ArrayList
and LinkedList. This was very helpful because initially I just wanted to
8. ChatGPT, I used AI to ask questions about java syntax and logic. Particularly, for things that I was not able to figure 
out or was confused about if I could not come to a conclusive answer myself or find the answer online or in some sort
of documentation. Also, I used it to assist with troubleshooting Maven dependency configuration and resolving Gson 
library import issues.
9. https://maven.apache.org/guides/introduction/introduction-to-the-pom.html, read about Project Object Model (POM) in 
Maven. 

------------------------------------------------------------------------------------------------------------------------


Vault Object & VaultEntry Object
------------------------------------------------------------------------------------------------------------------------
Use nextId to not change the ID of a vault entry by setting id equal to nextId using the getNextId() getter method and 
then create a new vault entry object using the id value. Then I increment the nextId field so that I can continue to 
create more vaultEntry objects while not changing the ID of any preexisting vault entries. 
------------------------------------------------------------------------------------------------------------------------