
@echo off
call mvn verify
javac -sourcepath ./src/main/java/ -d ./bin/ -encoding ISO-8859-1 -nowarn ./src/main/java/CDIO3/App.java
echo if there are problems with wierd characters/overlapping text, you shoud use runClean.bat instead
pause
for /L %%G IN (0,1,50) DO echo ************************************************************
echo make sure you can see the entire square at once, use ("ctrl" and "-") ro zoom out, ("ctrl" and "+") to zoom in
pause
java -cp ./bin/ CDIO3/App
Pause