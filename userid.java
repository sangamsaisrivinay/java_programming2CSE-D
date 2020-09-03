/*

USER ID GENERATION:
Joseph’s team has been assigned the task of creating user-ids for all the participants of an
online gaming competition. Joseph has designed a process for generating the user-id using
the participant’s First_Name, Last_Name, PIN code and a number N. The process defined by
Joseph is as follows:
Step 1 : Compare the lengths of First_Name and Last_Name of the participant. The one that is
shorter will be called “Smaller Name”, and the one that is longer is called “Longer Name”. If
both First_Name and Last_Name are of equal length, then the name that appears earlier in
alphabetical order will be called “Smaller Name “ and the name that appears later in the
alphabetical order is called “Longer Name”.
Step 2: The user-id should be generated as below -
Last letter of the smaller name + entire word of the longer name + Digit at position N in the
PIN when traversing the PIN from left to right + Digit at position N in the PIN when traversing
from right to left.
Step 3: Toggle the alphabets of the user-id generated in step2 i.e., upper- case alphabets to
Lower case and vice-versa

TEST CASES
SAMPLE INPUT
SAMPLE OUTPUT
Rajiv
Roy
560037
6
YrAJIV75
Kumud
Kumar
561327
2
RkUMUD62

*/
