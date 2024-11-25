# Part1 (1)
def Operator():
    floatNum=12.5
    intNum=5
    print("Part1 (1) Output")
    #Addition
    print(floatNum+intNum)
    #Subtraction
    print(floatNum-intNum)
    #Multiplication
    print(floatNum*intNum)
    #Division
    print(floatNum/intNum)
Operator()

# Part1 (2)
def OperatorWithTypeCast():
    floatNum=12.5
    intNum=5

    #Type casting
    newIntNum=int(floatNum)
    newFloatNum=float(intNum)

    print("\nPart1 (2) Output")
    #Addition
    print(newFloatNum+newIntNum)
    #Subtraction
    print(newIntNum-newFloatNum)
    #Multiplication
    print(newFloatNum*newIntNum)
    #Division
    print(newIntNum/newFloatNum)
OperatorWithTypeCast()

#Part2 (1)
def StringToInteger():
    strNum="123"
    ans=int(strNum)
    print("\nPart2 (1) Output")
    print(type(ans),":",ans)
StringToInteger()

#Part2 (2)
def ValidateAge(age):
    print("\nPart2 (2) Output")
    if(age<18):
        print(age," : Minor")
    else:
        print(age," : Adult")
ValidateAge(18)

#Part3
def FlowControl():

    print("\nPart3 Output")
    try:
        num=int(input("Enter the number: "))
        if(num>10):
            print("Number greater than 10")
        elif(num<10):
            print("Number less than 10")
        else:
            print("Number is equal to 10")
    
    except ValueError:
        print("Invalid input! Please enter a valid number.")
FlowControl()

#Classwork
def FirstRecurrence():
    string="PythonInterviewQuestion"
    string=string.lower()
    for i in string:
        if string.count(i)>1:
            print(i)
            break   
FirstRecurrence()