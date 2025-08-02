import pandas as pd

# Create the dataset(Activity 17)
data = {
  "Usernames": ["admin","Charles","Deku"],
  "Passwords": ["password","Char113","AllMight"]
}
# Convert Dataset into DataFrame
df = pd.DataFrame(data)

# Write the DataFrame to a csv file
df.to_csv("sample.csv", index=False)

# Reading data from csv file (Activity 18)
input_data = pd.read_csv("sample.csv")

# Print the values only in the usernames column
print("=======Usernames column=======")
print(input_data["Usernames"])

# Print the username and password of the second row
print("=======Second row data=======")
print(input_data["Usernames"][1],input_data["Passwords"][1])

# Sort the usernames column in ascending order
print("\n=======Sorted Usernames column======== ")
print(input_data.sort_values(by="Usernames",ascending=True))

# Sort the Passwords column in descending order
print("\n=======Sorted Passwords column======== ")
print(input_data.sort_values(by="Passwords",ascending=False))