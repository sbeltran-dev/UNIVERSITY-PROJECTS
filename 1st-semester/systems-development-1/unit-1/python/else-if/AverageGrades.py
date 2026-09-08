#3. Create a Java program that reads the data of a student (name and three partial grades)
# and prints the name and final grade according to the following: to pass the course,
# the student must have 60 or more in each of the three grades. The final grade will be
# the average. If they failed one or more regular exams, the final grade will be NA (Not Accredited).

name = input("Enter the student's name: ")
partial1 = float(input("Grade for the first partial: "))
partial2 = float(input("Grade for the second partial: "))
partial3 = float(input("Grade for the third partial: "))

partialSum = partial1 + partial2 + partial3
average = partialSum / 3

# Option 1 (else)
'''
if partial1 >= 60 and partial2 >= 60 and partial3 >= 60:
    print("Student's name: " + name)
    print(f"Final average: {average:,.2f}")
    print("Passing: Yes")
else:
    print("Student's name: " + name)
    print(f"Student's final average: {average:,.2f}")
    print("Passing: No")
'''

# Option 2 (elif)
'''
if partial1 >= 60 and partial2 >= 60 and partial3 >= 60:
    print("Student's name: " + name)
    print(f"Student's final average: {average:,.2f}")
    print("Passing: Yes")
elif partial1 < 60 or partial2 < 60 and partial3 < 60:
    print("Student's name: " + name)
    print(f"Student's final average: {average:,.2f}")
    print("Passing: No")
'''
