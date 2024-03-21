import os
from pytz import timezone 
from datetime import datetime

ind_time = datetime.now(timezone("Asia/Kolkata")).strftime(f'%d-%m-%Y %H:%M')
print(ind_time)

os.system("git add .")
os.system(f'git commit -m "{ind_time}" ')
os.system("git push")



# timestamp = time.strftime('%H:%M:%S')
# print(timestamp)
# timestamp = time.strftime('%H')
# print(timestamp)
# timestamp = time.strftime('%M')
# print(timestamp)
# timestamp = time.strftime('%S')
# print(timestamp)
# https://docs.python.org/3/library/time.html#time.strftime

