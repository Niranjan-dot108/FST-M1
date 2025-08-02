#import pandas 
import pandas 
from pandas import ExcelWriter

#Create a dictionary that will be used to create the DataFrame
data = {
   'FirstName': ["Satvik","Avinash","Lahri"],
   'LastName': ["Shah","Kati","Rath"],
   'Email': ["satshah@example.com","avinashK@example.com","lahri.rath@example.com"],
   'PhoneNumber': ["453782914598","45374534648","45377698989"]
}

#Create the dataframe that will be written to the excel file
dataframe =pandas.DataFrame(data)

#Print the dataframe
print(dataframe)

writer = Excelwriter ('sample.xlsx')