import random
import sys

class BankAccount:
    __funds = 0.0
    __acc_number = 0
    __acc_type = ''
    __mx_funds = 0.0
    __mn_funds = 0.0


    def __init__(self, type, amount):
        self.__acc_number = random.randint(9999,10000)

        if self.__acc_type(type) == True:
            self.add_funds(amount)
        else :
            del self


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
        

    def get_account_number (self):
        return self.__acc_number


    def get_acc_type (self):
        return self.__acc_type


    def get_funds (self):
        return self.__funds


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