call mvn -e clean
call mvn install
pause Check if build was OK

rem copy target\TmClassIpasExtract-1.0.jar 			  ..\Installer\run_TmClassIpasExtract\lib
rem copy src\org\ecap3\tmclass\interfaces\Messages.properties ..\Installer\run_TmClassIpasExtract\resources
rem pause Check if copy was OK
