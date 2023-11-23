
@echo off
call mvn test
echo [2J[1;1H
echo if there are problems with wierd characters/overlapping text, you shoud use runClean.bat instead
pause
java -cp ./target/classes CDIO3/App -lang=eng
Pause