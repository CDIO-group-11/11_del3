
@echo off
javac -sourcepath ./src/main/java/ -d ./bin/ -nowarn ./src/main/java/CDIO3/App.java
echo if there are problems with wierd characters/overlapping text, you shoud use runClean.bat instead
pause
java -cp ./bin/ CDIO3/App
Pause