cmd /C start/MIN
cd D:/Paral
java -jar selenium-server-standalone-3.141.59.jar -role hub

cmd /C start/MIN 
cd D:/Paral 
java "-Dwebdriver.chrome.driver=D:\Paral1\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub "http://192.168.31.49:4444/grid/register" -port 4546

