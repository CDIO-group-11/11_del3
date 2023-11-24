
@echo off
call mvn test
pause
echo [2J[1;1H
for /L %%G IN (0,1,50) DO echo ************************************************************
javac -sourcepath ./src/main/java/ -d ./bin/ -encoding ISO-8859-1 -nowarn ./src/main/java/CDIO3/App.java
echo make sure you can see the entire square at once, use ("ctrl" and "-") ro zoom out, ("ctrl" and "+") to zoom in
echo if there are problems with wierd characters/overlapping text, you shoud use runClean.bat instead
pause
java -cp ./bin/ CDIO3/App unClean
Pause