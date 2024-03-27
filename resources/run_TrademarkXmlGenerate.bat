@echo off


SET JAVA_HOME=D:/devel/sp-cesto/tools/java/jdk1.8.0_40
SET MAIN_CLASS=org.tmview.interfaces.MonitoringFrame
SET JVM_ARGS=-Xms4096m -Xmx8192m -Djdk.home="%JAVA_HOME%" -Dtemp="%TEMP%" -Djava.library.path="./bin" -Dcom.sun.management.jmxremote

setlocal ENABLEDELAYEDEXPANSION
SET APP_HOME=.
SET CLASS_PATH=/resources
for %%f in (%APP_HOME%\lib\*.jar) do set CLASS_PATH=!CLASS_PATH!;%%f

@echo on
SET JAVA_EXE=%JAVA_HOME%\bin\java.exe
"%JAVA_EXE%" %JVM_ARGS% -cp "%CLASS_PATH%" %MAIN_CLASS%

goto end

:error
@echo on
echo ---------------------------------------------------------------------
echo Please, specify JAVA_HOME variable in this batch file.
echo ---------------------------------------------------------------------
pause

:end
rem pause
exit



