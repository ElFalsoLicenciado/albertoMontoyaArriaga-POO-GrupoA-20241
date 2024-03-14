import BankAccount 

class Employee:
    __name = ""
    __last_name = ""
    __accounts = []
    __flag = False


    def __init__(self, name, last_name):
        self.__name = name
        self.__last_name = last_name


    def set_name (self, name):
        self.__name = name


    def set_last_name (self, last_name):
        self.__last_name = last_name


    def set_validity (self, flag):
        self.__flag = flag


    def set_account (self, account ):
        self.__accounts.append(account)
        self.__flag = True  


    def get_name (self):
        return self.__name


    def get_last_name (self):
        return self.__last_name


    def get_accounts (self):
        return self.__accounts
    

    def get_validity (self):
        return self.__flag
    

    
