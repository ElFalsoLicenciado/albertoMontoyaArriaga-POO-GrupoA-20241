import Employee
import BankAccount

class Bank:
  __ui = ""
  __flag = False
  

  def __init__(self):
    __bank_accounts = []
    __emp_list = []


  def create_account (self):
   type = '~'

   while True:
      print("What type of account do you want?")
      print("A type: MAX $50 000\nB type: MAX $100 000\nC type: unlimited\n")

      while True:
        try :
          self.__ui = input()
          self.__ui = self.__ui.lower()
          type = self.__ui
          break
        except TypeError:
          print("Invalid input.")
      
      if (Bank.confirmation()==True):
        print("Write the amount")
        
        break

  
  def create_employee (self):
    name = input("Write the name.")
    last_name = input("Write the last name")


  def confirmation (self):
    ui = ""
    ui = input("Are you sure? ")
    f = False
    
    if(ui.lower("y") or ui.lower("yes")):
      f = True
    else:
      pass

    return f


class Main:

  

  def menu ():
   banco = Bank()
   while True:
    
    print("1. Employees and bank accounts.")
    print("2. Search for all bank accounts.")
    print("3. Search for a specific account.")
    print("0. Quit")
    opt = input()
    
    if opt == 1:
      
      while True:

        print("1. Register employee.")
        print("2. Regiser employee + account.")
        print("3. Regiser employee + account & founds.")
        print("0. Return.")
        p = input()

        if p == 1:
          banco.create_employee()
          break
        
        elif p == 2:
          name = input("Employee's name: ")
          last_name = input("Employee's last name: ")
          employee = Employee(name,last_name)
          
          type = input().lower()

          break
        
        elif p == 3:
          
          break

        elif p == 0:
          
          break

        else:
          print("Invalid input.")


        


    elif opt == 2:
      while True:
        pass
        
    elif opt == 3:
      while True:
        pass


    elif opt == 0:
      print("Cheers")
      break

    else:
      print("Invalid choice")
    