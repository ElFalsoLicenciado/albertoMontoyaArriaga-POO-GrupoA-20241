import random
import sys

class BankAccount:
    __funds = 0.0
    __acc_number = 0
    __acc_type = ''
    __mx_funds = 0.0
    __mn_funds = 0.0
    __valid_acc = True

    def __init__(self):
        self.__acc_number = random.randint(9999,10000)

    def set_account_type(self, acc_type):
        self.__acc_type = acc_type

        if acc_type == 'a':
            self.__mx_funds = 50000
            self.__mn_funds = 1000
        
        elif acc_type == 'c':
            self.__mx_funds = 100000
            self.__mn_funds = 5000
        
        elif acc_type == 'c':
            self.__mx_funds = sys.float_info.max
            self.__mn_funds = 10000
        
        else:  
            print("Could not create or modify that account type")
            self.__valid_acc = False
            self.__acc_type = '~' 

    def set_valid_account (self, status):
        self.__valid_acc = status
    
    def get_account_number (self):
        return self.__acc_number

    def get_acc_type (self):
        return self.__acc_type
    
    def get_funds (self):
        return self.__funds
    
    def get_validity(self):
        return self.__valid_acc
    
    def add_funds (self, amount):
        if(self.__funds + amount > self.__mx_funds or amount < 1):
            print("Couldn't deposit that amount.")
        else:
            self.__funds += amount
            print(f"You added: ${self.__funds}")

    def take_funds (self, amount):
        if(self.__funds - amount < self.__mn_funds or amount < 1):
            print("Couldn't withdraw that amount.")
        else:
            self.__funds -= amount
            print(f"You took: ${self.__funds}")        