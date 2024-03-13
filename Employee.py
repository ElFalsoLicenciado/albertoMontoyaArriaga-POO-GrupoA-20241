import BankAccount 

class Employee:
    __name = ""
    __last_name = ""
    __accounts = []
    __invalid_accs = []
    __flag = False

        
    def set_name (self, name):
        self.__name = name
    
    def set_last_name (self, last_name):
        self.__last_name = last_name

    def set_validity (self, flag):
        self.__flag = flag

    def get_name (self):
        return self.__name

    def get_last_name (self):
        return self.__last_name
    
    def get_accounts (self):
        return self.__accounts

    def get_invalid_accs (self):
        return self.__invalid_accs
        
    def get_validity (self):
        return self.__flag
    

    
